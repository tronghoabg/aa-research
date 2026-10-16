package com.waze.main_screen.g;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f26402a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26403b;

    /* renamed from: c, reason: collision with root package name */
    private final i f26404c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26405d;

    public j(String str, String str2, i iVar, int i2) {
        x.f(iVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f26402a = str;
        this.f26403b = str2;
        this.f26404c = iVar;
        this.f26405d = i2;
    }

    public final int a() {
        return this.f26405d;
    }

    public final i b() {
        return this.f26404c;
    }

    public final String c() {
        return this.f26402a;
    }

    public final String d() {
        return this.f26403b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return x.n(this.f26402a, jVar.f26402a) && x.n(this.f26403b, jVar.f26403b) && this.f26404c == jVar.f26404c && this.f26405d == jVar.f26405d;
    }

    public final int hashCode() {
        String str = this.f26402a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f26403b;
        return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f26404c.hashCode()) * 31) + this.f26405d;
    }

    public final String toString() {
        return "NearbyMessage(message=" + this.f26402a + ", messageBody=" + this.f26403b + ", type=" + this.f26404c + ", timeout=" + this.f26405d + ")";
    }

    private j() {
        throw null;
    }
}
