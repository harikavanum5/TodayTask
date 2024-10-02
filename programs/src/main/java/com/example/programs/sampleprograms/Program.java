package com.example.programs.sampleprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {

	public static void main(String[] args) {


		List<Map<String, Object>> s = new ArrayList<>();
		Map<String, Object> Map1 = new HashMap<>();
		Map1.put("id", 1);
		Map1.put("name", "harika");
		s.add(Map1);

		Map<String, Object> Map2 = new HashMap<>();
		Map2.put("id", 2);
		Map2.put("name", "ramesh");

		s.add(Map2);

		List<Map<String, Object>> s1 = new ArrayList<>();
		Map<String, Object> Map3 = new HashMap<>();
		Map3.put("id", 1);
		Map3.put("course", "MCA");
		s1.add(Map3);

		Map<String, Object> Map4 = new HashMap<>();
		Map4.put("id", 2);
		Map4.put("course", "MCA");
		s1.add(Map4);

		List<Map<String, Object>> merge = new ArrayList<>();

		for (Map<String, Object> mapA : s) {
			for (Map<String, Object> mapB : s1) {
				if (mapA.get("id").equals(mapB.get("id"))) {
					Map<String, Object> mergedMap = new HashMap<>(mapA);
					mergedMap.putAll(mapB);
					merge.add(mergedMap);
				}
			}
		}
		System.out.println(merge);
	}
}



































//List<Map<String, Object>> list1 = new ArrayList<>();
//Map<String, Object> map1 = new HashMap<>();
//map1.put("id", 1);
//map1.put("name", "Ramesh");
//list1.add(map1);
//
//Map<String, Object> map2 = new HashMap<>();
//map2.put("id", 2);
//map2.put("name", "Trinadh");
//list1.add(map2);
//
//Map<String, Object> map3 = new HashMap<>();
//map3.put("id", 3);
//map3.put("name", "Harika");
//list1.add(map3);
//
//Map<String, Object> map4 = new HashMap<>();
//map4.put("id", 4);
//map4.put("name", "Ramya");
//list1.add(map4);
//
//List<Map<String, Object>> list2 = new ArrayList<>();
//Map<String, Object> course1 = new HashMap<>();
//course1.put("id", 1);
//course1.put("course", "MBA");
//list2.add(course1);
//
//Map<String, Object> course2 = new HashMap<>();
//course2.put("id", 2);
//course2.put("course", "MCA");
//list2.add(course2);
//
//Map<String, Object> course3 = new HashMap<>();
//course3.put("id", 3);
//course3.put("course", "B.tech");
//list2.add(course3);
//
//List<Map<String, Object>> mergedList = new ArrayList<>();
//
//for (Map<String, Object> mapA : list1) {
//	for (Map<String, Object> mapB : list2) {
//		if (mapA.get("id").equals(mapB.get("id"))) {
//			Map<String, Object> mergedMap = new HashMap<>(mapA);
//			mergedMap.putAll(mapB);
//			mergedList.add(mergedMap);
//		}
//	}
//}
//System.out.println(mergedList);
//}
//}
//
