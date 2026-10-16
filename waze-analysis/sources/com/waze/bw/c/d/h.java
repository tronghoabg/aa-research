package com.waze.bw.c.d;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18119b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f18120c;

    public /* synthetic */ h(Object obj, int i2, int i3) {
        this.f18120c = i3;
        this.f18119b = obj;
        this.f18118a = i2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f18120c;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f18118a;
            return v.D(this.f18119b, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f18118a;
            return v.B(this.f18119b, i4, (Composer) obj);
        }
        if (i2 == 2) {
            ((Integer) obj2).intValue();
            int i5 = this.f18118a;
            return v.C(this.f18119b, i5, (Composer) obj);
        }
        if (i2 != 3) {
            ((Integer) obj2).intValue();
            int i6 = this.f18118a;
            return ct.e(this.f18119b, i6, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i7 = this.f18118a;
        return v.E(this.f18119b, i7, (Composer) obj);
    }
}
