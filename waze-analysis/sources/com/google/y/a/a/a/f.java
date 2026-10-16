package com.google.y.a.a.a;

import androidx.compose.foundation.style.StylePropertiesKt;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    private final long f13420a;

    f(long j2) {
        this.f13420a = j2;
    }

    @Override // com.google.y.a.a.a.j
    protected final int a() {
        return d(this.f13420a >= 0 ? (byte) 0 : StylePropertiesKt.ZIndexId);
    }

    public final long c() {
        return this.f13420a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j jVar = (j) obj;
        return a() != jVar.a() ? a() - jVar.a() : Long.compare(Math.abs(this.f13420a), Math.abs(((f) jVar).f13420a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f13420a == ((f) obj).f13420a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a()), Long.valueOf(this.f13420a));
    }

    public final String toString() {
        return Long.toString(this.f13420a);
    }
}
