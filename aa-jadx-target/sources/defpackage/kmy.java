package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kmy {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ExperimentToken");
    public final defpackage.svo b;
    public final java.util.concurrent.Executor c;
    public final java.util.concurrent.atomic.AtomicReference d;
    public final java.util.concurrent.atomic.AtomicReference e;

    public kmy(java.util.concurrent.Executor executor, android.content.Context context) {
        defpackage.svo svoVar = new defpackage.svo(context);
        com.google.android.gms.phenotype.ExperimentTokens experimentTokens = com.google.android.gms.phenotype.ExperimentTokens.b;
        this.d = new java.util.concurrent.atomic.AtomicReference(experimentTokens);
        this.e = new java.util.concurrent.atomic.AtomicReference(experimentTokens);
        this.c = executor;
        this.b = svoVar;
    }
}
