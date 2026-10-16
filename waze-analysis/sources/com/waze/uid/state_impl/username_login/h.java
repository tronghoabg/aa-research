package com.waze.uid.state_impl.username_login;

import com.waze.web.r;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class h implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44708a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44709b;

    public /* synthetic */ h(Object obj, int i2) {
        this.f44709b = i2;
        this.f44708a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, org.a.d.a.a] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f44709b;
        if (i2 == 0) {
            return i.a((i) this.f44708a);
        }
        ?? r3 = this.f44708a;
        if (i2 != 1) {
            return r.l((Class) r3, null);
        }
        if (r3 instanceof org.a.d.a.b) {
            org.a.d.k.b bVarL = ((org.a.d.a.b) r3).l();
            int i3 = ar.f48106a;
            return bVarL.a(new h.g.b.m(com.waze.sharedui.api.d.class), null, null);
        }
        org.a.d.k.b bVarC = r3.getKoin().a().c();
        int i4 = ar.f48106a;
        return bVarC.a(new h.g.b.m(com.waze.sharedui.api.d.class), null, null);
    }

    public h(org.a.d.a.a aVar, int i2) {
        this.f44709b = i2;
        this.f44708a = aVar;
    }
}
