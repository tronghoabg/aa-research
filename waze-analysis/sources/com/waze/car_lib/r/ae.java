package com.waze.car_lib.r;

import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.car_lib.f.jg;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final Object f20935a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f20936b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20937c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20938d;

    public ae(com.waze.shared_infra.o.a aVar, com.waze.car_lib.login.m mVar, jg jgVar, String str) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(mVar, "loginController");
        h.g.b.x.f(jgVar, "coordinatorController");
        h.g.b.x.f(str, "userName");
        this.f20935a = aVar;
        this.f20937c = mVar;
        this.f20938d = str;
        this.f20936b = new MutableLiveData(new com.waze.car_lib.p.p("Password", aVar.c(R.string.AAOS_USER_NAME_PASSWORD_LOGIN_TITLE, new Object[0]), 2, 0, (String) null, (String) null, (String) null, (com.waze.car_lib.p.co) null, 504));
    }

    public static final /* synthetic */ com.waze.car_lib.login.m d(ae aeVar) {
        return (com.waze.car_lib.login.m) aeVar.f20937c;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    public static final /* synthetic */ void e(ae aeVar) {
        ?? r3 = aeVar.f20935a;
        ((MutableLiveData) aeVar.f20936b).setValue(new com.waze.car_lib.p.q(r3.c(R.string.AAOS_USER_NAME_PASSWORD_LOGIN_TITLE, new Object[0]), r3.c(R.string.AAOS_LOADING_LOGIN_SCREEN_MESSAGE, new Object[0])));
    }

    public final LiveData a(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 11), 3);
        return (LiveData) this.f20936b;
    }

    public final void b(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_PASSWORD);
        ((com.waze.car_lib.login.m) this.f20937c).e((String) this.f20938d, str);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.waze.settings.f.b.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.waze.settings.eb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    public final bl c(com.waze.car_lib.f.cl clVar) {
        h.g.b.x.f(clVar, "controller");
        return new bl(this.f20935a, (DriveToNativeManager) this.f20936b, clVar, this.f20937c, this.f20938d);
    }

    public ae(com.waze.settings.f.b.b bVar, DriveToNativeManager driveToNativeManager, com.waze.settings.eb ebVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bVar, "hovSettingsStateHolder");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(ebVar, "settingsStatsSender");
        h.g.b.x.f(eVar, "logger");
        this.f20935a = bVar;
        this.f20936b = driveToNativeManager;
        this.f20937c = ebVar;
        this.f20938d = eVar;
    }
}
