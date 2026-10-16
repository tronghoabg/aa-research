package defpackage;

/* loaded from: classes3.dex */
final class advr extends adtc {
    final adjq h;
    final admf i;
    final adiw j;
    final /* synthetic */ advs k;
    private final long l;

    /* JADX WARN: Illegal instructions before constructor call */
    public advr(advs advsVar, adjq adjqVar, admf admfVar, adiw adiwVar) {
        this.k = advsVar;
        advv advvVar = advsVar.c;
        super(advvVar.f(adiwVar), advvVar.j, adiwVar.b);
        this.h = adjqVar;
        this.i = admfVar;
        this.j = adiwVar;
        this.l = System.nanoTime();
    }

    final void bc() {
        adsw adswVar;
        adjq adjqVarA = this.h.a();
        try {
            adqq adqqVarC = this.k.c(this.i, this.j.f(adjb.f, Long.valueOf(System.nanoTime() - this.l)));
            synchronized (this) {
                if (this.g == null) {
                    super.ba(adqqVarC);
                    adtb adtbVar = this.f;
                    if (adtbVar == null) {
                        this.e = null;
                        this.d = true;
                    } else {
                        super.bb(adtbVar);
                        adswVar = new adsw(this, this.c);
                    }
                }
                adswVar = null;
            }
            advs advsVar = this.k;
            if (adswVar == null) {
                advsVar.c.m.execute(new aduy(this, 10));
            } else {
                advsVar.c.f(this.j).execute(new adsy(this, adswVar, 18, (char[]) null));
            }
        } finally {
            this.h.f(adjqVarA);
        }
    }

    @Override // defpackage.adtc
    protected final void k() {
        this.k.c.m.execute(new aduy(this, 10));
    }
}
