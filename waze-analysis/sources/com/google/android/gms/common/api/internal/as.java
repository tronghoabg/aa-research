package com.google.android.gms.common.api.internal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4761a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4762b;

    as(Object obj, String str) {
        this.f4761a = obj;
        this.f4762b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return this.f4761a == asVar.f4761a && this.f4762b.equals(asVar.f4762b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f4761a) * 31) + this.f4762b.hashCode();
    }
}
