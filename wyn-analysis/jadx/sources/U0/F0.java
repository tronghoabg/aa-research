package u0;

import android.view.View;
import androidx.lifecycle.InterfaceC1457v;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class F0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46103a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f46105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N.p0 f46106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1457v f46107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G0 f46108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f46109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(kotlin.jvm.internal.G g9, N.p0 p0Var, InterfaceC1457v interfaceC1457v, G0 g02, View view, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46105c = g9;
        this.f46106d = p0Var;
        this.f46107e = interfaceC1457v;
        this.f46108f = g02;
        this.f46109g = view;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        F0 f02 = new F0(this.f46105c, this.f46106d, this.f46107e, this.f46108f, this.f46109g, interfaceC3103c);
        f02.f46104b = obj;
        return f02;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r11.f46103a
            androidx.lifecycle.v r2 = r11.f46107e
            ef.C r3 = ef.C2515C.f34653a
            r4 = 0
            u0.G0 r5 = r11.f46108f
            r6 = 1
            if (r1 == 0) goto L24
            if (r1 != r6) goto L1c
            java.lang.Object r0 = r11.f46104b
            Ef.m0 r0 = (Ef.InterfaceC0501m0) r0
            Fe.e.U(r12)     // Catch: java.lang.Throwable -> L19
            goto L92
        L19:
            r12 = move-exception
            goto La5
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            Fe.e.U(r12)
            java.lang.Object r12 = r11.f46104b
            Ef.E r12 = (Ef.E) r12
            kotlin.jvm.internal.G r1 = r11.f46105c     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r1.f39740a     // Catch: java.lang.Throwable -> L64
            u0.b0 r1 = (u0.C4165b0) r1     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L67
            android.view.View r7 = r11.f46109g     // Catch: java.lang.Throwable -> L64
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.Throwable -> L64
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L64
            java.lang.String r8 = "context.applicationContext"
            kotlin.jvm.internal.AbstractC3340k.d(r7, r8)     // Catch: java.lang.Throwable -> L64
            Hf.v0 r7 = u0.I0.a(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r8 = r7.getValue()     // Catch: java.lang.Throwable -> L64
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L64
            float r8 = r8.floatValue()     // Catch: java.lang.Throwable -> L64
            java.lang.Float r8 = java.lang.Float.valueOf(r8)     // Catch: java.lang.Throwable -> L64
            N.Y r9 = r1.f46199a     // Catch: java.lang.Throwable -> L64
            r9.setValue(r8)     // Catch: java.lang.Throwable -> L64
            u0.E0 r8 = new u0.E0     // Catch: java.lang.Throwable -> L64
            r8.<init>(r7, r1, r4)     // Catch: java.lang.Throwable -> L64
            r1 = 3
            Ef.H0 r12 = Ef.H.D(r12, r4, r8, r1)     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r12 = move-exception
            r0 = r4
            goto La5
        L67:
            r12 = r4
        L68:
            N.p0 r1 = r11.f46106d     // Catch: java.lang.Throwable -> La3
            r11.f46104b = r12     // Catch: java.lang.Throwable -> La3
            r11.f46103a = r6     // Catch: java.lang.Throwable -> La3
            N.o0 r6 = new N.o0     // Catch: java.lang.Throwable -> La3
            r6.<init>(r1, r4)     // Catch: java.lang.Throwable -> La3
            jf.h r7 = r11.getContext()     // Catch: java.lang.Throwable -> La3
            N.Q r7 = N.C0718d.B(r7)     // Catch: java.lang.Throwable -> La3
            N.m0 r8 = new N.m0     // Catch: java.lang.Throwable -> La3
            r8.<init>(r1, r6, r7, r4)     // Catch: java.lang.Throwable -> La3
            N.g r1 = r1.f7882a     // Catch: java.lang.Throwable -> La3
            java.lang.Object r1 = Ef.H.P(r1, r8, r11)     // Catch: java.lang.Throwable -> La3
            if (r1 != r0) goto L89
            goto L8a
        L89:
            r1 = r3
        L8a:
            if (r1 != r0) goto L8d
            goto L8e
        L8d:
            r1 = r3
        L8e:
            if (r1 != r0) goto L91
            return r0
        L91:
            r0 = r12
        L92:
            if (r0 == 0) goto L97
            r0.cancel(r4)
        L97:
            androidx.lifecycle.o r12 = r2.getLifecycle()
            r12.c(r5)
            return r3
        L9f:
            r10 = r0
            r0 = r12
            r12 = r10
            goto La5
        La3:
            r0 = move-exception
            goto L9f
        La5:
            if (r0 == 0) goto Laa
            r0.cancel(r4)
        Laa:
            androidx.lifecycle.o r0 = r2.getLifecycle()
            r0.c(r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.F0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
