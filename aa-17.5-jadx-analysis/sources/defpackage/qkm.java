package defpackage;

import android.util.Pair;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class qkm implements mnp {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public qkm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mnp
    public final void c(moa moaVar) {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((ncp) obj).n(moaVar);
        } else {
            ((qkn) obj).e(moaVar);
        }
    }

    @Override // defpackage.mnp
    public final void d(moa moaVar, moa moaVar2) {
        int i = this.b;
        Object obj = this.a;
        if (i == 0) {
            ((qkn) obj).e(moaVar2);
            return;
        }
        if (moaVar2 != null) {
            moaVar = moaVar2;
        }
        ((ncp) obj).n(moaVar);
    }

    @Override // defpackage.mnp
    public final void e(moa moaVar) {
        if (this.b != 0) {
            ((ncp) this.a).n(moaVar);
            return;
        }
        yph yphVar = qkn.a;
        if (yphVar.l().Z()) {
            ((ype) yphVar.l().ai((char) 7492)).y("processStreamItemRemoved %s", Objects.toString(moaVar));
        }
        qkj qkjVar = (qkj) ((qkn) this.a).b.remove(new Pair(Long.valueOf(moaVar.A()), moaVar.J()));
        if (qkjVar == null) {
            ((ype) yphVar.l().ai((char) 7491)).u("no adapter found for removed SI");
            return;
        }
        nur nurVarE = qkjVar.e(moaVar);
        String strB = nurVarE == null ? qkn.b(moaVar) : nurVarE.f;
        qkjVar.c();
        nuj.b().g(moaVar.J().name(), moaVar.A(), strB);
    }

    @Override // defpackage.mnp
    public final void a() {
    }

    @Override // defpackage.mnp
    public final void b() {
    }
}
