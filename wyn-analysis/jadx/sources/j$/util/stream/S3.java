package j$.util.stream;

/* loaded from: classes2.dex */
final class S3 extends AbstractC2992n2 implements h4 {

    /* renamed from: b, reason: collision with root package name */
    long f38090b;

    /* renamed from: c, reason: collision with root package name */
    boolean f38091c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f38092d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ T3 f38093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S3(T3 t32, InterfaceC3011r2 interfaceC3011r2, boolean z2) {
        super(interfaceC3011r2);
        this.f38093e = t32;
        this.f38092d = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.f38091c
            if (r0 != 0) goto L15
            j$.util.stream.T3 r0 = r6.f38093e
            java.util.function.Predicate r0 = r0.f38108m
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.f38091c = r1
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r1 = r6.f38092d
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            long r2 = r6.f38090b
            r4 = 1
            long r2 = r2 + r4
            r6.f38090b = r2
        L23:
            if (r1 != 0) goto L29
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            j$.util.stream.r2 r0 = r6.f38260a
            r0.accept(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.S3.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.h4
    public final long f() {
        return this.f38090b;
    }
}
