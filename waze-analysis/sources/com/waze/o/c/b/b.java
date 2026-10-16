package com.waze.o.c.b;

import com.waze.sound.bp;
import com.waze.t.b.bz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends bz {

    /* renamed from: a, reason: collision with root package name */
    private final bp f32790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(bp bpVar) {
        super(null);
        h.g.b.x.f(bpVar, "mode");
        this.f32790a = bpVar;
    }

    public final bp a() {
        return this.f32790a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f32790a == ((b) obj).f32790a;
    }

    public final int hashCode() {
        return this.f32790a.hashCode();
    }

    public final String toString() {
        return "ChangeVoiceGuidanceMode(mode=" + this.f32790a + ")";
    }
}
