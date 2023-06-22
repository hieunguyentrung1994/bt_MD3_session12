package service;

import model.Color;
import model.Product;

import java.util.*;

public class ColorService implements service.IBaseService<Color> {
    @Override
    public Map<String, Integer> atributeWithPrd(List<Color> colors, List<Product> products) {
        Map<String, Integer> map = new HashMap<>();
        for (Color color: colors) {
            map.put(color.getColorName(), 0);
        }

        for (Product product: products) {
            String key = product.getColor().getColorName(); // lấy ra rá trị theo product có số màu theo hàm map ở trên
            int value = map.get(key) + 1; // lấy ra giá trị của key +1 để gán thêm vào
            map.put(key, value);
        }
//        for (Map.Entry<String,Integer> entry: map.entrySet()) {
//            for (Product p:products) {
//                if(entry.getKey().equals(p.getColor().getColorName())) {
//                    entry.setValue(entry.getValue() + 1);
//                }
//            }
//        }
        return map;
    }

    @Override
    public boolean save(List<Color> colors, Color color) {
        return service.IBaseService.super.save(colors, color);
    }

    @Override
    public Color findById(List<Color> colors, int id) {
        return service.IBaseService.super.findById(colors, id);
    }

    @Override
    public boolean deleteById(List<Color> colors, int id) {
        return service.IBaseService.super.deleteById(colors, id);
    }

    @Override
    public Integer idAutoIncrement(List<Color> colors) {
        return service.IBaseService.super.idAutoIncrement(colors);
    }
}
