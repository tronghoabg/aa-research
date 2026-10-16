package com.waze.ay;

import com.waze.ConfigManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.config.b;
import com.waze.config.d;
import com.waze.config.dj;
import com.waze.ni;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements com.waze.r.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f16127a;

    public a(com.waze.shared_infra.o.a aVar) {
        x.f(aVar, "stringsProvider");
        this.f16127a = aVar;
    }

    @Override // com.waze.r.a
    public final String a() {
        return this.f16127a.c(R.string.ND4C_CONSENT_MAIN_CANCEL_BUTTON, new Object[0]);
    }

    @Override // com.waze.r.a
    public final String b() {
        return this.f16127a.c(R.string.ND4C_CONSENT_CANCELLATION_POPUP_BODY, new Object[0]);
    }

    @Override // com.waze.r.a
    public final String c() {
        return this.f16127a.c(R.string.ND4C_CONSENT_CANCELLATION_POPUP_CANCEL_BUTTON, new Object[0]);
    }

    @Override // com.waze.r.a
    public final String d() {
        return this.f16127a.c(R.string.ND4C_CONSENT_CANCELLATION_POPUP_OK_BUTTON, new Object[0]);
    }

    @Override // com.waze.r.a
    public final String e() {
        return this.f16127a.c(R.string.ND4C_CONSENT_CANCELLATION_POPUP_TITLE, new Object[0]);
    }

    @Override // com.waze.r.a
    public final String f() {
        return this.f16127a.c(R.string.ND4C_CONSENT_MAIN_OK_BUTTON, new Object[0]);
    }

    @Override // com.waze.r.a
    public final String g() {
        String str;
        int i2 = dj.f22618a;
        dj djVarC = ni.c();
        d dVar = ConfigValues.CONFIG_VALUE_SIGNUP_ND4C_PHONE_NUMBER;
        x.e(dVar, "CONFIG_VALUE_SIGNUP_ND4C_PHONE_NUMBER");
        String strB = djVarC.b(dVar);
        if (strB.length() > 0) {
            str = String.format(this.f16127a.c(R.string.ND4C_CONSENT_PHONE_NUMBER_HTML_PS_PS, new Object[0]), Arrays.copyOf(new Object[]{strB, strB}, 2));
            x.e(str, "format(...)");
        } else {
            str = "";
        }
        return this.f16127a.c(R.string.ND4C_CONSENT_MAIN_HTML_PS, str);
    }

    @Override // com.waze.r.a
    public final void h() {
        ConfigManager.getInstance().setConfigValueString(ConfigValues.CONFIG_VALUE_ND4C_APPROVED_VER, "5.20.90.901");
    }

    @Override // com.waze.r.a
    public final boolean i() {
        int i2 = dj.f22618a;
        dj djVarC = ni.c();
        b bVar = ConfigValues.CONFIG_VALUE_SIGNUP_ND4C_ENABLED;
        x.e(bVar, "CONFIG_VALUE_SIGNUP_ND4C_ENABLED");
        return djVarC.c(bVar);
    }

    @Override // com.waze.r.a
    public final boolean j() {
        if (!i()) {
            return false;
        }
        int i2 = dj.f22618a;
        dj djVarC = ni.c();
        d dVar = ConfigValues.CONFIG_VALUE_ND4C_APPROVED_VER;
        x.e(dVar, "CONFIG_VALUE_ND4C_APPROVED_VER");
        return x.n(djVarC.b(dVar), "0");
    }
}
