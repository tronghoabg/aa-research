package com.waze.map;

import com.waze.jni.protos.map.MapPopupNativeInfo;
import com.waze.navigate.AddressItem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gu {

    /* renamed from: a, reason: collision with root package name */
    public static final gu f29181a;

    /* renamed from: b, reason: collision with root package name */
    public static final gu f29182b;

    /* renamed from: c, reason: collision with root package name */
    public static final gu f29183c;

    /* renamed from: d, reason: collision with root package name */
    public static final gu f29184d;

    /* renamed from: e, reason: collision with root package name */
    public static final gu f29185e;

    /* renamed from: f, reason: collision with root package name */
    public static final gu f29186f;

    /* renamed from: g, reason: collision with root package name */
    public static final gu f29187g;

    /* renamed from: h, reason: collision with root package name */
    public static final gu f29188h;

    /* renamed from: i, reason: collision with root package name */
    public static final gu f29189i;

    /* renamed from: j, reason: collision with root package name */
    public static final gu f29190j;

    /* renamed from: k, reason: collision with root package name */
    public static final gu f29191k;

    /* renamed from: l, reason: collision with root package name */
    public static final gu f29192l;
    public static final gu m;
    public static final com.waze.aj.b n;
    private static final /* synthetic */ gu[] o;
    private static final /* synthetic */ h.d.a p;

    static {
        gu guVar = new gu("None", 0);
        f29181a = guVar;
        gu guVar2 = new gu("MyLocation", 1);
        f29182b = guVar2;
        gu guVar3 = new gu("Segment", 2);
        f29183c = guVar3;
        gu guVar4 = new gu("ShowOnMap", 3);
        f29184d = guVar4;
        gu guVar5 = new gu("StartPoint", 4);
        f29185e = guVar5;
        gu guVar6 = new gu(AddressItem.HOME, 5);
        f29186f = guVar6;
        gu guVar7 = new gu(AddressItem.WORK, 6);
        f29187g = guVar7;
        gu guVar8 = new gu("Parked", 7);
        f29188h = guVar8;
        gu guVar9 = new gu("CanPark", 8);
        f29189i = guVar9;
        gu guVar10 = new gu("NewVenue", 9);
        f29190j = guVar10;
        gu guVar11 = new gu("User", 10);
        f29191k = guVar11;
        gu guVar12 = new gu("Search", 11);
        f29192l = guVar12;
        gu guVar13 = new gu("ParkingOrigDest", 12);
        m = guVar13;
        gu[] guVarArr = {guVar, guVar2, guVar3, guVar4, guVar5, guVar6, guVar7, guVar8, guVar9, guVar10, guVar11, guVar12, guVar13};
        o = guVarArr;
        p = h.d.b.a(guVarArr);
        n = new com.waze.aj.b(null);
    }

    public static h.d.a b() {
        return p;
    }

    public static gu[] values() {
        return (gu[]) o.clone();
    }

    public final MapPopupNativeInfo.WazeUiMapPopupType a() {
        switch (ordinal()) {
            case 0:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_none;
            case 1:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_my_location;
            case 2:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_segment;
            case 3:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_show_on_map;
            case 4:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_start_point;
            case 5:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_home;
            case 6:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_work;
            case 7:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_parked;
            case 8:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_can_park;
            case 9:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_new_venue;
            case 10:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_user;
            case 11:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_search;
            case 12:
                return MapPopupNativeInfo.WazeUiMapPopupType.waze_ui_map_popup_type_parking_orig_dest;
            default:
                throw new h.i();
        }
    }
}
