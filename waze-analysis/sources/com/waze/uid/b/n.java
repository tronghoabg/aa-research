package com.waze.uid.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final o f44167a;

    public n(o oVar) {
        h.g.b.x.f(oVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f44167a = oVar;
    }

    public static final n a(boolean z) {
        byte[] bArr = null;
        if (z) {
            return new n(bArr);
        }
        return null;
    }

    public final o b() {
        return this.f44167a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f44167a == ((n) obj).f44167a;
    }

    public final int hashCode() {
        return this.f44167a.hashCode();
    }

    public final String toString() {
        return "Loader(type=" + this.f44167a + ")";
    }

    public n() {
        this((byte[]) null);
    }

    public /* synthetic */ n(byte[] bArr) {
        this(o.f44168a);
    }
}
