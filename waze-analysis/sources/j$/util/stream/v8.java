package j$.util.stream;

import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class v8 extends p5 implements f9 {

    /* renamed from: b, reason: collision with root package name */
    public long f50652b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50653c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Predicate f50654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f50655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(t5 t5Var, Predicate predicate, boolean z) {
        super(t5Var);
        this.f50654d = predicate;
        this.f50655e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.f50653c
            if (r0 != 0) goto L13
            java.util.function.Predicate r0 = r6.f50654d
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.f50653c = r1
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            boolean r1 = r6.f50655e
            if (r1 == 0) goto L21
            if (r0 != 0) goto L21
            long r2 = r6.f50652b
            r4 = 1
            long r2 = r2 + r4
            r6.f50652b = r2
        L21:
            if (r1 != 0) goto L27
            if (r0 == 0) goto L26
            goto L27
        L26:
            return
        L27:
            j$.util.stream.t5 r6 = r6.f50576a
            r6.accept(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.v8.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.f9
    public final long t() {
        return this.f50652b;
    }
}
