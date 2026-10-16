package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbc extends defpackage.akaw implements defpackage.ajqj {
    public defpackage.ajqb a;
    private final defpackage.ajqt b;
    private final int c;
    private final java.lang.String f;
    private final java.util.Locale g;
    private defpackage.akbi h;

    public akbc(defpackage.akbi akbiVar, java.util.Locale locale) {
        this.h = akbiVar;
        this.b = akbiVar.a;
        this.c = akbiVar.b;
        this.f = akbiVar.c;
        this.g = locale;
    }

    @Override // defpackage.ajqj
    public final defpackage.ajqb a() {
        return this.a;
    }

    @Override // defpackage.ajqj
    public final void b(defpackage.ajqb ajqbVar) {
        this.a = ajqbVar;
    }

    @Override // defpackage.ajqg
    public final defpackage.ajqt d() {
        throw null;
    }

    @Override // defpackage.ajqj
    public final defpackage.akbi p() {
        defpackage.akbi akbiVar = this.h;
        if (akbiVar != null) {
            return akbiVar;
        }
        defpackage.ajqt ajqtVar = this.b;
        int i = this.c;
        java.lang.String str = this.f;
        if (str == null) {
            if (this.g == null) {
                java.util.Locale.getDefault();
            }
            boolean z = false;
            if (i >= 100 && i < 600) {
                z = true;
            }
            defpackage.aguw.a(z, defpackage.a.bo(i, "Unknown category for status code "));
            int i2 = i / 100;
            int i3 = i2 * 100;
            java.lang.String[] strArr = defpackage.ajwf.b[i2];
            int i4 = i - i3;
            str = strArr.length > i4 ? strArr[i4] : null;
        }
        defpackage.akbi akbiVar2 = new defpackage.akbi(ajqtVar, i, str);
        this.h = akbiVar2;
        return akbiVar2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(p());
        sb.append(' ');
        sb.append(this.d);
        if (this.a != null) {
            sb.append(' ');
            sb.append(this.a);
        }
        return sb.toString();
    }
}
