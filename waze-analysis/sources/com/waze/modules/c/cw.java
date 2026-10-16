package com.waze.modules.c;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cw {

    /* renamed from: a, reason: collision with root package name */
    private final cv f30017a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30018b;

    public cw(cv cvVar, String str) {
        h.g.b.x.f(cvVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(str, "message");
        this.f30017a = cvVar;
        this.f30018b = str;
    }

    public final cv a() {
        return this.f30017a;
    }

    public final String b() {
        return this.f30018b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return this.f30017a == cwVar.f30017a && h.g.b.x.n(this.f30018b, cwVar.f30018b);
    }

    public final int hashCode() {
        return (this.f30017a.hashCode() * 31) + this.f30018b.hashCode();
    }

    public final String toString() {
        return "RoutingNotification(type=" + this.f30017a + ", message=" + this.f30018b + ")";
    }
}
