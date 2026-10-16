package com.waze.uid.state_impl.email;

import com.waze.uid.UidModel;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class j implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f44652a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.e.f f44653b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44654c;

    j(m mVar, int i2, int i3) {
        this.f44654c = i3;
        this.f44652a = i2;
        Objects.requireNonNull(mVar);
        this.f44653b = mVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        int i2 = this.f44654c;
        int i3 = this.f44652a;
        if (i2 == 0) {
            if (i3 != com.waze.uid.e.f.i()) {
                return;
            }
            com.waze.uid.e.f fVar = this.f44653b;
            ((k) fVar).f44485c.w(new com.waze.uid.b.d(bVar));
            fVar.j();
            return;
        }
        if (i3 != com.waze.uid.e.f.i()) {
            return;
        }
        com.waze.uid.e.f fVar2 = this.f44653b;
        m mVar = (m) fVar2;
        mVar.f44485c.k(mVar.f44485c.a().b(com.waze.uid.b.n.a(false)));
        mVar.f44485c.w(new com.waze.uid.b.d(bVar));
        fVar2.j();
    }

    @Override // com.waze.sharedui.api.b
    public final /* synthetic */ void b(Object obj) {
        if (this.f44654c == 0) {
            if (this.f44652a != com.waze.uid.e.f.i()) {
                return;
            }
            ((k) this.f44653b).k();
            return;
        }
        com.waze.sharedui.api.j jVar = (com.waze.sharedui.api.j) obj;
        m mVar = (m) this.f44653b;
        mVar.f44485c.k(mVar.f44485c.a().b(com.waze.uid.b.n.a(false)));
        if (this.f44652a != com.waze.uid.e.f.i()) {
            return;
        }
        if (jVar.a() == null) {
            mVar.a(new k(mVar.f44486d, mVar.f44484b, mVar.f44485c));
        } else {
            ((UidModel) mVar.f44485c.b()).getEmailParameters().setExistingProfile(jVar.a());
            mVar.a(new g(mVar.f44486d, mVar.f44484b, mVar.f44485c));
        }
    }

    j(k kVar, int i2, int i3) {
        this.f44654c = i3;
        this.f44652a = i2;
        Objects.requireNonNull(kVar);
        this.f44653b = kVar;
    }
}
