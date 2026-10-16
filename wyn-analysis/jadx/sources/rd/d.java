package Rd;

import ff.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.q;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10597a;

    /* renamed from: b, reason: collision with root package name */
    public int f10598b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10599c;

    /* renamed from: d, reason: collision with root package name */
    public D8.a f10600d;

    @NotNull
    private volatile /* synthetic */ Object interceptors$delegate;

    public d(D8.a... aVarArr) {
        new Nd.d();
        this.f10597a = AbstractC3935e.G(Arrays.copyOf(aVarArr, aVarArr.length));
        this.interceptors$delegate = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r13, java.lang.Object r14, lf.AbstractC3464c r15) {
        /*
            r12 = this;
            jf.h r0 = r15.getContext()
            java.lang.Object r1 = r12.interceptors$delegate
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            if (r1 != 0) goto L94
            int r1 = r12.f10598b
            r3 = 0
            r4 = 0
            if (r1 != 0) goto L1b
            ff.v r1 = ff.v.f35432a
            r12.interceptors$delegate = r1
            r12.f10599c = r4
            r12.f10600d = r3
            goto L94
        L1b:
            java.util.ArrayList r5 = r12.f10597a
            if (r1 != r2) goto L4f
            int r1 = r7.AbstractC3935e.z(r5)
            if (r1 < 0) goto L4f
            r6 = r4
        L26:
            java.lang.Object r7 = r5.get(r6)
            boolean r8 = r7 instanceof Rd.c
            if (r8 == 0) goto L31
            Rd.c r7 = (Rd.c) r7
            goto L32
        L31:
            r7 = r3
        L32:
            if (r7 != 0) goto L35
            goto L4a
        L35:
            java.util.List r8 = r7.f10595c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4a
            java.util.List r1 = r7.f10595c
            r7.f10596d = r2
            r12.interceptors$delegate = r1
            r12.f10599c = r4
            D8.a r1 = r7.f10593a
            r12.f10600d = r1
            goto L94
        L4a:
            if (r6 == r1) goto L4f
            int r6 = r6 + 1
            goto L26
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r6 = r7.AbstractC3935e.z(r5)
            if (r6 < 0) goto L8e
            r7 = r4
        L5b:
            java.lang.Object r8 = r5.get(r7)
            boolean r9 = r8 instanceof Rd.c
            if (r9 == 0) goto L66
            Rd.c r8 = (Rd.c) r8
            goto L67
        L66:
            r8 = r3
        L67:
            if (r8 != 0) goto L6a
            goto L89
        L6a:
            java.util.List r8 = r8.f10595c
            int r9 = r1.size()
            int r10 = r8.size()
            int r10 = r10 + r9
            r1.ensureCapacity(r10)
            int r9 = r8.size()
            r10 = r4
        L7d:
            if (r10 >= r9) goto L89
            java.lang.Object r11 = r8.get(r10)
            r1.add(r11)
            int r10 = r10 + 1
            goto L7d
        L89:
            if (r7 == r6) goto L8e
            int r7 = r7 + 1
            goto L5b
        L8e:
            r12.interceptors$delegate = r1
            r12.f10599c = r4
            r12.f10600d = r3
        L94:
            r12.f10599c = r2
            java.lang.Object r1 = r12.interceptors$delegate
            java.util.List r1 = (java.util.List) r1
            kotlin.jvm.internal.AbstractC3340k.b(r1)
            boolean r2 = r12.d()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.AbstractC3340k.e(r13, r3)
            java.lang.String r3 = "subject"
            kotlin.jvm.internal.AbstractC3340k.e(r14, r3)
            java.lang.String r3 = "coroutineContext"
            kotlin.jvm.internal.AbstractC3340k.e(r0, r3)
            boolean r3 = Rd.f.f10602a
            if (r3 != 0) goto Lbd
            if (r2 == 0) goto Lb7
            goto Lbd
        Lb7:
            Rd.l r0 = new Rd.l
            r0.<init>(r14, r13, r1)
            goto Lc3
        Lbd:
            Rd.b r2 = new Rd.b
            r2.<init>(r13, r1, r14, r0)
            r0 = r2
        Lc3:
            java.lang.Object r13 = r0.a(r14, r15)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Rd.d.a(java.lang.Object, java.lang.Object, lf.c):java.lang.Object");
    }

    public final c b(D8.a aVar) {
        ArrayList arrayList = this.f10597a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = arrayList.get(i5);
            if (obj == aVar) {
                c cVar = new c(aVar, i.f10604a);
                arrayList.set(i5, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                if (cVar2.f10593a == aVar) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final int c(D8.a aVar) {
        ArrayList arrayList = this.f10597a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = arrayList.get(i5);
            if (obj == aVar || ((obj instanceof c) && ((c) obj).f10593a == aVar)) {
                return i5;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(D8.a aVar) {
        ArrayList arrayList = this.f10597a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = arrayList.get(i5);
            if (obj == aVar) {
                return true;
            }
            if ((obj instanceof c) && ((c) obj).f10593a == aVar) {
                return true;
            }
        }
        return false;
    }

    public final void f(D8.a phase, q qVar) {
        AbstractC3340k.e(phase, "phase");
        c cVarB = b(phase);
        if (cVarB == null) {
            throw new N0.c("Phase " + phase + " was not registered for this pipeline");
        }
        List list = (List) this.interceptors$delegate;
        if (!this.f10597a.isEmpty() && list != null && !this.f10599c && K.h(list)) {
            if (AbstractC3340k.a(this.f10600d, phase)) {
                list.add(qVar);
            } else if (phase.equals(o.y0(this.f10597a)) || c(phase) == AbstractC3935e.z(this.f10597a)) {
                c cVarB2 = b(phase);
                AbstractC3340k.b(cVarB2);
                if (cVarB2.f10596d) {
                    cVarB2.f10595c = o.U0(cVarB2.f10595c);
                    cVarB2.f10596d = false;
                }
                cVarB2.f10595c.add(qVar);
                list.add(qVar);
            }
            this.f10598b++;
            return;
        }
        if (cVarB.f10596d) {
            cVarB.f10595c = o.U0(cVarB.f10595c);
            cVarB.f10596d = false;
        }
        cVarB.f10595c.add(qVar);
        this.f10598b++;
        this.interceptors$delegate = null;
        this.f10599c = false;
        this.f10600d = null;
    }
}
