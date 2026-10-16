package com.moloco.sdk.internal.services.bidtoken.providers;

import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.v f29501a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f29502b;

    /* renamed from: c, reason: collision with root package name */
    public m f29503c;

    public n(com.moloco.sdk.internal.services.v deviceInfoService, com.moloco.sdk.internal.services.i screenInfoService) {
        AbstractC3340k.e(deviceInfoService, "deviceInfoService");
        AbstractC3340k.e(screenInfoService, "screenInfoService");
        this.f29501a = deviceInfoService;
        this.f29502b = screenInfoService;
        this.f29503c = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29503c = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        m mVarD = d();
        boolean z2 = !mVarD.equals(this.f29503c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP needsRefresh: " + z2 + ", with current: " + mVarD + ", cached: " + this.f29503c, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "DSignalProvider";
    }

    public final m d() {
        com.moloco.sdk.internal.services.v vVar = this.f29501a;
        try {
            int i5 = this.f29502b.f29625a.getResources().getConfiguration().orientation;
            com.moloco.sdk.internal.services.j jVar = i5 != 1 ? i5 != 2 ? com.moloco.sdk.internal.services.j.f29703a : com.moloco.sdk.internal.services.j.f29705c : com.moloco.sdk.internal.services.j.f29704b;
            vVar.getClass();
            String language = Locale.getDefault().getLanguage();
            AbstractC3340k.d(language, "getLanguage(...)");
            Object systemService = vVar.f29732a.getSystemService("input_method");
            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodSubtype currentInputMethodSubtype = ((InputMethodManager) systemService).getCurrentInputMethodSubtype();
            return new m(jVar, language, currentInputMethodSubtype != null ? currentInputMethodSubtype.getLocale() : null);
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "DSignalProvider", "[CBT] DSP Error", e7, false, 8, null);
            return new m(null, null, null);
        }
    }
}
