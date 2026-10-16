package com.waze.bc.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f16192a;

    /* renamed from: b, reason: collision with root package name */
    private final b f16193b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16194c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16195d;

    public a(String str, b bVar, String str2, String str3) {
        x.f(str, "mainText");
        x.f(bVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(str2, "secondaryText");
        x.f(str3, "changeTodayText");
        this.f16192a = str;
        this.f16193b = bVar;
        this.f16194c = str2;
        this.f16195d = str3;
    }

    public final b a() {
        return this.f16193b;
    }

    public final String b() {
        return this.f16195d;
    }

    public final String c() {
        return this.f16192a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f16192a, aVar.f16192a) && this.f16193b == aVar.f16193b && x.n(this.f16194c, aVar.f16194c) && x.n(this.f16195d, aVar.f16195d);
    }

    public final int hashCode() {
        return (((((this.f16192a.hashCode() * 31) + this.f16193b.hashCode()) * 31) + this.f16194c.hashCode()) * 31) + this.f16195d.hashCode();
    }

    public final String toString() {
        return "OpeningHoursDisplayData(mainText=" + this.f16192a + ", type=" + this.f16193b + ", secondaryText=" + this.f16194c + ", changeTodayText=" + this.f16195d + ")";
    }

    public /* synthetic */ a(String str, b bVar, String str2, String str3, int i2) {
        this(str, bVar, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
