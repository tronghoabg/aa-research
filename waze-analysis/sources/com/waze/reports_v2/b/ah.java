package com.waze.reports_v2.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends com.waze.bm.a.a.ad {

    /* renamed from: a, reason: collision with root package name */
    private final ad f34051a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ah(ad adVar) {
        h.g.b.x.f(adVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        byte[] bArr = null;
        super(bArr, bArr);
        this.f34051a = adVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah) && this.f34051a == ((ah) obj).f34051a;
    }

    public final ad g() {
        return this.f34051a;
    }

    public final int hashCode() {
        return this.f34051a.hashCode();
    }

    public final String toString() {
        return "Legacy(type=" + this.f34051a + ")";
    }
}
