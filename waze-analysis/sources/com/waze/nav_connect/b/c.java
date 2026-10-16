package com.waze.nav_connect.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30788a;

    public c(boolean z) {
        this.f30788a = z;
    }

    public final boolean a() {
        return this.f30788a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f30788a == ((c) obj).f30788a;
    }

    public final int hashCode() {
        return a.a.a(this.f30788a);
    }

    public final String toString() {
        return "State(showTooltipWhenRelevant=" + this.f30788a + ")";
    }

    public c() {
        this((byte[]) null);
    }

    public /* synthetic */ c(byte[] bArr) {
        this(false);
    }
}
