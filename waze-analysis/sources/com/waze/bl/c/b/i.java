package com.waze.bl.c.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.reports_v2.b.af;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17018a;

    /* renamed from: b, reason: collision with root package name */
    private final af f17019b;

    public i(boolean z, af afVar) {
        x.f(afVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f17018a = z;
        this.f17019b = afVar;
    }

    public final af a() {
        return this.f17019b;
    }

    @Override // com.waze.bl.c.b.j, com.waze.t.b.cb
    public final boolean e() {
        return this.f17018a;
    }

    @Override // com.waze.bl.c.b.j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17018a == iVar.f17018a && this.f17019b == iVar.f17019b;
    }

    @Override // com.waze.bl.c.b.j
    public final int hashCode() {
        return (a.a.a(this.f17018a) * 31) + this.f17019b.hashCode();
    }

    public final String toString() {
        return "ReportMapIssueResult(success=" + this.f17018a + ", type=" + this.f17019b + ")";
    }
}
