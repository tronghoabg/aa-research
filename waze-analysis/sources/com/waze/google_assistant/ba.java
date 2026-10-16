package com.waze.google_assistant;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    public static final ba f24142a;

    /* renamed from: b, reason: collision with root package name */
    public static final ba f24143b;

    /* renamed from: c, reason: collision with root package name */
    public static final ba f24144c;

    /* renamed from: d, reason: collision with root package name */
    public static final ba f24145d;

    /* renamed from: e, reason: collision with root package name */
    public static final ba f24146e;

    /* renamed from: f, reason: collision with root package name */
    public static final ba f24147f;

    /* renamed from: g, reason: collision with root package name */
    public static final ba f24148g;

    /* renamed from: h, reason: collision with root package name */
    public static final ba f24149h;

    /* renamed from: i, reason: collision with root package name */
    public static final ba f24150i;

    /* renamed from: j, reason: collision with root package name */
    public static final ba f24151j;

    /* renamed from: k, reason: collision with root package name */
    public static final ba f24152k;

    /* renamed from: l, reason: collision with root package name */
    public static final ba f24153l;
    public static final ba m;
    public static final ba n;
    public static final ba o;
    public static final ba p;
    public static final ba q;
    public static final ba r;
    public static final ba s;
    public static final ba t;
    private static final /* synthetic */ ba[] u;
    private final String v;
    private final String w;

    static {
        ba baVar = new ba("ACCIDENT_MAJOR", 0, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "major");
        f24142a = baVar;
        ba baVar2 = new ba("ACCIDENT_MINOR", 1, ExifInterface.GPS_MEASUREMENT_2D, "minor");
        f24143b = baVar2;
        ba baVar3 = new ba("HAZARD_ANIMAL", 2, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "animal");
        f24144c = baVar3;
        ba baVar4 = new ba("HAZARD_MISSING_SIGN", 3, ExifInterface.GPS_MEASUREMENT_2D, "missing_sign");
        f24145d = baVar4;
        ba baVar5 = new ba("HAZARD_FLOODING", 4, ExifInterface.GPS_MEASUREMENT_3D, "flooding");
        f24146e = baVar5;
        ba baVar6 = new ba("HAZARD_FOG", 5, "4", "fog");
        f24147f = baVar6;
        ba baVar7 = new ba("HAZARD_HAIL", 6, "5", "hail");
        f24148g = baVar7;
        ba baVar8 = new ba("HAZARD_ICE", 7, "6", "ice");
        f24149h = baVar8;
        ba baVar9 = new ba("HAZARD_SNOW", 8, "10", "snow");
        f24150i = baVar9;
        ba baVar10 = new ba("HAZARD_POTHOLE", 9, "7", "pothole");
        f24151j = baVar10;
        ba baVar11 = new ba("HAZARD_ROADKILL", 10, "8", "roadkill");
        f24152k = baVar11;
        ba baVar12 = new ba("HAZARD_STUCK_VEHICLE", 11, "9", "vehicle");
        f24153l = baVar12;
        ba baVar13 = new ba("HAZARD_CONSTRUCTION", 12, "11", "construction");
        m = baVar13;
        ba baVar14 = new ba("HAZARD_OBJECT_ON_ROAD", 13, "12", "object_on_road");
        n = baVar14;
        ba baVar15 = new ba("HAZARD_BROKEN_TRAFFIC_LIGHT", 14, "13", "broken_traffic_light");
        o = baVar15;
        ba baVar16 = new ba("TRAFFIC_MODERATE", 15, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "moderate");
        p = baVar16;
        ba baVar17 = new ba("TRAFFIC_HEAVY", 16, ExifInterface.GPS_MEASUREMENT_2D, "heavy");
        q = baVar17;
        ba baVar18 = new ba("TRAFFIC_STANDSTILL", 17, ExifInterface.GPS_MEASUREMENT_3D, "standstill");
        r = baVar18;
        ba baVar19 = new ba("REPORT_SIDE_OTHER", 18, ExifInterface.GPS_MEASUREMENT_2D, "other_side");
        s = baVar19;
        ba baVar20 = new ba("LOCATION_ON_ROAD_ON_SHOULDER", 19, ExifInterface.GPS_MEASUREMENT_2D, "on_shoulder");
        t = baVar20;
        ba[] baVarArr = {baVar, baVar2, baVar3, baVar4, baVar5, baVar6, baVar7, baVar8, baVar9, baVar10, baVar11, baVar12, baVar13, baVar14, baVar15, baVar16, baVar17, baVar18, baVar19, baVar20};
        u = baVarArr;
        h.d.b.a(baVarArr);
    }

    private ba(String str, int i2, String str2, String str3) {
        this.v = str2;
        this.w = str3;
    }

    public static ba[] values() {
        return (ba[]) u.clone();
    }

    public final String a() {
        return this.w;
    }

    public final String b() {
        return this.v;
    }
}
