package com.waze.bl.c.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.reports_v2.b.at;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.bl.b.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final at f17006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(at atVar) {
        super(null, null);
        x.f(atVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f17006a = atVar;
    }

    public final at b() {
        return this.f17006a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f17006a == ((c) obj).f17006a;
    }

    public final int hashCode() {
        return this.f17006a.hashCode();
    }

    public final String toString() {
        return "ReportAlert(type=" + this.f17006a + ")";
    }
}
