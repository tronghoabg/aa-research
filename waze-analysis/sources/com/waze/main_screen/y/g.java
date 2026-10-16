package com.waze.main_screen.y;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    private final f f27882a;

    public g(f fVar) {
        x.f(fVar, "triggerReason");
        this.f27882a = fVar;
    }

    public final f a() {
        return this.f27882a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f27882a == ((g) obj).f27882a;
    }

    public final int hashCode() {
        return this.f27882a.hashCode();
    }

    public final String toString() {
        return "PreDrive(triggerReason=" + this.f27882a + ")";
    }

    public g() {
        this((byte[]) null);
    }

    public /* synthetic */ g(byte[] bArr) {
        this(f.f27875a);
    }
}
