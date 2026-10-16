package com.google.android.gms.common.internal;

import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private Object f5042a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5043b;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f5044d;

    public e(m mVar, Object obj) {
        Objects.requireNonNull(mVar);
        this.f5044d = mVar;
        this.f5042a = obj;
        this.f5043b = false;
    }

    protected abstract void a(Object obj);

    public final void d() {
        Object obj;
        synchronized (this) {
            obj = this.f5042a;
            if (this.f5043b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f5043b = true;
        }
        f();
    }

    public final void e() {
        synchronized (this) {
            this.f5042a = null;
        }
    }

    public final void f() {
        e();
        m mVar = this.f5044d;
        synchronized (mVar.n) {
            mVar.n.remove(this);
        }
    }
}
