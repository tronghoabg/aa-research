package Mf;

import Ef.InterfaceC0496k;
import Ef.InterfaceC0498l;
import Ef.R0;
import Ef.w0;
import Ef.x0;
import Ef.z0;
import Jf.r;
import ef.C2515C;
import ff.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public class h implements InterfaceC0496k, i, R0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7650f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3108h f7651a;

    /* renamed from: c, reason: collision with root package name */
    public Object f7653c;
    private volatile /* synthetic */ Object state$volatile = j.f7656a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7652b = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public int f7654d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f7655e = j.f7659d;

    public h(InterfaceC3108h interfaceC3108h) {
        this.f7651a = interfaceC3108h;
    }

    @Override // Ef.InterfaceC0496k
    public final void a(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7650f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == j.f7657b) {
                return;
            }
            H6.g gVar = j.f7658c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f7652b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
            this.f7655e = j.f7659d;
            this.f7652b = null;
            return;
        }
    }

    @Override // Ef.R0
    public final void b(r rVar, int i5) {
        this.f7653c = rVar;
        this.f7654d = i5;
    }

    public final Object c(AbstractC3464c abstractC3464c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7650f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        f fVar = (f) obj;
        Object obj2 = this.f7655e;
        ArrayList arrayList = this.f7652b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (fVar2 != fVar) {
                    fVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, j.f7657b);
            this.f7655e = j.f7659d;
            this.f7652b = null;
        }
        x0.f3789a.invoke(fVar.f7641a, null, obj2);
        return fVar.f7642b.invoke(obj2, abstractC3464c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(lf.AbstractC3464c r11) throws Ef.N {
        /*
            r10 = this;
            boolean r0 = r11 instanceof Mf.g
            if (r0 == 0) goto L13
            r0 = r11
            Mf.g r0 = (Mf.g) r0
            int r1 = r0.f7649d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7649d = r1
            goto L18
        L13:
            Mf.g r0 = new Mf.g
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f7647b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f7649d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            Fe.e.U(r11)
            return r11
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            Mf.h r2 = r0.f7646a
            Fe.e.U(r11)
            goto Lb4
        L3a:
            Fe.e.U(r11)
            r0.f7646a = r10
            r0.f7649d = r5
            Ef.n r11 = new Ef.n
            jf.c r2 = A6.h.A(r0)
            r11.<init>(r5, r2)
            r11.t()
        L4d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Mf.h.f7650f
            java.lang.Object r6 = r2.get(r10)
            H6.g r7 = Mf.j.f7656a
            ef.C r8 = ef.C2515C.f34653a
            if (r6 != r7) goto L6a
        L59:
            boolean r7 = r2.compareAndSet(r10, r6, r11)
            if (r7 == 0) goto L63
            r11.w(r10)
            goto La7
        L63:
            java.lang.Object r7 = r2.get(r10)
            if (r7 == r6) goto L59
            goto L4d
        L6a:
            boolean r9 = r6 instanceof java.util.List
            if (r9 == 0) goto L9b
        L6e:
            boolean r8 = r2.compareAndSet(r10, r6, r7)
            if (r8 == 0) goto L94
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L7a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r2.next()
            Mf.f r6 = r10.e(r6)
            kotlin.jvm.internal.AbstractC3340k.b(r6)
            r6.f7643c = r3
            r7 = -1
            r6.f7644d = r7
            r10.f(r6, r5)
            goto L7a
        L94:
            java.lang.Object r8 = r2.get(r10)
            if (r8 == r6) goto L6e
            goto L4d
        L9b:
            boolean r2 = r6 instanceof Mf.f
            if (r2 == 0) goto Lc0
            Mf.f r6 = (Mf.f) r6
            r6.getClass()
            r11.g(r8, r3)
        La7:
            java.lang.Object r11 = r11.s()
            kf.a r2 = kf.a.f39711a
            if (r11 != r2) goto Lb0
            r8 = r11
        Lb0:
            if (r8 != r1) goto Lb3
            goto Lbe
        Lb3:
            r2 = r10
        Lb4:
            r0.f7646a = r3
            r0.f7649d = r4
            java.lang.Object r11 = r2.c(r0)
            if (r11 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            return r11
        Lc0:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Mf.h.d(lf.c):java.lang.Object");
    }

    public final f e(Object obj) {
        ArrayList arrayList = this.f7652b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((f) next).f7641a == obj) {
                obj2 = next;
                break;
            }
        }
        f fVar = (f) obj2;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(f fVar, boolean z2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7650f;
        if (atomicReferenceFieldUpdater.get(this) instanceof f) {
            return;
        }
        z0 z0Var = fVar.f7641a;
        if (!z2) {
            ArrayList arrayList = this.f7652b;
            AbstractC3340k.b(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((f) it.next()).f7641a == z0Var) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + z0Var).toString());
                    }
                }
            }
        }
        w0.f3786a.invoke(z0Var, this, null);
        if (this.f7655e != j.f7659d) {
            atomicReferenceFieldUpdater.set(this, fVar);
            return;
        }
        if (!z2) {
            ArrayList arrayList2 = this.f7652b;
            AbstractC3340k.b(arrayList2);
            arrayList2.add(fVar);
        }
        fVar.f7643c = this.f7653c;
        fVar.f7644d = this.f7654d;
        this.f7653c = null;
        this.f7654d = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7650f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC0498l)) {
                if (AbstractC3340k.a(obj3, j.f7657b) || (obj3 instanceof f)) {
                    return 3;
                }
                if (AbstractC3340k.a(obj3, j.f7658c)) {
                    return 2;
                }
                if (AbstractC3340k.a(obj3, j.f7656a)) {
                    List listC = AbstractC3935e.C(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listC)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListF0 = o.F0((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListF0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            f fVarE = e(obj);
            if (fVarE != null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, fVarE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                InterfaceC0498l interfaceC0498l = (InterfaceC0498l) obj3;
                this.f7655e = obj2;
                H6.g gVarM = interfaceC0498l.m(C2515C.f34653a, null);
                if (gVarM == null) {
                    this.f7655e = j.f7659d;
                    return 2;
                }
                interfaceC0498l.o(gVarM);
                return 0;
            }
            continue;
        }
    }
}
