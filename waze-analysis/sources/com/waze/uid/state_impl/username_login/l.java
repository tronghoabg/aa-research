package com.waze.uid.state_impl.username_login;

import com.waze.R;
import com.waze.sharedui.profile.UserProfile;
import com.waze.uid.UidModel;
import com.waze.uid.b.v;
import com.waze.uid.c.ba;
import com.waze.uid.c.bb;
import com.waze.uid.c.bm;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements com.waze.sharedui.api.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f44710a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.e.f f44711b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f44712c;

    l(int i2, com.waze.uid.e.f fVar, int i3) {
        this.f44712c = i3;
        this.f44710a = i2;
        this.f44711b = fVar;
    }

    @Override // com.waze.sharedui.api.b
    public final void a(com.waze.sharedui.b bVar) {
        int i2 = this.f44712c;
        int i3 = this.f44710a;
        if (i2 != 0) {
            if (i3 != com.waze.uid.e.f.i()) {
                return;
            }
            com.waze.uid.e.f fVar = this.f44711b;
            ((g) fVar).f44485c.w(new v(R.string.NO_CONNECTION_ERROR, R.drawable.toast_error, null));
            fVar.j();
            return;
        }
        if (i3 == com.waze.uid.e.f.i()) {
            m mVar = (m) this.f44711b;
            mVar.f44485c.k(mVar.f44485c.a().e(new bb(bm.n, null)));
            mVar.f44485c.w(new v(R.string.NO_CONNECTION_ERROR, R.drawable.toast_error, null));
        }
    }

    @Override // com.waze.sharedui.api.b
    public final /* synthetic */ void b(Object obj) {
        if (this.f44712c != 0) {
            com.waze.sharedui.api.j jVar = (com.waze.sharedui.api.j) obj;
            x.f(jVar, "value");
            if (this.f44710a != com.waze.uid.e.f.i()) {
                return;
            }
            g gVar = (g) this.f44711b;
            ((UidModel) gVar.f44485c.b()).getLoginParameters().setExistingProfile(jVar.a());
            gVar.k();
            return;
        }
        com.waze.sharedui.api.g gVar2 = (com.waze.sharedui.api.g) obj;
        x.f(gVar2, "value");
        if (this.f44710a == com.waze.uid.e.f.i()) {
            UserProfile userProfileA = gVar2.a();
            com.waze.uid.e.f fVar = this.f44711b;
            if (userProfileA != null) {
                ((m) fVar).k();
                return;
            }
            m mVar = (m) fVar;
            mVar.f44485c.k(mVar.f44485c.a().e(new bb(bm.n, null)));
            mVar.f44485c.w(new ba(R.string.LOGIN_PASSWORD_WRONG_MSG));
        }
    }
}
