package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tzt {
    public final tzi a;
    public tzl b;
    public psj d;
    public usy e;
    public qrx g;
    private boolean h;
    private tzd i;
    private tzs j;
    private uvg l;
    private gjv m;
    private gjv n;
    public final ajki f = new ajki();
    public ygr c = yly.a;
    private final Set k = new HashSet();

    public tzt(tzi tziVar) {
        this.a = tziVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, ucf] */
    @ResultIgnorabilityUnspecified
    public final tzx a(tzx tzxVar, tzv tzvVar) {
        synchronized (this) {
            tzi tziVar = this.a;
            tzx tzxVarA = tziVar.a(tzvVar);
            int i = -1;
            if (tzxVar != null) {
                tob tobVarA = tzxVar.a();
                int i2 = 0;
                while (true) {
                    yfq yfqVar = tzvVar.c;
                    if (i2 < ((yls) yfqVar).c) {
                        if (tobVarA.equals(((tzx) yfqVar.get(i2)).a())) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            tob tobVar = tzvVar.b;
            plb plbVar = tziVar.b;
            acjs acjsVar = (acjs) plbVar.g(tobVar);
            byte[] bArr = null;
            if (acjsVar != null && acjsVar.a == i) {
                return null;
            }
            plbVar.n(tobVar, new acjs(tobVar, i));
            boolean zEquals = tzvVar.equals(tziVar.a);
            yno it = b().iterator();
            while (it.hasNext()) {
                Object obj = ((erb) it.next()).a;
                sm smVar = new sm(tzvVar);
                synchronized (obj) {
                    if (((zvm) obj).e != null) {
                        ((zvm) obj).a.execute(new xab(obj, smVar, 17, bArr));
                    }
                }
            }
            synchronized (this) {
                tzl tzlVar = this.b;
                if (tzlVar != null) {
                    tzlVar.b(this.a);
                }
            }
            gjv gjvVar = this.n;
            if (gjvVar != null) {
                gjvVar.a.v();
            }
            if (zEquals) {
                f(tzxVar);
            }
            return tzxVarA;
        }
    }

    public final synchronized ygr b() {
        return ygr.n(this.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(tzx tzxVar, tzv tzvVar, long j) {
        ?? r0 = this.f.b;
        tob tobVar = tzvVar.b;
        synchronized (r0) {
            if (!r0.containsKey(tobVar) || ((Long) r0.get(tobVar)).longValue() <= j) {
                r0.put(tobVar, Long.valueOf(j));
                final tzx tzxVarA = a(tzxVar, tzvVar);
                if (tzxVarA != null) {
                    synchronized (this) {
                        qrx qrxVar = this.g;
                        if (qrxVar != null) {
                            int i = 0;
                            while (true) {
                                yfq yfqVar = tzxVarA.c;
                                if (i >= ((yls) yfqVar).c) {
                                    break;
                                }
                                tob tobVar2 = (tob) yfqVar.get(i);
                                if (!tobVar2.equals(tzvVar.b)) {
                                    qrxVar.c(tobVar2, new tzf() { // from class: tzo
                                        @Override // defpackage.tzn
                                        public final void a(Object obj) {
                                            tzx tzxVarA2;
                                            tzt tztVar = this.a;
                                            tzv tzvVar2 = (tzv) obj;
                                            synchronized (tztVar) {
                                                tzxVarA2 = tztVar.a.a(tzvVar2);
                                            }
                                            if (tzxVarA2 != null) {
                                                if (tzxVarA2.a().equals(tzxVarA.a())) {
                                                    tztVar.a(null, tzvVar2);
                                                }
                                            }
                                        }
                                    });
                                }
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }

    public final synchronized void d(tob tobVar) {
        qrx qrxVar;
        if (g() && (qrxVar = this.g) != null) {
            ((roa) qrxVar.b).b(tobVar, new tzn() { // from class: tzr
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.tzn
                public final void a(Object obj) {
                    qrx qrxVar2;
                    final tzt tztVar = this.a;
                    final tzx tzxVar = (tzx) obj;
                    synchronized (tztVar) {
                        qrxVar2 = tztVar.g;
                    }
                    if (qrxVar2 == null) {
                        return;
                    }
                    final long jC = tztVar.f.c();
                    yfq yfqVar = tzxVar.c;
                    int i = ((yls) yfqVar).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        qrxVar2.c((tob) yfqVar.get(i2), new tzf() { // from class: tzq
                            @Override // defpackage.tzn
                            public final void a(Object obj2) {
                                tztVar.c(tzxVar, (tzv) obj2, jC);
                            }
                        });
                    }
                }
            });
        }
    }

    public final synchronized void e() {
        gjv gjvVar;
        vat vatVar = uqb.b;
        if (this.h) {
            tzd tzdVar = this.i;
            if (tzdVar != null) {
                tzdVar.d(yly.a, null);
                this.i.a = null;
            }
            tzs tzsVar = this.j;
            if (tzsVar != null && (gjvVar = this.m) != null) {
                gjvVar.o(tzsVar);
            }
            this.j = null;
            qrx qrxVar = this.g;
            if (qrxVar != null) {
                ((plb) qrxVar.c).l();
                ((plb) ((roa) qrxVar.e).a).l();
                ((plb) ((roa) qrxVar.b).a).l();
            }
            this.h = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.tzx r12) {
        /*
            r11 = this;
            uvg r11 = r11.l
            if (r11 == 0) goto L44
            r0 = 500(0x1f4, double:2.47E-321)
            if (r12 == 0) goto L1c
            tzy r12 = r12.f
            int r12 = r12.c
            if (r12 < 0) goto Lf
            goto L1c
        Lf:
            utl r12 = r11.E
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r12.b(r2, r0)
            r11.k()
            return
        L1c:
            utl r12 = r11.E
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r4 = r12.a
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L34
            long r8 = r12.b
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 < 0) goto L34
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L41
        L34:
            long r4 = r12.b
            long r4 = r4 - r2
            long r4 = java.lang.Math.max(r4, r6)
            long r2 = r2 - r4
            r12.b = r2
            long r2 = r2 + r0
            r12.a = r2
        L41:
            r11.k()
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzt.f(tzx):void");
    }

    public final synchronized boolean g() {
        return this.h;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    final synchronized void h(usy usyVar) {
        tzd tzdVar;
        if (g() && (usyVar.d & 4) == 0 && (tzdVar = this.i) != null && this.b != null) {
            synchronized (tzdVar) {
                if (!tzdVar.d) {
                    return;
                }
                tzdVar.f = usyVar.p();
                byte[] bArr = null;
                if (!tzd.c(tzdVar.f, 17)) {
                    tzdVar.d(yly.a, null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ukp.j(usyVar.n().c, 14, arrayList, null);
                tzdVar.d(arrayList, usyVar);
                usz uszVar = tzdVar.f;
                qrx qrxVar = tzdVar.g;
                Collection collectionA = tzdVar.a();
                tzc tzcVar = new tzc(tzdVar, uszVar);
                HashSet<ukp> hashSet = new HashSet();
                Iterator it = collectionA.iterator();
                while (it.hasNext()) {
                    hashSet.add(((ukp) it.next()).h(14));
                }
                for (ukp ukpVar : hashSet) {
                    boolean z = false;
                    if (ukpVar.a < 14) {
                        int i = yfq.d;
                        tzcVar.a(ukpVar, 0, yls.a);
                        return;
                    }
                    synchronized (qrxVar) {
                        ?? r3 = qrxVar.f;
                        List arrayList2 = (List) r3.get(ukpVar);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            r3.put(ukpVar, arrayList2);
                            z = true;
                        }
                        arrayList2.add(tzcVar);
                    }
                    if (z) {
                        qrxVar.d.execute(new txo(qrxVar, ukpVar, 5, bArr));
                    }
                }
            }
        }
    }

    public final synchronized void i(psj psjVar, qrx qrxVar, tzd tzdVar) {
        this.d = psjVar;
        this.g = qrxVar;
        this.i = tzdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void j(tzl tzlVar, uvg uvgVar, gjv gjvVar, usy usyVar, gjv gjvVar2) {
        vat vatVar = uqb.b;
        if (!this.h) {
            this.b = tzlVar;
            this.m = gjvVar;
            this.e = usyVar;
            this.n = gjvVar2;
            this.l = uvgVar;
            tzd tzdVar = this.i;
            if (tzdVar != null) {
                tzdVar.a = this;
            }
            if (this.j == null) {
                tzs tzsVar = new tzs(this, usyVar, gjvVar);
                this.j = tzsVar;
                gjv gjvVar3 = tzsVar.c;
                gjvVar3.k(tzsVar);
                gjvVar3.n(tzsVar);
            }
            this.h = true;
            h(new usy(this.j.b));
            yno it = b().iterator();
            while (it.hasNext()) {
            }
        }
    }

    public final synchronized void k(erb erbVar) {
        this.k.add(erbVar);
    }

    public final synchronized void l(erb erbVar) {
        this.k.remove(erbVar);
    }
}
