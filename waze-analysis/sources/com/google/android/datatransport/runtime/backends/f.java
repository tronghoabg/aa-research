package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4165a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4166b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.c.a f4167c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4168d;

    f(Context context, com.google.android.datatransport.runtime.c.a aVar, com.google.android.datatransport.runtime.c.a aVar2, String str) {
        this.f4165a = context;
        this.f4166b = aVar;
        this.f4167c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4168d = str;
    }

    public final Context a() {
        return this.f4165a;
    }

    public final com.google.android.datatransport.runtime.c.a b() {
        return this.f4167c;
    }

    public final com.google.android.datatransport.runtime.c.a c() {
        return this.f4166b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f4165a.equals(fVar.f4165a) && this.f4166b.equals(fVar.f4166b) && this.f4167c.equals(fVar.f4167c) && this.f4168d.equals(fVar.f4168d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f4165a.hashCode() ^ 1000003) * 1000003) ^ this.f4166b.hashCode()) * 1000003) ^ this.f4167c.hashCode();
        return this.f4168d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        com.google.android.datatransport.runtime.c.a aVar = this.f4167c;
        com.google.android.datatransport.runtime.c.a aVar2 = this.f4166b;
        return "CreationContext{applicationContext=" + this.f4165a.toString() + ", wallClock=" + aVar2.toString() + ", monotonicClock=" + aVar.toString() + ", backendName=" + this.f4168d + "}";
    }

    public f() {
        throw null;
    }
}
