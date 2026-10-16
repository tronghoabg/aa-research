package com.waze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ImageTypeToIconMapping$ImageType {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ ImageTypeToIconMapping$ImageType[] $VALUES;
    private final long numericValue;
    public static final ImageTypeToIconMapping$ImageType Preferred = new ImageTypeToIconMapping$ImageType("Preferred", 0, 5);
    public static final ImageTypeToIconMapping$ImageType Traffic = new ImageTypeToIconMapping$ImageType("Traffic", 1, 6);
    public static final ImageTypeToIconMapping$ImageType Accident = new ImageTypeToIconMapping$ImageType("Accident", 2, 7);
    public static final ImageTypeToIconMapping$ImageType Construction = new ImageTypeToIconMapping$ImageType("Construction", 3, 8);
    public static final ImageTypeToIconMapping$ImageType Pothole = new ImageTypeToIconMapping$ImageType("Pothole", 4, 9);
    public static final ImageTypeToIconMapping$ImageType BrokenTrafficLight = new ImageTypeToIconMapping$ImageType("BrokenTrafficLight", 5, 10);
    public static final ImageTypeToIconMapping$ImageType Weather = new ImageTypeToIconMapping$ImageType("Weather", 6, 11);
    public static final ImageTypeToIconMapping$ImageType SlipperyRoad = new ImageTypeToIconMapping$ImageType("SlipperyRoad", 7, 12);
    public static final ImageTypeToIconMapping$ImageType Flood = new ImageTypeToIconMapping$ImageType("Flood", 8, 13);
    public static final ImageTypeToIconMapping$ImageType UnplowedRoad = new ImageTypeToIconMapping$ImageType("UnplowedRoad", 9, 14);
    public static final ImageTypeToIconMapping$ImageType Fog = new ImageTypeToIconMapping$ImageType("Fog", 10, 15);
    public static final ImageTypeToIconMapping$ImageType IcyRoad = new ImageTypeToIconMapping$ImageType("IcyRoad", 11, 16);
    public static final ImageTypeToIconMapping$ImageType BlockedLane = new ImageTypeToIconMapping$ImageType("BlockedLane", 12, 17);

    private static final /* synthetic */ ImageTypeToIconMapping$ImageType[] $values() {
        return new ImageTypeToIconMapping$ImageType[]{Preferred, Traffic, Accident, Construction, Pothole, BrokenTrafficLight, Weather, SlipperyRoad, Flood, UnplowedRoad, Fog, IcyRoad, BlockedLane};
    }

    static {
        ImageTypeToIconMapping$ImageType[] imageTypeToIconMapping$ImageTypeArr$values = $values();
        $VALUES = imageTypeToIconMapping$ImageTypeArr$values;
        $ENTRIES = h.d.b.a(imageTypeToIconMapping$ImageTypeArr$values);
    }

    private ImageTypeToIconMapping$ImageType(String str, int i2, long j2) {
        this.numericValue = j2;
    }

    public static h.d.a<ImageTypeToIconMapping$ImageType> getEntries() {
        return $ENTRIES;
    }

    public static ImageTypeToIconMapping$ImageType valueOf(String str) {
        return (ImageTypeToIconMapping$ImageType) Enum.valueOf(ImageTypeToIconMapping$ImageType.class, str);
    }

    public static ImageTypeToIconMapping$ImageType[] values() {
        return (ImageTypeToIconMapping$ImageType[]) $VALUES.clone();
    }

    public final long getNumericValue() {
        return this.numericValue;
    }
}
