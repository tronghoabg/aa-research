package com.waze.app_nav;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f15433a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    private final Class f15434b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f15435c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15436d;

    public p(Class cls, Bundle bundle) {
        h.g.b.x.f(bundle, "bundle");
        this.f15434b = cls;
        this.f15435c = bundle;
        this.f15436d = f15433a.incrementAndGet();
    }

    public final long a() {
        return this.f15436d;
    }

    public final Bundle b() {
        return this.f15435c;
    }

    public final Class c() {
        return this.f15434b;
    }

    public boolean equals(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null) {
            return pVar.f15436d == this.f15436d;
        }
        return false;
    }

    public int hashCode() {
        return a.a.b(this.f15436d);
    }

    public final String toString() {
        Class cls = this.f15434b;
        String name = cls != null ? cls.getName() : null;
        return "Flow(id=" + this.f15436d + ", clazz=" + name + ", bundle=" + this.f15435c + ")";
    }

    public /* synthetic */ p(Class cls, Bundle bundle, int i2) {
        this(cls, (i2 & 2) != 0 ? new Bundle() : bundle);
    }
}
