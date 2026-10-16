package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class vah implements vae {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public vah(qsb qsbVar, pwc pwcVar, int i) {
        this.c = i;
        this.a = pwcVar;
        this.b = qsbVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vae] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uzy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, uzy] */
    @Override // defpackage.vae
    public final void a(uzy uzyVar) {
        zhc zhcVar;
        int i = this.c;
        ?? r0 = this.b;
        if (i == 0) {
            r0.a(this.a);
            return;
        }
        xxh xxhVarA = ((qsb) r0).a();
        boolean zF = xxhVarA.f();
        Object obj = this.a;
        if (zF && lws.O(((pnd) xxhVarA.b()).k())) {
            pwc pwcVar = (pwc) obj;
            pwcVar.c = true;
            pwn pwnVarC = pwcVar.c();
            synchronized (obj) {
                zhcVar = ((pwc) obj).a;
            }
            zhcVar.o(pwnVarC);
            if (pwcVar.b.getAndSet(true)) {
                return;
            }
            qsb qsbVar = pwcVar.d;
            vae vaeVar = (vae) qsbVar.d.remove(obj);
            if (vaeVar != null) {
                qsbVar.c.f(vaeVar);
            }
        }
    }

    public /* synthetic */ vah(vai vaiVar, vae vaeVar, int i) {
        this.c = i;
        this.a = vaiVar;
        this.b = vaeVar;
    }
}
