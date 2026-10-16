package com.waze.sharedui.utils;

import android.content.Context;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ org.a.d.a.a f39082a;

    public a(org.a.d.a.a aVar) {
        this.f39082a = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [android.content.Context, java.lang.Object] */
    @Override // h.g.a.a
    public final Context invoke() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = this.f39082a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(Context.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(Context.class);
        }
        return bVarC.a(mVar, null, null);
    }
}
