package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class SearchStatsSender$SearchCategoryGroup {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ SearchStatsSender$SearchCategoryGroup[] $VALUES;
    public static final SearchStatsSender$SearchCategoryGroup SAVED_PLACES = new SearchStatsSender$SearchCategoryGroup("SAVED_PLACES", 0);
    public static final SearchStatsSender$SearchCategoryGroup DRIVE_THRU = new SearchStatsSender$SearchCategoryGroup("DRIVE_THRU", 1);
    public static final SearchStatsSender$SearchCategoryGroup PARKING = new SearchStatsSender$SearchCategoryGroup("PARKING", 2);
    public static final SearchStatsSender$SearchCategoryGroup GAS_STATION = new SearchStatsSender$SearchCategoryGroup("GAS_STATION", 3);
    public static final SearchStatsSender$SearchCategoryGroup FOOD = new SearchStatsSender$SearchCategoryGroup("FOOD", 4);
    public static final SearchStatsSender$SearchCategoryGroup MORE = new SearchStatsSender$SearchCategoryGroup("MORE", 5);
    public static final SearchStatsSender$SearchCategoryGroup COFFEE = new SearchStatsSender$SearchCategoryGroup("COFFEE", 6);
    public static final SearchStatsSender$SearchCategoryGroup SHOPPING = new SearchStatsSender$SearchCategoryGroup("SHOPPING", 7);
    public static final SearchStatsSender$SearchCategoryGroup PHARMACIES = new SearchStatsSender$SearchCategoryGroup("PHARMACIES", 8);
    public static final SearchStatsSender$SearchCategoryGroup GROCERY_STORES = new SearchStatsSender$SearchCategoryGroup("GROCERY_STORES", 9);
    public static final SearchStatsSender$SearchCategoryGroup CHARGING_STATION = new SearchStatsSender$SearchCategoryGroup("CHARGING_STATION", 10);
    public static final SearchStatsSender$SearchCategoryGroup HOSPITAL_AND_MEDICAL_CARE = new SearchStatsSender$SearchCategoryGroup("HOSPITAL_AND_MEDICAL_CARE", 11);
    public static final SearchStatsSender$SearchCategoryGroup HOTELS_AND_LODGING = new SearchStatsSender$SearchCategoryGroup("HOTELS_AND_LODGING", 12);
    public static final SearchStatsSender$SearchCategoryGroup OUTDOOR_PARKS = new SearchStatsSender$SearchCategoryGroup("OUTDOOR_PARKS", 13);
    public static final SearchStatsSender$SearchCategoryGroup CRISIS_LOCATION = new SearchStatsSender$SearchCategoryGroup("CRISIS_LOCATION", 14);

    private static final /* synthetic */ SearchStatsSender$SearchCategoryGroup[] $values() {
        return new SearchStatsSender$SearchCategoryGroup[]{SAVED_PLACES, DRIVE_THRU, PARKING, GAS_STATION, FOOD, MORE, COFFEE, SHOPPING, PHARMACIES, GROCERY_STORES, CHARGING_STATION, HOSPITAL_AND_MEDICAL_CARE, HOTELS_AND_LODGING, OUTDOOR_PARKS, CRISIS_LOCATION};
    }

    static {
        SearchStatsSender$SearchCategoryGroup[] searchStatsSender$SearchCategoryGroupArr$values = $values();
        $VALUES = searchStatsSender$SearchCategoryGroupArr$values;
        $ENTRIES = h.d.b.a(searchStatsSender$SearchCategoryGroupArr$values);
    }

    private SearchStatsSender$SearchCategoryGroup(String str, int i2) {
    }

    public static h.d.a<SearchStatsSender$SearchCategoryGroup> getEntries() {
        return $ENTRIES;
    }

    public static SearchStatsSender$SearchCategoryGroup valueOf(String str) {
        return (SearchStatsSender$SearchCategoryGroup) Enum.valueOf(SearchStatsSender$SearchCategoryGroup.class, str);
    }

    public static SearchStatsSender$SearchCategoryGroup[] values() {
        return (SearchStatsSender$SearchCategoryGroup[]) $VALUES.clone();
    }
}
