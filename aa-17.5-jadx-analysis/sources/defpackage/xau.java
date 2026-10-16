package defpackage;

import androidx.preference.ListPreference;

/* loaded from: classes3.dex */
public final class xau extends xat {
    public static final yph c = yph.c("GH.DayNightPref");
    public final qrn d;

    public xau(qrn qrnVar, ykd ykdVar, ListPreference listPreference) {
        super(listPreference, ykdVar);
        this.d = qrnVar;
    }

    public final void b(nfp nfpVar) {
        ListPreference listPreference = this.a;
        ((ype) c.l().ai((char) 10007)).M("setDisplayedSetting: %s -> %s", nfp.a(listPreference.i), nfpVar);
        listPreference.o(nfpVar.i);
        listPreference.n(listPreference.l());
    }
}
