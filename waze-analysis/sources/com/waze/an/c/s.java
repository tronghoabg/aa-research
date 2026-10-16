package com.waze.an.c;

import androidx.compose.foundation.ScrollState;
import com.waze.main_screen.t.al;
import com.waze.main_screen.t.am;
import com.waze.search.h.bd;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14807b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f14808c;

    public /* synthetic */ s(Object obj, boolean z, int i2) {
        this.f14808c = i2;
        this.f14807b = obj;
        this.f14806a = z;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f14808c;
        if (i2 == 0) {
            if (this.f14806a) {
                this.f14807b.invoke();
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            this.f14807b.invoke(Boolean.valueOf(!this.f14806a));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            if (this.f14806a) {
                this.f14807b.invoke();
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            return Float.valueOf(al.a((am) this.f14807b, this.f14806a));
        }
        if (i2 != 4) {
            int i3 = com.waze.ui.o.ae.f43122a;
            return Boolean.valueOf(((ScrollState) this.f14807b).getValue() > 70 && this.f14806a);
        }
        org.a.d.k.b bVarL = ((com.waze.search.r) this.f14807b).l();
        int i4 = ar.f48106a;
        return com.waze.ch.a.a.f.g(new bd(this.f14806a, ((com.waze.br.b.p) bVarL.a(new h.g.b.m(com.waze.br.b.p.class), null, null)).a()));
    }

    public /* synthetic */ s(boolean z, Object obj, int i2) {
        this.f14808c = i2;
        this.f14806a = z;
        this.f14807b = obj;
    }
}
