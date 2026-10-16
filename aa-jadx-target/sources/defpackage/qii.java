package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class qii implements defpackage.kjd {
    public final /* synthetic */ defpackage.qsh a;
    public final /* synthetic */ defpackage.qqe b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ android.content.Intent d;
    private final /* synthetic */ int e;

    public /* synthetic */ qii(defpackage.qsh qshVar, defpackage.qqe qqeVar, boolean z, android.content.Intent intent, int i) {
        this.e = i;
        this.a = qshVar;
        this.b = qqeVar;
        this.c = z;
        this.d = intent;
    }

    @Override // defpackage.kjd
    public final java.lang.Object a() throws defpackage.qst {
        java.util.List listJ;
        java.util.List listI;
        int i = this.e;
        boolean z = this.c;
        if (i != 0) {
            defpackage.qqe qqeVar = this.b;
            defpackage.qsh qshVar = this.a;
            android.content.Intent intent = this.d;
            qij qijVarF = defpackage.qik.f(qshVar, qqeVar);
            try {
                if (z) {
                    defpackage.qik.e();
                    listI = qshVar.a().k(intent, qqeVar.ordinal());
                } else {
                    defpackage.qik.e();
                    listI = qshVar.a().i(intent, qqeVar.ordinal());
                }
                if (qijVarF != null) {
                    qijVarF.close();
                }
                return listI;
            } catch (java.lang.Throwable th) {
                if (qijVarF != null) {
                    try {
                        qijVarF.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        defpackage.qqe qqeVar2 = this.b;
        defpackage.qsh qshVar2 = this.a;
        android.content.Intent intent2 = this.d;
        qij qijVarF2 = defpackage.qik.f(qshVar2, qqeVar2);
        try {
            if (z) {
                defpackage.qik.e();
                listJ = qshVar2.a().l(intent2, qqeVar2.ordinal());
            } else {
                defpackage.qik.e();
                listJ = qshVar2.a().j(intent2, qqeVar2.ordinal());
            }
            if (qijVarF2 != null) {
                qijVarF2.close();
            }
            return listJ;
        } catch (java.lang.Throwable th3) {
            if (qijVarF2 != null) {
                try {
                    qijVarF2.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
