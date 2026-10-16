package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uyc {
    private static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();

    public static defpackage.uya a() {
        defpackage.uya uyaVar = (defpackage.uya) a.get();
        if (uyaVar == null) {
            return new defpackage.uya();
        }
        uyaVar.b(0);
        return uyaVar;
    }

    public static void b(defpackage.uya uyaVar) {
        uyaVar.c();
        a.set(uyaVar);
    }
}
