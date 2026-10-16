package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adte extends defpackage.adtv {
    final /* synthetic */ defpackage.ador a;
    final /* synthetic */ defpackage.adnd b;
    final /* synthetic */ defpackage.adtg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adte(defpackage.adtg adtgVar, defpackage.ador adorVar, defpackage.adnd adndVar) {
        super(adtgVar.b.e);
        this.a = adorVar;
        this.b = adndVar;
        this.c = adtgVar;
    }

    @Override // defpackage.adtv
    public final void a() {
        int i = defpackage.aefb.a;
        defpackage.adtg adtgVar = this.c;
        adtgVar.b.f.c();
        defpackage.ador adorVar = this.a;
        defpackage.adnd adndVar = this.b;
        defpackage.ador adorVar2 = adtgVar.a;
        if (adorVar2 != null) {
            adndVar = new defpackage.adnd();
            adorVar = adorVar2;
        }
        try {
            defpackage.adth.l(adtgVar.c, adorVar, adndVar);
        } finally {
            this.c.b.d.a(adorVar.g());
        }
    }
}
