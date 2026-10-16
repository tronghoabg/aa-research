package defpackage;

import android.view.KeyEvent;

/* loaded from: classes2.dex */
final class bqf implements afec {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ afec c;
    final /* synthetic */ boolean d;
    final /* synthetic */ float e;
    final /* synthetic */ afdr f;
    final /* synthetic */ afgw g;

    public bqf(boolean z, afgw afgwVar, boolean z2, afec afecVar, boolean z3, float f, afdr afdrVar) {
        this.a = z;
        this.g = afgwVar;
        this.b = z2;
        this.c = afecVar;
        this.d = z3;
        this.e = f;
        this.f = afdrVar;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        KeyEvent keyEvent = ((cpo) obj).a;
        if (!this.a) {
            return false;
        }
        int iE = rl.e(keyEvent);
        if (!a.Y(iE, 2)) {
            if (!a.Y(iE, 1)) {
                return false;
            }
            if (this.d) {
                long jF = rl.f(keyEvent);
                if (!a.j(jF, ti.g(19)) && !a.j(jF, ti.g(-1000000001)) && !a.j(jF, ti.g(20)) && !a.j(jF, ti.g(-1000000002)) && !a.j(jF, ti.g(122)) && !a.j(jF, ti.g(-1000000005)) && !a.j(jF, ti.g(123)) && !a.j(jF, ti.g(-1000000006)) && !a.j(jF, ti.g(92)) && !a.j(jF, ti.g(-1000000007)) && !a.j(jF, ti.g(93)) && !a.j(jF, ti.g(-1000000008))) {
                    return false;
                }
                afdr afdrVar = this.f;
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
                return true;
            }
            long jF2 = rl.f(keyEvent);
            if (!a.j(jF2, ti.g(22)) && !a.j(jF2, ti.g(-1000000004)) && !a.j(jF2, ti.g(21)) && !a.j(jF2, ti.g(-1000000003)) && !a.j(jF2, ti.g(122)) && !a.j(jF2, ti.g(-1000000005)) && !a.j(jF2, ti.g(123)) && !a.j(jF2, ti.g(-1000000006)) && !a.j(jF2, ti.g(92)) && !a.j(jF2, ti.g(-1000000007)) && !a.j(jF2, ti.g(93)) && !a.j(jF2, ti.g(-1000000008))) {
                return false;
            }
            afdr afdrVar2 = this.f;
            if (afdrVar2 != null) {
                afdrVar2.invoke();
            }
            return true;
        }
        afgw afgwVar = this.g;
        float fAbs = Math.abs(((Number) afgwVar.c()).floatValue() - ((Number) afgwVar.d()).floatValue()) / 100.0f;
        int i = true != this.b ? 1 : -1;
        if (a.j(rl.f(keyEvent), ti.g(122)) || a.j(rl.f(keyEvent), ti.g(-1000000005))) {
            this.c.invoke(afgwVar.d());
            return true;
        }
        if (a.j(rl.f(keyEvent), ti.g(123)) || a.j(rl.f(keyEvent), ti.g(-1000000006))) {
            this.c.invoke(afgwVar.c());
            return true;
        }
        if (this.d) {
            long jF3 = rl.f(keyEvent);
            if (a.j(jF3, ti.g(19)) || a.j(jF3, ti.g(-1000000001))) {
                this.c.invoke(afpt.n(Float.valueOf(this.e - (i * fAbs)), afgwVar));
                return true;
            }
            if (a.j(jF3, ti.g(20)) || a.j(jF3, ti.g(-1000000002))) {
                this.c.invoke(afpt.n(Float.valueOf(this.e + (i * fAbs)), afgwVar));
                return true;
            }
            if (a.j(jF3, ti.g(92)) || a.j(jF3, ti.g(-1000000007))) {
                this.c.invoke(afpt.n(Float.valueOf(this.e - ((i * 10) * fAbs)), afgwVar));
                return true;
            }
            if (!a.j(jF3, ti.g(93)) && !a.j(jF3, ti.g(-1000000008))) {
                return false;
            }
            this.c.invoke(afpt.n(Float.valueOf(this.e + (i * 10 * fAbs)), afgwVar));
            return true;
        }
        long jF4 = rl.f(keyEvent);
        if (a.j(jF4, ti.g(22)) || a.j(jF4, ti.g(-1000000004))) {
            this.c.invoke(afpt.n(Float.valueOf(this.e + (i * fAbs)), afgwVar));
            return true;
        }
        if (a.j(jF4, ti.g(21)) || a.j(jF4, ti.g(-1000000003))) {
            this.c.invoke(afpt.n(Float.valueOf(this.e - (i * fAbs)), afgwVar));
            return true;
        }
        if (a.j(jF4, ti.g(92)) || a.j(jF4, ti.g(-1000000007))) {
            this.c.invoke(afpt.n(Float.valueOf(this.e + (fAbs * 10.0f)), afgwVar));
            return true;
        }
        if (!a.j(jF4, ti.g(93)) && !a.j(jF4, ti.g(-1000000008))) {
            return false;
        }
        this.c.invoke(afpt.n(Float.valueOf(this.e - (fAbs * 10.0f)), afgwVar));
        return true;
    }
}
