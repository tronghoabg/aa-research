package com.google.firebase.crashlytics.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class al extends co {

    /* renamed from: a, reason: collision with root package name */
    private final long f9347a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9348b;

    /* renamed from: c, reason: collision with root package name */
    private final ce f9349c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f9350d;

    /* renamed from: e, reason: collision with root package name */
    private final ci f9351e;

    /* renamed from: f, reason: collision with root package name */
    private final cn f9352f;

    /* synthetic */ al(long j2, String str, ce ceVar, ch chVar, ci ciVar, cn cnVar) {
        this.f9347a = j2;
        this.f9348b = str;
        this.f9349c = ceVar;
        this.f9350d = chVar;
        this.f9351e = ciVar;
        this.f9352f = cnVar;
    }

    @Override // com.google.firebase.crashlytics.a.e.co
    public final long a() {
        return this.f9347a;
    }

    @Override // com.google.firebase.crashlytics.a.e.co
    public final ce b() {
        return this.f9349c;
    }

    @Override // com.google.firebase.crashlytics.a.e.co
    public final cf c() {
        return new cf(this);
    }

    @Override // com.google.firebase.crashlytics.a.e.co
    public final ch d() {
        return this.f9350d;
    }

    @Override // com.google.firebase.crashlytics.a.e.co
    public final ci e() {
        return this.f9351e;
    }

    public final boolean equals(Object obj) {
        ci ciVar;
        cn cnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof co) {
            co coVar = (co) obj;
            if (this.f9347a == coVar.a() && this.f9348b.equals(coVar.g()) && this.f9349c.equals(coVar.b()) && this.f9350d.equals(coVar.d()) && ((ciVar = this.f9351e) != null ? ciVar.equals(coVar.e()) : coVar.e() == null) && ((cnVar = this.f9352f) != null ? cnVar.equals(coVar.f()) : coVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.a.e.co
    public final cn f() {
        return this.f9352f;
    }

    @Override // com.google.firebase.crashlytics.a.e.co
    public final String g() {
        return this.f9348b;
    }

    public final int hashCode() {
        long j2 = this.f9347a;
        int iHashCode = ((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f9348b.hashCode()) * 1000003) ^ this.f9349c.hashCode()) * 1000003) ^ this.f9350d.hashCode();
        ci ciVar = this.f9351e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (ciVar == null ? 0 : ciVar.hashCode())) * 1000003;
        cn cnVar = this.f9352f;
        return iHashCode2 ^ (cnVar != null ? cnVar.hashCode() : 0);
    }

    public final String toString() {
        cn cnVar = this.f9352f;
        ci ciVar = this.f9351e;
        ch chVar = this.f9350d;
        return "Event{timestamp=" + this.f9347a + ", type=" + this.f9348b + ", app=" + this.f9349c.toString() + ", device=" + chVar.toString() + ", log=" + String.valueOf(ciVar) + ", rollouts=" + String.valueOf(cnVar) + "}";
    }
}
