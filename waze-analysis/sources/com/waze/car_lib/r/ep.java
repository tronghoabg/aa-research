package com.waze.car_lib.r;

import android.net.Uri;
import com.waze.R;
import com.waze.config.ConfigValues;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ep {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.dg f21564a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.p.bh f21565b;

    public ep(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21564a = new com.waze.car_lib.p.dg(aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_TITLE, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_TEXT, new Object[0]), null, false, new com.waze.car_lib.p.dc(aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_BUTTON, new Object[0]), true), null, 44);
        String strB = ConfigValues.CONFIG_VALUE_GDPR_PRIVACY_SETTINGS_LOCALIZED_TERMS_OF_USE_URL_PS.b();
        h.g.b.x.e(strB, "getValue(...)");
        String str = String.format(strB, Arrays.copyOf(new Object[]{aVar.a()}, 1));
        h.g.b.x.e(str, "format(...)");
        Uri uri = Uri.parse(str);
        h.g.b.x.e(uri, "parse(...)");
        this.f21565b = new com.waze.car_lib.p.bh(uri, aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_TITLE, new Object[0]), aVar.c(R.string.AAOS_ABOUT_SETTINGS_TERMS_OF_USE_QR_TEXT, new Object[0]));
    }

    public final com.waze.car_lib.p.bh a() {
        return this.f21565b;
    }

    public final com.waze.car_lib.p.dg b() {
        return this.f21564a;
    }
}
