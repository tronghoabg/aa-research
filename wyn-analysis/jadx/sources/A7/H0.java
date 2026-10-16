package A7;

/* loaded from: classes4.dex */
public enum H0 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: a, reason: collision with root package name */
    public final String f508a;

    H0(String str) {
        this.f508a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f508a;
    }
}
