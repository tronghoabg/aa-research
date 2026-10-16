package defpackage;

/* loaded from: classes.dex */
public final class ahng {
    private ahng() {
    }

    public static final Object a(Object obj, afck afckVar) {
        if (!(obj instanceof aito)) {
            return obj;
        }
        Throwable thA = ((aito) obj).b;
        if (aitz.b && (afckVar instanceof afdb)) {
            thA = ajcy.a(thA, (afdb) afckVar);
        }
        thA.getClass();
        return new aezv(thA);
    }

    public static final Object b(Object obj) {
        Throwable thA = aezw.a(obj);
        return thA == null ? obj : new aito(thA, false);
    }

    public final ahnh topLevel(ahnj ahnjVar) {
        ahnjVar.getClass();
        String strAsString = ahnjVar.asString();
        strAsString.getClass();
        return new ahnh(strAsString, ahnf.ROOT.toUnsafe(), ahnjVar, null);
    }

    public /* synthetic */ ahng(afeu afeuVar) {
        this();
    }
}
