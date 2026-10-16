package com.waze.nav_connect.b;

import androidx.compose.ui.graphics.ImageBitmap;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class v extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30831a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f30832b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f30833c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ w f30834d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(w wVar, h.c.e eVar) {
        super(4, eVar);
        this.f30834d = wVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        v vVar = new v(this.f30834d, (h.c.e) obj4);
        vVar.f30831a = (com.waze.map.isolated.k) obj;
        vVar.f30832b = zBooleanValue;
        vVar.f30833c = (ImageBitmap) obj3;
        return vVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            e.b.c.b(r9)
            java.lang.Object r9 = r8.f30831a
            r3 = r9
            com.waze.map.isolated.k r3 = (com.waze.map.isolated.k) r3
            boolean r6 = r8.f30832b
            java.lang.Object r8 = r8.f30833c
            androidx.compose.ui.graphics.ImageBitmap r8 = (androidx.compose.ui.graphics.ImageBitmap) r8
            boolean r9 = r3.c()
            r0 = 0
            java.lang.String r1 = ""
            if (r9 == 0) goto L2e
            boolean r2 = r3 instanceof com.waze.nav_connect.a.b
            if (r2 == 0) goto L21
            r2 = r3
            com.waze.nav_connect.a.b r2 = (com.waze.nav_connect.a.b) r2
            goto L22
        L21:
            r2 = r0
        L22:
            if (r2 == 0) goto L2e
            com.waze.nav_connect.a.e r2 = r2.a()
            java.lang.String r2 = r2.e()
            if (r2 != 0) goto L2f
        L2e:
            r2 = r1
        L2f:
            r1 = 1
            if (r1 == r9) goto L34
            r1 = r0
            goto L35
        L34:
            r1 = r8
        L35:
            com.waze.nav_connect.b.h r0 = new com.waze.nav_connect.b.h
            h.o.c r8 = h.o.a.f48264a
            com.waze.config.c r8 = com.waze.config.ConfigValues.CONFIG_VALUE_NAV_CONNECT_BUTTON_EXPANSION_DURATION_SECONDS
            java.lang.Long r8 = r8.b()
            java.lang.String r9 = "getValue(...)"
            h.g.b.x.e(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            h.o.d r4 = h.o.d.f48273d
            long r4 = h.o.c.j(r8, r4)
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.nav_connect.b.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
