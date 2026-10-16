package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bd extends bf {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32005a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f32006b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32007c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32008d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32009e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32010f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f32011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd(boolean z, boolean z2, boolean z3, String str, int i2, String str2, boolean z4, int i3) {
        super((byte[]) null);
        str = (i3 & 8) != 0 ? "" : str;
        h.g.b.x.f(str, "internalCode");
        this.f32005a = 1 == ((z ? 1 : 0) & ((i3 & 1) ^ 1));
        this.f32006b = ((i3 & 2) == 0) & z2;
        this.f32007c = ((i3 & 4) == 0) & z3;
        this.f32008d = str;
        this.f32009e = (i3 & 16) != 0 ? -1 : i2;
        this.f32010f = (i3 & 32) != 0 ? "" : str2;
        this.f32011g = ((i3 & 64) == 0) & z4;
    }

    public final int a() {
        return this.f32009e;
    }

    public final String b() {
        return this.f32008d;
    }

    public final String c() {
        return this.f32010f;
    }

    public final boolean d() {
        return this.f32011g;
    }

    public final boolean e() {
        return this.f32006b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return this.f32005a == bdVar.f32005a && this.f32006b == bdVar.f32006b && this.f32007c == bdVar.f32007c && h.g.b.x.n(this.f32008d, bdVar.f32008d) && this.f32009e == bdVar.f32009e && h.g.b.x.n(this.f32010f, bdVar.f32010f) && this.f32011g == bdVar.f32011g;
    }

    public final boolean f() {
        return this.f32005a;
    }

    public final int hashCode() {
        int iA = (((((a.a.a(this.f32005a) * 31) + a.a.a(this.f32006b)) * 31) + a.a.a(this.f32007c)) * 31) + this.f32008d.hashCode();
        String str = this.f32010f;
        return (((((iA * 31) + this.f32009e) * 31) + (str == null ? 0 : str.hashCode())) * 31) + a.a.a(this.f32011g);
    }

    public final String toString() {
        return "Failure(timeout=" + this.f32005a + ", networkError=" + this.f32006b + ", requiredSessionMissing=" + this.f32007c + ", internalCode=" + this.f32008d + ", code=" + this.f32009e + ", message=" + this.f32010f + ", authenticationFailed=" + this.f32011g + ")";
    }

    public bd() {
        this(false, false, false, null, 0, null, false, 127);
    }
}
