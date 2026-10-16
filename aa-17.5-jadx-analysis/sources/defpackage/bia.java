package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class bia extends bim {
    public bip a;
    private aivh c;
    private aizk d;

    private final void m(afec afecVar) {
        bik bikVar = this.b;
        if (bikVar == null) {
            return;
        }
        this.c = bikVar.A ? ahnc.d(bikVar.N(), null, 4, new beh(bikVar, new bhz(afecVar, this, bikVar, (afck) null, 0), (afck) null, 4), 1) : null;
    }

    public final aizk a() {
        aizk aizkVar = this.d;
        if (aizkVar != null) {
            return aizkVar;
        }
        if (!bhv.a) {
            return null;
        }
        aizk aizkVarE = aizq.e(1, 0, 3, 2);
        this.d = aizkVarE;
        return aizkVarE;
    }

    @Override // defpackage.bim, defpackage.djq
    public final void b(cjb cjbVar) {
        Rect rect;
        bip bipVar = this.a;
        if (bipVar != null) {
            bipVar.k = new Rect(afgi.k(cjbVar.b), afgi.k(cjbVar.c), afgi.k(cjbVar.d), afgi.k(cjbVar.e));
            if (!bipVar.i.isEmpty() || (rect = bipVar.k) == null) {
                return;
            }
            bipVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.bim, defpackage.djq
    public final void c() {
        m(null);
    }

    @Override // defpackage.djq
    public final void d(djv djvVar, dje djeVar, afec afecVar, afec afecVar2) {
        m(new bhw(djvVar, this, djeVar, afecVar, afecVar2, 0));
    }

    @Override // defpackage.bim
    public final void e() {
        aizk aizkVarA = a();
        if (aizkVarA != null) {
            aizkVarA.c(afak.a);
        }
    }

    @Override // defpackage.djq
    public final void f() {
        aivh aivhVar = this.c;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        this.c = null;
        aizk aizkVarA = a();
        if (aizkVarA != null) {
            synchronized (aizkVarA) {
                ((aizp) aizkVarA).k(((aizp) aizkVarA).d(), ((aizp) aizkVarA).c, ((aizp) aizkVarA).d(), ((aizp) aizkVarA).f());
            }
        }
    }

    @Override // defpackage.djq
    public final void g(djv djvVar, djv djvVar2) {
        bip bipVar = this.a;
        if (bipVar != null) {
            long j = bipVar.g.b;
            long j2 = djvVar2.b;
            long j3 = dfv.a;
            boolean zJ = a.j(j, j2);
            boolean z = true;
            if (zJ && affa.f(bipVar.g.c, djvVar2.c)) {
                z = false;
            }
            bipVar.g = djvVar2;
            List list = bipVar.i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                biq biqVar = (biq) ((WeakReference) list.get(i)).get();
                if (biqVar != null) {
                    biqVar.a = djvVar2;
                }
            }
            bil bilVar = bipVar.l;
            synchronized (bilVar.a) {
                bilVar.h = null;
                bilVar.j = null;
                bilVar.i = null;
                bilVar.k = null;
                bilVar.l = null;
            }
            if (affa.f(djvVar, djvVar2)) {
                if (z) {
                    bii biiVar = bipVar.m;
                    long j4 = djvVar2.b;
                    int iD = dfv.d(j4);
                    int iC = dfv.c(j4);
                    dfv dfvVar = bipVar.g.c;
                    int iD2 = dfvVar != null ? dfv.d(dfvVar.b) : -1;
                    dfv dfvVar2 = bipVar.g.c;
                    biiVar.b(iD, iC, iD2, dfvVar2 != null ? dfv.c(dfvVar2.b) : -1);
                    return;
                }
                return;
            }
            if (djvVar != null && (!affa.f(djvVar.a(), djvVar2.a()) || (a.j(djvVar.b, djvVar2.b) && !affa.f(djvVar.c, djvVar2.c)))) {
                bii biiVar2 = bipVar.m;
                biiVar2.a().restartInput((View) biiVar2.a);
                return;
            }
            List list2 = bipVar.i;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                biq biqVar2 = (biq) ((WeakReference) list2.get(i2)).get();
                if (biqVar2 != null) {
                    djv djvVar3 = bipVar.g;
                    bii biiVar3 = bipVar.m;
                    if (biqVar2.d) {
                        biqVar2.a = djvVar3;
                        if (biqVar2.c) {
                            biiVar3.a().updateExtractedText((View) biiVar3.a, biqVar2.b, aclh.w(djvVar3));
                        }
                        dfv dfvVar3 = djvVar3.c;
                        int iD3 = dfvVar3 != null ? dfv.d(dfvVar3.b) : -1;
                        int iC2 = dfvVar3 != null ? dfv.c(dfvVar3.b) : -1;
                        long j5 = djvVar3.b;
                        biiVar3.b(dfv.d(j5), dfv.c(j5), iD3, iC2);
                    }
                }
            }
        }
    }

    @Override // defpackage.bim, defpackage.djq
    public final void h(djv djvVar, djn djnVar, dft dftVar, afec afecVar, cjb cjbVar, cjb cjbVar2) {
        bip bipVar = this.a;
        if (bipVar != null) {
            bil bilVar = bipVar.l;
            synchronized (bilVar.a) {
                bilVar.h = djvVar;
                bilVar.j = djnVar;
                bilVar.i = dftVar;
                bilVar.k = cjbVar;
                bilVar.l = cjbVar2;
                if (bilVar.c || bilVar.b) {
                    bilVar.a();
                }
            }
        }
    }
}
