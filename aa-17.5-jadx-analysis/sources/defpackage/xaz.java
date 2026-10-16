package defpackage;

import androidx.preference.ListPreference;

/* loaded from: classes3.dex */
public final class xaz extends xat {
    public static final yph c = yph.c("GH.InitialFocusPref");
    public final qrn d;

    public xaz(ListPreference listPreference, qrn qrnVar, ykd ykdVar) {
        super(listPreference, ykdVar);
        this.d = qrnVar;
    }

    public final void b(jez jezVar) {
        ListPreference listPreference = this.a;
        String str = listPreference.i;
        ((ype) c.l().ai((char) 10010)).M("setDisplayedSetting: %s -> %s", str == null ? null : jez.a(str), jezVar);
        listPreference.o(jezVar.e);
        listPreference.n(listPreference.l());
    }
}
