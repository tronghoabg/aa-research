package com.google.android.play.core.a;

import android.os.Bundle;
import com.google.android.gms.o.w;
import com.waze.navigate.di;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends com.google.android.play.core.a.b.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f6941a;

    /* renamed from: b, reason: collision with root package name */
    private final w f6942b;

    /* renamed from: c, reason: collision with root package name */
    private final di f6943c;

    k(l lVar, w wVar) {
        Objects.requireNonNull(lVar);
        this.f6941a = lVar;
        this.f6943c = new di("OnRequestIntegrityTokenCallback");
        this.f6942b = wVar;
    }

    @Override // com.google.android.play.core.a.b.e
    public final void a(Bundle bundle) {
        com.google.android.play.core.b.i iVar = this.f6941a.f6944a;
        w wVar = this.f6942b;
        iVar.q(wVar);
        this.f6943c.h("onRequestIntegrityToken", new Object[0]);
        int i2 = bundle.getInt("error");
        n nVar = null;
        if (i2 != 0) {
            bundle.getBoolean("is.error.remediable");
            nVar = new n(i2, null, null);
        }
        if (nVar != null) {
            wVar.d(nVar);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            wVar.d(new n(-100));
            return;
        }
        bundle.getLong("request.token.sid");
        Objects.requireNonNull(this);
        t tVar = new t();
        s sVar = new s();
        sVar.b(string);
        sVar.d(tVar);
        sVar.c();
        wVar.e(sVar.a());
    }
}
