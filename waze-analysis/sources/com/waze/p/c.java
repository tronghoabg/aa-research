package com.waze.p;

import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import h.g.b.x;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f32937a;

    public c(NativeManager nativeManager) {
        x.f(nativeManager, "nativeManager");
        this.f32937a = nativeManager;
    }

    @Override // com.waze.p.a
    public final Locale a() {
        Locale locale = this.f32937a.getLocale();
        x.e(locale, "<get-locale>(...)");
        return locale;
    }

    @Override // com.waze.p.a
    public final boolean b() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_VENUES_RTL_ADDRESSES.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
