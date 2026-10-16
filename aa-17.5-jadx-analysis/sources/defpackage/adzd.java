package defpackage;

/* loaded from: classes3.dex */
public final class adzd extends adsu {
    final /* synthetic */ adjj a;
    final /* synthetic */ zhc b;
    final /* synthetic */ admc c;
    final /* synthetic */ adzj d;
    final /* synthetic */ adyy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adzd(adjj adjjVar, zhc zhcVar, admc admcVar, adzj adzjVar, adyy adyyVar) {
        super(adjjVar);
        this.a = adjjVar;
        this.b = zhcVar;
        this.c = admcVar;
        this.d = adzjVar;
        this.e = adyyVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [adnh, java.lang.Object] */
    @Override // defpackage.adsu
    public final void a() {
        int i = aeeb.a;
        adzk adzkVar = adzg.c;
        zhc zhcVar = this.b;
        if (zhcVar.isCancelled()) {
            return;
        }
        try {
            aebg aebgVar = (aebg) wub.af(zhcVar);
            admc admcVar = this.c;
            ?? r3 = aebgVar.a;
            Object obj = aebgVar.b;
            this.e.g(new adys((adyt) obj, r3.a((adng) obj, admcVar), ((adyt) obj).b));
            this.a.d(new adzb(this.d), zfq.a);
        } finally {
        }
    }
}
