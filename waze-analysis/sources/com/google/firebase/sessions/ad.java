package com.google.firebase.sessions;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.l f10789a;

    public ad(kotlinx.coroutines.b.l lVar) {
        this.f10789a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.ac
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.ac r0 = (com.google.firebase.sessions.ac) r0
            int r1 = r0.f10787b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10787b = r1
            goto L18
        L13:
            com.google.firebase.sessions.ac r0 = new com.google.firebase.sessions.ac
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f10786a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f10787b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L53
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.b.l r4 = r4.f10789a
            r6 = r0
            h.c.e r6 = (h.c.e) r6
            androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
            com.google.firebase.sessions.o r6 = new com.google.firebase.sessions.o
            int r2 = com.google.firebase.sessions.aa.f10781a
            androidx.datastore.preferences.core.Preferences$Key r2 = com.google.firebase.sessions.aa.a()
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            r6.<init>(r5)
            r0.f10787b = r3
            java.lang.Object r4 = r4.emit(r6, r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.ad.emit(java.lang.Object, h.c.e):java.lang.Object");
    }
}
