package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class whv implements defpackage.zgm {
    public java.util.List a;
    public final /* synthetic */ defpackage.whw b;

    public whv(defpackage.whw whwVar) {
        this.b = whwVar;
    }

    @Override // defpackage.zgm
    public final defpackage.zhs a() throws java.lang.Exception {
        defpackage.whw whwVar = this.b;
        defpackage.xvg xvgVarBG = defpackage.ysr.bG("Initialize ".concat(java.lang.String.valueOf(whwVar.a)), defpackage.xvj.a, false);
        try {
            synchronized (whwVar.d) {
                if (this.a == null) {
                    this.a = whwVar.e;
                    whwVar.e = java.util.Collections.EMPTY_LIST;
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.a.size());
            defpackage.wyz wyzVar = new defpackage.wyz(this.b, null);
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((defpackage.zgn) it.next()).a(wyzVar));
                } catch (java.lang.Exception e) {
                    arrayList.add(new defpackage.zif(e));
                }
            }
            defpackage.zhs zhsVarA = new defpackage.zhk(true, defpackage.ygw.n(arrayList)).a(new defpackage.imt(this, 6), defpackage.zgt.INSTANCE);
            xvgVarBG.a(zhsVarA);
            xvgVarBG.close();
            return zhsVarA;
        } catch (java.lang.Throwable th) {
            try {
                xvgVarBG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
