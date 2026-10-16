package Rd;

import java.util.List;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public final class b extends e {

    /* renamed from: b, reason: collision with root package name */
    public final List f10588b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3108h f10589c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10590d;

    /* renamed from: e, reason: collision with root package name */
    public int f10591e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object context, List interceptors, Object subject, InterfaceC3108h interfaceC3108h) {
        super(context);
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(interceptors, "interceptors");
        AbstractC3340k.e(subject, "subject");
        this.f10588b = interceptors;
        this.f10589c = interfaceC3108h;
        this.f10590d = subject;
    }

    @Override // Rd.e
    public final Object a(Object obj, AbstractC3464c abstractC3464c) {
        this.f10591e = 0;
        AbstractC3340k.e(obj, "<set-?>");
        this.f10590d = obj;
        return d(abstractC3464c);
    }

    @Override // Rd.e
    public final Object c() {
        return this.f10590d;
    }

    @Override // Rd.e
    public final Object d(InterfaceC3103c interfaceC3103c) {
        int i5 = this.f10591e;
        if (i5 < 0) {
            return this.f10590d;
        }
        if (i5 < this.f10588b.size()) {
            return f(interfaceC3103c);
        }
        this.f10591e = -1;
        return this.f10590d;
    }

    @Override // Rd.e
    public final Object e(Object obj, InterfaceC3103c interfaceC3103c) {
        AbstractC3340k.e(obj, "<set-?>");
        this.f10590d = obj;
        return d(interfaceC3103c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(jf.InterfaceC3103c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof Rd.a
            if (r0 == 0) goto L13
            r0 = r7
            Rd.a r0 = (Rd.a) r0
            int r1 = r0.f10587c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10587c = r1
            goto L18
        L13:
            Rd.a r0 = new Rd.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f10585a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f10587c
            r3 = 1
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            goto L2c
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2c:
            Fe.e.U(r7)
        L2f:
            int r7 = r6.f10591e
            r2 = -1
            if (r7 != r2) goto L35
            goto L3f
        L35:
            java.util.List r4 = r6.f10588b
            int r5 = r4.size()
            if (r7 < r5) goto L42
            r6.f10591e = r2
        L3f:
            java.lang.Object r7 = r6.f10590d
            return r7
        L42:
            java.lang.Object r2 = r4.get(r7)
            tf.q r2 = (tf.q) r2
            int r7 = r7 + 1
            r6.f10591e = r7
            java.lang.Object r7 = r6.f10590d
            r0.f10587c = r3
            java.lang.Object r7 = r2.invoke(r6, r7, r0)
            if (r7 != r1) goto L2f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Rd.b.f(jf.c):java.lang.Object");
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f10589c;
    }
}
