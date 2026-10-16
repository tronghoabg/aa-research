package com.waze.google_assistant;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class az {

    /* renamed from: a, reason: collision with root package name */
    public static final az f24127a;

    /* renamed from: b, reason: collision with root package name */
    public static final az f24128b;

    /* renamed from: c, reason: collision with root package name */
    public static final az f24129c;

    /* renamed from: d, reason: collision with root package name */
    public static final az f24130d;

    /* renamed from: e, reason: collision with root package name */
    public static final az f24131e;

    /* renamed from: f, reason: collision with root package name */
    public static final az f24132f;

    /* renamed from: g, reason: collision with root package name */
    public static final az f24133g;

    /* renamed from: h, reason: collision with root package name */
    public static final az f24134h;

    /* renamed from: i, reason: collision with root package name */
    public static final az f24135i;

    /* renamed from: j, reason: collision with root package name */
    public static final az f24136j;

    /* renamed from: k, reason: collision with root package name */
    public static final az f24137k;

    /* renamed from: l, reason: collision with root package name */
    public static final az f24138l;
    public static final az m;
    public static final az n;
    public static final az o;
    public static final az p;
    public static final az q;
    public static final az r;
    public static final az s;
    public static final az t;
    public static final az u;
    public static final az v;
    public static final az w;
    public static final az x;
    private static final /* synthetic */ az[] y;
    private final String A;
    private final String z;

    static {
        az azVar = new az("MUTE", 0, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "mute");
        f24127a = azVar;
        az azVar2 = new az("UNMUTE", 1, ExifInterface.GPS_MEASUREMENT_2D, "unmute");
        f24128b = azVar2;
        az azVar3 = new az("SHOW_ALTERNATES", 2, "7", "show_alternates");
        f24129c = azVar3;
        az azVar4 = new az("ROUTE_OVERVIEW", 3, "8", "route_overview");
        f24130d = azVar4;
        az azVar5 = new az("EXIT_NAVIGATION", 4, "9", "exit_navigation");
        f24131e = azVar5;
        az azVar6 = new az("HELP", 5, "10", null);
        f24132f = azVar6;
        az azVar7 = new az("DISTANCE_TO_DESTINATION", 6, "14", "distance_to_destination");
        f24133g = azVar7;
        az azVar8 = new az("TIME_TO_DESTINATION", 7, "15", "time_to_destination");
        f24134h = azVar8;
        az azVar9 = new az("ETA", 8, "16", "eta");
        f24135i = azVar9;
        az azVar10 = new az("GO_BACK", 9, "17", "go_back");
        f24136j = azVar10;
        az azVar11 = new az("SHOW_DIRECTIONS_LIST", 10, "19", "show_directions_list");
        f24137k = azVar11;
        az azVar12 = new az("SEARCH", 11, "24", null);
        f24138l = azVar12;
        az azVar13 = new az("FOLLOW_MODE", 12, "28", "follow_mode");
        m = azVar13;
        az azVar14 = new az("SHOW_MAP", 13, "31", null);
        n = azVar14;
        az azVar15 = new az("AVOID_TOLLS", 14, "35", "avoid_tolls");
        o = azVar15;
        az azVar16 = new az("ALLOW_TOLLS", 15, "36", "allow_tolls");
        p = azVar16;
        az azVar17 = new az("AVOID_FERRIES", 16, "37", "avoid_ferries");
        q = azVar17;
        az azVar18 = new az("ALLOW_FERRIES", 17, "38", "allow_ferries");
        r = azVar18;
        az azVar19 = new az("AVOID_HIGHWAYS", 18, "39", "avoid_highways");
        s = azVar19;
        az azVar20 = new az("ALLOW_HIGHWAYS", 19, "40", "allow_highways");
        t = azVar20;
        az azVar21 = new az("REPORT_CRASH", 20, "41", "report_crash");
        u = azVar21;
        az azVar22 = new az("REPORT_TRAFFIC_JAM", 21, "44", "report_traffic_jam");
        v = azVar22;
        az azVar23 = new az("REPORT_POLICE", 22, "45", "report_police");
        w = azVar23;
        az azVar24 = new az("REPORT_HAZARD", 23, "46", "report_hazard");
        x = azVar24;
        az[] azVarArr = {azVar, azVar2, azVar3, azVar4, azVar5, azVar6, azVar7, azVar8, azVar9, azVar10, azVar11, azVar12, azVar13, azVar14, azVar15, azVar16, azVar17, azVar18, azVar19, azVar20, azVar21, azVar22, azVar23, azVar24};
        y = azVarArr;
        h.d.b.a(azVarArr);
    }

    private az(String str, int i2, String str2, String str3) {
        this.z = str2;
        this.A = str3;
    }

    public static az[] values() {
        return (az[]) y.clone();
    }

    public final String a() {
        return this.A;
    }

    public final String b() {
        return this.z;
    }
}
