package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.bx;
import com.waze.sound.bp;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26945a = new b(true, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26946b;

    /* renamed from: c, reason: collision with root package name */
    public final bx f26947c;

    /* renamed from: d, reason: collision with root package name */
    public final bp f26948d;

    public b(boolean z, bx bxVar, bp bpVar) {
        this.f26946b = z;
        this.f26947c = bxVar;
        this.f26948d = bpVar;
    }

    public static /* synthetic */ b a(b bVar, boolean z, bx bxVar, bp bpVar, int i2) {
        if ((i2 & 1) != 0) {
            z = bVar.f26946b;
        }
        if ((i2 & 2) != 0) {
            bxVar = bVar.f26947c;
        }
        if ((i2 & 4) != 0) {
            bpVar = bVar.f26948d;
        }
        return new b(z, bxVar, bpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f26946b == bVar.f26946b && h.g.b.x.n(this.f26947c, bVar.f26947c) && this.f26948d == bVar.f26948d;
    }

    public final int hashCode() {
        bx bxVar = this.f26947c;
        int iHashCode = bxVar == null ? 0 : bxVar.hashCode();
        boolean z = this.f26946b;
        bp bpVar = this.f26948d;
        return (((a.a.a(z) * 31) + iHashCode) * 31) + (bpVar != null ? bpVar.hashCode() : 0);
    }

    public final String toString() {
        return "State(isCalculating=" + this.f26946b + ", etaBarModel=" + this.f26947c + ", guidanceModeV2=" + this.f26948d + ")";
    }
}
