package a9;

import Bf.r;
import C6.l;
import L8.e;
import L8.f;
import We.k;
import android.content.Context;
import cg.C1616e;
import cg.C1621j;
import cg.y;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;
import o3.C3645b;
import o3.InterfaceC3646c;
import o3.d;
import p3.h;
import r7.C3934d;
import r7.InterfaceC3932b;
import s2.C;
import s2.o;
import s2.w;

/* renamed from: a9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1342b implements InterfaceC1343c, f, InterfaceC3646c, InterfaceC3932b, o, e {

    /* renamed from: a, reason: collision with root package name */
    public static C1342b f17401a;

    public static final void e(C1616e c1616e, long j8, boolean z2) {
        C1616e c1616e2;
        ReentrantLock reentrantLock = C1616e.f19894h;
        if (C1616e.f19897l == null) {
            C1616e.f19897l = new C1616e();
            k kVar = new k("Okio Watchdog");
            kVar.setDaemon(true);
            kVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j8 != 0 && z2) {
            c1616e.f19900g = Math.min(j8, c1616e.c() - jNanoTime) + jNanoTime;
        } else if (j8 != 0) {
            c1616e.f19900g = j8 + jNanoTime;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            c1616e.f19900g = c1616e.c();
        }
        long j10 = c1616e.f19900g - jNanoTime;
        C1616e c1616e3 = C1616e.f19897l;
        AbstractC3340k.b(c1616e3);
        while (true) {
            c1616e2 = c1616e3.f19899f;
            if (c1616e2 == null || j10 < c1616e2.f19900g - jNanoTime) {
                break;
            }
            AbstractC3340k.b(c1616e2);
            c1616e3 = c1616e2;
        }
        c1616e.f19899f = c1616e2;
        c1616e3.f19899f = c1616e;
        if (c1616e3 == C1616e.f19897l) {
            C1616e.f19895i.signal();
        }
    }

    public static final boolean g(y yVar) {
        y yVar2 = dg.e.f34298e;
        yVar.getClass();
        C1621j c1621j = dg.c.f34290a;
        C1621j c1621jQ = yVar.f19938a;
        int iK = C1621j.k(c1621jQ, c1621j);
        if (iK == -1) {
            iK = C1621j.k(c1621jQ, dg.c.f34291b);
        }
        if (iK != -1) {
            c1621jQ = C1621j.q(c1621jQ, iK + 1, 0, 2);
        } else if (yVar.g() != null && c1621jQ.d() == 2) {
            c1621jQ = C1621j.f19903d;
        }
        return !r.b0(c1621jQ.t(), ".class", true);
    }

    public static C1616e h() throws InterruptedException {
        C1616e c1616e = C1616e.f19897l;
        AbstractC3340k.b(c1616e);
        C1616e c1616e2 = c1616e.f19899f;
        if (c1616e2 == null) {
            long jNanoTime = System.nanoTime();
            C1616e.f19895i.await(C1616e.f19896j, TimeUnit.MILLISECONDS);
            C1616e c1616e3 = C1616e.f19897l;
            AbstractC3340k.b(c1616e3);
            if (c1616e3.f19899f != null || System.nanoTime() - jNanoTime < C1616e.k) {
                return null;
            }
            return C1616e.f19897l;
        }
        long jNanoTime2 = c1616e2.f19900g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C1616e.f19895i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C1616e c1616e4 = C1616e.f19897l;
        AbstractC3340k.b(c1616e4);
        c1616e4.f19899f = c1616e2.f19899f;
        c1616e2.f19899f = null;
        c1616e2.f19898e = 2;
        return c1616e2;
    }

    public static C1342b i(boolean z2) {
        if (f17401a == null && z2) {
            f17401a = new C1342b();
        }
        return f17401a;
    }

    @Override // r7.InterfaceC3932b
    public int a(Context context, String str, boolean z2) {
        return C3934d.d(context, str, z2);
    }

    @Override // L8.f
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (L8.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f6990a;
            if (str != null) {
                aa.f fVar = new aa.f(9, str, bVar);
                bVar = new L8.b(str, bVar.f6991b, bVar.f6992c, bVar.f6993d, bVar.f6994e, fVar, bVar.f6996g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // o3.InterfaceC3646c
    public d c(C3645b c3645b) {
        return new h(c3645b.f41341a, c3645b.f41342b, c3645b.f41343c, c3645b.f41344d, c3645b.f41345e);
    }

    @Override // r7.InterfaceC3932b
    public int d(Context context, String str) {
        return C3934d.a(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // a9.InterfaceC1343c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StackTraceElement[] f(java.lang.StackTraceElement[] r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r2 = 1
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Ld:
            int r7 = r15.length
            if (r4 >= r7) goto L61
            r7 = r15[r4]
            java.lang.Object r8 = r0.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4f
            int r9 = r8.intValue()
            int r10 = r4 - r9
            int r11 = r4 + r10
            int r12 = r15.length
            if (r11 <= r12) goto L26
            goto L4f
        L26:
            r11 = r3
        L27:
            if (r11 >= r10) goto L3b
            int r12 = r9 + r11
            r12 = r15[r12]
            int r13 = r4 + r11
            r13 = r15[r13]
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L38
            goto L4f
        L38:
            int r11 = r11 + 1
            goto L27
        L3b:
            int r8 = r8.intValue()
            int r8 = r4 - r8
            r9 = 10
            if (r6 >= r9) goto L4b
            java.lang.System.arraycopy(r15, r4, r1, r5, r8)
            int r5 = r5 + r8
            int r6 = r6 + 1
        L4b:
            int r8 = r8 + (-1)
            int r8 = r8 + r4
            goto L57
        L4f:
            r6 = r15[r4]
            r1[r5] = r6
            int r5 = r5 + 1
            r6 = r2
            r8 = r4
        L57:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r7, r4)
            int r4 = r8 + 1
            goto Ld
        L61:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r3, r0, r3, r5)
            int r1 = r15.length
            if (r5 >= r1) goto L6a
            return r0
        L6a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C1342b.f(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // s2.o, J5.m
    public void l() {
        throw new UnsupportedOperationException();
    }

    @Override // s2.o
    /* renamed from: m */
    public C mo0m(int i5, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // L8.e
    public Object o(l lVar) {
        return new ya.d(lVar.c(ya.h.class));
    }

    @Override // s2.o
    public void s(w wVar) {
        throw new UnsupportedOperationException();
    }
}
