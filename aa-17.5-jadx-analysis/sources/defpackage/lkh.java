package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class lkh implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ lkh(affv affvVar, afec afecVar, afec afecVar2, gku gkuVar, String str, affq affqVar, int i) {
        this.g = i;
        this.f = affvVar;
        this.c = afecVar;
        this.d = afecVar2;
        this.a = gkuVar;
        this.b = str;
        this.e = affqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [gku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [afdr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        if (this.g != 0) {
            gbu gbuVar = (gbu) obj;
            gbuVar.getClass();
            ((affv) this.f).a = gbuVar;
            gbuVar.a = this.c;
            gbuVar.b = this.d;
            gbuVar.setInputType(gbt.e(1));
            ?? r0 = this.a;
            if (!r0.c()) {
                Object obj2 = this.e;
                ?? r13 = this.b;
                gbuVar.setText((CharSequence) r13);
                gbuVar.setSelection(((String) r13).length());
                if (((affq) obj2).a) {
                    r0.a(gbuVar);
                }
            }
            return afak.a;
        }
        thj thjVar = (thj) obj;
        thjVar.getClass();
        eqc eqcVar = thjVar.b;
        eqcVar.getClass();
        Context context = (Context) this.a;
        int iU = lnm.u(44, context);
        int iU2 = lnm.u(36, context);
        int iU3 = lnm.u(64, context);
        int iU4 = lnm.u(164, context);
        int iU5 = lnm.u(8, context);
        tjz tjzVar = new tjz(context, eqcVar, "Tabs", iU2, (Integer) null, (htm) null, (htm) null, 240);
        ?? r11 = this.f;
        ?? r10 = this.e;
        return new lkp(context, eqcVar, this.b, (mon) this.c, iU, iU3, iU4, iU5, this.d, r10, r11, tjzVar);
    }

    public /* synthetic */ lkh(qn qnVar, eqa eqaVar, mon monVar, afdr afdrVar, afdr afdrVar2, afeg afegVar, int i) {
        this.g = i;
        this.a = qnVar;
        this.b = eqaVar;
        this.c = monVar;
        this.d = afdrVar;
        this.e = afdrVar2;
        this.f = afegVar;
    }
}
