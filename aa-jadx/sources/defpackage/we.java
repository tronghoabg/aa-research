package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class we {
    public java.lang.Object a;

    public static /* synthetic */ void a(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, defpackage.doe doeVar, defpackage.afer aferVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            doeVar.b(aferVar.invoke());
        } catch (java.lang.Throwable th) {
            doeVar.d(th);
        }
    }
}
