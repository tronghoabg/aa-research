package defpackage;

/* loaded from: classes2.dex */
public final class aivp {
    public static final boolean a = afuq.c("kotlinx.coroutines.fast.path.cancellation", false);
    public static final ajcz b = new ajcz("COMPLETING_ALREADY");
    public static final ajcz c = new ajcz("COMPLETING_WAITING_CHILDREN");
    public static final ajcz d = new ajcz("COMPLETING_RETRY");
    public static final ajcz e = new ajcz("TOO_LATE_TO_CANCEL");
    public static final ajcz f = new ajcz("SEALED");
    public static final aiur g = new aiur(false);
    public static final aiur h = new aiur(true);

    public static final Object a(Object obj) {
        return obj instanceof aivd ? new aive((aivd) obj) : obj;
    }

    public static final Object b(Object obj) {
        aivd aivdVar;
        aive aiveVar = obj instanceof aive ? (aive) obj : null;
        return (aiveVar == null || (aivdVar = aiveVar.a) == null) ? obj : aivdVar;
    }
}
