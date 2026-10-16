package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aixi {
    public static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();

    public static final defpackage.aivr a() {
        java.lang.ThreadLocal threadLocal = a;
        defpackage.aivr aivrVar = (defpackage.aivr) threadLocal.get();
        if (aivrVar != null) {
            return aivrVar;
        }
        defpackage.aiuc aiucVar = new defpackage.aiuc(java.lang.Thread.currentThread());
        threadLocal.set(aiucVar);
        return aiucVar;
    }
}
