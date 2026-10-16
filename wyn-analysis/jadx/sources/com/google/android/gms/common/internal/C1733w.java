package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.InterfaceC1694h;
import com.google.android.gms.common.api.internal.InterfaceC1704s;

/* renamed from: com.google.android.gms.common.internal.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1733w implements InterfaceC1715d, InterfaceC1713b, InterfaceC1714c, InterfaceC1731u {

    /* renamed from: b, reason: collision with root package name */
    public static C1733w f26694b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1734x f26695c = new C1734x(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f26696a;

    public /* synthetic */ C1733w(Object obj) {
        this.f26696a = obj;
    }

    public static synchronized C1733w c() {
        try {
            if (f26694b == null) {
                f26694b = new C1733w();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f26694b;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1731u
    public Object a(com.google.android.gms.common.api.t tVar) {
        C7.d dVar = (C7.d) this.f26696a;
        dVar.f421a = tVar;
        return dVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1715d
    public void b(d7.b bVar) {
        boolean zV = bVar.V();
        AbstractC1717f abstractC1717f = (AbstractC1717f) this.f26696a;
        if (zV) {
            abstractC1717f.getRemoteService(null, abstractC1717f.getScopes());
        } else if (abstractC1717f.zzl() != null) {
            abstractC1717f.zzl().onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public void onConnected(Bundle bundle) {
        ((InterfaceC1694h) this.f26696a).onConnected();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1714c
    public void onConnectionFailed(d7.b bVar) {
        ((InterfaceC1704s) this.f26696a).onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public void onConnectionSuspended(int i5) {
        ((InterfaceC1694h) this.f26696a).onConnectionSuspended(i5);
    }
}
