package defpackage;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class vwm extends vmc {
    public vwm(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    public final String e() {
        Locale locale = Locale.US;
        ajgu ajguVar = this.a;
        ajgo ajgoVar = ajguVar.j;
        if (ajgoVar == null) {
            ajgoVar = ajgo.a;
        }
        Long lValueOf = Long.valueOf(ajgoVar.c);
        ajgo ajgoVar2 = ajguVar.j;
        if (ajgoVar2 == null) {
            ajgoVar2 = ajgo.a;
        }
        Long lValueOf2 = Long.valueOf(ajgoVar2.d);
        ajgo ajgoVar3 = ajguVar.j;
        if (ajgoVar3 == null) {
            ajgoVar3 = ajgo.a;
        }
        return String.format(locale, "Cache Size: %d\nCode Size: %d\nData Size: %d", lValueOf, lValueOf2, Long.valueOf(ajgoVar3.e));
    }

    @Override // defpackage.vmc
    public final String g() {
        return "Disk Event";
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 128) != 0;
    }
}
