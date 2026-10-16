package defpackage;

/* loaded from: classes2.dex */
public abstract class aivk extends ajcq implements aiuo, aivd {
    public aivo b;

    @Override // defpackage.aivd
    public final aivs a() {
        return null;
    }

    public abstract void b(Throwable th);

    public abstract boolean c();

    public final aivo f() {
        aivo aivoVar = this.b;
        if (aivoVar != null) {
            return aivoVar;
        }
        affa.d("job");
        return null;
    }

    @Override // defpackage.aiuo
    public final void hy() {
        Object objHN;
        aivo aivoVarF = f();
        do {
            objHN = aivoVarF.hN();
            if (objHN instanceof aivk) {
                if (objHN != this) {
                    return;
                }
            } else {
                if (!(objHN instanceof aivn)) {
                    if (!(objHN instanceof aivd) || ((aivd) objHN).a() == null) {
                        return;
                    }
                    n();
                    return;
                }
                if (!aivp.a) {
                    aivs aivsVar = ((aivn) objHN).a;
                    n();
                    return;
                }
                while (true) {
                    Object objG = g();
                    if ((objG instanceof ajcu) || affa.f(objG, this)) {
                        return;
                    }
                    if (objG instanceof ajcq) {
                        if (this.d.d(objG, ((ajcq) objG).j())) {
                            return;
                        }
                    }
                }
            }
        } while (!aivoVarF.e.d(objHN, aivp.h));
    }

    @Override // defpackage.aivd
    public final boolean hz() {
        return true;
    }

    @Override // defpackage.ajcq
    public final String toString() {
        return aiua.a(this) + "@" + aiua.b(this) + "[job@" + aiua.b(f()) + "]";
    }
}
