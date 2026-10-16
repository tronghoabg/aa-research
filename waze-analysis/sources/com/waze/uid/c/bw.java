package com.waze.uid.c;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class bw implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.p f44327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44328b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44329c;

    public /* synthetic */ bw(h.g.a.p pVar, int i2, int i3) {
        this.f44329c = i3;
        this.f44327a = pVar;
        this.f44328b = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f44329c != 0) {
            ((Integer) obj2).intValue();
            int i2 = this.f44328b;
            return cb.e(this.f44327a, i2, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i3 = this.f44328b;
        return cb.c(this.f44327a, i3, (Composer) obj);
    }
}
