package com.waze.asks;

import java.util.ArrayList;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15486a;

    public ab(com.waze.shared_infra.i.e eVar, com.waze.main_screen.af.a.i iVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(iVar, "controller");
        int i2 = kotlinx.coroutines.av.f51370a;
        kotlinx.coroutines.aj.e(kotlinx.coroutines.e.ac.f51860a);
        this.f15486a = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
    }

    public final bq a() {
        return (bq) this.f15486a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.f, java.lang.Object] */
    public final int b() {
        return ((Number) this.f15486a.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.f, java.lang.Object] */
    public final long c() {
        Object value = this.f15486a.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final com.waze.map.bq d() {
        return (com.waze.map.bq) h.a.i.U(this.f15486a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void e(com.waze.map.bq bqVar) {
        h.g.b.x.f(bqVar, "view");
        ?? r1 = this.f15486a;
        r1.remove(bqVar);
        r1.add(bqVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void f(com.waze.map.bq bqVar) {
        h.g.b.x.f(bqVar, "view");
        this.f15486a.remove(bqVar);
    }

    public ab(byte[] bArr) {
        this.f15486a = h.g.a(new android.support.v4.a.a.c(13));
    }

    public ab() {
        this.f15486a = h.g.a(new android.support.v4.a.a.c(14));
    }

    public ab(byte[] bArr, byte[] bArr2) {
        this.f15486a = new ArrayList();
    }
}
