package com.waze.ui.r.a.e;

import android.content.Context;
import androidx.credentials.CredentialManager;
import com.waze.config.ConfigValues;
import com.waze.sharedui.h;
import com.waze.uid.d.q;
import h.ab;
import h.g.b.x;
import h.n.o;
import java.util.concurrent.TimeUnit;
import kotlinx.b.d.n;
import kotlinx.b.d.u;
import kotlinx.b.d.z;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f43365a;

    public /* synthetic */ c(int i2) {
        this.f43365a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f43365a) {
            case 0:
                int i2 = e.f43379a;
                return new d();
            case 1:
                return ConfigValues.CONFIG_VALUE_SIGNUP_ONBOARDING_SUMMARY_STAT_EXPERIMENT_GROUP.b();
            case 2:
                return Boolean.valueOf(o.Q(ConfigValues.CONFIG_VALUE_SIGNUP_ONBOARDING_EXPERIMENT_EMAIL_TRADEOFF.b(), "guest only"));
            case 3:
                return Boolean.valueOf(o.Q(ConfigValues.CONFIG_VALUE_SIGNUP_ONBOARDING_EXPERIMENT_EMAIL_TRADEOFF.b(), "google and guest"));
            case 4:
                return ConfigValues.CONFIG_VALUE_LOGIN_CHANGE_EMAIL_2FA_ENABLED.b();
            case 5:
                return ConfigValues.CONFIG_VALUE_LOGIN_WEB_CHANGE_EMAIL_2FA_URL.b();
            case 6:
                return ConfigValues.CONFIG_VALUE_SIGNUP_ONBOARDING_VISUAL_ALIGNMENT_ENABLED.b();
            case 7:
                return ConfigValues.CONFIG_VALUE_SIGNUP_AUTOMATIC_ACCOUNT_RECOVERY_ANDROID_ALLOWED.b();
            case 8:
                return ConfigValues.CONFIG_VALUE_SIGNUP_ALLOW_CREATE_FROM_ACCOUNT_NOT_FOUND.b();
            case 9:
                q.f44463a.a().f44467e.l();
                return ab.f48028a;
            case 10:
                return com.waze.shared_infra.i.a.d("AddIdAddHomeAndWorkState");
            case 11:
                return com.waze.shared_infra.i.a.d("AddIdChooseVehicleTypeState");
            case 12:
                CredentialManager.Companion companion = CredentialManager.Companion;
                Context contextA = h.k().a();
                x.e(contextA, "getApplicationContext(...)");
                return companion.create(contextA);
            case 13:
                return ab.f48028a;
            case 14:
                return ab.f48028a;
            case 15:
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return Long.valueOf(System.currentTimeMillis() / 1000);
            case 16:
                return null;
            case 17:
                n nVar = n.f51215a;
                return z.f51231a.getDescriptor();
            case 18:
                n nVar2 = n.f51215a;
                return u.f51223a.getDescriptor();
            case 19:
                n nVar3 = n.f51215a;
                return kotlinx.b.d.x.f51229a.getDescriptor();
            default:
                n nVar4 = n.f51215a;
                return kotlinx.b.d.e.f51203a.getDescriptor();
        }
    }
}
