package com.airbnb.lottie.b;

import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f2000a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f2001b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ br f2002c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f2003d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f2004e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ k f2005f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(t tVar, br brVar, int i2, int i3, k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f2001b = tVar;
        this.f2002c = brVar;
        this.f2003d = i2;
        this.f2004e = i3;
        this.f2005f = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f2001b, this.f2002c, this.f2003d, this.f2004e, this.f2005f, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r4.f2000a
            if (r1 == 0) goto La
            e.b.c.b(r5)
            goto L4a
        La:
            e.b.c.b(r5)
        Ld:
            com.airbnb.lottie.b.t r5 = com.airbnb.lottie.b.t.f2074a
            com.airbnb.lottie.b.t r5 = r4.f2001b
            int r5 = r5.ordinal()
            r1 = 1
            if (r5 == r1) goto L1b
            int r5 = r4.f2003d
            goto L28
        L1b:
            kotlinx.coroutines.br r5 = r4.f2002c
            boolean r5 = r5.bZ()
            if (r5 == 0) goto L26
            int r5 = r4.f2003d
            goto L28
        L26:
            int r5 = r4.f2004e
        L28:
            com.airbnb.lottie.b.k r2 = r4.f2005f
            r3 = r4
            h.c.e r3 = (h.c.e) r3
            r4.f2000a = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 != r1) goto L3e
            com.airbnb.lottie.b.c r5 = new com.airbnb.lottie.b.c
            r5.<init>()
            java.lang.Object r5 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r5, r3)
            goto L47
        L3e:
            com.airbnb.lottie.b.d r1 = new com.airbnb.lottie.b.d
            r1.<init>()
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r1, r3)
        L47:
            if (r5 != r0) goto L4a
            return r0
        L4a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L53
            goto Ld
        L53:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
