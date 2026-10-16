package com.waze.car_lib.n;

import com.waze.hr;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f20408a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f20409b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f20410c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f20411d;

    public j(com.waze.shared_infra.o.a aVar, com.waze.car_lib.q.g gVar, com.waze.config.b bVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(gVar, "carHardwareManagerUtils");
        h.g.b.x.f(bVar, "configValueHideGasCategoryEnabled");
        this.f20408a = aVar;
        this.f20409b = h.g.b(h.h.f48130a, new f(this));
        i iVar = new i(e().a(), this);
        this.f20410c = iVar;
        this.f20411d = kotlinx.coroutines.b.ai.r(com.waze.n.ac.p(bVar), iVar, gVar.d(), new e(null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.car_lib.n.d a(com.waze.car_lib.n.j r3, com.waze.li r4) {
        /*
            java.lang.String r0 = r4.a()
            int r1 = r0.hashCode()
            r2 = 0
            switch(r1) {
                case -1355030580: goto L9c;
                case -968051567: goto L8a;
                case -793201736: goto L79;
                case -344460952: goto L67;
                case 3148894: goto L56;
                case 577688908: goto L45;
                case 772885966: goto L33;
                case 1825048934: goto L21;
                case 1919954658: goto Lf;
                default: goto Lc;
            }
        Lc:
            r0 = r2
            goto Lad
        Lf:
            java.lang.String r1 = "crisis_locations"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto Lc
        L18:
            r0 = 2131232054(0x7f080536, float:1.8080206E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lad
        L21:
            java.lang.String r1 = "charging_station"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            goto Lc
        L2a:
            r0 = 2131232051(0x7f080533, float:1.80802E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lad
        L33:
            java.lang.String r1 = "gas_station"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto Lc
        L3c:
            r0 = 2131232056(0x7f080538, float:1.808021E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lad
        L45:
            java.lang.String r1 = "drive_thru"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto Lc
        L4e:
            r0 = 2131231172(0x7f0801c4, float:1.8078418E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lad
        L56:
            java.lang.String r1 = "food"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f
            goto Lc
        L5f:
            r0 = 2131231173(0x7f0801c5, float:1.807842E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lad
        L67:
            java.lang.String r1 = "shopping"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L71
            goto Lc
        L71:
            r0 = 2131232078(0x7f08054e, float:1.8080255E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lad
        L79:
            java.lang.String r1 = "parking"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L82
            goto Lc
        L82:
            r0 = 2131232071(0x7f080547, float:1.808024E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lad
        L8a:
            java.lang.String r1 = "pharmacies"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L94
            goto Lc
        L94:
            r0 = 2131232073(0x7f080549, float:1.8080245E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto Lad
        L9c:
            java.lang.String r1 = "coffee"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La6
            goto Lc
        La6:
            r0 = 2131232053(0x7f080535, float:1.8080204E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        Lad:
            if (r0 == 0) goto Lc7
            com.waze.shared_infra.o.a r3 = r3.f20408a
            int r0 = r0.intValue()
            java.lang.String r1 = r4.b()
            java.lang.String r3 = r3.b(r1)
            com.waze.car_lib.n.d r1 = new com.waze.car_lib.n.d
            java.lang.String r4 = r4.a()
            r1.<init>(r4, r3, r0)
            return r1
        Lc7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.n.j.a(com.waze.car_lib.n.j, com.waze.li):com.waze.car_lib.n.d");
    }

    private final com.waze.ar e() {
        return (com.waze.ar) this.f20409b.getValue();
    }

    public final Object b(String str, h.c.e eVar) {
        Object objA;
        final CompletableDeferred completableDeferredJ = bo.j();
        try {
            e().b(str, new hr() { // from class: com.waze.car_lib.n.c
                @Override // com.waze.hr
                public final void a(String str2) {
                    completableDeferredJ.a(str2);
                }
            });
            objA = h.ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (h.m.c(objA) != null) {
            completableDeferredJ.a(str);
        }
        return completableDeferredJ.c(eVar);
    }

    public final kotlinx.coroutines.b.k c() {
        return this.f20410c;
    }

    public final kotlinx.coroutines.b.k d() {
        return this.f20411d;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
