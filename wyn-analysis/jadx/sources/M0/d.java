package M0;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f7240c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z2, i iVar, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7239b = z2;
        this.f7240c = iVar;
        this.f7241d = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new d(this.f7239b, this.f7240c, this.f7241d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r11.f7250a.a(r5, r10.f7241d, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r11.f7250a.a(r10.f7241d, r4, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r0;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r10.f7238a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            Fe.e.U(r11)
            goto L47
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            Fe.e.U(r11)
            r6 = r10
            goto L47
        L1d:
            Fe.e.U(r11)
            M0.i r11 = r10.f7240c
            boolean r1 = r10.f7239b
            if (r1 != 0) goto L37
            long r5 = L0.l.f6813b
            r10.f7238a = r3
            long r7 = r10.f7241d
            o0.c r4 = r11.f7250a
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            r6 = r9
            if (r11 != r0) goto L47
            goto L46
        L37:
            r6 = r10
            long r4 = L0.l.f6813b
            r6.f7238a = r2
            long r2 = r6.f7241d
            o0.c r1 = r11.f7250a
            java.lang.Object r11 = r1.a(r2, r4, r6)
            if (r11 != r0) goto L47
        L46:
            return r0
        L47:
            ef.C r11 = ef.C2515C.f34653a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
