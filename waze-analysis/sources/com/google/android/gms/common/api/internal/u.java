package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4850a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4851b;

    public u() {
        this.f4850a = DesugarCollections.synchronizedMap(new WeakHashMap());
        this.f4851b = DesugarCollections.synchronizedMap(new WeakHashMap());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    private final void j(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        ?? r0 = this.f4850a;
        synchronized (r0) {
            map = new HashMap((Map) r0);
        }
        ?? r3 = this.f4851b;
        synchronized (r3) {
            map2 = new HashMap((Map) r3);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).g(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((com.google.android.gms.o.w) entry2.getKey()).d(new com.google.android.gms.common.api.i(status));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    final void c(BasePendingResult basePendingResult, boolean z) {
        this.f4850a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.c(new s(this, basePendingResult));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    final void d(com.google.android.gms.o.w wVar, boolean z) {
        this.f4851b.put(wVar, Boolean.valueOf(z));
        wVar.a().m(new t(this, wVar));
    }

    final void e(int i2, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i2 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i2 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        j(true, new Status(20, sb.toString()));
    }

    public final void f() {
        j(false, ah.f4735a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    final boolean g() {
        return (this.f4850a.isEmpty() && this.f4851b.isEmpty()) ? false : true;
    }

    public final com.google.android.gms.common.api.a h() {
        return (com.google.android.gms.common.api.a) this.f4850a;
    }

    public final String i() {
        return (String) this.f4851b;
    }

    public u(String str, com.google.android.gms.common.api.a aVar) {
        this.f4851b = str;
        this.f4850a = aVar;
    }
}
