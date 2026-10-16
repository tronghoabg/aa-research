package com.waze.map.main;

import com.waze.navigate.AddressItem;
import l.a.aqp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    public static final aq f29339a;

    /* renamed from: b, reason: collision with root package name */
    public static final aq f29340b;

    /* renamed from: c, reason: collision with root package name */
    public static final aq f29341c;

    /* renamed from: d, reason: collision with root package name */
    public static final aq f29342d;

    /* renamed from: e, reason: collision with root package name */
    public static final aq f29343e;

    /* renamed from: f, reason: collision with root package name */
    public static final aq f29344f;

    /* renamed from: g, reason: collision with root package name */
    public static final aq f29345g;

    /* renamed from: h, reason: collision with root package name */
    public static final aq f29346h;

    /* renamed from: i, reason: collision with root package name */
    public static final aq f29347i;

    /* renamed from: j, reason: collision with root package name */
    public static final aq f29348j;

    /* renamed from: k, reason: collision with root package name */
    public static final aq f29349k;

    /* renamed from: l, reason: collision with root package name */
    public static final aq f29350l;
    private static final /* synthetic */ aq[] m;
    private final aqp n;

    static {
        aq aqVar = new aq("CurrentLocation", 0, aqp.PIN_TYPE_CURRENT_LOCATION);
        f29339a = aqVar;
        aq aqVar2 = new aq(AddressItem.HOME, 1, aqp.PIN_TYPE_HOME);
        f29340b = aqVar2;
        aq aqVar3 = new aq(AddressItem.WORK, 2, aqp.PIN_TYPE_WORK);
        f29341c = aqVar3;
        aq aqVar4 = new aq("Wazer", 3, aqp.PIN_TYPE_WAZER);
        f29342d = aqVar4;
        aq aqVar5 = new aq("YourParking", 4, aqp.PIN_TYPE_YOUR_PARKING);
        f29343e = aqVar5;
        aq aqVar6 = new aq("Parking", 5, aqp.PIN_TYPE_PARKING);
        f29344f = aqVar6;
        aq aqVar7 = new aq("Venue", 6, aqp.PIN_TYPE_VENUE);
        f29345g = aqVar7;
        aq aqVar8 = new aq("DroppedPin", 7, aqp.PIN_TYPE_DROPPED_PIN);
        f29346h = aqVar8;
        aq aqVar9 = new aq("SearchResult", 8, aqp.PIN_TYPE_SEARCH_RESULT);
        f29347i = aqVar9;
        aq aqVar10 = new aq("ShowOnMap", 9, aqp.PIN_TYPE_SHOW_ON_MAP);
        f29348j = aqVar10;
        aq aqVar11 = new aq("SetStartPoint", 10, aqp.PIN_TYPE_SET_START_POINT);
        f29349k = aqVar11;
        aq aqVar12 = new aq("OriginalDestination", 11, aqp.PIN_TYPE_ORIGINAL_DESTINATION);
        f29350l = aqVar12;
        aq[] aqVarArr = {aqVar, aqVar2, aqVar3, aqVar4, aqVar5, aqVar6, aqVar7, aqVar8, aqVar9, aqVar10, aqVar11, aqVar12};
        m = aqVarArr;
        h.d.b.a(aqVarArr);
    }

    private aq(String str, int i2, aqp aqpVar) {
        this.n = aqpVar;
    }

    public static aq[] values() {
        return (aq[]) m.clone();
    }

    public final aqp a() {
        return this.n;
    }
}
