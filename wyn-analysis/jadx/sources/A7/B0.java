package A7;

import A.AbstractC0226t;
import A.C0212e;
import I4.C0618c;
import U1.C0850u;
import U1.C0853x;
import U1.C0855z;
import Va.C1077na;
import ac.C1346a;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import ba.C1521a;
import c8.C1581e;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.services.UnityAdsConstants;
import e0.C2465q;
import g0.AbstractC2662c;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import n7.InterfaceC3596a;

/* loaded from: classes4.dex */
public abstract class B0 implements C0, E5.w0, I4.q, B.S, Nd.k {

    /* renamed from: a, reason: collision with root package name */
    public Object f421a;

    public /* synthetic */ B0(Object obj) {
        this.f421a = obj;
    }

    public void A(Nd.j stringValues) {
        AbstractC3340k.e(stringValues, "stringValues");
        stringValues.d(new Bf.s(this, 6));
    }

    public void B() {
        ((Map) this.f421a).clear();
    }

    public void C(t0.v vVar, float f10, long j8) {
        M.y yVar = (M.y) this.f421a;
        yVar.getClass();
        boolean zIsNaN = Float.isNaN(f10);
        boolean z2 = yVar.f7226a;
        float fA = zIsNaN ? M.p.a(vVar, z2, vVar.c()) : vVar.t(f10);
        float fFloatValue = ((Number) ((C0212e) yVar.f7228c).d()).floatValue();
        if (fFloatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            long jA = C2465q.a(j8, fFloatValue);
            if (!z2) {
                AbstractC2662c.a(vVar, jA, fA, 0L, 124);
                return;
            }
            float fD = d0.f.d(vVar.c());
            float fB = d0.f.b(vVar.c());
            C1521a c1521a = vVar.f45543a.f35484b;
            long jY = c1521a.y();
            c1521a.v().m();
            ((C1521a) ((ad.L) c1521a.f19414b).f17515b).v().e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fD, fB, 1);
            AbstractC2662c.a(vVar, jA, fA, 0L, 124);
            c1521a.v().restore();
            c1521a.J(jY);
        }
    }

    public List D(String str) {
        Map map = (Map) this.f421a;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        X(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public String E(String str) {
        List listI = i(str);
        if (listI != null) {
            return (String) ff.o.s0(listI);
        }
        return null;
    }

    public abstract void F();

    public abstract void G();

    public boolean H(int i5) {
        E5.I i10 = (E5.I) this;
        i10.Q0();
        return i10.f3059O.f3540a.f46677a.get(i5);
    }

    public boolean I() {
        E5.I i5 = (E5.I) this;
        E5.J0 j0O0 = i5.o0();
        return !j0O0.p() && j0O0.m(i5.l0(), (E5.I0) this.f421a, 0L).f3117h;
    }

    public boolean J() {
        E5.I i5 = (E5.I) this;
        E5.J0 j0O0 = i5.o0();
        return !j0O0.p() && j0O0.m(i5.l0(), (E5.I0) this.f421a, 0L).a();
    }

    public boolean K() {
        E5.I i5 = (E5.I) this;
        E5.J0 j0O0 = i5.o0();
        return !j0O0.p() && j0O0.m(i5.l0(), (E5.I0) this.f421a, 0L).f3116g;
    }

    public void L(int i5, int i10) {
        if (i5 != i10) {
            int i11 = i5 + 1;
            C0850u c0850u = (C0850u) this;
            c0850u.S0();
            Q1.k.c(i5 >= 0 && i5 <= i11 && i10 >= 0);
            ArrayList arrayList = c0850u.f12164o;
            int size = arrayList.size();
            int iMin = Math.min(i11, size);
            int iMin2 = Math.min(i10, size - (iMin - i5));
            if (i5 >= size || i5 == iMin || i5 == iMin2) {
                return;
            }
            N1.N nO0 = c0850u.o0();
            c0850u.f12125E++;
            Q1.x.J(arrayList, i5, iMin, iMin2);
            U1.V v2 = new U1.V(arrayList, c0850u.f12129I);
            U1.P p10 = c0850u.f12152d0;
            U1.P pW0 = c0850u.w0(p10, v2, c0850u.r0(nO0, v2, c0850u.p0(p10), c0850u.i0(c0850u.f12152d0)));
            k2.g0 g0Var = c0850u.f12129I;
            C0855z c0855z = c0850u.k;
            c0855z.getClass();
            c0855z.f12218i.a(19, new C0853x(i5, iMin, iMin2, g0Var)).b();
            c0850u.Q0(pW0, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public void M(F4.h hVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f421a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(hVar);
        }
    }

    public abstract void N(D.k kVar);

    public abstract void O(long j8, int i5, boolean z2);

    public void P() {
        int iE;
        int iE2;
        E5.I i5 = (E5.I) this;
        if (i5.o0().p() || i5.x0()) {
            return;
        }
        E5.J0 j0O0 = i5.o0();
        if (j0O0.p()) {
            iE = -1;
        } else {
            int iL0 = i5.l0();
            i5.Q0();
            int i10 = i5.f3051F;
            if (i10 == 1) {
                i10 = 0;
            }
            i5.Q0();
            iE = j0O0.e(iL0, i10, i5.f3052G);
        }
        if (!(iE != -1)) {
            if (J() && I()) {
                int iL02 = i5.l0();
                i5.Q0();
                i5.E0(-9223372036854775807L, iL02, false);
                return;
            }
            return;
        }
        E5.J0 j0O02 = i5.o0();
        if (j0O02.p()) {
            iE2 = -1;
        } else {
            int iL03 = i5.l0();
            i5.Q0();
            int i11 = i5.f3051F;
            if (i11 == 1) {
                i11 = 0;
            }
            i5.Q0();
            iE2 = j0O02.e(iL03, i11, i5.f3052G);
        }
        if (iE2 == -1) {
            return;
        }
        if (iE2 == i5.l0()) {
            i5.Q0();
            i5.E0(-9223372036854775807L, i5.l0(), true);
        } else {
            i5.Q0();
            i5.E0(-9223372036854775807L, iE2, false);
        }
    }

    public void Q(long j8) {
        E5.I i5 = (E5.I) this;
        long jM0 = i5.m0() + j8;
        long jR0 = i5.r0();
        if (jR0 != -9223372036854775807L) {
            jM0 = Math.min(jM0, jR0);
        }
        long jMax = Math.max(jM0, 0L);
        int iL0 = i5.l0();
        i5.Q0();
        i5.E0(jMax, iL0, false);
    }

    public void R() {
        int iK;
        int iK2;
        int iK3;
        E5.I i5 = (E5.I) this;
        if (i5.o0().p() || i5.x0()) {
            return;
        }
        E5.J0 j0O0 = i5.o0();
        if (j0O0.p()) {
            iK = -1;
        } else {
            int iL0 = i5.l0();
            i5.Q0();
            int i10 = i5.f3051F;
            if (i10 == 1) {
                i10 = 0;
            }
            i5.Q0();
            iK = j0O0.k(iL0, i10, i5.f3052G);
        }
        boolean z2 = iK != -1;
        if (J() && !K()) {
            if (z2) {
                E5.J0 j0O02 = i5.o0();
                if (j0O02.p()) {
                    iK3 = -1;
                } else {
                    int iL02 = i5.l0();
                    i5.Q0();
                    int i11 = i5.f3051F;
                    if (i11 == 1) {
                        i11 = 0;
                    }
                    i5.Q0();
                    iK3 = j0O02.k(iL02, i11, i5.f3052G);
                }
                if (iK3 == -1) {
                    return;
                }
                if (iK3 == i5.l0()) {
                    i5.Q0();
                    i5.E0(-9223372036854775807L, i5.l0(), true);
                    return;
                } else {
                    i5.Q0();
                    i5.E0(-9223372036854775807L, iK3, false);
                    return;
                }
            }
            return;
        }
        if (z2) {
            long jM0 = i5.m0();
            i5.Q0();
            if (jM0 <= 3000) {
                E5.J0 j0O03 = i5.o0();
                if (j0O03.p()) {
                    iK2 = -1;
                } else {
                    int iL03 = i5.l0();
                    i5.Q0();
                    int i12 = i5.f3051F;
                    if (i12 == 1) {
                        i12 = 0;
                    }
                    i5.Q0();
                    iK2 = j0O03.k(iL03, i12, i5.f3052G);
                }
                if (iK2 == -1) {
                    return;
                }
                if (iK2 == i5.l0()) {
                    i5.Q0();
                    i5.E0(-9223372036854775807L, i5.l0(), true);
                    return;
                } else {
                    i5.Q0();
                    i5.E0(-9223372036854775807L, iK2, false);
                    return;
                }
            }
        }
        int iL04 = i5.l0();
        i5.Q0();
        i5.E0(0L, iL04, false);
    }

    public abstract B0 S();

    public void T(String str) {
        AbstractC1732v.j(str, "Content URL must be non-null.");
        AbstractC1732v.g(str, "Content URL must be non-empty.");
        int length = str.length();
        AbstractC1732v.c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        ((D6.P0) this.f421a).f2350g = str;
    }

    public void U(List list) {
        if (list == null) {
            H6.l.f("neighboring content URLs list should not be null");
            return;
        }
        ArrayList arrayList = ((D6.P0) this.f421a).f2351h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                H6.l.f("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }

    public B0 V(String str) {
        ((D6.P0) this.f421a).f2353j = str;
        return S();
    }

    public void W(Object obj, boolean z2) {
        Set set = (Set) this.f421a;
        int size = set.size();
        if (z2) {
            set.add(obj);
            if (size == 0) {
                F();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            G();
        }
    }

    public void X(String name) {
        AbstractC3340k.e(name, "name");
    }

    public void Y(String value) {
        AbstractC3340k.e(value, "value");
    }

    public C0245e Z() {
        return ((C0273n0) this.f421a).f979g;
    }

    public Z a0() {
        Z z2 = ((C0273n0) this.f421a).f980h;
        C0273n0.c(z2);
        return z2;
    }

    @Override // Nd.k
    public Set b() {
        Set setEntrySet = ((Map) this.f421a).entrySet();
        AbstractC3340k.e(setEntrySet, "<this>");
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(setEntrySet);
        AbstractC3340k.d(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public U1 b0() {
        U1 u12 = ((C0273n0) this.f421a).f983l;
        C0273n0.c(u12);
        return u12;
    }

    public void c0() {
        C0264k0 c0264k0 = ((C0273n0) this.f421a).f982j;
        C0273n0.d(c0264k0);
        c0264k0.c0();
    }

    @Override // I4.q
    public I4.p d(I4.v vVar) {
        return new C0618c((I4.z) this.f421a, 2);
    }

    public abstract boolean d0(C1077na c1077na);

    @Override // Nd.k
    public void f(String name, Iterable values) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(values, "values");
        List listD = D(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Y((String) it.next());
        }
        ff.t.e0(values, listD);
    }

    @Override // Nd.k
    public List i(String name) {
        AbstractC3340k.e(name, "name");
        return (List) ((Map) this.f421a).get(name);
    }

    @Override // Nd.k
    public Set names() {
        return ((Map) this.f421a).keySet();
    }

    public void t(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            StringBuilder sb2 = new StringBuilder(str2.length() + 108);
            sb2.append("Value ");
            sb2.append(str2);
            sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            H6.l.f(sb2.toString());
        }
        ((D6.P0) this.f421a).f2348e.putString(str, str2);
    }

    public void u(String str, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    StringBuilder sb2 = new StringBuilder(str2.length() + 108);
                    sb2.append("Value ");
                    sb2.append(str2);
                    sb2.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    H6.l.f(sb2.toString());
                }
            }
            ((D6.P0) this.f421a).f2348e.putString(str, TextUtils.join(",", list));
        }
    }

    public void w(String str) {
        ((D6.P0) this.f421a).f2344a.add(str);
    }

    public B0 x(Class cls, Bundle bundle) {
        D6.P0 p02 = (D6.P0) this.f421a;
        p02.getClass();
        p02.f2345b.putBundle(cls.getName(), bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            p02.f2347d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return S();
    }

    public abstract void y(D.k kVar, Ef.E e7);

    public void z(String name, String value) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(value, "value");
        Y(value);
        D(name).add(value);
    }

    @Override // A7.C0
    public Context zza() {
        return ((C0273n0) this.f421a).f973a;
    }

    @Override // A7.C0
    public InterfaceC3596a zzb() {
        return ((C0273n0) this.f421a).f985n;
    }

    @Override // A7.C0
    public C1581e zzd() {
        return ((C0273n0) this.f421a).f978f;
    }

    @Override // A7.C0
    public N zzj() {
        N n10 = ((C0273n0) this.f421a).f981i;
        C0273n0.d(n10);
        return n10;
    }

    @Override // A7.C0
    public C0264k0 zzl() {
        C0264k0 c0264k0 = ((C0273n0) this.f421a).f982j;
        C0273n0.d(c0264k0);
        return c0264k0;
    }

    public B0(C1346a logger) {
        AbstractC3340k.e(logger, "logger");
        this.f421a = logger;
    }

    public B0(C0273n0 c0273n0) {
        AbstractC1732v.i(c0273n0);
        this.f421a = c0273n0;
    }

    public B0(int i5) {
        switch (i5) {
            case 2:
                char[] cArr = Y4.m.f16700a;
                this.f421a = new ArrayDeque(20);
                break;
            case 6:
                this.f421a = new N1.M();
                break;
            case 8:
                this.f421a = new Nd.b();
                break;
            case 12:
                this.f421a = Collections.newSetFromMap(new IdentityHashMap());
                break;
            case 14:
                D6.P0 p02 = new D6.P0();
                this.f421a = p02;
                p02.f2347d.add("B3EEABB8EE11C2BE770B684D95219ECB");
                break;
            default:
                this.f421a = new E5.I0();
                break;
        }
    }

    public B0(tf.l info) {
        AbstractC3340k.e(info, "info");
        this.f421a = info;
    }

    public B0(boolean z2, N.V v2) {
        M.y yVar = new M.y();
        yVar.f7226a = z2;
        yVar.f7227b = v2;
        yVar.f7228c = AbstractC0226t.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        yVar.f7229d = new ArrayList();
        this.f421a = yVar;
    }
}
