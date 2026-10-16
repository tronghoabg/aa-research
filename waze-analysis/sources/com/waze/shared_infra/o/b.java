package com.waze.shared_infra.o;

import h.g.b.ar;
import h.g.b.m;
import org.a.b.b.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f37916a = new b();

    public static final a a() {
        org.a.d.k.b bVarC;
        m mVar;
        org.a.d.a.a aVar = f37916a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new m(a.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(a.class);
        }
        return (a) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return d.e();
    }
}
