package com.waze.trip_overview;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.c.cv f41039a;

    /* renamed from: b, reason: collision with root package name */
    private final String f41040b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(com.waze.modules.c.cv cvVar, String str) {
        super(null);
        h.g.b.x.f(cvVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(str, "text");
        this.f41039a = cvVar;
        this.f41040b = str;
    }

    public final com.waze.modules.c.cv a() {
        return this.f41039a;
    }

    public final String b() {
        return this.f41040b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return this.f41039a == azVar.f41039a && h.g.b.x.n(this.f41040b, azVar.f41040b);
    }

    public final int hashCode() {
        return (this.f41039a.hashCode() * 31) + this.f41040b.hashCode();
    }

    public final String toString() {
        return "Message(type=" + this.f41039a + ", text=" + this.f41040b + ")";
    }
}
