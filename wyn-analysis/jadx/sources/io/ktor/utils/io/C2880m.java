package io.ktor.utils.io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.ktor.utils.io.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2880m implements InterfaceC2886t, J {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37409f = AtomicReferenceFieldUpdater.newUpdater(C2880m.class, Object.class, "suspensionSlot");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f37410g = AtomicReferenceFieldUpdater.newUpdater(C2880m.class, Object.class, "_closedCause");
    private volatile int flushBufferSize;

    /* renamed from: b, reason: collision with root package name */
    public final Pf.a f37411b = new Pf.a();

    /* renamed from: c, reason: collision with root package name */
    public final Object f37412c = new Object();

    @NotNull
    volatile /* synthetic */ Object suspensionSlot = C2870c.f37389b;

    /* renamed from: d, reason: collision with root package name */
    public final Pf.a f37413d = new Pf.a();

    /* renamed from: e, reason: collision with root package name */
    public final Pf.a f37414e = new Pf.a();

    @NotNull
    volatile /* synthetic */ Object _closedCause = null;

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final void a(Throwable th) {
        if (this._closedCause != null) {
            return;
        }
        S s10 = new S(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37410g;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, s10) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        i(s10.a(Q.f37370a));
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Throwable b() {
        S s10 = (S) this._closedCause;
        if (s10 != null) {
            return s10.a(Q.f37370a);
        }
        return null;
    }

    @Override // io.ktor.utils.io.J
    public final Pf.a c() throws Throwable {
        Throwable thA;
        if (this._closedCause == null) {
            return this.f37414e;
        }
        S s10 = (S) this._closedCause;
        if (s10 == null || (thA = s10.a(C2879l.f37408a)) == null) {
            throw new V(null, null);
        }
        throw thA;
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final Pf.a d() throws Throwable {
        Throwable thA;
        S s10 = (S) this._closedCause;
        if (s10 != null && (thA = s10.a(C2878k.f37407a)) != null) {
            throw thA;
        }
        if (this.f37413d.exhausted()) {
            k();
        }
        return this.f37413d;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // io.ktor.utils.io.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(lf.AbstractC3464c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2880m.e(lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(jf.InterfaceC3103c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.C2877j
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j r0 = (io.ktor.utils.io.C2877j) r0
            int r1 = r0.f37406c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37406c = r1
            goto L18
        L13:
            io.ktor.utils.io.j r0 = new io.ktor.utils.io.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f37404a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f37406c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Fe.e.U(r5)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r5 = move-exception
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            Fe.e.U(r5)
            r0.f37406c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r4.e(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L40
            return r1
        L3d:
            Fe.e.z(r5)
        L40:
            io.ktor.utils.io.S r5 = io.ktor.utils.io.N.f37364b
        L42:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = io.ktor.utils.io.C2880m.f37410g
            r1 = 0
            boolean r2 = r0.compareAndSet(r4, r1, r5)
            ef.C r3 = ef.C2515C.f34653a
            if (r2 == 0) goto L51
            r4.i(r1)
            return r3
        L51:
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L42
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2880m.f(jf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // io.ktor.utils.io.InterfaceC2886t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14, lf.AbstractC3464c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C2880m.g(int, lf.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC2886t
    public final boolean h() {
        if (b() == null) {
            return this._closedCause != null && this.flushBufferSize == 0 && this.f37413d.exhausted();
        }
        return true;
    }

    public final void i(Throwable th) {
        C2868a c2868a;
        if (th != null) {
            c2868a = new C2868a(th);
        } else {
            InterfaceC2874g.f37394a.getClass();
            c2868a = C2869b.f37386b;
        }
        InterfaceC2874g interfaceC2874g = (InterfaceC2874g) f37409f.getAndSet(this, c2868a);
        if (interfaceC2874g instanceof InterfaceC2872e) {
            ((InterfaceC2872e) interfaceC2874g).a(th);
        }
    }

    public final void j() {
        if (this.f37414e.exhausted()) {
            return;
        }
        synchronized (this.f37412c) {
            Pf.a aVar = this.f37414e;
            int i5 = (int) aVar.f9456c;
            this.f37411b.h(aVar);
            this.flushBufferSize += i5;
        }
        InterfaceC2874g interfaceC2874g = (InterfaceC2874g) this.suspensionSlot;
        if (interfaceC2874g instanceof C2871d) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37409f;
            C2870c c2870c = C2870c.f37389b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2874g, c2870c)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC2874g) {
                    return;
                }
            }
            ((InterfaceC2872e) interfaceC2874g).resume();
        }
    }

    public final void k() {
        synchronized (this.f37412c) {
            this.f37411b.i(this.f37413d);
            this.flushBufferSize = 0;
        }
        InterfaceC2874g interfaceC2874g = (InterfaceC2874g) this.suspensionSlot;
        if (interfaceC2874g instanceof C2873f) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f37409f;
            C2870c c2870c = C2870c.f37389b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2874g, c2870c)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC2874g) {
                    return;
                }
            }
            ((InterfaceC2872e) interfaceC2874g).resume();
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
