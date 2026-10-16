package com.waze.bl.c.b;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.reports_v2.b.af;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends com.waze.bl.b.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final af f17008a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(af afVar, String str) {
        super(null, null);
        x.f(afVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(str, "descriptionToSend");
        this.f17008a = afVar;
        this.f17009b = str;
    }

    public final af b() {
        return this.f17008a;
    }

    public final String c() {
        return this.f17009b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f17008a == eVar.f17008a && x.n(this.f17009b, eVar.f17009b);
    }

    public final int hashCode() {
        return (this.f17008a.hashCode() * 31) + this.f17009b.hashCode();
    }

    public final String toString() {
        return "ReportMapIssue(type=" + this.f17008a + ", descriptionToSend=" + this.f17009b + ")";
    }
}
