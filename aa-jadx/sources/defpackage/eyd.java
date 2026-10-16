package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eyd {
    final int a;
    final int b;
    final java.lang.String c;

    public eyd(androidx.preference.Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.E;
        this.b = preference.F;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.eyd)) {
            return false;
        }
        defpackage.eyd eydVar = (defpackage.eyd) obj;
        return this.a == eydVar.a && this.b == eydVar.b && android.text.TextUtils.equals(this.c, eydVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
