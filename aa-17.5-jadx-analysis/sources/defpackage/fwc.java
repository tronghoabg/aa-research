package defpackage;

import androidx.car.app.model.Chip;

/* loaded from: classes2.dex */
public final /* synthetic */ class fwc implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fwc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r0v44, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r0v51, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, xc] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r5v16, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [aizk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45, types: [fwb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v57, types: [dlg, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.c) {
            case 0:
                hgq hgqVar = (hgq) ((geu) this.a).F(hgq.class);
                ?? r5 = this.b;
                r5.getClass();
                hgqVar.a(r5);
                break;
            case 1:
                break;
            case 2:
                ((ieb) this.b).u();
                ((gbv) this.a).g.invoke();
                break;
            case 3:
                ((geu) this.a).t().h(this.b);
                break;
            case 4:
                gsf gsfVar = (gsf) ((geu) this.a).F(gsf.class);
                if (gsfVar.c()) {
                    gsfVar.b();
                }
                afdr afdrVar = ((fvu) this.b).c;
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
                break;
            case 5:
                gsf gsfVar2 = (gsf) ((geu) this.b).F(gsf.class);
                if (gsfVar2.c()) {
                    gsfVar2.b();
                }
                ?? r52 = this.a;
                if (r52 != 0) {
                    r52.invoke();
                }
                break;
            case 6:
                this.b.b(true);
                this.a.b(true);
                break;
            case 7:
                this.a.c(Float.valueOf(((byb) this.b).e()));
                break;
            case 8:
                ghe gheVar = (ghe) ((grg) this.b).a.l(ghe.class);
                if (gheVar != null) {
                    gheVar.g(gsn.c);
                }
                this.a.invoke();
                break;
            case 9:
                ynz ynzVar = (ynz) gzp.b.f().o(ypi.a, "CarApp.H.AlphaJump").ai(94);
                Object obj = this.b;
                fvd fvdVar = (fvd) obj;
                ynzVar.y("Jumping to letter %s", fvdVar.a);
                obj.getClass();
                ((gzp) this.a).e.d.d(new gzk(3, fvdVar));
                break;
            case 10:
                gca.e((geu) this.a, this.b);
                break;
            case 11:
                break;
            case 12:
                geu geuVar = (geu) this.a;
                ((gho) geuVar.F(gho.class)).a = true;
                gca.e(geuVar, ((Chip) this.b).getOnClickDelegate());
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                ((ajab) this.a).d(true);
                afdr afdrVarD = this.b.d();
                if (afdrVarD != null) {
                    afdrVarD.invoke();
                }
                break;
            case 16:
                break;
            case 17:
                Object objInvoke = this.a.invoke();
                if (objInvoke != null) {
                    cjb cjbVar = (cjb) objInvoke;
                    break;
                }
                break;
            case 18:
                float f = gjk.d.k;
                break;
            case 19:
                if (this.a == gzc.d) {
                    ((gsf) ((geu) this.b).F(gsf.class)).b();
                }
                break;
            default:
                this.a.invoke();
                hgk hgkVar = (hgk) this.b;
                hgkVar.b = 1.0f;
                hgkVar.c = 0L;
                hgkVar.d = 0L;
                break;
        }
        return afak.a;
    }

    public /* synthetic */ fwc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
