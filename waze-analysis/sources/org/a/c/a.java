package org.a.c;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import e.a.dw;
import kotlinx.b.c.t;
import org.a.d.k.b;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56367a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f56368b;

    static {
        CompositionLocalKt.compositionLocalOf$default(null, new t(1), 1, null);
        f56368b = CompositionLocalKt.compositionLocalOf$default(null, new t(2), 1, null);
    }

    public static final b a(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1872955113, 0, -1, "org.koin.compose.getKoinScope (KoinApplication.kt:80)");
        }
        composer.startReplaceGroup(318568233);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            try {
                objRememberedValue = (b) composer.consume(f56368b);
            } catch (org.a.c.a.a unused) {
                b().n().d("[Warning] - No Compose Koin context setup, taking default. Use KoinContext(), KoinAndroidContext() or KoinApplication() function to setup or create Koin context and avoid such message.");
                objRememberedValue = b().a().c();
            }
            composer.updateRememberedValue(objRememberedValue);
        }
        b bVar = (b) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bVar;
    }

    private static final org.a.d.a b() {
        dw.e();
        return org.a.d.b.a.a();
    }
}
