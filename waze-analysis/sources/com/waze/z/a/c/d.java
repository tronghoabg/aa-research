package com.waze.z.a.c;

import com.waze.z.a.ar;
import com.waze.z.a.at;
import com.waze.z.a.g.s;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f45829a;

    /* renamed from: b, reason: collision with root package name */
    private final ar f45830b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f45831c;

    /* renamed from: d, reason: collision with root package name */
    private final s f45832d;

    public /* synthetic */ d(String str, ar arVar, boolean z, s sVar, int i2) {
        sVar = (i2 & 8) != 0 ? at.f45676a : sVar;
        boolean z2 = (i2 & 4) == 0;
        x.f(str, "text");
        x.f(arVar, "properties");
        x.f(sVar, "timerProperties");
        this.f45829a = str;
        this.f45830b = arVar;
        this.f45831c = z | (!z2);
        this.f45832d = sVar;
    }

    public final ar a() {
        return this.f45830b;
    }

    public final String b() {
        return this.f45829a;
    }

    public final boolean c() {
        return this.f45831c;
    }

    public final s d() {
        return this.f45832d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f45829a, dVar.f45829a) && x.n(this.f45830b, dVar.f45830b) && this.f45831c == dVar.f45831c && x.n(this.f45832d, dVar.f45832d);
    }

    public final int hashCode() {
        return (((((this.f45829a.hashCode() * 31) + this.f45830b.hashCode()) * 31) + a.a.a(this.f45831c)) * 31) + this.f45832d.hashCode();
    }

    public final String toString() {
        return "DialogCta(text=" + this.f45829a + ", properties=" + this.f45830b + ", enabled=" + this.f45831c + ", timerProperties=" + this.f45832d + ")";
    }
}
