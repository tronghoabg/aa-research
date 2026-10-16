package defpackage;

/* loaded from: classes2.dex */
public final class ajca extends aiuk implements afdb, afck {
    public final aitu a;
    public final afck b;
    public Object c;
    public final Object d;
    public final aisx f;

    public ajca(aitu aituVar, afck afckVar) {
        super(-1);
        this.a = aituVar;
        this.b = afckVar;
        this.c = ajcb.a;
        this.d = ajdb.a(hH());
        this.f = new aisx(null, aisy.a);
    }

    public final void c(afco afcoVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.f(afcoVar, this);
    }

    @Override // defpackage.afdb
    public final StackTraceElement ea() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afck, afdb] */
    @Override // defpackage.afdb
    public final afdb eb() {
        return this.b;
    }

    @Override // defpackage.afck
    public final afco hH() {
        return this.b.hH();
    }

    @Override // defpackage.aiuk
    public final Object n() {
        Object obj = this.c;
        boolean z = aitz.a;
        this.c = ajcb.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + aiua.c(this.b) + "]";
    }

    @Override // defpackage.afck
    public final void w(Object obj) throws aiui {
        Object objB = ahng.b(obj);
        aitu aituVar = this.a;
        if (ajcb.c(aituVar, hH())) {
            this.c = objB;
            this.e = 0;
            ajcb.b(aituVar, hH(), this);
            return;
        }
        boolean z = aitz.a;
        ThreadLocal threadLocal = aiwj.a;
        aius aiusVarA = aiwj.a();
        if (aiusVarA.p()) {
            this.c = objB;
            this.e = 0;
            aiusVarA.n(this);
            return;
        }
        aiusVarA.o(true);
        try {
            afco afcoVarHH = hH();
            Object objB2 = ajdb.b(afcoVarHH, this.d);
            try {
                this.b.w(obj);
                while (aiusVarA.r()) {
                }
            } finally {
                ajdb.c(afcoVarHH, objB2);
            }
        } catch (Throwable th) {
            try {
                H(th);
            } finally {
                aiusVarA.m(true);
            }
        }
    }

    @Override // defpackage.aiuk
    public final afck r() {
        return this;
    }
}
