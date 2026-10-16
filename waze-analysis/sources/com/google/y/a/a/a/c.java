package com.google.y.a.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13418a;

    c(boolean z) {
        this.f13418a = z;
    }

    @Override // com.google.y.a.a.a.j
    protected final int a() {
        return d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        j jVar = (j) obj;
        if (a() != jVar.a()) {
            return a() - jVar.a();
        }
        return (true != this.f13418a ? 20 : 21) - (true == ((c) jVar).f13418a ? 21 : 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f13418a == ((c) obj).f13418a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(a()), Boolean.valueOf(this.f13418a));
    }

    public final String toString() {
        return Boolean.toString(this.f13418a);
    }
}
