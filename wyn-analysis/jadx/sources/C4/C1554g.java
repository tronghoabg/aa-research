package c4;

import Ef.E;
import ef.C2515C;
import f4.C2556c;
import h4.l;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* renamed from: c4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1554g extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f19631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1555h f19632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.h f19633c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f19635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X3.c f19636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2556c f19637g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1557j f19638h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554g(C1555h c1555h, h4.h hVar, Object obj, l lVar, X3.c cVar, C2556c c2556c, C1557j c1557j, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f19632b = c1555h;
        this.f19633c = hVar;
        this.f19634d = obj;
        this.f19635e = lVar;
        this.f19636f = cVar;
        this.f19637g = c2556c;
        this.f19638h = c1557j;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C1554g(this.f19632b, this.f19633c, this.f19634d, this.f19635e, this.f19636f, this.f19637g, this.f19638h, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1554g) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r5 = r16
            kf.a r6 = kf.a.f39711a
            int r0 = r5.f19631a
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 != r7) goto L11
            Fe.e.U(r17)
            r0 = r17
            goto L2f
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L19:
            Fe.e.U(r17)
            r5.f19631a = r7
            h4.l r3 = r5.f19635e
            X3.c r4 = r5.f19636f
            c4.h r0 = r5.f19632b
            h4.h r1 = r5.f19633c
            java.lang.Object r2 = r5.f19634d
            java.lang.Object r0 = c4.C1555h.b(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L2f
            return r6
        L2f:
            c4.a r0 = (c4.C1548a) r0
            c4.h r1 = r5.f19632b
            a2.c r1 = r1.f19641c
            h4.h r2 = r5.f19633c
            int r2 = r2.f36113w
            boolean r2 = com.google.android.gms.internal.consent_sdk.a.m(r2)
            r3 = 0
            r4 = 0
            f4.c r6 = r5.f19637g
            if (r2 != 0) goto L45
        L43:
            r1 = r3
            goto L99
        L45:
            java.lang.Object r1 = r1.f17156b
            X3.k r1 = (X3.k) r1
            ef.p r1 = r1.f16115e
            java.lang.Object r1 = r1.getValue()
            f4.e r1 = (f4.C2558e) r1
            if (r1 == 0) goto L43
            if (r6 != 0) goto L56
            goto L43
        L56:
            android.graphics.drawable.Drawable r2 = r0.f19584a
            boolean r8 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r8 == 0) goto L5f
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            goto L60
        L5f:
            r2 = r4
        L60:
            if (r2 == 0) goto L43
            android.graphics.Bitmap r2 = r2.getBitmap()
            if (r2 != 0) goto L69
            goto L43
        L69:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            boolean r9 = r0.f19585b
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r10 = "coil#is_sampled"
            r8.put(r10, r9)
            java.lang.String r9 = r0.f19587d
            if (r9 == 0) goto L82
            java.lang.String r10 = "coil#disk_cache_key"
            r8.put(r10, r9)
        L82:
            java.util.Map r9 = r6.f34810b
            java.util.Map r9 = r7.AbstractC3935e.S(r9)
            f4.c r10 = new f4.c
            java.lang.String r11 = r6.f34809a
            r10.<init>(r11, r9)
            java.util.Map r8 = r7.AbstractC3935e.S(r8)
            f4.h r1 = r1.f34813a
            r1.O(r10, r2, r8)
            r1 = r7
        L99:
            android.graphics.drawable.Drawable r9 = r0.f19584a
            if (r1 == 0) goto L9f
            r12 = r6
            goto La0
        L9f:
            r12 = r4
        La0:
            android.graphics.Bitmap$Config r1 = k4.e.f39264a
            c4.j r1 = r5.f19638h
            boolean r2 = r1 instanceof c4.C1557j
            if (r2 == 0) goto Lae
            boolean r1 = r1.f19653g
            if (r1 == 0) goto Lae
            r15 = r7
            goto Laf
        Lae:
            r15 = r3
        Laf:
            h4.o r8 = new h4.o
            java.lang.String r13 = r0.f19587d
            boolean r14 = r0.f19585b
            h4.h r10 = r5.f19633c
            int r11 = r0.f19586c
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C1554g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
