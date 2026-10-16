package com.google.android.gms.common.api.internal;

import A7.V0;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1703q {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f26550a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f26551b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1701o f26552c;

    public C1703q(Looper looper, Object obj, String str) {
        this.f26550a = new V0(looper);
        AbstractC1732v.j(obj, "Listener must not be null");
        this.f26551b = obj;
        AbstractC1732v.f(str);
        this.f26552c = new C1701o(obj, str);
    }

    public final void a() {
        this.f26551b = null;
        this.f26552c = null;
    }

    public final void b(InterfaceC1702p interfaceC1702p) {
        this.f26550a.execute(new e0(this, interfaceC1702p));
    }

    public C1703q(Object obj, String str, Executor executor) {
        AbstractC1732v.j(executor, "Executor must not be null");
        this.f26550a = executor;
        AbstractC1732v.j(obj, "Listener must not be null");
        this.f26551b = obj;
        AbstractC1732v.f(str);
        this.f26552c = new C1701o(obj, str);
    }
}
