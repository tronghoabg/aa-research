package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class es {

    /* renamed from: a, reason: collision with root package name */
    protected volatile fi f12915a;

    /* renamed from: b, reason: collision with root package name */
    private final fi f12916b;

    /* renamed from: c, reason: collision with root package name */
    private final de f12917c;

    /* renamed from: d, reason: collision with root package name */
    private volatile v f12918d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f12919e;

    es(fi fiVar) {
        if (fiVar == null) {
            throw new IllegalArgumentException("message cannot be null");
        }
        this.f12915a = fiVar;
        this.f12916b = fiVar.getDefaultInstanceForType();
        this.f12917c = de.f12840a;
        this.f12918d = null;
        this.f12919e = false;
    }

    final int a() {
        return ae.L(this.f12918d != null ? this.f12918d.c() : this.f12915a.getSerializedSize());
    }

    final v b() {
        if (this.f12918d != null) {
            return this.f12918d;
        }
        synchronized (this) {
            if (this.f12918d != null) {
                return this.f12918d;
            }
            this.f12918d = this.f12915a.toByteString();
            return this.f12918d;
        }
    }

    final fi c() {
        try {
            return this.f12915a;
        } catch (eu unused) {
            de.f();
            return this.f12916b;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es)) {
            return c().equals(obj);
        }
        es esVar = (es) obj;
        if (this.f12918d == null || esVar.f12918d == null || this.f12917c != esVar.f12917c || !this.f12918d.equals(esVar.f12918d)) {
            return c().equals(esVar.c());
        }
        return true;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return c().toString();
    }
}
