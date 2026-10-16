package com.waze.copilot.data.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f23016a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23017b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23018c;

    public q(String str, String str2, String str3) {
        x.f(str, "carId");
        x.f(str2, "moodId");
        this.f23016a = str;
        this.f23017b = str2;
        this.f23018c = str3;
    }

    public final String a() {
        return this.f23016a;
    }

    public final String b() {
        return this.f23017b;
    }

    public final String c() {
        return this.f23018c;
    }

    public final String d() {
        return this.f23016a;
    }

    public final String e() {
        return this.f23017b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return x.n(this.f23016a, qVar.f23016a) && x.n(this.f23017b, qVar.f23017b) && x.n(this.f23018c, qVar.f23018c);
    }

    public final String f() {
        return this.f23018c;
    }

    public final int hashCode() {
        int iHashCode = (this.f23016a.hashCode() * 31) + this.f23017b.hashCode();
        String str = this.f23018c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CopilotUserSelections(carId=" + this.f23016a + ", moodId=" + this.f23017b + ", voiceId=" + this.f23018c + ")";
    }
}
