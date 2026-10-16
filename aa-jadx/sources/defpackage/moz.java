package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class moz extends defpackage.mpb {
    private defpackage.mqi a;
    public final android.content.ComponentName b;

    protected moz(android.content.ComponentName componentName, java.lang.String str) {
        super(str);
        this.b = componentName;
    }

    protected abstract void c(android.content.Intent intent, defpackage.qrh qrhVar);

    public defpackage.mqi h() {
        return this.a;
    }

    @Override // defpackage.mpb
    protected final void i(android.content.Intent intent, defpackage.qrh qrhVar) {
        defpackage.mqi mqiVarB = defpackage.mqi.b(intent);
        mqiVarB.getClass();
        this.a = mqiVarB;
        c(intent, qrhVar);
    }
}
