package com.waze.bh.a;

import com.waze.app_nav.w;
import com.waze.shared_infra.f.b;
import com.waze.shared_infra.i.e;
import h.g.b.x;
import org.a.b.b.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements b, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final w f16752a;

    /* renamed from: b, reason: collision with root package name */
    private final e f16753b;

    public a(w wVar, e eVar) {
        x.f(wVar, "mainScreenFlowController");
        x.f(eVar, "logger");
        this.f16752a = wVar;
        this.f16753b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @Override // com.waze.shared_infra.f.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.waze.shared_infra.f.a r3) {
        /*
            r2 = this;
            java.lang.String r0 = "deeplink"
            h.g.b.x.f(r3, r0)
            java.lang.String r0 = r3.a()
            java.lang.String r1 = "login_with_qr"
            boolean r0 = h.g.b.x.n(r0, r1)
            if (r0 != 0) goto L13
            r2 = 0
            return r2
        L13:
            java.lang.String r0 = "token"
            java.lang.String r3 = r3.b(r0)
            r0 = 1
            if (r3 == 0) goto L3e
            r1 = r3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = h.n.o.G(r1)
            if (r0 == r1) goto L27
            r1 = r3
            goto L28
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L3e
            com.waze.app_nav.w r2 = r2.f16752a
            com.waze.bh.d r1 = com.waze.bh.d.f16791a
            com.waze.bh.b r1 = new com.waze.bh.b
            r1.<init>()
            r1.b(r3)
            com.waze.app_nav.p r3 = r1.a()
            com.waze.alerters.a.k.d(r2, r3)
            goto L4f
        L3e:
            com.waze.shared_infra.i.e r2 = r2.f16753b
            java.lang.String r1 = "invalid token "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r1.concat(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.g(r3)
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bh.a.a.a(com.waze.shared_infra.f.a):boolean");
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return d.e();
    }
}
