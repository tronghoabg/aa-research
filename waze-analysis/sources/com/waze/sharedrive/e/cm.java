package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    private final String f38498a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.i f38499b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38500c;

    /* renamed from: d, reason: collision with root package name */
    private final cl f38501d;

    public cm(String str, com.waze.ui.ac.i iVar, boolean z, cl clVar) {
        h.g.b.x.f(clVar, "participantRole");
        this.f38498a = str;
        this.f38499b = iVar;
        this.f38500c = z;
        this.f38501d = clVar;
    }

    public final cl a() {
        return this.f38501d;
    }

    public final com.waze.ui.ac.i b() {
        return this.f38499b;
    }

    public final String c() {
        return this.f38498a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm)) {
            return false;
        }
        cm cmVar = (cm) obj;
        return h.g.b.x.n(this.f38498a, cmVar.f38498a) && h.g.b.x.n(this.f38499b, cmVar.f38499b) && this.f38500c == cmVar.f38500c && h.g.b.x.n(this.f38501d, cmVar.f38501d);
    }

    public final int hashCode() {
        String str = this.f38498a;
        int iHashCode = str == null ? 0 : str.hashCode();
        com.waze.ui.ac.i iVar = this.f38499b;
        return (((((iHashCode * 31) + (iVar != null ? iVar.hashCode() : 0)) * 31) + a.a.a(this.f38500c)) * 31) + this.f38501d.hashCode();
    }

    public final String toString() {
        return "ParticipantUiState(name=" + this.f38498a + ", imageSource=" + this.f38499b + ", isCurrentUser=" + this.f38500c + ", participantRole=" + this.f38501d + ")";
    }
}
