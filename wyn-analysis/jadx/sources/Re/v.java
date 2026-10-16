package Re;

/* loaded from: classes5.dex */
public final class v extends Xe.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10765f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10766g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Oe.a aVar, Object obj, int i5) {
        super(aVar);
        this.f10765f = i5;
        this.f10766g = obj;
    }

    @Override // He.f
    public final void b(Object obj) {
        switch (this.f10765f) {
            case 0:
                if (!d(obj)) {
                    this.f16229b.request(1L);
                    break;
                }
                break;
            default:
                if (!this.f16231d) {
                    int i5 = this.f16232e;
                    Oe.a aVar = this.f16228a;
                    if (i5 != 0) {
                        aVar.b(null);
                        break;
                    } else {
                        try {
                            Object objApply = ((Y9.c) this.f10766g).apply(obj);
                            Ne.b.a(objApply, "The mapper function returned a null value.");
                            aVar.b(objApply);
                            break;
                        } catch (Throwable th) {
                            a(th);
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r1.d(r4) != false) goto L23;
     */
    @Override // Oe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f10765f
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.f16231d
            if (r0 == 0) goto Lb
            r4 = 0
            goto L24
        Lb:
            java.lang.Object r0 = r3.f10766g     // Catch: java.lang.Throwable -> L1f
            Y9.c r0 = (Y9.c) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "The mapper function returned a null value."
            Ne.b.a(r4, r0)     // Catch: java.lang.Throwable -> L1f
            Oe.a r0 = r3.f16228a
            boolean r4 = r0.d(r4)
            goto L24
        L1f:
            r4 = move-exception
            r3.a(r4)
            r4 = 1
        L24:
            return r4
        L25:
            boolean r0 = r3.f16231d
            if (r0 == 0) goto L2a
            goto L49
        L2a:
            int r0 = r3.f16232e
            Oe.a r1 = r3.f16228a
            if (r0 == 0) goto L36
            r4 = 0
            boolean r4 = r1.d(r4)
            goto L50
        L36:
            r0 = 1
            java.lang.Object r2 = r3.f10766g     // Catch: java.lang.Throwable -> L4b
            Le.d r2 = (Le.d) r2     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r2.test(r4)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L49
            boolean r4 = r1.d(r4)
            if (r4 == 0) goto L49
        L47:
            r4 = r0
            goto L50
        L49:
            r4 = 0
            goto L50
        L4b:
            r4 = move-exception
            r3.a(r4)
            goto L47
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Re.v.d(java.lang.Object):boolean");
    }

    @Override // Oe.h
    public final Object poll() {
        switch (this.f10765f) {
            case 0:
                Oe.e eVar = this.f16230c;
                while (true) {
                    Object objPoll = eVar.poll();
                    if (objPoll == null) {
                        return null;
                    }
                    if (((Le.d) this.f10766g).test(objPoll)) {
                        return objPoll;
                    }
                    if (this.f16232e == 2) {
                        eVar.request(1L);
                    }
                }
            default:
                Object objPoll2 = this.f16230c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((Y9.c) this.f10766g).apply(objPoll2);
                Ne.b.a(objApply, "The mapper function returned a null value.");
                return objApply;
        }
    }
}
