package com.google.android.gms.o;

import com.google.android.gms.common.api.internal.av;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f5767a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f5768b;

    l(j jVar, t tVar) {
        this.f5767a = tVar;
        Objects.requireNonNull(jVar);
        this.f5768b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f5768b;
        synchronized (jVar.f5764b) {
            m mVar = jVar.f5766d;
            Exception excF = this.f5767a.f();
            av.m(excF);
            Exception exc = excF;
            mVar.onFailure(excF);
        }
    }
}
