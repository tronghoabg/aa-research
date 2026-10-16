package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bil {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public bil(defpackage.dec decVar, defpackage.zo zoVar) {
        this.a = decVar.b;
        java.util.List listK = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
        this.b = new defpackage.zq(listK.size());
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            defpackage.dec decVar2 = (defpackage.dec) listK.get(i);
            if (zoVar.b(decVar2.c)) {
                ((defpackage.zq) this.b).d(decVar2.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Collection] */
    public static /* synthetic */ void ab(final defpackage.bil bilVar, final defpackage.affg affgVar, final defpackage.affh affhVar, final defpackage.afer aferVar) {
        final defpackage.cgc cgcVar = defpackage.cgf.e;
        bilVar.b.add(new defpackage.ccz(-1789283891, true, new defpackage.affh() { // from class: alw
            /* JADX WARN: Type inference failed for: r0v1, types: [affm, java.lang.Object] */
            @Override // defpackage.affh
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                defpackage.alu aluVar = (defpackage.alu) obj;
                defpackage.bve bveVar = (defpackage.bve) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= true != bveVar.C(aluVar) ? 2 : 4;
                }
                if (bveVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                    java.lang.String str = (java.lang.String) affgVar.invoke(bveVar, 0);
                    if (afzh.v(str)) {
                        defpackage.asq.d("Label must not be blank");
                    }
                    defpackage.afer aferVar2 = aferVar;
                    defpackage.affh affhVar2 = affhVar;
                    bilVar.a.invoke(cgcVar, str, java.lang.Boolean.TRUE, aluVar, affhVar2, aferVar2, bveVar, java.lang.Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    bveVar.s();
                }
                return defpackage.afbk.a;
            }
        }));
    }

    public final void A(defpackage.mr mrVar) {
        defpackage.aba abaVar = (defpackage.aba) this.b;
        defpackage.np npVarA = (defpackage.np) abaVar.get(mrVar);
        if (npVarA == null) {
            npVarA = defpackage.np.a();
            abaVar.put(mrVar, npVarA);
        }
        npVarA.b |= 1;
    }

    public final void B(long j, defpackage.mr mrVar) {
        ((defpackage.zz) this.a).g(j, mrVar);
    }

    public final void C() {
        ((defpackage.aba) this.b).clear();
        ((defpackage.zz) this.a).f();
    }

    public final void D(defpackage.mr mrVar) {
        defpackage.np npVar = (defpackage.np) ((defpackage.aba) this.b).get(mrVar);
        if (npVar == null) {
            return;
        }
        npVar.b &= -2;
    }

    public final void E(defpackage.mr mrVar) {
        defpackage.zz zzVar = (defpackage.zz) this.a;
        int iB = zzVar.b();
        while (true) {
            iB--;
            if (iB < 0) {
                break;
            }
            if (mrVar == zzVar.e(iB)) {
                java.lang.Object[] objArr = zzVar.c;
                java.lang.Object obj = objArr[iB];
                java.lang.Object obj2 = defpackage.aaa.a;
                if (obj == obj2) {
                    break;
                }
                objArr[iB] = obj2;
                zzVar.a = true;
                break;
            }
        }
        defpackage.np npVar = (defpackage.np) ((defpackage.aba) this.b).remove(mrVar);
        if (npVar != null) {
            defpackage.np.b(npVar);
        }
    }

    public final boolean F(defpackage.mr mrVar) {
        defpackage.np npVar = (defpackage.np) ((defpackage.aba) this.b).get(mrVar);
        return (npVar == null || (npVar.b & 1) == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, no] */
    public final android.view.View G(int i, int i2, int i3, int i4) {
        ?? r0 = this.b;
        int iD = r0.d();
        int iC = r0.c();
        android.view.View view = null;
        int i5 = i;
        while (i5 != i2) {
            android.view.View viewE = r0.e(i5);
            int iB = r0.b(viewE);
            int iA = r0.a(viewE);
            defpackage.nn nnVar = (defpackage.nn) this.a;
            nnVar.c(iD, iC, iB, iA);
            nnVar.b();
            nnVar.a(i3);
            if (nnVar.d()) {
                return viewE;
            }
            if (i4 != 0) {
                nnVar.b();
                nnVar.a(i4);
                if (nnVar.d()) {
                    view = viewE;
                }
            }
            i5 += i2 > i ? 1 : -1;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, no] */
    public final boolean H(android.view.View view) {
        java.lang.Object obj = this.a;
        ?? r4 = this.b;
        defpackage.nn nnVar = (defpackage.nn) obj;
        nnVar.c(r4.d(), r4.c(), r4.b(view), r4.a(view));
        nnVar.b();
        nnVar.a(24579);
        return nnVar.d();
    }

    public final void I(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = ((android.widget.TextView) this.a).getContext().obtainStyledAttributes(attributeSet, defpackage.ft.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            java.lang.Object obj = this.b;
            defpackage.emx emxVar = defpackage.emx.b;
            ((defpackage.enf) ((defpackage.kwv) obj).a).a.a = z;
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void J(android.support.v4.app.Fragment fragment, android.os.Bundle bundle, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.J(fragment, bundle, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void K(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        defpackage.bt btVar = (defpackage.bt) this.a;
        android.content.Context context = btVar.m.c;
        android.support.v4.app.Fragment fragment2 = btVar.o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.K(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void L(android.support.v4.app.Fragment fragment, android.os.Bundle bundle, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.L(fragment, bundle, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void M(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.M(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void N(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.N(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void O(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.O(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void P(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        defpackage.bt btVar = (defpackage.bt) this.a;
        android.content.Context context = btVar.m.c;
        android.support.v4.app.Fragment fragment2 = btVar.o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.P(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void Q(android.support.v4.app.Fragment fragment, android.os.Bundle bundle, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.Q(fragment, bundle, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void R(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.R(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void S(android.support.v4.app.Fragment fragment, android.os.Bundle bundle, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.S(fragment, bundle, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void T(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.T(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void U(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.U(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void V(android.support.v4.app.Fragment fragment, android.view.View view, android.os.Bundle bundle, boolean z) {
        fragment.getClass();
        view.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.V(fragment, view, bundle, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void W(android.support.v4.app.Fragment fragment, boolean z) {
        fragment.getClass();
        android.support.v4.app.Fragment fragment2 = ((defpackage.bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.W(fragment, true);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final defpackage.euf X(defpackage.mr mrVar, int i) {
        defpackage.np npVar;
        defpackage.euf eufVar;
        defpackage.aba abaVar = (defpackage.aba) this.b;
        int iC = abaVar.c(mrVar);
        if (iC >= 0 && (npVar = (defpackage.np) abaVar.g(iC)) != null) {
            int i2 = npVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                npVar.b = i3;
                if (i == 4) {
                    eufVar = npVar.c;
                } else {
                    if (i != 8) {
                        throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    eufVar = npVar.d;
                }
                if ((i3 & 12) == 0) {
                    abaVar.e(iC);
                    defpackage.np.b(npVar);
                }
                return eufVar;
            }
        }
        return null;
    }

    public final void Y(defpackage.mr mrVar, defpackage.euf eufVar) {
        defpackage.aba abaVar = (defpackage.aba) this.b;
        defpackage.np npVarA = (defpackage.np) abaVar.get(mrVar);
        if (npVarA == null) {
            npVarA = defpackage.np.a();
            abaVar.put(mrVar, npVarA);
        }
        npVarA.d = eufVar;
        npVarA.b |= 8;
    }

    public final void Z(defpackage.mr mrVar, defpackage.euf eufVar) {
        defpackage.aba abaVar = (defpackage.aba) this.b;
        defpackage.np npVarA = (defpackage.np) abaVar.get(mrVar);
        if (npVarA == null) {
            npVarA = defpackage.np.a();
            abaVar.put(mrVar, npVarA);
        }
        npVarA.c = eufVar;
        npVarA.b |= 4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afar, java.lang.Object] */
    public final android.view.inputmethod.InputMethodManager a() {
        return (android.view.inputmethod.InputMethodManager) this.b.a();
    }

    public final defpackage.mku aa() {
        return v().a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aiwg, java.lang.Object] */
    public final void ad(defpackage.bil bilVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.bil bilVar2;
        do {
            atomicReference = (java.util.concurrent.atomic.AtomicReference) this.b;
            bilVar2 = (defpackage.bil) atomicReference.get();
            if (bilVar2 != null) {
                if (((defpackage.akv) bilVar.a).compareTo((java.lang.Enum) bilVar2.a) < 0) {
                    throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
                }
            }
        } while (!defpackage.a.g(atomicReference, bilVar2, bilVar));
        if (bilVar2 != null) {
            bilVar2.b.s(new defpackage.akw());
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection((android.view.View) this.a, i, i2, i3, i4);
    }

    public final boolean c() {
        return this.b != defpackage.cct.a;
    }

    public final boolean d() {
        return this.a != defpackage.cct.a;
    }

    public final defpackage.bil e(java.lang.Object obj) {
        return new defpackage.bil(this.a, obj);
    }

    public final void f(defpackage.bfw bfwVar) {
        ((defpackage.aan) this.b).p(bfwVar);
    }

    public final void g() {
        ((defpackage.aan) this.b).p(defpackage.bga.b);
    }

    public final boolean h() {
        return (((defpackage.byj) this.a).e() & 1) != 0;
    }

    public final boolean i() {
        return (((defpackage.byj) this.a).e() & 2) != 0;
    }

    public final boolean j() {
        return (((defpackage.byj) this.a).e() & 4) != 0;
    }

    public final android.view.autofill.AutofillId k(long j) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return null;
        }
        java.lang.Object obj = this.a;
        return alh$.ExternalSyntheticApiModelOutline0.m(alh$.ExternalSyntheticApiModelOutline0.m(obj), a$.ExternalSyntheticApiModelOutline1.m(new defpackage.kwv(a$.ExternalSyntheticApiModelOutline1.m((android.view.View) this.b)).a), j);
    }

    public final void l() {
        java.lang.ref.Reference referencePoll;
        do {
            referencePoll = ((java.lang.ref.ReferenceQueue) this.a).poll();
            if (referencePoll != null) {
                ((defpackage.bzc) this.b).m(referencePoll);
            }
        } while (referencePoll != null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afer, java.lang.Object] */
    public final java.lang.Object m(int i) {
        java.lang.Object objC = ((defpackage.bzc) this.b).c(i);
        this.a.invoke();
        return objC;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afer, java.lang.Object] */
    public final void n(int i, java.lang.Object obj) {
        ((defpackage.bzc) this.b).f(i, obj);
        this.a.invoke();
    }

    public final long o() {
        return defpackage.tna.aK(((defpackage.crx) this.b).a(Float.MAX_VALUE), ((defpackage.crx) this.a).a(Float.MAX_VALUE));
    }

    public final void p(long j, long j2) {
        ((defpackage.crx) this.b).b(j, java.lang.Float.intBitsToFloat((int) (j2 >> 32)));
        ((defpackage.crx) this.a).b(j, java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void q(defpackage.alu aluVar, defpackage.bve bveVar, int i) {
        int i2 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-798501095);
        int i3 = i2 == 0 ? (true != bveVarC.C(aluVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(this) ? 16 : 32;
        }
        if (bveVarC.I((i3 & 19) != 18, i3 & 1)) {
            java.util.List listE = ((androidx.compose.runtime.snapshots.SnapshotStateList) this.b).e();
            int size = listE.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((defpackage.affh) listE.get(i4)).invoke(aluVar, bveVarC, java.lang.Integer.valueOf(i3 & 14));
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(this, aluVar, i, 4, null);
        }
    }

    public final java.lang.Object r(defpackage.akv akvVar, defpackage.affc affcVar, defpackage.afdk afdkVar) {
        return ahoi.a(new defpackage.akx(akvVar, this, affcVar, (defpackage.afdk) null, 0), afdkVar);
    }

    public final java.lang.Object s(java.lang.Object obj, defpackage.akv akvVar, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        return ahoi.a(new defpackage.aky(akvVar, this, affgVar, obj, null), afdkVar);
    }

    public final void t() {
        ((ajey) this.a).d();
    }

    public final java.lang.Object u(defpackage.afu afuVar, defpackage.affc affcVar, defpackage.afdk afdkVar) {
        return ahoi.a(new defpackage.akx(afuVar, this, affcVar, (defpackage.afdk) null, 1), afdkVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afar, java.lang.Object] */
    public final defpackage.or v() {
        return (defpackage.or) this.a.a();
    }

    public final void w(defpackage.op opVar) {
        v().a.u(opVar.e(new defpackage.exb(opVar, null)));
    }

    public final void x(defpackage.eqg eqgVar, defpackage.op opVar) {
        eqgVar.getClass();
        opVar.getClass();
        final defpackage.epy lifecycle = eqgVar.getLifecycle();
        if (lifecycle.a() == defpackage.epx.a) {
            return;
        }
        defpackage.oo ooVarE = opVar.e(new defpackage.exb(opVar, eqgVar));
        ooVarE.d(false);
        v().a.u(ooVarE);
        final defpackage.os osVar = new defpackage.os(ooVarE, lifecycle, 0);
        lifecycle.c(osVar);
        opVar.d.add(new java.lang.AutoCloseable() { // from class: oq
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.d(osVar);
            }
        });
    }

    public final void y() {
        v().b();
    }

    public final void z(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        v().a.t(new defpackage.exi(onBackInvokedDispatcher, 0), 1);
        v().a.t(new defpackage.exi(onBackInvokedDispatcher, 1000000), 0);
    }

    public bil(android.widget.TextView textView) {
        this.a = textView;
        this.b = new defpackage.kwv(textView);
    }

    public bil(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public bil(java.lang.Object obj, java.lang.Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public bil(java.lang.Runnable runnable) {
        this.b = runnable;
        this.a = new defpackage.afay(new defpackage.nz(this, 4));
    }

    public bil(defpackage.no noVar) {
        this.b = noVar;
        this.a = new defpackage.nn();
    }

    public bil(short[] sArr, byte[] bArr) {
        this.a = new defpackage.ca();
        this.b = new defpackage.ca();
    }

    public bil(defpackage.bt btVar) {
        this.a = btVar;
        this.b = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public bil(defpackage.epy epyVar) {
        epyVar.getClass();
        this.b = epyVar;
        this.a = new java.util.ArrayList();
    }

    public bil(byte[] bArr, char[] cArr) {
        this.b = new java.util.concurrent.atomic.AtomicReference(null);
        this.a = new ajey();
    }

    public bil(char[] cArr, byte[] bArr) {
        this.b = new java.util.concurrent.atomic.AtomicReference(null);
        this.a = new ajey();
    }

    public bil(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.b = new defpackage.aba(0);
        this.a = new defpackage.zz(10);
    }

    public bil(defpackage.affm affmVar) {
        this.a = affmVar;
        this.b = new androidx.compose.runtime.snapshots.SnapshotStateList();
    }

    public bil(int[] iArr) {
        this.b = new defpackage.crx(true, 2);
        this.a = new defpackage.crx(true, 2);
    }

    public bil(byte[] bArr, byte[] bArr2) {
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
    }

    public bil(defpackage.asj asjVar) {
        this.b = asjVar;
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
    }

    public bil(char[] cArr) {
        this.b = new defpackage.aan(16);
        this.a = new defpackage.aan(16);
    }

    public bil(android.view.View view) {
        this.a = view;
        this.b = defpackage.afga.cB(3, new defpackage.bfd(this, 19));
    }

    public bil() {
        this.b = new defpackage.aau(6);
        this.a = new defpackage.aau(6);
    }

    public bil(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public bil(short[] sArr) {
        this.b = new defpackage.bzc(new java.lang.ref.Reference[16]);
        this.a = new java.lang.ref.ReferenceQueue();
    }
}
