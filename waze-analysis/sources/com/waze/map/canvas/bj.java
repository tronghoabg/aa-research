package com.waze.map.canvas;

import com.waze.jni.protos.map.canvas.MainCanvasCameraStateProto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    public static final bj f28599a;

    /* renamed from: b, reason: collision with root package name */
    public static final bj f28600b;

    /* renamed from: c, reason: collision with root package name */
    public static final bj f28601c;

    /* renamed from: d, reason: collision with root package name */
    public static final bj f28602d;

    /* renamed from: e, reason: collision with root package name */
    public static final bj f28603e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ bj[] f28604f;

    /* renamed from: g, reason: collision with root package name */
    private final MainCanvasCameraStateProto f28605g;

    static {
        bj bjVar = new bj("Overview", 0, MainCanvasCameraStateProto.OVERVIEW);
        f28599a = bjVar;
        bj bjVar2 = new bj("OverviewWithOffset", 1, MainCanvasCameraStateProto.OVERVIEW_WITH_OFFSET);
        f28600b = bjVar2;
        bj bjVar3 = new bj("TrackingUserLocation", 2, MainCanvasCameraStateProto.TRACKING_USER_LOCATION);
        f28601c = bjVar3;
        bj bjVar4 = new bj("ExternalCanvas", 3, MainCanvasCameraStateProto.EXTERNAL_CANVAS);
        f28602d = bjVar4;
        bj bjVar5 = new bj("Other", 4, MainCanvasCameraStateProto.OTHER);
        f28603e = bjVar5;
        bj[] bjVarArr = {bjVar, bjVar2, bjVar3, bjVar4, bjVar5};
        f28604f = bjVarArr;
        h.d.b.a(bjVarArr);
    }

    private bj(String str, int i2, MainCanvasCameraStateProto mainCanvasCameraStateProto) {
        this.f28605g = mainCanvasCameraStateProto;
    }

    public static bj[] values() {
        return (bj[]) f28604f.clone();
    }

    public final MainCanvasCameraStateProto a() {
        return this.f28605g;
    }
}
