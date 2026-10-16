package com.waze.ui.w.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends com.waze.ui.d.s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f43714a;

    public x(boolean z) {
        super(null);
        this.f43714a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f43714a == ((x) obj).f43714a;
    }

    public final int hashCode() {
        return a.a.a(this.f43714a);
    }

    public final String toString() {
        return "Listening(postFteHint=" + this.f43714a + ")";
    }

    public x() {
        this((byte[]) null);
    }

    public /* synthetic */ x(byte[] bArr) {
        this(false);
    }
}
