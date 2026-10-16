package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aixk extends java.util.concurrent.CancellationException implements defpackage.aiur {
    public final transient defpackage.aiwg a;

    public aixk(java.lang.String str, defpackage.aiwg aiwgVar) {
        super(str);
        this.a = aiwgVar;
    }

    @Override // defpackage.aiur
    public final /* bridge */ /* synthetic */ java.lang.Throwable a() {
        java.lang.String message = getMessage();
        if (message == null) {
            message = "";
        }
        defpackage.aixk aixkVar = new defpackage.aixk(message, this.a);
        aixkVar.initCause(this);
        return aixkVar;
    }
}
