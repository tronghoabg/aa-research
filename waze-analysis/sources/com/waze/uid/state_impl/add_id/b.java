package com.waze.uid.state_impl.add_id;

import com.waze.sharedui.profile.ProfileBasicInfo;
import com.waze.uid.UidModel;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f44579a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.e.f f44580b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44581c;

    b(j jVar, int i2, int i3) {
        this.f44581c = i3;
        this.f44579a = i2;
        Objects.requireNonNull(jVar);
        this.f44580b = jVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        int i2 = this.f44581c;
        if (i2 == 0) {
            if (this.f44579a != com.waze.uid.e.f.i()) {
                return;
            }
            com.waze.uid.e.f fVar = this.f44580b;
            c cVar = (c) fVar;
            j.u(cVar.f44485c, false);
            cVar.f44485c.w(new com.waze.uid.b.d(bVar));
            fVar.j();
            return;
        }
        int i3 = this.f44579a;
        if (i2 == 1) {
            if (i3 != com.waze.uid.e.f.i()) {
                return;
            }
            com.waze.uid.e.f fVar2 = this.f44580b;
            ((j) fVar2).f44485c.w(new com.waze.uid.b.d(bVar));
            fVar2.j();
            return;
        }
        if (i3 != com.waze.uid.e.f.i()) {
            return;
        }
        com.waze.uid.e.f fVar3 = this.f44580b;
        e eVar = (e) fVar3;
        j.u(eVar.f44485c, false);
        eVar.f44485c.w(new com.waze.uid.b.d(bVar));
        fVar3.j();
    }

    @Override // com.waze.sharedui.api.b
    public final /* synthetic */ void b(Object obj) {
        int i2 = this.f44581c;
        if (i2 == 0) {
            if (this.f44579a != com.waze.uid.e.f.i()) {
                return;
            }
            c cVar = (c) this.f44580b;
            j.u(cVar.f44485c, false);
            cVar.k();
            return;
        }
        if (i2 != 1) {
            if (this.f44579a != com.waze.uid.e.f.i()) {
                return;
            }
            e eVar = (e) this.f44580b;
            j.u(eVar.f44485c, false);
            eVar.k();
            return;
        }
        com.waze.sharedui.api.j jVar = (com.waze.sharedui.api.j) obj;
        if (this.f44579a != com.waze.uid.e.f.i()) {
            return;
        }
        if (jVar.a() == null) {
            j jVar2 = (j) this.f44580b;
            jVar2.a(new c(jVar2.f44486d, jVar2.f44484b, jVar2.f44485c));
            return;
        }
        String email = jVar.a().getBasicInfo().getEmail();
        ProfileBasicInfo basicInfo = com.waze.sharedui.profile.b.c().getBasicInfo();
        if (basicInfo.getEmailVerified() && email != null && email.equals(basicInfo.getEmail())) {
            ((j) this.f44580b).k();
            return;
        }
        j jVar3 = (j) this.f44580b;
        ((UidModel) jVar3.f44485c.b()).getEmailParameters().setExistingProfile(jVar.a());
        jVar3.a(new a(jVar3.f44486d, jVar3.f44484b, jVar3.f44485c, jVar3.f44585f));
    }

    b(c cVar, int i2, int i3) {
        this.f44581c = i3;
        this.f44579a = i2;
        Objects.requireNonNull(cVar);
        this.f44580b = cVar;
    }

    b(e eVar, int i2, int i3) {
        this.f44581c = i3;
        this.f44579a = i2;
        Objects.requireNonNull(eVar);
        this.f44580b = eVar;
    }
}
