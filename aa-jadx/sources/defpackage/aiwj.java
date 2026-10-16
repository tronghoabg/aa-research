package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aiwj extends defpackage.ajdq implements defpackage.aivn, defpackage.aiwc {
    public defpackage.aiwn b;

    @Override // defpackage.aiwc
    public final defpackage.aiwr a() {
        return null;
    }

    public abstract void b(java.lang.Throwable th);

    public abstract boolean c();

    public final defpackage.aiwn f() {
        defpackage.aiwn aiwnVar = this.b;
        if (aiwnVar != null) {
            return aiwnVar;
        }
        defpackage.afga.d("job");
        return null;
    }

    @Override // defpackage.aivn
    public final void gK() {
        java.lang.Object objGY;
        defpackage.aiwn aiwnVarF = f();
        do {
            objGY = aiwnVarF.gY();
            if (objGY instanceof defpackage.aiwj) {
                if (objGY != this) {
                    return;
                }
            } else {
                if (!(objGY instanceof defpackage.aiwm)) {
                    if (!(objGY instanceof defpackage.aiwc) || ((defpackage.aiwc) objGY).a() == null) {
                        return;
                    }
                    n();
                    return;
                }
                if (!defpackage.aiwo.a) {
                    defpackage.aiwr aiwrVar = ((defpackage.aiwm) objGY).a;
                    n();
                    return;
                }
                while (true) {
                    java.lang.Object objG = g();
                    if ((objG instanceof defpackage.ajdu) || defpackage.afga.f(objG, this)) {
                        return;
                    }
                    if (objG instanceof defpackage.ajdq) {
                        if (this.d.d(objG, ((defpackage.ajdq) objG).j())) {
                            return;
                        }
                    }
                }
            }
        } while (!aiwnVarF.e.d(objGY, defpackage.aiwo.h));
    }

    @Override // defpackage.aiwc
    public final boolean gL() {
        return true;
    }

    @Override // defpackage.ajdq
    public final java.lang.String toString() {
        return defpackage.aiuz.a(this) + "@" + defpackage.aiuz.b(this) + "[job@" + defpackage.aiuz.b(f()) + "]";
    }
}
