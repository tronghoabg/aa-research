package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    protected final l f4821a;

    public d(l lVar) {
        super(1);
        this.f4821a = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void f(Status status) {
        try {
            this.f4821a.f(status);
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void g(Exception exc) {
        try {
            this.f4821a.f(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e2) {
            Log.w("ApiCallRunner", "Exception reporting failure", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void h(ad adVar) throws DeadObjectException {
        try {
            this.f4821a.e(adVar.f());
        } catch (RuntimeException e2) {
            g(e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void i(u uVar, boolean z) {
        uVar.c(this.f4821a, z);
    }
}
