package com.waze.car_lib.r;

import android.net.Uri;
import com.waze.R;
import com.waze.config.ConfigValues;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cn implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.dg f21224a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.p.bh f21225b;

    public cn(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21224a = new com.waze.car_lib.p.dg(aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_TITLE, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_TEXT, new Object[0]), null, false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_BUTTON, new Object[0]), true), null, 44);
        String strB = ConfigValues.CONFIG_VALUE_GDPR_PRIVACY_SETTINGS_LOCALIZED_PRIVACY_POLICY_URL_PS.b();
        h.g.b.x.e(strB, "getValue(...)");
        String str = String.format(strB, Arrays.copyOf(new Object[]{aVar.a()}, 1));
        h.g.b.x.e(str, "format(...)");
        Uri uri = Uri.parse(str);
        h.g.b.x.e(uri, "parse(...)");
        this.f21225b = new com.waze.car_lib.p.bh(uri, aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_TITLE, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_PRIVACY_POLICY_QR_TEXT, new Object[0]));
    }

    public final com.waze.car_lib.p.bh a() {
        return this.f21225b;
    }

    public final com.waze.car_lib.p.dg b() {
        return this.f21224a;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
