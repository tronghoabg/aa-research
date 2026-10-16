package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kot {
    public final java.util.List a;
    public final boolean b;
    public final android.os.Handler c;
    public android.os.Handler e;
    public final defpackage.pby g;
    public final defpackage.ydi h;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    public int f = 0;

    public kot(android.os.Handler handler, defpackage.pby pbyVar, defpackage.ydi ydiVar) {
        this.g = pbyVar;
        defpackage.pbs pbsVar = (pbyVar.c == 11 ? (defpackage.pbt) pbyVar.d : defpackage.pbt.a).e;
        this.a = (pbsVar == null ? defpackage.pbs.a : pbsVar).b;
        defpackage.pbs pbsVar2 = (pbyVar.c == 11 ? (defpackage.pbt) pbyVar.d : defpackage.pbt.a).e;
        this.b = (pbsVar2 == null ? defpackage.pbs.a : pbsVar2).c;
        this.h = ydiVar;
        this.c = handler;
    }

    public final boolean a() {
        return this.f >= this.a.size();
    }
}
