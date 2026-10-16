package com.waze.car_lib.l;

import com.waze.R;
import com.waze.car_lib.p.dc;
import com.waze.car_lib.p.dg;
import h.g.b.x;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20296a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f20297b;

    public d(com.waze.shared_infra.o.a aVar) {
        x.f(aVar, "stringProvider");
        String str = aVar.c(R.string.AAOS_QR_LOGIN_SUCCEEDED_SCREEN_TITLE, new Object[0]) + "\n" + aVar.c(R.string.AAOS_QR_LOGIN_SUCCEEDED_SCREEN_MESSAGE, new Object[0]);
        this.f20297b = str;
        this.f20296a = new dg(aVar.c(R.string.AAOS_QR_LOGIN_SCREEN_TITLE, new Object[0]), str, Integer.valueOf(R.drawable.ic_t3_safe_drive_64px), false, new dc(aVar.c(R.string.AAOS_QR_LOGIN_SUCCEEDED_SCREEN_OK_BUTTON, new Object[0]), true), null, 32);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.bq] */
    public final bq a() {
        return this.f20297b;
    }

    public final dg b() {
        return (dg) this.f20296a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    public final h.g.a.a c() {
        return this.f20296a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    public final h.g.a.a d() {
        return this.f20297b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    public final void e(com.waze.car_lib.r.bq bqVar) {
        x.f(bqVar, "errorEvent");
        this.f20296a.c(bqVar);
    }

    public d(h.g.a.a aVar, h.g.a.a aVar2) {
        x.f(aVar, "onScreenShown");
        x.f(aVar2, "onBackPressed");
        this.f20297b = aVar;
        this.f20296a = aVar2;
    }

    public d(byte[] bArr) {
        bm bmVarE = bu.e(0, 1, null, 5);
        this.f20296a = bmVarE;
        this.f20297b = bmVarE;
    }

    public d() {
        throw null;
    }
}
