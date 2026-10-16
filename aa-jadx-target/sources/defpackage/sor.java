package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class sor extends defpackage.sok implements defpackage.slr {
    public static volatile java.util.concurrent.Executor u;
    private final android.accounts.Account a;
    public final defpackage.som v;
    public final java.util.Set w;

    protected sor(android.content.Context context, android.os.Looper looper, int i, defpackage.som somVar, defpackage.smx smxVar, defpackage.snr snrVar) {
        super(context, looper, defpackage.sox.b(context), defpackage.skr.a, i, new defpackage.wyz(smxVar, null), new defpackage.wyz(snrVar, null), somVar.f);
        this.v = somVar;
        this.a = somVar.a;
        java.util.Set set = somVar.c;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((com.google.android.gms.common.api.Scope) it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.w = set;
        if (u == null) {
            synchronized (defpackage.sor.class) {
                if (u == null && defpackage.sov.a(context.getPackageName())) {
                    u = defpackage.sot.a(context);
                }
            }
        }
    }

    @Override // defpackage.sok
    public final com.google.android.gms.common.Feature[] D() {
        return new com.google.android.gms.common.Feature[0];
    }

    @Override // defpackage.sok, defpackage.slr
    public int a() {
        throw null;
    }

    @Override // defpackage.slr
    public final java.util.Set m() {
        return i() ? this.w : java.util.Collections.EMPTY_SET;
    }

    @Override // defpackage.sok
    public final android.accounts.Account u() {
        return this.a;
    }

    @Override // defpackage.sok
    protected final java.util.concurrent.Executor x() {
        return u;
    }
}
