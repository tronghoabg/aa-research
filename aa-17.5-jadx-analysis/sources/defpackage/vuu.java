package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class vuu extends vmc {
    public vuu(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    protected final String e() {
        Locale locale = Locale.US;
        ajgu ajguVar = this.a;
        ajgl ajglVar = ajguVar.l;
        if (ajglVar == null) {
            ajglVar = ajgl.a;
        }
        Integer numValueOf = Integer.valueOf(ajglVar.c);
        ajgl ajglVar2 = ajguVar.l;
        if (ajglVar2 == null) {
            ajglVar2 = ajgl.a;
        }
        Integer numValueOf2 = Integer.valueOf(ajglVar2.d);
        ajgl ajglVar3 = ajguVar.l;
        if (ajglVar3 == null) {
            ajglVar3 = ajgl.a;
        }
        String strF = f(Long.valueOf(ajglVar3.f));
        ajgl ajglVar4 = ajguVar.l;
        if (ajglVar4 == null) {
            ajglVar4 = ajgl.a;
        }
        return String.format(locale, "Janky frame count: %d, Total number of rendered frames: %d, Maximum frame render time: %s, Total recording time: %s", numValueOf, numValueOf2, strF, f(Long.valueOf(ajglVar4.i)));
    }

    @Override // defpackage.vmc
    protected final String g() {
        return (String) xxh.g(c()).d("Jank Event");
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0;
    }
}
