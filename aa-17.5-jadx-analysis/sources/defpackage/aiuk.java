package defpackage;

/* loaded from: classes2.dex */
public abstract class aiuk extends ajdn {
    public int e;

    public aiuk(int i) {
        super(0L, false);
        this.e = i;
    }

    public final void H(Throwable th) {
        aiiu.b(r().hH(), new aity(a.bm(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object n();

    public Throwable q(Object obj) {
        aito aitoVar = obj instanceof aito ? (aito) obj : null;
        if (aitoVar != null) {
            return aitoVar.b;
        }
        return null;
    }

    public abstract afck r();

    /* JADX WARN: Type inference failed for: r1v0, types: [afck, afdb] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = aitz.a;
        try {
            ajca ajcaVar = (ajca) r();
            ?? r1 = ajcaVar.b;
            Object obj = ajcaVar.d;
            afco afcoVarHH = r1.hH();
            Object objB = ajdb.b(afcoVarHH, obj);
            aivh aivhVar = null;
            aiwp aiwpVarC = objB != ajdb.a ? aits.c(r1, afcoVarHH, objB) : null;
            try {
                afco afcoVarHH2 = r1.hH();
                Object objN = n();
                Throwable thQ = q(objN);
                if (thQ == null && affx.k(this.e)) {
                    aivhVar = (aivh) afcoVarHH2.get(aivh.d);
                }
                if (aivhVar != null && !aivhVar.t()) {
                    Throwable thO = aivhVar.o();
                    F(thO);
                    if (aitz.b) {
                        thO = ajcy.a(thO, r1);
                    }
                    thO.getClass();
                    r1.w(new aezv(thO));
                } else if (thQ != null) {
                    r1.w(new aezv(thQ));
                } else {
                    r1.w(m(objN));
                }
                if (aiwpVarC != null && !aiwpVarC.S()) {
                    return;
                }
                ajdb.c(afcoVarHH, objB);
            } catch (Throwable th) {
                if (aiwpVarC == null || aiwpVarC.S()) {
                    ajdb.c(afcoVarHH, objB);
                }
                throw th;
            }
        } catch (aiui e) {
            aiiu.b(r().hH(), e.a);
        } catch (Throwable th2) {
            H(th2);
        }
    }

    public void F(Throwable th) {
    }

    public Object m(Object obj) {
        return obj;
    }
}
