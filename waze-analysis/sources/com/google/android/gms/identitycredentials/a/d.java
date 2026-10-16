package com.google.android.gms.identitycredentials.a;

import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements bf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a.a f5509a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f5510b;

    public /* synthetic */ d(com.google.android.gms.common.internal.a.a aVar, int i2) {
        this.f5510b = i2;
        this.f5509a = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    public final void a(Object obj, Object obj2) {
        int i2 = this.f5510b;
        if (i2 == 0) {
            c cVar = (c) obj;
            int i3 = j.f5515a;
            i iVar = new i((w) obj2);
            b bVar = (b) cVar.y();
            cVar.x();
            bVar.d(iVar, (com.google.android.gms.identitycredentials.w) this.f5509a, k.c());
            return;
        }
        if (i2 == 1) {
            c cVar2 = (c) obj;
            int i4 = j.f5515a;
            h hVar = new h((w) obj2);
            b bVar2 = (b) cVar2.y();
            cVar2.x();
            bVar2.c(hVar, (GetCredentialRequest) this.f5509a, k.c());
            return;
        }
        if (i2 != 2) {
            c cVar3 = (c) obj;
            int i5 = j.f5515a;
            f fVar = new f((w) obj2);
            b bVar3 = (b) cVar3.y();
            cVar3.x();
            bVar3.a(fVar, (com.google.android.gms.identitycredentials.b) this.f5509a, k.c());
            return;
        }
        c cVar4 = (c) obj;
        int i6 = j.f5515a;
        g gVar = new g((w) obj2);
        b bVar4 = (b) cVar4.y();
        cVar4.x();
        bVar4.b(gVar, (com.google.android.gms.identitycredentials.g) this.f5509a, k.c());
    }
}
