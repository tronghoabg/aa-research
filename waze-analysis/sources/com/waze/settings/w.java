package com.waze.settings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final String f37671a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f37672b;

    public w(String str, boolean z) {
        this.f37671a = str;
        this.f37672b = z;
    }

    public static /* synthetic */ w c(w wVar, String str) {
        return new w(str, wVar.f37672b);
    }

    public final String a() {
        return this.f37671a;
    }

    public final boolean b() {
        return this.f37672b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return h.g.b.x.n(this.f37671a, wVar.f37671a) && this.f37672b == wVar.f37672b;
    }

    public final int hashCode() {
        String str = this.f37671a;
        return ((str == null ? 0 : str.hashCode()) * 31) + a.a.a(this.f37672b);
    }

    public final String toString() {
        return "UiState(selectedVoiceName=" + this.f37671a + ", isMetric=" + this.f37672b + ")";
    }
}
