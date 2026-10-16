package com.google.android.gms.common.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f26596a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1717f f26598c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26599d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f26600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC1717f f26601f;

    public G(AbstractC1717f abstractC1717f, int i5, Bundle bundle) {
        this.f26601f = abstractC1717f;
        Boolean bool = Boolean.TRUE;
        this.f26598c = abstractC1717f;
        this.f26596a = bool;
        this.f26597b = false;
        this.f26599d = i5;
        this.f26600e = bundle;
    }

    public abstract boolean a();

    public abstract void b(d7.b bVar);

    public final void c() {
        d();
        AbstractC1717f abstractC1717f = this.f26598c;
        synchronized (abstractC1717f.zzj()) {
            abstractC1717f.zzj().remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.f26596a = null;
        }
    }
}
