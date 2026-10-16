package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class daj implements bwj {
    public final Choreographer a;
    private final dag c;

    public daj(Choreographer choreographer, dag dagVar) {
        this.a = choreographer;
        this.c = dagVar;
    }

    @Override // defpackage.bwj
    public final Object a(afec afecVar, afck afckVar) {
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        dai daiVar = new dai(aitgVar, afecVar);
        dag dagVar = this.c;
        Choreographer choreographer = dagVar.c;
        Choreographer choreographer2 = this.a;
        if (affa.f(choreographer, choreographer2)) {
            synchronized (dagVar.e) {
                dagVar.f.add(daiVar);
                if (!dagVar.h) {
                    dagVar.h = true;
                    choreographer.postFrameCallback(dagVar.i);
                }
            }
            aitgVar.d(new beq(dagVar, daiVar, 4));
        } else {
            choreographer2.postFrameCallback(daiVar);
            aitgVar.d(new dah(this, daiVar, 0));
        }
        return aitgVar.k();
    }

    @Override // defpackage.afco
    public final <R> R fold(R r, afeg<? super R, ? super afcm, ? extends R> afegVar) {
        return afegVar.invoke(r, this);
    }

    @Override // defpackage.afcm, defpackage.afco
    public final <E extends afcm> E get(afcn<E> afcnVar) {
        return (E) affa.t(this, afcnVar);
    }

    @Override // defpackage.afcm
    public final /* synthetic */ afcn getKey() {
        return bwj.b;
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        afcoVar.getClass();
        return affa.w(this, afcoVar);
    }
}
