package defpackage;

/* loaded from: classes.dex */
public final class zfv implements zfj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public zfv(xuk xukVar, zfj zfjVar, int i) {
        this.c = i;
        this.b = xukVar;
        this.a = zfjVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xuk] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, zfj] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, zfj] */
    @Override // defpackage.zfj
    public final zgp a() throws Exception {
        if (this.c == 0) {
            if (((zfx) this.a).compareAndSet(zfw.a, zfw.c)) {
                return this.b.a();
            }
            zgk zgkVar = zgk.a;
            return zgkVar == null ? new zgk() : zgkVar;
        }
        nrd nrdVar = (nrd) xts.c.get();
        Object obj = nrdVar.b;
        xuk xukVarH = xts.h(nrdVar, this.b);
        try {
            zgp zgpVarA = this.a.a();
            Object obj2 = nrdVar.b;
            xts.h(nrdVar, xukVarH);
            zgpVarA.getClass();
            return zgpVarA;
        } catch (Throwable th) {
            try {
                xto.a(th);
                throw th;
            } catch (Throwable th2) {
                Object obj3 = nrdVar.b;
                xts.h(nrdVar, xukVarH);
                throw th2;
            }
        }
    }

    public final String toString() {
        if (this.c == 0) {
            return this.b.toString();
        }
        return "propagating=[" + this.a + "]";
    }

    public zfv(zfx zfxVar, zfj zfjVar, int i) {
        this.c = i;
        this.a = zfxVar;
        this.b = zfjVar;
    }
}
