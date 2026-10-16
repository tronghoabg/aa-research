package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aiwo {
    public static final boolean a = defpackage.afvs.d("kotlinx.coroutines.fast.path.cancellation", false);
    public static final defpackage.ajdz b = new defpackage.ajdz("COMPLETING_ALREADY");
    public static final defpackage.ajdz c = new defpackage.ajdz("COMPLETING_WAITING_CHILDREN");
    public static final defpackage.ajdz d = new defpackage.ajdz("COMPLETING_RETRY");
    public static final defpackage.ajdz e = new defpackage.ajdz("TOO_LATE_TO_CANCEL");
    public static final defpackage.ajdz f = new defpackage.ajdz("SEALED");
    public static final defpackage.aivq g = new defpackage.aivq(false);
    public static final defpackage.aivq h = new defpackage.aivq(true);

    public static final java.lang.Object a(java.lang.Object obj) {
        return obj instanceof defpackage.aiwc ? new defpackage.aiwd((defpackage.aiwc) obj) : obj;
    }

    public static final java.lang.Object b(java.lang.Object obj) {
        defpackage.aiwc aiwcVar;
        defpackage.aiwd aiwdVar = obj instanceof defpackage.aiwd ? (defpackage.aiwd) obj : null;
        return (aiwdVar == null || (aiwcVar = aiwdVar.a) == null) ? obj : aiwcVar;
    }
}
