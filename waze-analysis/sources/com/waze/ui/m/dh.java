package com.waze.ui.m;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class dh implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f42966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42968c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42969d;

    public /* synthetic */ dh(Object obj, boolean z, int i2, int i3) {
        this.f42969d = i3;
        this.f42968c = obj;
        this.f42966a = z;
        this.f42967b = i2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.waze.ui.ac.i, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42969d != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f42967b;
            boolean z = this.f42966a;
            return dc.H(this.f42968c, z, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f42967b;
        boolean z2 = this.f42966a;
        return dj.j(this.f42968c, z2, i3, (Composer) obj);
    }
}
