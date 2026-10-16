package com.google.android.gms.auth.api.identity.a;

import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.s;
import com.google.android.gms.auth.api.identity.u;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.api.q;
import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements bf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f4456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a.a f4457b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f4458c;

    public /* synthetic */ i(q qVar, com.google.android.gms.common.internal.a.a aVar, int i2) {
        this.f4458c = i2;
        this.f4456a = qVar;
        this.f4457b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    public final void a(Object obj, Object obj2) {
        int i2 = this.f4458c;
        if (i2 == 0) {
            b bVar = (b) obj;
            d dVar = new d((k) this.f4456a, (w) obj2, 3);
            e eVar = (e) bVar.y();
            u uVar = (u) this.f4457b;
            bVar.x();
            eVar.a(dVar, uVar, com.google.android.gms.identitycredentials.a.k.c());
            return;
        }
        if (i2 == 1) {
            a aVar = (a) obj;
            d dVar2 = new d((h) this.f4456a, (w) obj2, 1);
            c cVar = (c) aVar.y();
            AuthorizationRequest authorizationRequest = (AuthorizationRequest) this.f4457b;
            aVar.x();
            cVar.a(dVar2, authorizationRequest, com.google.android.gms.identitycredentials.a.k.c());
            return;
        }
        q qVar = this.f4456a;
        if (i2 != 2) {
            o oVar = (o) obj;
            d dVar3 = new d((n) qVar, (w) obj2, 2, null);
            f fVar = (f) oVar.y();
            s sVar = (s) this.f4457b;
            oVar.x();
            fVar.c(dVar3, sVar, com.google.android.gms.identitycredentials.a.k.c());
            return;
        }
        o oVar2 = (o) obj;
        d dVar4 = new d((n) qVar, (w) obj2, 0);
        f fVar2 = (f) oVar2.y();
        com.google.android.gms.auth.api.identity.m mVar = (com.google.android.gms.auth.api.identity.m) this.f4457b;
        oVar2.x();
        fVar2.b(dVar4, mVar, com.google.android.gms.identitycredentials.a.k.c());
    }
}
