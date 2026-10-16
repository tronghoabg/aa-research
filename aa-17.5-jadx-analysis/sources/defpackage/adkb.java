package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class adkb extends adqs {
    public final adzh a;
    public final adou b;
    public boolean c;

    public adkb(adod adodVar, adoi adoiVar) {
        super(null, null);
        adou adouVar = new adou();
        this.b = adouVar;
        adouVar.a = adodVar;
        adzh adzhVar = new adzh(new adus(this, adoiVar));
        this.a = adzhVar;
        adzhVar.i = false;
        adzhVar.l = false;
    }

    @Override // defpackage.adqs
    public final void a(adni adniVar) {
        List list = this.a.c;
        adniVar.getClass();
        list.add(adniVar);
    }

    public final String toString() {
        adzh adzhVar = this.a;
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", adzhVar);
        return xxgVarAo.toString();
    }
}
