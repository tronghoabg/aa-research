package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class sts extends defpackage.wfd {
    private static final java.util.function.Function a;
    private static volatile java.util.function.Function b;
    public static final /* synthetic */ int c = 0;
    private final defpackage.sqs d;

    static {
        defpackage.mmf mmfVar = new defpackage.mmf(15);
        a = mmfVar;
        b = mmfVar;
    }

    public sts() {
        defpackage.str strVar = defpackage.str.a;
        this.d = defpackage.str.b;
    }

    public abstract void a(android.content.Intent intent);

    @Override // defpackage.wfd
    protected final void b(defpackage.wfa wfaVar) {
        wfaVar.d = java.lang.Boolean.FALSE;
        wfaVar.e = java.lang.Boolean.FALSE;
    }

    @Override // defpackage.wfd
    protected final void c(android.content.Intent intent) {
        if (this.d != defpackage.str.b) {
            a(intent);
        } else {
            a(intent);
        }
    }

    @Override // defpackage.wfd
    protected final defpackage.sqs d(android.content.Context context) {
        return (defpackage.sqs) a$.ExternalSyntheticApiModelOutline2.m(b, context);
    }

    public sts(byte[] bArr) {
        defpackage.str strVar = defpackage.str.a;
        this.d = defpackage.str.b;
    }
}
