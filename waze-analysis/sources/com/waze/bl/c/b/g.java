package com.waze.bl.c.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.reports_v2.b.at;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g extends j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17012a;

    /* renamed from: b, reason: collision with root package name */
    private final at f17013b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17014c;

    public g(boolean z, at atVar, int i2) {
        x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f17012a = z;
        this.f17013b = atVar;
        this.f17014c = i2;
    }

    public final int a() {
        return this.f17014c;
    }

    public final at b() {
        return this.f17013b;
    }

    @Override // com.waze.bl.c.b.j, com.waze.t.b.cb
    public final boolean e() {
        return this.f17012a;
    }

    @Override // com.waze.bl.c.b.j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f17012a == gVar.f17012a && this.f17013b == gVar.f17013b && this.f17014c == gVar.f17014c;
    }

    @Override // com.waze.bl.c.b.j
    public final int hashCode() {
        return (((a.a.a(this.f17012a) * 31) + this.f17013b.hashCode()) * 31) + this.f17014c;
    }

    public final String toString() {
        return "ReportAlertResult(success=" + this.f17012a + ", type=" + this.f17013b + ", pointsAwarded=" + this.f17014c + ")";
    }
}
