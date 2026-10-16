package com.waze.navigate;

import com.waze.hw;
import com.waze.jni.protos.navigate.DriveTo;
import l.a.alx;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bm implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f31122e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f31123f;

    public /* synthetic */ bm(bt btVar, int i2, int i3, alx alxVar, DriveTo.DangerZoneStatType dangerZoneStatType, int i4) {
        this.f31123f = i4;
        this.f31121d = btVar;
        this.f31118a = i2;
        this.f31119b = i3;
        this.f31122e = alxVar;
        this.f31120c = dangerZoneStatType;
    }

    @Override // com.waze.hw
    public final Object a() {
        if (this.f31123f != 0) {
            Object obj = this.f31120c;
            Object obj2 = this.f31122e;
            int i2 = this.f31119b;
            bt.addDangerZoneStat$lambda$0((bt) this.f31121d, this.f31118a, i2, (alx) obj2, (DriveTo.DangerZoneStatType) obj);
            return null;
        }
        int i3 = this.f31119b;
        Object obj3 = this.f31122e;
        Object obj4 = this.f31121d;
        bt.setProductPrices$lambda$0((bt) this.f31120c, this.f31118a, (float[]) obj4, (int[]) obj3, i3);
        return null;
    }

    public /* synthetic */ bm(bt btVar, int i2, float[] fArr, int[] iArr, int i3, int i4) {
        this.f31123f = i4;
        this.f31120c = btVar;
        this.f31118a = i2;
        this.f31121d = fArr;
        this.f31122e = iArr;
        this.f31119b = i3;
    }
}
