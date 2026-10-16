package com.waze.car_lib;

import android.database.Cursor;
import android.net.Uri;
import com.waze.sound.SoundNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends com.waze.e.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bl f19188a;

    /* JADX WARN: Illegal instructions before constructor call */
    bj(bl blVar) {
        this.f19188a = blVar;
        org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
        int i2 = h.g.b.ar.f48106a;
        super((com.waze.bj) bVarC.a(new h.g.b.m(com.waze.bj.class), null, null), (com.waze.favorites.k) com.waze.web.r.k().a().c().a(new h.g.b.m(com.waze.favorites.k.class), null, null), (SoundNativeManager) com.waze.web.r.k().a().c().a(new h.g.b.m(SoundNativeManager.class), null, null), (com.waze.shared_infra.o.a) com.waze.web.r.k().a().c().a(new h.g.b.m(com.waze.shared_infra.o.a.class), null, null), (com.waze.search.bn) com.waze.web.r.k().a().c().a(new h.g.b.m(com.waze.search.bn.class), null, null), (com.waze.e.b) com.waze.web.r.k().a().c().a(new h.g.b.m(com.waze.e.b.class), null, null), (com.waze.google_assistant.ah) com.waze.web.r.k().a().c().a(new h.g.b.m(com.waze.google_assistant.ah.class), null, null));
    }

    @Override // com.waze.cr
    public final Uri a() {
        return null;
    }

    @Override // com.waze.cr
    public final String b() {
        String packageName = this.f19188a.getCarContext().getPackageName();
        h.g.b.x.e(packageName, "getPackageName(...)");
        return packageName;
    }

    @Override // com.waze.cr
    public final Cursor h(Uri uri, String[] strArr, String str) {
        return null;
    }
}
