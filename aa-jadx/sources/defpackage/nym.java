package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nym {
    public final defpackage.cno a;
    public final java.lang.Integer b;
    public final boolean c;
    public final java.lang.String d;
    public final defpackage.afer e;
    private final boolean f = true;

    public nym(defpackage.cno cnoVar, java.lang.Integer num, boolean z, java.lang.String str, defpackage.afer aferVar) {
        this.a = cnoVar;
        this.b = num;
        this.c = z;
        this.d = str;
        this.e = aferVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nym)) {
            return false;
        }
        defpackage.nym nymVar = (defpackage.nym) obj;
        if (!defpackage.afga.f(this.a, nymVar.a) || !defpackage.afga.f(this.b, nymVar.b) || this.c != nymVar.c) {
            return false;
        }
        boolean z = nymVar.f;
        return defpackage.afga.f(this.d, nymVar.d) && defpackage.afga.f(this.e, nymVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Integer num = this.b;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + defpackage.a.e(this.c)) * 31) + defpackage.a.e(true)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "QuickSettingsTileModel(icon=" + this.a + ", label=" + this.b + ", isActive=" + this.c + ", isEnabled=true, testTag=" + this.d + ", onClick=" + this.e + ")";
    }
}
