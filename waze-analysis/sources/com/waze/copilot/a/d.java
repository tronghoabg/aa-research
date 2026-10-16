package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f22821a;

    d(g gVar) {
        this.f22821a = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (kotlinx.coroutines.aj.d(new com.waze.copilot.a.f(r8, r9, null), r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.waze.sharedui.profile.UserProfile r9, h.c.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.waze.copilot.a.c
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.copilot.a.c r0 = (com.waze.copilot.a.c) r0
            int r1 = r0.f22819c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22819c = r1
            goto L18
        L13:
            com.waze.copilot.a.c r0 = new com.waze.copilot.a.c
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f22817a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22819c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r10)
            goto L83
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            com.waze.sharedui.profile.UserProfile r9 = r0.f22820d
            r2 = r9
            com.waze.sharedui.profile.UserProfile r2 = (com.waze.sharedui.profile.UserProfile) r2
            e.b.c.b(r10)
            goto L6a
        L3b:
            e.b.c.b(r10)
            com.waze.copilot.a.g r10 = r8.f22821a
            com.waze.shared_infra.i.e r10 = com.waze.copilot.a.g.d(r10)
            long r5 = r9.getUserId()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "profile changed to uid="
            r2.<init>(r7)
            r2.append(r5)
            java.lang.String r5 = ", refreshing copilot and recorded voice assets."
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r10.a(r2)
            r0.f22820d = r9
            r0.f22819c = r4
            java.lang.Object r10 = com.waze.config.a.a(r0)
            if (r10 == r1) goto L86
        L6a:
            com.waze.copilot.a.g r8 = r8.f22821a
            boolean r9 = r9.isValid()
            r10 = 0
            r0.f22820d = r10
            r0.f22819c = r3
            com.waze.copilot.a.f r2 = new com.waze.copilot.a.f
            r2.<init>(r8, r9, r10)
            h.g.a.p r2 = (h.g.a.p) r2
            java.lang.Object r8 = kotlinx.coroutines.aj.d(r2, r0)
            if (r8 != r1) goto L83
            goto L86
        L83:
            h.ab r8 = h.ab.f48028a
            return r8
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.d.emit(com.waze.sharedui.profile.UserProfile, h.c.e):java.lang.Object");
    }
}
