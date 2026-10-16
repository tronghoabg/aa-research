package defpackage;

/* loaded from: classes3.dex */
public final class adze extends adsu {
    final /* synthetic */ adjj a;
    final /* synthetic */ String b;
    final /* synthetic */ adzj c;
    final /* synthetic */ adyy d;
    final /* synthetic */ zhc e;
    final /* synthetic */ adzv f;
    final /* synthetic */ admc g;
    final /* synthetic */ adzf h;
    final /* synthetic */ aebg i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adze(adzf adzfVar, adjj adjjVar, aebg aebgVar, String str, adzj adzjVar, adyy adyyVar, zhc zhcVar, adzv adzvVar, admc admcVar) {
        super(adjjVar);
        this.a = adjjVar;
        this.i = aebgVar;
        this.b = str;
        this.c = adzjVar;
        this.d = adyyVar;
        this.e = zhcVar;
        this.f = adzvVar;
        this.g = admcVar;
        this.h = adzfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v5, types: [adnh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.adsu
    public final void a() {
        int i = aeeb.a;
        try {
            aebg aebgVar = this.i;
            if (aebgVar == null) {
                this.c.k();
                aebgVar = null;
            }
            if (aebgVar == null) {
                adnq adnqVarE = adnq.k.e("Method not found: " + this.b);
                this.d.g(adzg.c);
                this.c.e(adnqVarE, new admc());
                this.a.j(null);
                this.e.cancel(false);
                return;
            }
            adzf adzfVar = this.h;
            adzj adzjVar = this.c;
            adzv adzvVar = this.f;
            adzjVar.k();
            adqq[] adqqVarArr = adzvVar.b;
            if (adqqVarArr.length > 0) {
                adqq adqqVar = adqqVarArr[0];
                throw null;
            }
            Object obj = aebgVar.b;
            adzg adzgVar = adzfVar.b;
            adni[] adniVarArr = adzgVar.h;
            int length = adniVarArr.length;
            int i2 = 0;
            ?? r4 = obj;
            while (i2 < length) {
                adnj adnjVar = new adnj(adniVarArr[i2], r4);
                i2++;
                r4 = adnjVar;
            }
            aebg aebgVar2 = new aebg(aebgVar.a, r4, null);
            this.e.o(new aebg(new adyt(adzjVar, (admf) aebgVar2.a, this.g, this.a, adzgVar.s, adzgVar.u), aebgVar2.b));
        } catch (Throwable th) {
            this.d.g(adzg.c);
            this.c.e(adnq.c(th), new admc());
            this.a.j(null);
            this.e.cancel(false);
            throw th;
        }
    }
}
