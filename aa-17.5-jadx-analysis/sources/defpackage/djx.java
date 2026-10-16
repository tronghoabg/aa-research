package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class djx implements djq {
    public final View a;
    public boolean b;
    public final div i;
    public Runnable k;
    public final nfh l;
    private final Executor m;
    private Rect n;
    public afec c = new cyo(14);
    public afec d = new cyo(15);
    public djv e = new djv("", dfv.a, 4);
    public dje f = dje.a;
    public final List g = new ArrayList();
    public final aezr h = woy.dH(3, new deh(this, 5));
    public final byw j = new byw(new djw[16]);

    public djx(View view, cqg cqgVar, nfh nfhVar, Executor executor) {
        this.a = view;
        this.l = nfhVar;
        this.m = executor;
        this.i = new div(cqgVar, nfhVar);
    }

    private final void e(djw djwVar) {
        this.j.n(djwVar);
        if (this.k == null) {
            ne neVar = new ne(this, 11, null);
            this.m.execute(neVar);
            this.k = neVar;
        }
    }

    public final void a() {
        nfh nfhVar = this.l;
        nfhVar.p().restartInput((View) nfhVar.c);
    }

    @Override // defpackage.djq
    public final void b(cjb cjbVar) {
        Rect rect;
        float f = cjbVar.e;
        this.n = new Rect(afgi.k(cjbVar.b), afgi.k(cjbVar.c), afgi.k(cjbVar.d), afgi.k(f));
        if (!this.g.isEmpty() || (rect = this.n) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.djq
    public final void c() {
        e(djw.a);
    }

    @Override // defpackage.djq
    public final void d(djv djvVar, dje djeVar, afec afecVar, afec afecVar2) {
        this.b = true;
        this.e = djvVar;
        this.f = djeVar;
        this.c = afecVar;
        this.d = afecVar2;
        e(djw.a);
    }

    @Override // defpackage.djq
    public final void f() {
        this.b = false;
        this.c = new cyo(12);
        this.d = new cyo(13);
        this.n = null;
        e(djw.b);
    }

    @Override // defpackage.djq
    public final void g(djv djvVar, djv djvVar2) {
        int iMin;
        int iMax;
        int iMin2;
        long j = this.e.b;
        long j2 = dfv.a;
        boolean z = true;
        if (j == djvVar2.b && affa.f(this.e.c, djvVar2.c)) {
            z = false;
        }
        this.e = djvVar2;
        List list = this.g;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            djr djrVar = (djr) ((WeakReference) list.get(i)).get();
            if (djrVar != null) {
                djrVar.a = djvVar2;
            }
        }
        div divVar = this.i;
        synchronized (divVar.a) {
            divVar.h = null;
            divVar.j = null;
            divVar.i = null;
            divVar.k = ayv.c;
            divVar.l = null;
            divVar.m = null;
        }
        int iMax2 = -1;
        if (affa.f(djvVar, djvVar2)) {
            if (z) {
                nfh nfhVar = this.l;
                long j3 = djvVar2.b;
                int i2 = (int) (j3 >> 32);
                int i3 = (int) (j3 & 4294967295L);
                int iMin3 = Math.min(i2, i3);
                int iMax3 = Math.max(i2, i3);
                dfv dfvVar = this.e.c;
                if (dfvVar != null) {
                    long j4 = dfvVar.b;
                    iMin2 = Math.min((int) (j4 >> 32), (int) (j4 & 4294967295L));
                } else {
                    iMin2 = -1;
                }
                dfv dfvVar2 = this.e.c;
                if (dfvVar2 != null) {
                    long j5 = dfvVar2.b;
                    iMax2 = Math.max((int) (j5 >> 32), (int) (4294967295L & j5));
                }
                nfhVar.q(iMin3, iMax3, iMin2, iMax2);
                return;
            }
            return;
        }
        if (djvVar != null && (!affa.f(djvVar.a(), djvVar2.a()) || (djvVar.b == djvVar2.b && !affa.f(djvVar.c, djvVar2.c)))) {
            a();
            return;
        }
        List list2 = this.g;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            djr djrVar2 = (djr) ((WeakReference) list2.get(i4)).get();
            if (djrVar2 != null) {
                djv djvVar3 = this.e;
                nfh nfhVar2 = this.l;
                if (djrVar2.d) {
                    djrVar2.a = djvVar3;
                    if (djrVar2.c) {
                        nfhVar2.p().updateExtractedText((View) nfhVar2.c, djrVar2.b, aclh.w(djvVar3));
                    }
                    dfv dfvVar3 = djvVar3.c;
                    if (dfvVar3 != null) {
                        long j6 = dfvVar3.b;
                        iMin = Math.min((int) (j6 >> 32), (int) (j6 & 4294967295L));
                    } else {
                        iMin = -1;
                    }
                    if (dfvVar3 != null) {
                        long j7 = dfvVar3.b;
                        iMax = Math.max((int) (j7 >> 32), (int) (j7 & 4294967295L));
                    } else {
                        iMax = -1;
                    }
                    long j8 = djvVar3.b;
                    int i5 = (int) (j8 >> 32);
                    int i6 = (int) (j8 & 4294967295L);
                    nfhVar2.q(Math.min(i5, i6), Math.max(i5, i6), iMin, iMax);
                }
            }
        }
    }

    @Override // defpackage.djq
    public final void h(djv djvVar, djn djnVar, dft dftVar, afec afecVar, cjb cjbVar, cjb cjbVar2) {
        div divVar = this.i;
        synchronized (divVar.a) {
            divVar.h = djvVar;
            divVar.j = djnVar;
            divVar.i = dftVar;
            divVar.k = afecVar;
            divVar.l = cjbVar;
            divVar.m = cjbVar2;
            if (divVar.c || divVar.b) {
                divVar.a();
            }
        }
    }

    @Override // defpackage.djq
    public final void i() {
        e(djw.d);
    }

    @Override // defpackage.djq
    public final void j() {
        e(djw.c);
    }
}
