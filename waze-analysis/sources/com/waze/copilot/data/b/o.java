package com.waze.copilot.data.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final p f23009a;

    /* renamed from: b, reason: collision with root package name */
    private final g f23010b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23011c;

    public o(p pVar, g gVar, String str) {
        x.f(pVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(gVar, "operation");
        x.f(str, "assetId");
        this.f23009a = pVar;
        this.f23010b = gVar;
        this.f23011c = str;
    }

    public final g a() {
        return this.f23010b;
    }

    public final p b() {
        return this.f23009a;
    }

    public final String c() {
        return this.f23011c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f23009a == oVar.f23009a && this.f23010b == oVar.f23010b && x.n(this.f23011c, oVar.f23011c);
    }

    public final int hashCode() {
        return (((this.f23009a.hashCode() * 31) + this.f23010b.hashCode()) * 31) + this.f23011c.hashCode();
    }

    public final String toString() {
        return "CopilotSelection(type=" + this.f23009a + ", operation=" + this.f23010b + ", assetId=" + this.f23011c + ")";
    }
}
