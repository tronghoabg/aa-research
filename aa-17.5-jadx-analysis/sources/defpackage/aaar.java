package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class aaar implements zsk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaar(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xyc] */
    @Override // defpackage.zsk
    public final void a(zsl zslVar) {
        zhc zhcVar;
        if (this.b != 0) {
            int i = zvp.a;
            ((zst) this.a.gu()).t();
            return;
        }
        Object obj = ((ykd) this.a).a;
        pwn pwnVarC = ((psz) obj).c();
        synchronized (obj) {
            zhcVar = null;
            if (pwnVarC != null) {
                try {
                    zhc zhcVar2 = ((psz) obj).a;
                    if (zhcVar2 != null) {
                        zhcVar = zhcVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zhcVar != null) {
            zhcVar.o(pwnVarC);
        }
    }
}
