package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public class aivo implements aivh {
    private final aisx a;
    public final aisx e;

    public aivo(boolean z) {
        aiur aiurVar = z ? aivp.h : aivp.g;
        aisy aisyVar = aisy.a;
        this.e = new aisx(aiurVar, aisyVar);
        this.a = new aisx(null, aisyVar);
    }

    public static final aitl Q(ajcq ajcqVar) {
        while (ajcqVar.hA()) {
            ajcqVar = ajcqVar.i();
        }
        while (true) {
            ajcqVar = ajcqVar.h();
            if (!ajcqVar.hA()) {
                if (ajcqVar instanceof aitl) {
                    return (aitl) ajcqVar;
                }
                if (ajcqVar instanceof aivs) {
                    return null;
                }
            }
        }
    }

    private final void R(aivk aivkVar) {
        aivs aivsVar = new aivs();
        aivsVar.e.b(aivkVar);
        aivsVar.d.b(aivkVar);
        while (true) {
            if (aivkVar.g() != aivkVar) {
                break;
            } else if (aivkVar.d.d(aivkVar, aivsVar)) {
                aivsVar.l(aivkVar);
                break;
            }
        }
        this.e.d(aivkVar, aivkVar.h());
    }

    private final boolean S(Throwable th) {
        if (m()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        aitk aitkVarF = F();
        return (aitkVarF == null || aitkVarF == aivu.a) ? z : aitkVarF.e(th) || z;
    }

    private static final String T(Object obj) {
        if (!(obj instanceof aivn)) {
            return obj instanceof aivd ? ((aivd) obj).hz() ? "Active" : "New" : obj instanceof aito ? "Cancelled" : "Completed";
        }
        aivn aivnVar = (aivn) obj;
        return aivnVar.g() ? "Cancelling" : aivnVar.h() ? "Completing" : "Active";
    }

    private final int b(Object obj) {
        if (obj instanceof aiur) {
            if (((aiur) obj).a) {
                return 0;
            }
            if (!this.e.d(obj, aivp.h)) {
                return -1;
            }
            J();
            return 1;
        }
        if (!(obj instanceof aivc)) {
            return 0;
        }
        if (!this.e.d(obj, ((aivc) obj).a)) {
            return -1;
        }
        J();
        return 1;
    }

    private final Object f(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof aivd)) {
            return aivp.b;
        }
        if (((obj instanceof aiur) || (obj instanceof aivk)) && !(obj instanceof aitl) && !(obj2 instanceof aito)) {
            aivd aivdVar = (aivd) obj;
            boolean z = aitz.a;
            if (!this.e.d(aivdVar, aivp.a(obj2))) {
                return aivp.d;
            }
            hK(obj2);
            k(aivdVar, obj2);
            return obj2;
        }
        aivd aivdVar2 = (aivd) obj;
        aivs aivsVarI = i(aivdVar2);
        if (aivsVarI == null) {
            return aivp.d;
        }
        Throwable th = null;
        aivn aivnVar = aivdVar2 instanceof aivn ? (aivn) aivdVar2 : null;
        if (aivnVar == null) {
            aivnVar = new aivn(aivsVarI, null);
        }
        affv affvVar = new affv();
        synchronized (aivnVar) {
            if (aivnVar.h()) {
                return aivp.b;
            }
            aivnVar.b.c();
            if (aivnVar != aivdVar2 && !this.e.d(aivdVar2, aivnVar)) {
                return aivp.d;
            }
            boolean z2 = aitz.a;
            boolean zG = aivnVar.g();
            aito aitoVar = obj2 instanceof aito ? (aito) obj2 : null;
            if (aitoVar != null) {
                aivnVar.e(aitoVar.b);
            }
            Throwable thD = aivnVar.d();
            boolean z3 = !zG;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = thD;
            }
            affvVar.a = th;
            Throwable th2 = (Throwable) affvVar.a;
            if (th2 != null) {
                u(aivsVarI, th2);
            }
            aitl aitlVarQ = Q(aivsVarI);
            if (aitlVarQ != null && P(aivnVar, aitlVarQ, obj2)) {
                return aivp.c;
            }
            aivsVarI.k(2);
            aitl aitlVarQ2 = Q(aivsVarI);
            return (aitlVarQ2 == null || !P(aivnVar, aitlVarQ2, obj2)) ? hM(aivnVar, obj2) : aivp.c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    private final Throwable h(Object obj) {
        CancellationException cancellationExceptionD;
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th != null ? th : new aivi(hF(), null, this);
        }
        aivo aivoVar = (aivo) obj;
        Object objHN = aivoVar.hN();
        if (objHN instanceof aivn) {
            cancellationExceptionD = ((aivn) objHN).d();
        } else if (objHN instanceof aito) {
            cancellationExceptionD = ((aito) objHN).b;
        } else {
            if (objHN instanceof aivd) {
                Objects.toString(objHN);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(objHN)));
            }
            cancellationExceptionD = null;
        }
        CancellationException cancellationException = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        return cancellationException == null ? new aivi("Parent job is ".concat(T(objHN)), cancellationExceptionD, aivoVar) : cancellationException;
    }

    private final aivs i(aivd aivdVar) {
        aivs aivsVarA = aivdVar.a();
        if (aivsVarA != null) {
            return aivsVarA;
        }
        if (aivdVar instanceof aiur) {
            return new aivs();
        }
        if (aivdVar instanceof aivk) {
            R((aivk) aivdVar);
            return null;
        }
        Objects.toString(aivdVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(aivdVar)));
    }

    private final void k(aivd aivdVar, Object obj) throws Throwable {
        aitk aitkVarF = F();
        if (aitkVarF != null) {
            aitkVarF.hy();
            K(aivu.a);
        }
        aitp aitpVar = null;
        aito aitoVar = obj instanceof aito ? (aito) obj : null;
        Throwable th = aitoVar != null ? aitoVar.b : null;
        if (aivdVar instanceof aivk) {
            try {
                ((aivk) aivdVar).b(th);
                return;
            } catch (Throwable th2) {
                g(new aitp(a.bt(this, aivdVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        aivs aivsVarA = aivdVar.a();
        if (aivsVarA != null) {
            aivsVarA.k(1);
            Object objG = aivsVarA.g();
            objG.getClass();
            for (ajcq ajcqVarH = (ajcq) objG; !affa.f(ajcqVarH, aivsVarA); ajcqVarH = ajcqVarH.h()) {
                if ((ajcqVarH instanceof aivk) && !ajcqVarH.hA()) {
                    try {
                        ((aivk) ajcqVarH).b(th);
                    } catch (Throwable th3) {
                        if (aitpVar != null) {
                            adqs.y(aitpVar, th3);
                        } else {
                            aitpVar = new aitp(a.bt(this, ajcqVarH, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (aitpVar != null) {
                g(aitpVar);
            }
        }
    }

    private final void u(aivs aivsVar, Throwable th) throws Throwable {
        aivsVar.k(4);
        Object objG = aivsVar.g();
        objG.getClass();
        aitp aitpVar = null;
        for (ajcq ajcqVarH = (ajcq) objG; !affa.f(ajcqVarH, aivsVar); ajcqVarH = ajcqVarH.h()) {
            if ((ajcqVarH instanceof aivk) && !ajcqVarH.hA()) {
                aivk aivkVar = (aivk) ajcqVarH;
                if (aivkVar.c()) {
                    try {
                        aivkVar.b(th);
                    } catch (Throwable th2) {
                        if (aitpVar != null) {
                            adqs.y(aitpVar, th2);
                        } else {
                            aitpVar = new aitp(a.bt(this, ajcqVarH, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (aitpVar != null) {
            g(aitpVar);
        }
        S(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [aivc] */
    private final void w(aiur aiurVar) {
        aivs aivsVar = new aivs();
        if (!aiurVar.a) {
            aivsVar = new aivc(aivsVar);
        }
        this.e.d(aiurVar, aivsVar);
    }

    public final Object D(Object obj) throws Throwable {
        Object objF;
        do {
            objF = f(hN(), obj);
            if (objF == aivp.b) {
                String strBt = a.bt(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                aito aitoVar = obj instanceof aito ? (aito) obj : null;
                throw new IllegalStateException(strBt, aitoVar != null ? aitoVar.b : null);
            }
        } while (objF == aivp.d);
        return objF;
    }

    protected final CancellationException E(Throwable th, String str) {
        CancellationException aiviVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (aiviVar == null) {
            if (str == null) {
                str = hF();
            }
            aiviVar = new aivi(str, th, this);
        }
        return aiviVar;
    }

    public final aitk F() {
        return (aitk) this.a.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
    
        return defpackage.aivu.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aiuo G(boolean r5, defpackage.aivk r6) {
        /*
            r4 = this;
            r6.b = r4
        L2:
            java.lang.Object r0 = r4.hN()
            boolean r1 = r0 instanceof defpackage.aiur
            if (r1 == 0) goto L1e
            r1 = r0
            aiur r1 = (defpackage.aiur) r1
            boolean r2 = r1.a
            if (r2 == 0) goto L1a
            aisx r1 = r4.e
            boolean r0 = r1.d(r0, r6)
            if (r0 == 0) goto L2
            goto L5e
        L1a:
            r4.w(r1)
            goto L2
        L1e:
            boolean r1 = r0 instanceof defpackage.aivd
            r2 = 0
            if (r1 == 0) goto L5f
            r1 = r0
            aivd r1 = (defpackage.aivd) r1
            aivs r3 = r1.a()
            if (r3 != 0) goto L35
            r0.getClass()
            aivk r0 = (defpackage.aivk) r0
            r4.R(r0)
            goto L2
        L35:
            boolean r0 = r6.c()
            if (r0 == 0) goto L57
            boolean r0 = r1 instanceof defpackage.aivn
            if (r0 == 0) goto L42
            aivn r1 = (defpackage.aivn) r1
            goto L43
        L42:
            r1 = r2
        L43:
            if (r1 == 0) goto L49
            java.lang.Throwable r2 = r1.d()
        L49:
            if (r2 != 0) goto L51
            r0 = 5
            boolean r0 = r3.m(r6, r0)
            goto L5c
        L51:
            if (r5 == 0) goto L74
            r6.b(r2)
            goto L74
        L57:
            r0 = 1
            boolean r0 = r3.m(r6, r0)
        L5c:
            if (r0 == 0) goto L2
        L5e:
            return r6
        L5f:
            if (r5 == 0) goto L74
            java.lang.Object r4 = r4.hN()
            boolean r5 = r4 instanceof defpackage.aito
            if (r5 == 0) goto L6c
            aito r4 = (defpackage.aito) r4
            goto L6d
        L6c:
            r4 = r2
        L6d:
            if (r4 == 0) goto L71
            java.lang.Throwable r2 = r4.b
        L71:
            r6.b(r2)
        L74:
            aivu r4 = defpackage.aivu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aivo.G(boolean, aivk):aiuo");
    }

    public void H(Throwable th) {
        L(th);
    }

    protected final void I(aivh aivhVar) {
        boolean z = aitz.a;
        if (aivhVar == null) {
            K(aivu.a);
            return;
        }
        aivhVar.z();
        aitk aitkVarHP = aivhVar.hP(this);
        K(aitkVarHP);
        if (x()) {
            aitkVarHP.hy();
            K(aivu.a);
        }
    }

    public final void K(aitk aitkVar) {
        this.a.c(aitkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d9, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean L(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aivo.L(java.lang.Object):boolean");
    }

    public boolean M(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return L(th) && hB();
    }

    protected boolean N(Throwable th) {
        return false;
    }

    public final boolean O(Object obj) throws Throwable {
        while (true) {
            Object objF = f(hN(), obj);
            if (objF == aivp.b) {
                return false;
            }
            if (objF == aivp.c) {
                break;
            }
            if (objF != aivp.d) {
                l(objF);
                break;
            }
        }
        return true;
    }

    public final boolean P(aivn aivnVar, aitl aitlVar, Object obj) {
        while (affx.c(aitlVar.a, false, new aivm(this, aivnVar, aitlVar, obj)) == aivu.a) {
            aitlVar = Q(aitlVar);
            if (aitlVar == null) {
                return false;
            }
        }
        return true;
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
    public final afcn<?> getKey() {
        return aivh.d;
    }

    public boolean hB() {
        return true;
    }

    protected String hF() {
        return "Job was cancelled";
    }

    public String hG() {
        return aiua.a(this);
    }

    public final Object hL(afck afckVar) throws Throwable {
        Object objHN;
        do {
            objHN = hN();
            if (!(objHN instanceof aivd)) {
                if (!(objHN instanceof aito)) {
                    return aivp.b(objHN);
                }
                Throwable th = ((aito) objHN).b;
                if (aitz.b && (afckVar instanceof afdb)) {
                    throw ajcy.a(th, (afdb) afckVar);
                }
                throw th;
            }
        } while (b(objHN) < 0);
        aivl aivlVar = new aivl(affa.s(afckVar), this);
        aivlVar.z();
        ahne.b(aivlVar, affx.c(this, true, new aivy(aivlVar)));
        Object objK = aivlVar.k();
        if (objK == afcr.a) {
            afckVar.getClass();
        }
        return objK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object hM(aivn aivnVar, Object obj) throws Throwable {
        ArrayList<Throwable> arrayList;
        Object next;
        Throwable aiviVar;
        boolean z = aitz.a;
        Throwable th = null;
        aito aitoVar = obj instanceof aito ? (aito) obj : null;
        Throwable th2 = aitoVar != null ? aitoVar.b : null;
        synchronized (aivnVar) {
            aivnVar.g();
            Object objC = aivnVar.c();
            if (objC == null) {
                arrayList = new ArrayList(4);
            } else if (objC instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(objC);
                arrayList = arrayList2;
            } else {
                if (!(objC instanceof ArrayList)) {
                    Objects.toString(objC);
                    throw new IllegalStateException("State is ".concat(objC.toString()));
                }
                arrayList = (ArrayList) objC;
            }
            Throwable thD = aivnVar.d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th2 != null && !affa.f(th2, thD)) {
                arrayList.add(th2);
            }
            aivnVar.f(aivp.f);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        break;
                    }
                }
                Throwable th3 = (Throwable) next;
                if (th3 == null) {
                    aiviVar = (Throwable) arrayList.get(0);
                    if (aiviVar instanceof aiwl) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            Throwable th4 = (Throwable) next2;
                            if (th4 != aiviVar && (th4 instanceof aiwl)) {
                                th = next2;
                                break;
                            }
                        }
                        th = th;
                        if (th == null) {
                            th = aiviVar;
                        }
                    } else {
                        th = aiviVar;
                    }
                } else {
                    th = th3;
                }
            } else if (aivnVar.g()) {
                aiviVar = new aivi(hF(), null, this);
                th = aiviVar;
            }
            if (th != null && arrayList.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                boolean z2 = ajbn.a;
                boolean z3 = ajbn.a;
                Throwable thC = (!z3 && aitz.b) ? ajcy.c(th) : th;
                for (Throwable thC2 : arrayList) {
                    if (!z3 && aitz.b) {
                        thC2 = ajcy.c(thC2);
                    }
                    if (thC2 != th && thC2 != thC && !(thC2 instanceof CancellationException) && setNewSetFromMap.add(thC2)) {
                        adqs.y(th, thC2);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new aito(th, false);
        }
        if (th != null && (S(th) || N(th))) {
            obj.getClass();
            ((aito) obj).a();
        }
        hK(obj);
        this.e.d(aivnVar, aivp.a(obj));
        k(aivnVar, obj);
        return obj;
    }

    public final Object hN() {
        return this.e.a;
    }

    @Override // defpackage.aivh
    public final aivh hO() {
        aitk aitkVarF = F();
        if (aitkVarF != null) {
            return aitkVarF.d();
        }
        return null;
    }

    @Override // defpackage.aivh
    public final aitk hP(aivo aivoVar) {
        aitl aitlVar = new aitl(aivoVar);
        aitlVar.b = this;
        while (true) {
            Object objHN = hN();
            if (objHN instanceof aiur) {
                aiur aiurVar = (aiur) objHN;
                if (!aiurVar.a) {
                    w(aiurVar);
                } else if (this.e.d(objHN, aitlVar)) {
                    break;
                }
            } else {
                if (!(objHN instanceof aivd)) {
                    Object objHN2 = hN();
                    aito aitoVar = objHN2 instanceof aito ? (aito) objHN2 : null;
                    aitlVar.b(aitoVar != null ? aitoVar.b : null);
                    return aivu.a;
                }
                aivs aivsVarA = ((aivd) objHN).a();
                if (aivsVarA == null) {
                    objHN.getClass();
                    R((aivk) objHN);
                } else if (!aivsVarA.m(aitlVar, 7)) {
                    boolean zM = aivsVarA.m(aitlVar, 3);
                    Object objHN3 = hN();
                    if (objHN3 instanceof aivn) {
                        thD = ((aivn) objHN3).d();
                    } else {
                        boolean z = aitz.a;
                        aito aitoVar2 = objHN3 instanceof aito ? (aito) objHN3 : null;
                        if (aitoVar2 != null) {
                            thD = aitoVar2.b;
                        }
                    }
                    aitlVar.b(thD);
                    if (!zM) {
                        return aivu.a;
                    }
                    boolean z2 = aitz.a;
                    return aitlVar;
                }
            }
        }
        return aitlVar;
    }

    public boolean hw() {
        return false;
    }

    protected boolean m() {
        return false;
    }

    @Override // defpackage.afco
    public final afco minusKey(afcn<?> afcnVar) {
        return affa.u(this, afcnVar);
    }

    @Override // defpackage.aivh
    public final Object n(afck afckVar) {
        Object objHN;
        do {
            objHN = hN();
            if (!(objHN instanceof aivd)) {
                affx.f(afckVar.hH());
                return afak.a;
            }
        } while (b(objHN) < 0);
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        ahne.b(aitgVar, affx.c(this, true, new aivz(aitgVar)));
        Object objK = aitgVar.k();
        afcr afcrVar = afcr.a;
        if (objK == afcrVar) {
            afckVar.getClass();
        }
        return objK == afcrVar ? objK : afak.a;
    }

    @Override // defpackage.aivh
    public final CancellationException o() {
        Object objHN = hN();
        if (!(objHN instanceof aivn)) {
            if (!(objHN instanceof aivd)) {
                return objHN instanceof aito ? E(((aito) objHN).b, null) : new aivi(String.valueOf(getClass().getSimpleName()).concat(" has completed normally"), null, this);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable thD = ((aivn) objHN).d();
        if (thD != null) {
            return E(thD, String.valueOf(getClass().getSimpleName()).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.aivh
    public final aiuo p(afec afecVar) {
        return G(true, new aivg(afecVar));
    }

    @Override // defpackage.afco
    public final afco plus(afco afcoVar) {
        afcoVar.getClass();
        return affa.w(this, afcoVar);
    }

    @Override // defpackage.aivh
    public final aiuo q(boolean z, boolean z2, afec afecVar) {
        return G(z2, z ? new aivf(afecVar) : new aivg(afecVar));
    }

    @Override // defpackage.aivh
    public void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new aivi(hF(), null, this);
        }
        H(cancellationException);
    }

    @Override // defpackage.aivh
    public final boolean t() {
        Object objHN = hN();
        return (objHN instanceof aivd) && ((aivd) objHN).hz();
    }

    public final String toString() {
        return (hG() + "{" + T(hN()) + "}") + "@" + aiua.b(this);
    }

    @Override // defpackage.aivh
    public final boolean v() {
        Object objHN = hN();
        if (objHN instanceof aito) {
            return true;
        }
        return (objHN instanceof aivn) && ((aivn) objHN).g();
    }

    @Override // defpackage.aivh
    public final boolean x() {
        return !(hN() instanceof aivd);
    }

    @Override // defpackage.aivh
    public final void z() {
        int iB;
        do {
            iB = b(hN());
            if (iB == 0) {
                return;
            }
        } while (iB != 1);
    }

    protected void J() {
    }

    public void g(Throwable th) throws Throwable {
        throw th;
    }

    protected void hK(Object obj) {
    }

    protected void l(Object obj) {
    }
}
