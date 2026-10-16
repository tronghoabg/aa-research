package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class bgf extends afde implements afec {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgf(amv amvVar, afeh afehVar, afck afckVar, int i) {
        super(1, afckVar);
        this.d = i;
        this.b = amvVar;
        this.c = afehVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [afeh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [dhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [efa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.d;
        int i2 = 6;
        byte[] bArr = null;
        if (i != 0) {
            if (i == 1) {
                afcr afcrVar = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                } else {
                    woy.dF(obj);
                    Object obj2 = this.b;
                    alg algVar = new alg(obj2, i2);
                    ams amsVar = new ams((afeh) this.c, (amv) obj2, (afck) null, 1);
                    this.a = 1;
                    if (amm.a(algVar, amsVar, this) == afcrVar) {
                        return afcrVar;
                    }
                }
                amv amvVar = (amv) this.b;
                Object objB = amvVar.n().b(amvVar.b());
                if (objB != null) {
                    if (Math.abs(amvVar.b() - amvVar.n().a(objB)) < 0.5f) {
                        Boolean bool = true;
                        bool.getClass();
                        amvVar.m(objB);
                        amvVar.k(objB);
                    }
                }
                return afak.a;
            }
            if (i == 2) {
                afcr afcrVar2 = afcr.a;
                try {
                    if (this.a != 0) {
                        woy.dF(obj);
                    } else {
                        woy.dF(obj);
                        Object obj3 = this.c;
                        Object obj4 = this.b;
                        ((bhl) obj3).d((bhk) obj4);
                        this.a = 1;
                        Object objD = ((bhk) obj4).b.d(this);
                        if (objD != afcrVar2) {
                            objD = afak.a;
                        }
                        if (objD == afcrVar2) {
                            return afcrVar2;
                        }
                    }
                    ((bhl) this.c).d(null);
                    return afak.a;
                } catch (Throwable th) {
                    ((bhl) this.c).d(null);
                    throw th;
                }
            }
            if (i == 3) {
                afcr afcrVar3 = afcr.a;
                if (this.a != 0) {
                    woy.dF(obj);
                    return obj;
                }
                woy.dF(obj);
                Object obj5 = this.b;
                ?? r1 = this.c;
                this.a = 1;
                Object objC = ((dhk) obj5).c(r1, this);
                return objC == afcrVar3 ? afcrVar3 : objC;
            }
            afcr afcrVar4 = afcr.a;
            int i3 = this.a;
            woy.dF(obj);
            if (i3 == 0) {
                this.a = 1;
                obj = null;
            } else if (i3 != 1) {
                return obj;
            }
            fdf fdfVar = (fdf) obj;
            ehn ehnVar = (ehn) hH().get(bwi.c);
            if (ehnVar != 0) {
                ehnVar.a(this.b);
            }
            egd egdVar = (egd) this.b;
            ehn ehnVar2 = new ehn(ehnVar, egdVar);
            efz efzVar = new efz(egdVar, (afeg) this.c, fdfVar, (afck) null, 0);
            this.a = 2;
            Object objA = ahnc.a(ehnVar2, efzVar, this);
            return objA == afcrVar4 ? afcrVar4 : objA;
        }
        afcr afcrVar5 = afcr.a;
        try {
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                bge bgeVar = new bge();
                Object obj6 = this.b;
                Object obj7 = this.c;
                aiy aiyVar = new aiy(obj6, obj7, 12);
                aiy aiyVar2 = new aiy(obj6, obj7, 13);
                bgg bggVar = (bgg) obj6;
                View view = bggVar.a;
                bgd bgdVar = new bgd(bgeVar, aiyVar, aiyVar2, view);
                Looper looperMyLooper = Looper.myLooper();
                Handler handler = view.getHandler();
                if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                    Runnable impVar = bggVar.g;
                    if (impVar == null) {
                        impVar = new imp(obj6, (Object) bgdVar, (Object) bgeVar, 1, (byte[]) null);
                        bggVar.g = impVar;
                    }
                    view.post(impVar);
                } else {
                    ActionMode actionModeAa = awx.aa(view, bgdVar);
                    if (actionModeAa == null) {
                        return afak.a;
                    }
                    bggVar.f = actionModeAa;
                }
                this.a = 1;
                Object objD2 = bgeVar.a.d(this);
                if (objD2 != afcrVar5) {
                    objD2 = afak.a;
                }
                if (objD2 == afcrVar5) {
                    return afcrVar5;
                }
            }
            Object obj8 = this.b;
            bgg bggVar2 = (bgg) obj8;
            bggVar2.c.a();
            View view2 = bggVar2.a;
            Looper looperMyLooper2 = Looper.myLooper();
            Handler handler2 = view2.getHandler();
            if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                Runnable neVar = bggVar2.h;
                if (neVar == null) {
                    neVar = new ne(obj8, i2, bArr);
                    bggVar2.h = neVar;
                }
                view2.post(neVar);
            } else {
                ActionMode actionMode = bggVar2.f;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            Runnable runnable = bggVar2.g;
            if (runnable != null) {
                view2.removeCallbacks(runnable);
            }
            bggVar2.f = null;
            return afak.a;
        } catch (Throwable th2) {
            Object obj9 = this.b;
            bgg bggVar3 = (bgg) obj9;
            bggVar3.c.a();
            View view3 = bggVar3.a;
            Looper looperMyLooper3 = Looper.myLooper();
            Handler handler3 = view3.getHandler();
            if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                Runnable neVar2 = bggVar3.h;
                if (neVar2 == null) {
                    neVar2 = new ne(obj9, i2, bArr);
                    bggVar3.h = neVar2;
                }
                view3.post(neVar2);
            } else {
                ActionMode actionMode2 = bggVar3.f;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            Runnable runnable2 = bggVar3.g;
            if (runnable2 != null) {
                view3.removeCallbacks(runnable2);
            }
            bggVar3.f = null;
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [bho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [dhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [afeh, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.d;
        if (i == 0) {
            Object obj2 = this.b;
            return new bgf((bgg) obj2, (bho) this.c, (afck) obj, 0).hT(afak.a);
        }
        if (i == 1) {
            Object obj3 = this.b;
            return new bgf((amv) obj3, (afeh) this.c, (afck) obj, 1).hT(afak.a);
        }
        if (i == 2) {
            Object obj4 = this.c;
            return new bgf((bhl) obj4, (bhk) this.b, (afck) obj, 2).hT(afak.a);
        }
        if (i != 3) {
            Object obj5 = this.b;
            return new bgf((egd) obj5, (afeg) this.c, (afck) obj, 4).hT(afak.a);
        }
        Object obj6 = this.b;
        return new bgf((dhk) obj6, (dhr) this.c, (afck) obj, 3).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgf(bgg bggVar, bho bhoVar, afck afckVar, int i) {
        super(1, afckVar);
        this.d = i;
        this.b = bggVar;
        this.c = bhoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgf(bhl bhlVar, bhk bhkVar, afck afckVar, int i) {
        super(1, afckVar);
        this.d = i;
        this.c = bhlVar;
        this.b = bhkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgf(dhk dhkVar, dhr dhrVar, afck afckVar, int i) {
        super(1, afckVar);
        this.d = i;
        this.b = dhkVar;
        this.c = dhrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgf(egd egdVar, afeg afegVar, afck afckVar, int i) {
        super(1, afckVar);
        this.d = i;
        this.b = egdVar;
        this.c = afegVar;
    }
}
