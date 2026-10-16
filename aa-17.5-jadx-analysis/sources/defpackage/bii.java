package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.model.Alert;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bii {
    public final Object a;
    public final Object b;

    public bii(ddu dduVar, zh zhVar) {
        this.a = dduVar.b;
        List listK = dduVar.k((4 & 1) != 0 ? !dduVar.e : false, true & ((4 & 2) == 0));
        this.b = new zj(listK.size());
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            ddu dduVar2 = (ddu) listK.get(i);
            if (zhVar.b(dduVar2.c)) {
                ((zj) this.b).d(dduVar2.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Collection] */
    public static /* synthetic */ void ab(final bii biiVar, final afeg afegVar, final afeh afehVar, final afdr afdrVar) {
        final cfv cfvVar = cfy.e;
        biiVar.b.add(new cct(-1789283891, true, new afeh() { // from class: alr
            /* JADX WARN: Type inference failed for: r0v3, types: [afem, java.lang.Object] */
            @Override // defpackage.afeh
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                alp alpVar = (alp) obj;
                bux buxVar = (bux) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= true != buxVar.C(alpVar) ? 2 : 4;
                }
                if (buxVar.I((iIntValue & 19) != 18, iIntValue & 1)) {
                    String str = (String) afegVar.invoke(buxVar, 0);
                    if (afyh.v(str)) {
                        asl.d("Label must not be blank");
                    }
                    afdr afdrVar2 = afdrVar;
                    biiVar.a.invoke(cfvVar, str, true, alpVar, afehVar, afdrVar2, buxVar, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    buxVar.s();
                }
                return afak.a;
            }
        }));
    }

    public final void A(mo moVar) {
        aat aatVar = (aat) this.b;
        nn nnVarA = (nn) aatVar.get(moVar);
        if (nnVarA == null) {
            nnVarA = nn.a();
            aatVar.put(moVar, nnVarA);
        }
        nnVarA.b |= 1;
    }

    public final void B(long j, mo moVar) {
        ((zs) this.a).g(j, moVar);
    }

    public final void C() {
        ((aat) this.b).clear();
        ((zs) this.a).f();
    }

    public final void D(mo moVar) {
        nn nnVar = (nn) ((aat) this.b).get(moVar);
        if (nnVar == null) {
            return;
        }
        nnVar.b &= -2;
    }

    public final void E(mo moVar) {
        zs zsVar = (zs) this.a;
        int iB = zsVar.b();
        while (true) {
            iB--;
            if (iB < 0) {
                break;
            }
            if (moVar == zsVar.e(iB)) {
                Object[] objArr = zsVar.c;
                Object obj = objArr[iB];
                Object obj2 = zt.a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    zsVar.a = true;
                }
            }
        }
        nn nnVar = (nn) ((aat) this.b).remove(moVar);
        if (nnVar != null) {
            nn.b(nnVar);
        }
    }

    public final boolean F(mo moVar) {
        nn nnVar = (nn) ((aat) this.b).get(moVar);
        return (nnVar == null || (nnVar.b & 1) == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nm] */
    public final View G(int i, int i2, int i3, int i4) {
        ?? r0 = this.b;
        int iD = r0.d();
        int iC = r0.c();
        View view = null;
        int i5 = i;
        while (i5 != i2) {
            View viewE = r0.e(i5);
            int iB = r0.b(viewE);
            int iA = r0.a(viewE);
            nl nlVar = (nl) this.a;
            nlVar.c(iD, iC, iB, iA);
            nlVar.b();
            nlVar.a(i3);
            if (nlVar.d()) {
                return viewE;
            }
            if (i4 != 0) {
                nlVar.b();
                nlVar.a(i4);
                if (nlVar.d()) {
                    view = viewE;
                }
            }
            i5 += i2 > i ? 1 : -1;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, nm] */
    public final boolean H(View view) {
        Object obj = this.a;
        ?? r4 = this.b;
        nl nlVar = (nl) obj;
        nlVar.c(r4.d(), r4.c(), r4.b(view), r4.a(view));
        nlVar.b();
        nlVar.a(24579);
        return nlVar.d();
    }

    public final void I(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((TextView) this.a).getContext().obtainStyledAttributes(attributeSet, fs.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            Object obj = this.b;
            emr emrVar = emr.b;
            ((emz) ((kwp) obj).a).a.a = z;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void J(Fragment fragment, Bundle bundle, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.J(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void K(Fragment fragment, boolean z) {
        fragment.getClass();
        bt btVar = (bt) this.a;
        Context context = btVar.m.c;
        Fragment fragment2 = btVar.o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.K(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void L(Fragment fragment, Bundle bundle, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.L(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void M(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.M(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void N(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.N(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void O(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.O(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void P(Fragment fragment, boolean z) {
        fragment.getClass();
        bt btVar = (bt) this.a;
        Context context = btVar.m.c;
        Fragment fragment2 = btVar.o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.P(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void Q(Fragment fragment, Bundle bundle, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.Q(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void R(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.R(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void S(Fragment fragment, Bundle bundle, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.S(fragment, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void T(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.T(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void U(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.U(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void V(Fragment fragment, View view, Bundle bundle, boolean z) {
        fragment.getClass();
        view.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.V(fragment, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void W(Fragment fragment, boolean z) {
        fragment.getClass();
        Fragment fragment2 = ((bt) this.a).o;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().B.W(fragment, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        it.getClass();
        if (it.hasNext()) {
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final etz X(mo moVar, int i) {
        nn nnVar;
        etz etzVar;
        aat aatVar = (aat) this.b;
        int iC = aatVar.c(moVar);
        if (iC >= 0 && (nnVar = (nn) aatVar.g(iC)) != null) {
            int i2 = nnVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                nnVar.b = i3;
                if (i == 4) {
                    etzVar = nnVar.c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    etzVar = nnVar.d;
                }
                if ((i3 & 12) == 0) {
                    aatVar.e(iC);
                    nn.b(nnVar);
                }
                return etzVar;
            }
        }
        return null;
    }

    public final void Y(mo moVar, etz etzVar) {
        aat aatVar = (aat) this.b;
        nn nnVarA = (nn) aatVar.get(moVar);
        if (nnVarA == null) {
            nnVarA = nn.a();
            aatVar.put(moVar, nnVarA);
        }
        nnVarA.d = etzVar;
        nnVarA.b |= 8;
    }

    public final void Z(mo moVar, etz etzVar) {
        aat aatVar = (aat) this.b;
        nn nnVarA = (nn) aatVar.get(moVar);
        if (nnVarA == null) {
            nnVarA = nn.a();
            aatVar.put(moVar, nnVarA);
        }
        nnVarA.c = etzVar;
        nnVarA.b |= 4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezr, java.lang.Object] */
    public final InputMethodManager a() {
        return (InputMethodManager) this.b.a();
    }

    public final mko aa() {
        return v().a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aivh, java.lang.Object] */
    public final void ad(bii biiVar) {
        AtomicReference atomicReference;
        bii biiVar2;
        do {
            atomicReference = (AtomicReference) this.b;
            biiVar2 = (bii) atomicReference.get();
            if (biiVar2 != null) {
                if (((akq) biiVar.a).compareTo((akq) biiVar2.a) < 0) {
                    throw new CancellationException("Current mutation had a higher priority");
                }
            }
        } while (!a.h(atomicReference, biiVar2, biiVar));
        if (biiVar2 != null) {
            biiVar2.b.s(new akr());
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection((View) this.a, i, i2, i3, i4);
    }

    public final boolean c() {
        return this.b != ccn.a;
    }

    public final boolean d() {
        return this.a != ccn.a;
    }

    public final bii e(Object obj) {
        return new bii(this.a, obj);
    }

    public final void f(bft bftVar) {
        ((aag) this.b).p(bftVar);
    }

    public final void g() {
        ((aag) this.b).p(bfx.b);
    }

    public final boolean h() {
        return (((byd) this.a).e() & 1) != 0;
    }

    public final boolean i() {
        return (((byd) this.a).e() & 2) != 0;
    }

    public final boolean j() {
        return (((byd) this.a).e() & 4) != 0;
    }

    public final AutofillId k(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        Object obj = this.a;
        return alc$$ExternalSyntheticApiModelOutline0.m(obj).newAutofillId(a$$ExternalSyntheticApiModelOutline0.m7m(new kwp(((View) this.b).getAutofillId()).a), j);
    }

    public final void l() {
        Reference referencePoll;
        do {
            referencePoll = ((ReferenceQueue) this.a).poll();
            if (referencePoll != null) {
                ((byw) this.b).m(referencePoll);
            }
        } while (referencePoll != null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afdr, java.lang.Object] */
    public final Object m(int i) {
        Object objC = ((byw) this.b).c(i);
        this.a.invoke();
        return objC;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afdr, java.lang.Object] */
    public final void n(int i, Object obj) {
        ((byw) this.b).f(i, obj);
        this.a.invoke();
    }

    public final long o() {
        return roc.aA(((cro) this.b).a(Float.MAX_VALUE), ((cro) this.a).a(Float.MAX_VALUE));
    }

    public final void p(long j, long j2) {
        ((cro) this.b).b(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((cro) this.a).b(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    public final void q(alp alpVar, bux buxVar, int i) {
        int i2 = i & 6;
        bux buxVarC = buxVar.c(-798501095);
        int i3 = i2 == 0 ? (true != buxVarC.C(alpVar) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(this) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            ?? r1 = this.b;
            int iA = ((SnapshotStateList) r1).a();
            for (int i4 = 0; i4 < iA; i4++) {
                ((afeh) r1.get(i4)).invoke(alpVar, buxVarC, Integer.valueOf(i3 & 14));
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(this, alpVar, i, 4, null);
        }
    }

    public final Object r(akq akqVar, afec afecVar, afck afckVar) {
        return ahni.a(new aks(akqVar, this, afecVar, (afck) null, 0), afckVar);
    }

    public final Object s(Object obj, akq akqVar, afeg afegVar, afck afckVar) {
        return ahni.a(new akt(akqVar, this, afegVar, obj, null), afckVar);
    }

    public final void t() {
        ((ajdz) this.a).d();
    }

    public final Object u(afn afnVar, afec afecVar, afck afckVar) {
        return ahni.a(new aks(afnVar, this, afecVar, (afck) null, 1), afckVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezr, java.lang.Object] */
    public final oo v() {
        return (oo) this.a.a();
    }

    public final void w(om omVar) {
        v().a.u(omVar.e(new ewv(omVar, null)));
    }

    public final void x(eqa eqaVar, om omVar) {
        eqaVar.getClass();
        omVar.getClass();
        final ept lifecycle = eqaVar.getLifecycle();
        if (lifecycle.a() == eps.a) {
            return;
        }
        ol olVarE = omVar.e(new ewv(omVar, eqaVar));
        olVarE.d(false);
        v().a.u(olVarE);
        final op opVar = new op(olVarE, lifecycle, 0);
        lifecycle.c(opVar);
        omVar.d.add(new AutoCloseable() { // from class: on
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.d(opVar);
            }
        });
    }

    public final void y() {
        v().b();
    }

    public final void z(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        v().a.t(new exc(onBackInvokedDispatcher, 0), 1);
        v().a.t(new exc(onBackInvokedDispatcher, 1000000), 0);
    }

    public bii(TextView textView) {
        this.a = textView;
        this.b = new kwp(textView);
    }

    public bii(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public bii(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public bii(Runnable runnable) {
        this.b = runnable;
        this.a = new aezy(new nx(this, 6));
    }

    public bii(nm nmVar) {
        this.b = nmVar;
        this.a = new nl();
    }

    public bii(short[] sArr, byte[] bArr) {
        this.a = new ca();
        this.b = new ca();
    }

    public bii(bt btVar) {
        this.a = btVar;
        this.b = new CopyOnWriteArrayList();
    }

    public bii(ept eptVar) {
        eptVar.getClass();
        this.b = eptVar;
        this.a = new ArrayList();
    }

    public bii(byte[] bArr, char[] cArr) {
        this.b = new AtomicReference(null);
        this.a = new ajdz();
    }

    public bii(char[] cArr, byte[] bArr) {
        this.b = new AtomicReference(null);
        this.a = new ajdz();
    }

    public bii(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.b = new aat(0);
        this.a = new zs(10);
    }

    public bii(afem afemVar) {
        this.a = afemVar;
        this.b = new SnapshotStateList();
    }

    public bii(int[] iArr) {
        this.b = new cro(true, 2);
        this.a = new cro(true, 2);
    }

    public bii(byte[] bArr, byte[] bArr2) {
        this.b = new ParcelableSnapshotMutableIntState(Alert.DURATION_SHOW_INDEFINITELY);
        this.a = new ParcelableSnapshotMutableIntState(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public bii(ase aseVar) {
        this.b = aseVar;
        this.a = new ParcelableSnapshotMutableIntState(0);
    }

    public bii(char[] cArr) {
        this.b = new aag(16);
        this.a = new aag(16);
    }

    public bii(View view) {
        this.a = view;
        this.b = woy.dH(3, new bih(this, 0));
    }

    public bii() {
        this.b = new aan(6);
        this.a = new aan(6);
    }

    public bii(ContentCaptureSession contentCaptureSession, View view) {
        this.a = contentCaptureSession;
        this.b = view;
    }

    public bii(short[] sArr) {
        this.b = new byw(new Reference[16]);
        this.a = new ReferenceQueue();
    }
}
