package com.waze.p;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import h.g.b.x;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements com.waze.ui.r.a.c.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f32935a;

    /* renamed from: b, reason: collision with root package name */
    private final a f32936b;

    public b(com.waze.shared_infra.o.a aVar, a aVar2) {
        x.f(aVar, "stringProvider");
        x.f(aVar2, "config");
        this.f32935a = aVar;
        this.f32936b = aVar2;
    }

    @Override // com.waze.ui.r.a.c.b
    public final String a(int i2, Composer composer, int i3) {
        composer.startReplaceGroup(1704315337);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1704315337, i3, -1, "com.waze.compose.DriverComposeWazeStrings.getString (DriverComposeWazeStrings.kt:27)");
        }
        String strC = this.f32935a.c(i2, new Object[0]);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strC;
    }

    @Override // com.waze.ui.r.a.c.b
    public final String b(String str, Composer composer, int i2) {
        x.f(str, "text");
        composer.startReplaceGroup(728849257);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(728849257, i2, -1, "com.waze.compose.DriverComposeWazeStrings.getString (DriverComposeWazeStrings.kt:39)");
        }
        String strB = this.f32935a.b(str);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strB;
    }

    @Override // com.waze.ui.r.a.c.b
    public final boolean c(Composer composer) {
        composer.startReplaceGroup(172280428);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(172280428, 0, -1, "com.waze.compose.DriverComposeWazeStrings.getIsRtlLanguage (DriverComposeWazeStrings.kt:15)");
        }
        boolean zB = this.f32936b.b();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return zB;
    }

    @Override // com.waze.ui.r.a.c.b
    public final Locale d(Composer composer) {
        composer.startReplaceGroup(616013222);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(616013222, 0, -1, "com.waze.compose.DriverComposeWazeStrings.getLocale (DriverComposeWazeStrings.kt:21)");
        }
        Locale localeA = this.f32936b.a();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return localeA;
    }

    @Override // com.waze.ui.r.a.c.b
    public final String e(int i2, Object[] objArr, Composer composer) {
        x.f(objArr, "args");
        composer.startReplaceGroup(811315670);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(811315670, 0, -1, "com.waze.compose.DriverComposeWazeStrings.getString (DriverComposeWazeStrings.kt:33)");
        }
        String strC = this.f32935a.c(i2, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strC;
    }
}
