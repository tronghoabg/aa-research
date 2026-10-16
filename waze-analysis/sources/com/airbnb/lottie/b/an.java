package com.airbnb.lottie.b;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1992a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.coroutines.ab f1993b = av.b();

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object b(android.content.Context r13, com.airbnb.lottie.b.ad r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, h.c.e r19) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.b.an.b(android.content.Context, com.airbnb.lottie.b.ad, java.lang.String, java.lang.String, java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ String c(String str) {
        String str2 = str;
        if (str2 == null || h.n.o.G(str2)) {
            return null;
        }
        return !h.n.o.R(str2, '/') ? String.valueOf(str).concat(DomExceptionUtils.SEPARATOR) : str;
    }

    public static final w d(ad adVar, Composer composer) {
        ad adVar2;
        h.g.b.x.f(adVar, "spec");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (h.g.a.q) new al(null);
            composer.updateRememberedValue(objRememberedValue);
        }
        h.g.a.q qVar = (h.g.a.q) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1248473602, 0, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:89)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = composer.changed(adVar);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new w(), null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        boolean zChanged2 = composer.changed(adVar) | composer.changed("__LottieInternalDefaultCacheKey__");
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(e(context, adVar, "__LottieInternalDefaultCacheKey__", true));
        }
        boolean zChanged3 = composer.changed(mutableState) | composer.changedInstance(qVar) | composer.changedInstance(context) | composer.changedInstance(adVar) | composer.changed((Object) null) | composer.changed("fonts/") | composer.changed(".ttf") | composer.changed("__LottieInternalDefaultCacheKey__");
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            adVar2 = adVar;
            objRememberedValue4 = (h.g.a.p) new am(qVar, context, adVar2, mutableState, null);
            composer.updateRememberedValue(objRememberedValue4);
        } else {
            adVar2 = adVar;
        }
        EffectsKt.LaunchedEffect(adVar2, "__LottieInternalDefaultCacheKey__", (h.g.a.p) objRememberedValue4, composer, 0);
        w wVarF = f(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return wVarF;
    }

    private static final com.airbnb.lottie.ab e(Context context, ad adVar, String str, boolean z) {
        if (adVar instanceof ab) {
            return h.g.b.x.n(str, "__LottieInternalDefaultCacheKey__") ? com.airbnb.lottie.m.h(context, ((ab) adVar).a()) : com.airbnb.lottie.m.i(context, ((ab) adVar).a(), str);
        }
        if (adVar instanceof ac) {
            if (h.g.b.x.n(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            throw null;
        }
        if (adVar instanceof z) {
            if (z) {
                return null;
            }
            throw null;
        }
        if (adVar instanceof x) {
            if (h.g.b.x.n(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            throw null;
        }
        if (adVar instanceof aa) {
            if (h.g.b.x.n(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((aa) adVar).a().hashCode());
            }
            ((aa) adVar).a();
            return com.airbnb.lottie.m.m(str);
        }
        if (!(adVar instanceof y)) {
            throw new h.i();
        }
        context.getContentResolver();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final w f(MutableState mutableState) {
        return (w) mutableState.getValue();
    }
}
