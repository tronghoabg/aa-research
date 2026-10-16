package u0;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class T extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Gf.v f46169a;

    /* renamed from: b, reason: collision with root package name */
    public Gf.b f46170b;

    /* renamed from: c, reason: collision with root package name */
    public int f46171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Gf.e f46172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Gf.e eVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46172d = eVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new T(this.f46172d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0034, B:19:0x003c, B:20:0x0044, B:28:0x005c, B:14:0x0027, B:30:0x005f, B:31:0x0063, B:32:0x0064, B:13:0x0021, B:21:0x0045, B:23:0x0052), top: B:44:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Type inference failed for: r4v4, types: [Gf.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:17:0x0034). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r7.f46171c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            Gf.b r1 = r7.f46170b
            Gf.v r4 = r7.f46169a
            Fe.e.U(r8)     // Catch: java.lang.Throwable -> L12
            goto L34
        L12:
            r8 = move-exception
            goto L6b
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            Fe.e.U(r8)
            Gf.e r4 = r7.f46172d
            Gf.b r8 = new Gf.b     // Catch: java.lang.Throwable -> L12
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L12
            r1 = r8
        L27:
            r7.f46169a = r4     // Catch: java.lang.Throwable -> L12
            r7.f46170b = r1     // Catch: java.lang.Throwable -> L12
            r7.f46171c = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r1.a(r7)     // Catch: java.lang.Throwable -> L12
            if (r8 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L65
            java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L12
            ef.C r8 = (ef.C2515C) r8     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = X.m.f15718b     // Catch: java.lang.Throwable -> L12
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicReference r5 = X.m.f15725i     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L5a
            X.b r5 = (X.C1269b) r5     // Catch: java.lang.Throwable -> L5a
            x.r r5 = r5.f15688h     // Catch: java.lang.Throwable -> L5a
            r6 = 0
            if (r5 == 0) goto L5c
            boolean r5 = r5.h()     // Catch: java.lang.Throwable -> L5a
            if (r5 != r3) goto L5c
            r6 = r3
            goto L5c
        L5a:
            r0 = move-exception
            goto L63
        L5c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            if (r6 == 0) goto L27
            X.m.a()     // Catch: java.lang.Throwable -> L12
            goto L27
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            throw r0     // Catch: java.lang.Throwable -> L12
        L65:
            r4.cancel(r2)
            ef.C r8 = ef.C2515C.f34653a
            return r8
        L6b:
            throw r8     // Catch: java.lang.Throwable -> L6c
        L6c:
            r0 = move-exception
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L74
            r2 = r8
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L74:
            if (r2 != 0) goto L7c
            java.lang.String r1 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = Ef.H.a(r1, r8)
        L7c:
            r4.cancel(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
