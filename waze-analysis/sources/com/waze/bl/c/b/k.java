package com.waze.bl.c.b;

import com.waze.reports_v2.b.at;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17021a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17022b;

    /* renamed from: c, reason: collision with root package name */
    private final at f17023c;

    public k(boolean z, int i2, at atVar) {
        x.f(atVar, "reportSubtype");
        this.f17021a = z;
        this.f17022b = i2;
        this.f17023c = atVar;
    }

    public final int a() {
        return this.f17022b;
    }

    public final at b() {
        return this.f17023c;
    }

    public final boolean c() {
        return this.f17021a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f17021a == kVar.f17021a && this.f17022b == kVar.f17022b && this.f17023c == kVar.f17023c;
    }

    public final int hashCode() {
        return (((a.a.a(this.f17021a) * 31) + this.f17022b) * 31) + this.f17023c.hashCode();
    }

    public final String toString() {
        return "ReportAgentCommonReport(success=" + this.f17021a + ", points=" + this.f17022b + ", reportSubtype=" + this.f17023c + ")";
    }
}
