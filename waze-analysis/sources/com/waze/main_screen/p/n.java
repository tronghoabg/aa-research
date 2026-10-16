package com.waze.main_screen.p;

import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class n implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f27305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27306b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27307c;

    public /* synthetic */ n(Density density, bf bfVar, int i2) {
        this.f27307c = i2;
        this.f27306b = density;
        this.f27305a = bfVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f27307c;
        if (i2 == 0) {
            kotlinx.coroutines.aj.z(this.f27305a, null, null, new ar((bf) this.f27306b, (h.c.e) null, 2, (char[]) null), 3);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            return Integer.valueOf(bf.b(this.f27306b, (bf) this.f27305a));
        }
        kotlinx.coroutines.aj.z(this.f27305a, null, null, new ar((bf) this.f27306b, (h.c.e) null, 1, (byte[]) null), 3);
        return h.ab.f48028a;
    }

    public /* synthetic */ n(kotlinx.coroutines.af afVar, bf bfVar, int i2) {
        this.f27307c = i2;
        this.f27305a = afVar;
        this.f27306b = bfVar;
    }
}
