package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sqd {
    private static defpackage.sqs a;

    public static synchronized void a() {
        if (a == null) {
            b(new defpackage.sqs());
        }
    }

    public static synchronized void b(defpackage.sqs sqsVar) {
        defpackage.ysr.bk(a == null, "Redundantly setting SignatureVerificationConfiguration");
        a = sqsVar;
    }
}
