package E5;

import U1.C0855z;
import Va.Y7;
import Va.Za;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import c8.C1583g;
import c8.C1587k;
import c8.C1589m;
import c8.InterfaceC1579c;
import com.google.protobuf.ByteString;
import com.google.protobuf.Int32Value;
import com.unity3d.services.UnityAdsConstants;
import f6.AbstractC2588a;
import f6.C2573C;
import f6.C2604q;
import f6.C2607t;
import f6.InterfaceC2571A;
import f6.InterfaceC2610w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import k2.AbstractC3144a;
import k2.C3139A;
import k2.C3142D;
import ka.C3236g0;
import ka.C3242i0;
import ka.C3246j1;
import ka.C3249k1;
import ka.C3252l1;
import ka.C3261o1;
import kd.RunnableC3307c;
import me.C3558a;
import o1.C3641c;
import p9.C3776A;
import r9.C3955l;
import v9.AbstractC4335b;
import v9.C4333A;
import w9.C4386e;
import w9.EnumC4385d;
import zg.C4684x;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3471a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3472b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3473c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3474d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3475e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3476f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3477g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3478h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3479i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f3480j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f3481l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3482m;

    public n0() {
        this.f3471a = 2;
        this.f3478h = new c8.t[4];
        this.f3472b = new Matrix[4];
        this.f3473c = new Matrix[4];
        this.f3474d = new PointF();
        this.f3475e = new Path();
        this.f3479i = new Path();
        this.f3480j = new c8.t();
        this.k = new float[2];
        this.f3476f = new float[2];
        this.f3481l = new Path();
        this.f3482m = new Path();
        this.f3477g = true;
        for (int i5 = 0; i5 < 4; i5++) {
            ((c8.t[]) this.f3478h)[i5] = new c8.t();
            ((Matrix[]) this.f3472b)[i5] = new Matrix();
            ((Matrix[]) this.f3473c)[i5] = new Matrix();
        }
    }

    public J0 a(int i5, ArrayList arrayList, f6.X x5) {
        if (!arrayList.isEmpty()) {
            this.f3481l = x5;
            for (int i10 = i5; i10 < arrayList.size() + i5; i10++) {
                m0 m0Var = (m0) arrayList.get(i10 - i5);
                ArrayList arrayList2 = (ArrayList) this.f3472b;
                if (i10 > 0) {
                    m0 m0Var2 = (m0) arrayList2.get(i10 - 1);
                    m0Var.f3466d = m0Var2.f3463a.f35102o.f35081b.o() + m0Var2.f3466d;
                    m0Var.f3467e = false;
                    m0Var.f3465c.clear();
                } else {
                    m0Var.f3466d = 0;
                    m0Var.f3467e = false;
                    m0Var.f3465c.clear();
                }
                int iO = m0Var.f3463a.f35102o.f35081b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((m0) arrayList2.get(i11)).f3466d += iO;
                }
                arrayList2.add(i10, m0Var);
                ((HashMap) this.f3474d).put(m0Var.f3464b, m0Var);
                if (this.f3477g) {
                    n(m0Var);
                    if (((IdentityHashMap) this.f3473c).isEmpty()) {
                        ((HashSet) this.f3476f).add(m0Var);
                    } else {
                        C0462l0 c0462l0 = (C0462l0) ((HashMap) this.f3475e).get(m0Var);
                        if (c0462l0 != null) {
                            c0462l0.f3458a.b(c0462l0.f3459b);
                        }
                    }
                }
            }
        }
        return d();
    }

    public N1.N b(int i5, ArrayList arrayList, k2.g0 g0Var) {
        if (!arrayList.isEmpty()) {
            this.f3481l = g0Var;
            for (int i10 = i5; i10 < arrayList.size() + i5; i10++) {
                U1.O o7 = (U1.O) arrayList.get(i10 - i5);
                ArrayList arrayList2 = (ArrayList) this.f3472b;
                if (i10 > 0) {
                    U1.O o10 = (U1.O) arrayList2.get(i10 - 1);
                    o7.f11974d = o10.f11971a.f38898o.f39170b.o() + o10.f11974d;
                    o7.f11975e = false;
                    o7.f11973c.clear();
                } else {
                    o7.f11974d = 0;
                    o7.f11975e = false;
                    o7.f11973c.clear();
                }
                int iO = o7.f11971a.f38898o.f39170b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((U1.O) arrayList2.get(i11)).f11974d += iO;
                }
                arrayList2.add(i10, o7);
                ((HashMap) this.f3474d).put(o7.f11972b, o7);
                if (this.f3477g) {
                    o(o7);
                    if (((IdentityHashMap) this.f3473c).isEmpty()) {
                        ((HashSet) this.f3476f).add(o7);
                    } else {
                        U1.N n10 = (U1.N) ((HashMap) this.f3475e).get(o7);
                        if (n10 != null) {
                            n10.f11968a.c(n10.f11969b);
                        }
                    }
                }
            }
        }
        return e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public void c(C1587k c1587k, float f10, RectF rectF, C4684x c4684x, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        c8.t[] tVarArr;
        int i5;
        boolean z2;
        float[] fArr;
        float f11;
        boolean z10;
        int i10;
        n0 n0Var = this;
        path.rewind();
        Path path2 = (Path) n0Var.f3475e;
        path2.rewind();
        Path path3 = (Path) n0Var.f3479i;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = (Matrix[]) n0Var.f3473c;
            matrixArr2 = (Matrix[]) n0Var.f3472b;
            tVarArr = (c8.t[]) n0Var.f3478h;
            i5 = 4;
            z2 = 0;
            fArr = (float[]) n0Var.k;
            if (i11 >= 4) {
                break;
            }
            InterfaceC1579c interfaceC1579c = i11 != 1 ? i11 != 2 ? i11 != 3 ? c1587k.f19767f : c1587k.f19766e : c1587k.f19769h : c1587k.f19768g;
            Fe.e eVar = i11 != 1 ? i11 != 2 ? i11 != 3 ? c1587k.f19763b : c1587k.f19762a : c1587k.f19765d : c1587k.f19764c;
            c8.t tVar = tVarArr[i11];
            eVar.getClass();
            eVar.E(tVar, f10, interfaceC1579c.a(rectF));
            int i12 = i11 + 1;
            float f12 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = (PointF) n0Var.f3474d;
            if (i11 == 1) {
                i10 = i11;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                i10 = i11;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                i10 = i11;
                pointF.set(rectF.right, rectF.top);
            } else {
                i10 = i11;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f12);
            c8.t tVar2 = tVarArr[i10];
            fArr[0] = tVar2.f19793b;
            fArr[1] = tVar2.f19794c;
            matrixArr2[i10].mapPoints(fArr);
            matrixArr[i10].reset();
            matrixArr[i10].setTranslate(fArr[0], fArr[1]);
            matrixArr[i10].preRotate(f12);
            i11 = i12;
        }
        int i13 = 0;
        while (i13 < i5) {
            c8.t tVar3 = tVarArr[i13];
            tVar3.getClass();
            fArr[z2] = 0.0f;
            fArr[1] = tVar3.f19792a;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[z2], fArr[1]);
            } else {
                path.lineTo(fArr[z2], fArr[1]);
            }
            tVarArr[i13].b(matrixArr2[i13], path);
            if (c4684x != null) {
                c8.t tVar4 = tVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                C1583g c1583g = (C1583g) c4684x.f48655a;
                BitSet bitSet = c1583g.f19732d;
                tVar4.getClass();
                f11 = 0.0f;
                bitSet.set(i13, z2);
                tVar4.a(tVar4.f19796e);
                c1583g.f19730b[i13] = new C1589m(new ArrayList(tVar4.f19798g), new Matrix(matrix));
            } else {
                f11 = 0.0f;
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            c8.t tVar5 = tVarArr[i13];
            fArr[0] = tVar5.f19793b;
            fArr[1] = tVar5.f19794c;
            matrixArr2[i13].mapPoints(fArr);
            c8.t tVar6 = tVarArr[i15];
            tVar6.getClass();
            float[] fArr2 = (float[]) n0Var.f3476f;
            fArr2[0] = f11;
            fArr2[1] = tVar6.f19792a;
            matrixArr2[i15].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            c8.t[] tVarArr2 = tVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f11);
            c8.t tVar7 = tVarArr2[i13];
            fArr[0] = tVar7.f19793b;
            fArr[1] = tVar7.f19794c;
            matrixArr3[i13].mapPoints(fArr);
            if (i13 == 1 || i13 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            c8.t tVar8 = (c8.t) n0Var.f3480j;
            tVar8.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 270.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            (i13 != 1 ? i13 != 2 ? i13 != 3 ? c1587k.f19771j : c1587k.f19770i : c1587k.f19772l : c1587k.k).getClass();
            tVar8.c(fMax, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path4 = (Path) n0Var.f3481l;
            path4.reset();
            tVar8.b(matrixArr[i13], path4);
            if (n0Var.f3477g && (n0Var.m(path4, i13) || n0Var.m(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = tVar8.f19792a;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                tVar8.b(matrixArr[i13], path2);
            } else {
                tVar8.b(matrixArr[i13], path);
            }
            if (c4684x != null) {
                Matrix matrix2 = matrixArr[i13];
                C1583g c1583g2 = (C1583g) c4684x.f48655a;
                z10 = false;
                c1583g2.f19732d.set(i13 + 4, false);
                tVar8.a(tVar8.f19796e);
                c1583g2.f19731c[i13] = new C1589m(new ArrayList(tVar8.f19798g), new Matrix(matrix2));
            } else {
                z10 = false;
            }
            z2 = z10;
            i13 = i14;
            tVarArr = tVarArr2;
            matrixArr2 = matrixArr3;
            i5 = 4;
            n0Var = this;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public J0 d() {
        ArrayList arrayList = (ArrayList) this.f3472b;
        if (arrayList.isEmpty()) {
            return J0.f3127a;
        }
        int iO = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            m0 m0Var = (m0) arrayList.get(i5);
            m0Var.f3466d = iO;
            iO += m0Var.f3463a.f35102o.f35081b.o();
        }
        return new z0(arrayList, (f6.X) this.f3481l);
    }

    public N1.N e() {
        ArrayList arrayList = (ArrayList) this.f3472b;
        if (arrayList.isEmpty()) {
            return N1.N.f8072a;
        }
        int iO = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            U1.O o7 = (U1.O) arrayList.get(i5);
            o7.f11974d = iO;
            iO += o7.f11971a.f38898o.f39170b.o();
        }
        return new U1.V(arrayList, (k2.g0) this.f3481l);
    }

    public void f() {
        C4333A c4333a = (C4333A) this.k;
        boolean zD = c4333a.d();
        v9.r rVar = v9.r.f47105a;
        if (zD) {
            c4333a.a(rVar, md.k0.f40674e);
        }
        v9.B b5 = (v9.B) this.f3476f;
        if (b5.d()) {
            b5.a(rVar, md.k0.f40674e);
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f3482m;
        if (!arrayDeque.isEmpty()) {
            Ba.c.p("RemoteStore", "Stopping write stream with %d pending writes", 1, Integer.valueOf(arrayDeque.size()));
            arrayDeque.clear();
        }
        this.f3481l = null;
    }

    public void g() {
        switch (this.f3471a) {
            case 0:
                Iterator it = ((HashSet) this.f3476f).iterator();
                while (it.hasNext()) {
                    m0 m0Var = (m0) it.next();
                    if (m0Var.f3465c.isEmpty()) {
                        C0462l0 c0462l0 = (C0462l0) ((HashMap) this.f3475e).get(m0Var);
                        if (c0462l0 != null) {
                            c0462l0.f3458a.b(c0462l0.f3459b);
                        }
                        it.remove();
                    }
                }
                break;
            default:
                Iterator it2 = ((HashSet) this.f3476f).iterator();
                while (it2.hasNext()) {
                    U1.O o7 = (U1.O) it2.next();
                    if (o7.f11973c.isEmpty()) {
                        U1.N n10 = (U1.N) ((HashMap) this.f3475e).get(o7);
                        if (n10 != null) {
                            n10.f11968a.c(n10.f11969b);
                        }
                        it2.remove();
                    }
                }
                break;
        }
    }

    public void h() {
        this.f3477g = true;
        ByteString byteStringD = ((C3955l) this.f3473c).f44633c.d();
        v9.B b5 = (v9.B) this.f3476f;
        b5.getClass();
        byteStringD.getClass();
        b5.f47040t = byteStringD;
        if (u()) {
            w();
        } else {
            ((io.flutter.plugin.platform.x) this.f3480j).d(1);
        }
        i();
    }

    public void i() {
        v9.B b5;
        ArrayDeque arrayDeque = (ArrayDeque) this.f3482m;
        int i5 = arrayDeque.isEmpty() ? -1 : ((t9.i) arrayDeque.getLast()).f45954a;
        while (true) {
            boolean z2 = this.f3477g;
            b5 = (v9.B) this.f3476f;
            if (!z2 || arrayDeque.size() >= 10) {
                break;
            }
            t9.i iVarB = ((C3955l) this.f3473c).f44633c.b(i5);
            if (iVarB != null) {
                A6.c.z(this.f3477g && arrayDeque.size() < 10, "addToWritePipeline called when pipeline is full", new Object[0]);
                arrayDeque.add(iVarB);
                if (b5.c() && b5.f47039s) {
                    b5.j(iVarB.f45957d);
                }
                i5 = iVarB.f45954a;
            } else if (arrayDeque.size() == 0 && b5.c() && b5.f47049b == null) {
                b5.f47049b = b5.f47053f.b(b5.f47054g, AbstractC4335b.f47045o, b5.f47052e);
            }
        }
        if (v()) {
            A6.c.z(v(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
            b5.g();
        }
    }

    public void j(r9.S s10) {
        Integer numValueOf = Integer.valueOf(s10.f44597b);
        HashMap map = (HashMap) this.f3474d;
        if (map.containsKey(numValueOf)) {
            return;
        }
        map.put(numValueOf, s10);
        if (u()) {
            w();
        } else if (((C4333A) this.k).c()) {
            t(s10);
        }
    }

    public void k(m0 m0Var) {
        if (m0Var.f3467e && m0Var.f3465c.isEmpty()) {
            C0462l0 c0462l0 = (C0462l0) ((HashMap) this.f3475e).remove(m0Var);
            c0462l0.getClass();
            C0460k0 c0460k0 = c0462l0.f3459b;
            AbstractC2588a abstractC2588a = c0462l0.f3458a;
            abstractC2588a.n(c0460k0);
            Za za2 = c0462l0.f3460c;
            abstractC2588a.q(za2);
            abstractC2588a.p(za2);
            ((HashSet) this.f3476f).remove(m0Var);
        }
    }

    public void l(U1.O o7) {
        if (o7.f11975e && o7.f11973c.isEmpty()) {
            U1.N n10 = (U1.N) ((HashMap) this.f3475e).remove(o7);
            n10.getClass();
            U1.I i5 = n10.f11969b;
            AbstractC3144a abstractC3144a = n10.f11968a;
            abstractC3144a.o(i5);
            U1.M m10 = n10.f11970c;
            abstractC3144a.r(m10);
            abstractC3144a.q(m10);
            ((HashSet) this.f3476f).remove(o7);
        }
    }

    public boolean m(Path path, int i5) {
        Path path2 = (Path) this.f3482m;
        path2.reset();
        ((c8.t[]) this.f3478h)[i5].b(((Matrix[]) this.f3472b)[i5], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [E5.k0, f6.A] */
    public void n(m0 m0Var) {
        C2607t c2607t = m0Var.f3463a;
        ?? r12 = new InterfaceC2571A() { // from class: E5.k0
            @Override // f6.InterfaceC2571A
            public final void a(AbstractC2588a abstractC2588a, J0 j02) {
                ((O) this.f3450a.f3479i).f3170h.c(22);
            }
        };
        Za za2 = new Za();
        za2.f13918d = this;
        za2.f13916b = (I5.f) this.f3480j;
        za2.f13917c = (I5.f) this.k;
        za2.f13915a = m0Var;
        ((HashMap) this.f3475e).put(m0Var, new C0462l0(c2607t, r12, za2));
        int i5 = u6.v.f46721a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c2607t.getClass();
        I5.f fVar = c2607t.f35024c;
        fVar.getClass();
        C2573C c2573c = new C2573C();
        c2573c.f34874a = handler;
        c2573c.f34875b = za2;
        fVar.f5394c.add(c2573c);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        I5.f fVar2 = c2607t.f35025d;
        fVar2.getClass();
        I5.e eVar = new I5.e();
        eVar.f5391a = za2;
        fVar2.f5394c.add(eVar);
        c2607t.j(r12, (t6.K) this.f3482m, (F5.l) this.f3478h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [U1.I, k2.I] */
    public void o(U1.O o7) {
        C3142D c3142d = o7.f11971a;
        ?? r12 = new k2.I() { // from class: U1.I
            @Override // k2.I
            public final void a(AbstractC3144a abstractC3144a, N1.N n10) {
                Q1.s sVar = ((C0855z) this.f11949a.f3479i).f12218i;
                sVar.d(2);
                sVar.e(22);
            }
        };
        U1.M m10 = new U1.M(this, o7);
        ((HashMap) this.f3475e).put(o7, new U1.N(c3142d, r12, m10));
        int i5 = Q1.x.f9724a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c3142d.getClass();
        Z1.d dVar = c3142d.f39018c;
        dVar.getClass();
        k2.L l10 = new k2.L();
        l10.f38917a = handler;
        l10.f38918b = m10;
        dVar.f16928c.add(l10);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        Z1.d dVar2 = c3142d.f39019d;
        dVar2.getClass();
        Z1.c cVar = new Z1.c();
        cVar.f16925a = m10;
        dVar2.f16928c.add(cVar);
        c3142d.k(r12, (S1.A) this.f3482m, (V1.k) this.f3478h);
    }

    public void p(InterfaceC2610w interfaceC2610w) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f3473c;
        m0 m0Var = (m0) identityHashMap.remove(interfaceC2610w);
        m0Var.getClass();
        m0Var.f3463a.m(interfaceC2610w);
        m0Var.f3465c.remove(((C2604q) interfaceC2610w).f35088a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        k(m0Var);
    }

    public void q(k2.F f10) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f3473c;
        U1.O o7 = (U1.O) identityHashMap.remove(f10);
        o7.getClass();
        o7.f11971a.n(f10);
        o7.f11973c.remove(((C3139A) f10).f38884a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        l(o7);
    }

    public void r(int i5, int i10) {
        switch (this.f3471a) {
            case 0:
                for (int i11 = i10 - 1; i11 >= i5; i11--) {
                    ArrayList arrayList = (ArrayList) this.f3472b;
                    m0 m0Var = (m0) arrayList.remove(i11);
                    ((HashMap) this.f3474d).remove(m0Var.f3464b);
                    int i12 = -m0Var.f3463a.f35102o.f35081b.o();
                    for (int i13 = i11; i13 < arrayList.size(); i13++) {
                        ((m0) arrayList.get(i13)).f3466d += i12;
                    }
                    m0Var.f3467e = true;
                    if (this.f3477g) {
                        k(m0Var);
                    }
                }
                break;
            default:
                for (int i14 = i10 - 1; i14 >= i5; i14--) {
                    ArrayList arrayList2 = (ArrayList) this.f3472b;
                    U1.O o7 = (U1.O) arrayList2.remove(i14);
                    ((HashMap) this.f3474d).remove(o7.f11972b);
                    int i15 = -o7.f11971a.f38898o.f39170b.o();
                    for (int i16 = i14; i16 < arrayList2.size(); i16++) {
                        ((U1.O) arrayList2.get(i16)).f11974d += i15;
                    }
                    o7.f11975e = true;
                    if (this.f3477g) {
                        l(o7);
                    }
                }
                break;
        }
    }

    public void s(int i5) {
        ((C6.l) this.f3481l).o(i5).f47117a++;
        C4333A c4333a = (C4333A) this.k;
        A6.c.z(c4333a.c(), "Unwatching targets requires an open stream", new Object[0]);
        C3236g0 c3236g0G = C3242i0.g();
        c3236g0G.c(c4333a.f47036r.f47102b);
        c3236g0G.d(i5);
        c4333a.i((C3242i0) c3236g0G.build());
    }

    public void t(r9.S s10) {
        String str;
        ((C6.l) this.f3481l).o(s10.f44597b).f47117a++;
        if (!s10.f44602g.isEmpty() || s10.f44600e.compareTo(s9.o.f45389b) > 0) {
            s10 = new r9.S(s10.f44596a, s10.f44597b, s10.f44598c, s10.f44599d, s10.f44600e, s10.f44601f, s10.f44602g, Integer.valueOf(((ad.L) this.f3472b).p(s10.f44597b).f19805a.size()));
        }
        C4333A c4333a = (C4333A) this.k;
        A6.c.z(c4333a.c(), "Watching queries requires an open stream", new Object[0]);
        C3236g0 c3236g0G = C3242i0.g();
        v9.o oVar = c4333a.f47036r;
        c3236g0G.c(oVar.f47102b);
        C3246j1 c3246j1H = C3261o1.h();
        C3776A c3776a = s10.f44596a;
        if (c3776a.e()) {
            C3249k1 c3249k1F = C3252l1.f();
            c3249k1F.a(v9.o.k(oVar.f47101a, c3776a.f43310d));
            c3246j1H.a((C3252l1) c3249k1F.build());
        } else {
            c3246j1H.c(oVar.j(c3776a));
        }
        c3246j1H.f(s10.f44597b);
        ByteString byteString = s10.f44602g;
        boolean zIsEmpty = byteString.isEmpty();
        s9.o oVar2 = s10.f44600e;
        if (!zIsEmpty || oVar2.compareTo(s9.o.f45389b) <= 0) {
            c3246j1H.e(byteString);
        } else {
            c3246j1H.d(v9.o.l(oVar2.f45390a));
        }
        Integer num = s10.f44603h;
        if (num != null && (!byteString.isEmpty() || oVar2.compareTo(s9.o.f45389b) > 0)) {
            c3246j1H.b(Int32Value.newBuilder().setValue(num.intValue()));
        }
        c3236g0G.b((C3261o1) c3246j1H.build());
        r9.y yVar = s10.f44599d;
        int iOrdinal = yVar.ordinal();
        HashMap map = null;
        if (iOrdinal == 0) {
            str = null;
        } else if (iOrdinal == 1) {
            str = "existence-filter-mismatch";
        } else if (iOrdinal == 2) {
            str = "existence-filter-mismatch-bloom";
        } else {
            if (iOrdinal != 3) {
                A6.c.s("Unrecognized query purpose: %s", yVar);
                throw null;
            }
            str = "limbo-document";
        }
        if (str != null) {
            map = new HashMap(1);
            map.put("goog-listen-tags", str);
        }
        if (map != null) {
            c3236g0G.a(map);
        }
        c4333a.i((C3242i0) c3236g0G.build());
    }

    public boolean u() {
        return (!this.f3477g || ((C4333A) this.k).d() || ((HashMap) this.f3474d).isEmpty()) ? false : true;
    }

    public boolean v() {
        return (!this.f3477g || ((v9.B) this.f3476f).d() || ((ArrayDeque) this.f3482m).isEmpty()) ? false : true;
    }

    public void w() {
        A6.c.z(u(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f3481l = new C6.l((s9.f) this.f3478h, this);
        ((C4333A) this.k).g();
        io.flutter.plugin.platform.x xVar = (io.flutter.plugin.platform.x) this.f3480j;
        if (xVar.f37167b == 0) {
            xVar.c(1);
            A6.c.z(((C3558a) xVar.f37169d) == null, "onlineStateTimer shouldn't be started yet", new Object[0]);
            xVar.f37169d = ((C4386e) xVar.f37170e).b(EnumC4385d.f47422f, 10000L, new RunnableC3307c(xVar, 17));
        }
    }

    public void x(int i5) {
        HashMap map = (HashMap) this.f3474d;
        A6.c.z(((r9.S) map.remove(Integer.valueOf(i5))) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i5));
        C4333A c4333a = (C4333A) this.k;
        if (c4333a.c()) {
            s(i5);
        }
        if (map.isEmpty()) {
            if (!c4333a.c()) {
                if (this.f3477g) {
                    ((io.flutter.plugin.platform.x) this.f3480j).d(1);
                }
            } else if (c4333a.c() && c4333a.f47049b == null) {
                c4333a.f47049b = c4333a.f47053f.b(c4333a.f47054g, AbstractC4335b.f47045o, c4333a.f47052e);
            }
        }
    }

    public n0(O o7, F5.f fVar, Handler handler, F5.l lVar) {
        this.f3471a = 0;
        this.f3478h = lVar;
        this.f3479i = o7;
        this.f3481l = new f6.X();
        this.f3473c = new IdentityHashMap();
        this.f3474d = new HashMap();
        this.f3472b = new ArrayList();
        I5.f fVar2 = new I5.f(1);
        this.f3480j = fVar2;
        I5.f fVar3 = new I5.f(0);
        this.k = fVar3;
        this.f3475e = new HashMap();
        this.f3476f = new HashSet();
        fVar.getClass();
        C2573C c2573c = new C2573C();
        c2573c.f34874a = handler;
        c2573c.f34875b = fVar;
        fVar2.f5394c.add(c2573c);
        I5.e eVar = new I5.e();
        eVar.f5391a = fVar;
        fVar3.f5394c.add(eVar);
    }

    public n0(C0855z c0855z, V1.d dVar, Q1.s sVar, V1.k kVar) {
        this.f3471a = 1;
        this.f3478h = kVar;
        this.f3479i = c0855z;
        this.f3481l = new k2.g0();
        this.f3473c = new IdentityHashMap();
        this.f3474d = new HashMap();
        this.f3472b = new ArrayList();
        this.f3480j = dVar;
        this.k = sVar;
        this.f3475e = new HashMap();
        this.f3476f = new HashSet();
    }

    public n0(s9.f fVar, ad.L l10, C3955l c3955l, v9.g gVar, C4386e c4386e, Y7 y72) {
        this.f3471a = 3;
        this.f3477g = false;
        this.f3478h = fVar;
        this.f3472b = l10;
        this.f3473c = c3955l;
        this.f3475e = gVar;
        this.f3479i = y72;
        this.f3474d = new HashMap();
        this.f3482m = new ArrayDeque();
        C3641c c3641c = new C3641c(l10, 8);
        io.flutter.plugin.platform.x xVar = new io.flutter.plugin.platform.x();
        xVar.f37170e = c4386e;
        xVar.f37171f = c3641c;
        xVar.f37166a = 1;
        xVar.f37168c = true;
        this.f3480j = xVar;
        v9.p pVar = new v9.p(this);
        gVar.getClass();
        this.k = new C4333A(gVar.f47068c, gVar.f47067b, gVar.f47066a, pVar);
        v9.q qVar = new v9.q(this);
        this.f3476f = new v9.B(gVar.f47068c, gVar.f47067b, gVar.f47066a, qVar);
        r9.E e7 = new r9.E(1, this, c4386e);
        synchronized (((ArrayList) y72.f13870d)) {
            ((ArrayList) y72.f13870d).add(e7);
        }
    }
}
