package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4826a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4827b = false;

    /* renamed from: c, reason: collision with root package name */
    public final int f4828c;

    public h(int i2) {
        this.f4828c = i2;
    }

    static /* bridge */ /* synthetic */ Status j(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void f(Status status);

    public abstract void g(Exception exc);

    public abstract void h(ad adVar);

    public abstract void i(u uVar, boolean z);

    public final void k(boolean z) {
        this.f4826a = z;
    }

    public final boolean l() {
        return this.f4827b;
    }

    public final boolean m() {
        return this.f4826a;
    }

    public final void n() {
        this.f4827b = true;
    }
}
