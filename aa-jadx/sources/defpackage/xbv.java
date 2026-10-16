package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xbv extends defpackage.xbp {
    public static final defpackage.yqm c = defpackage.yqm.c("GH.InitialFocusPref");
    public final defpackage.qsh d;

    public xbv(androidx.preference.ListPreference listPreference, defpackage.qsh qshVar, defpackage.xei xeiVar) {
        super(listPreference, xeiVar);
        this.d = qshVar;
    }

    public final void b(defpackage.jfh jfhVar) {
        androidx.preference.ListPreference listPreference = this.a;
        java.lang.String str = listPreference.i;
        ((defpackage.yqj) c.l().ai((char) 10038)).M("setDisplayedSetting: %s -> %s", str == null ? null : defpackage.jfh.a(str), jfhVar);
        listPreference.o(jfhVar.e);
        listPreference.n(listPreference.l());
    }
}
