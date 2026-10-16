package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ctq extends defpackage.cxk {
    final /* synthetic */ defpackage.ctu a;
    final /* synthetic */ defpackage.affg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctq(defpackage.ctu ctuVar, defpackage.affg affgVar, java.lang.String str) {
        super(str);
        this.a = ctuVar;
        this.b = affgVar;
    }

    @Override // defpackage.cty
    public final defpackage.ctz e(defpackage.cub cubVar, java.util.List list, long j) {
        defpackage.ctu ctuVar = this.a;
        defpackage.ctn ctnVar = ctuVar.f;
        ctnVar.a = cubVar.p();
        ctnVar.b = cubVar.a();
        ctnVar.c = cubVar.b();
        if (cubVar.dU() || ctuVar.a.j == null) {
            ctuVar.d = 0;
            defpackage.ctz ctzVar = (defpackage.ctz) this.b.invoke(ctnVar, new defpackage.dlm(j));
            return new defpackage.ctp(ctzVar, ctuVar, ctuVar.d, ctzVar);
        }
        ctuVar.e = 0;
        defpackage.ctz ctzVar2 = (defpackage.ctz) this.b.invoke(ctuVar.g, new defpackage.dlm(j));
        return new defpackage.cto(ctzVar2, ctuVar, ctuVar.e, ctzVar2);
    }
}
