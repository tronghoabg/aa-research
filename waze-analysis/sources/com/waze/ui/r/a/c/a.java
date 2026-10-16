package com.waze.ui.r.a.c;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import h.g.b.x;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements b {
    @Override // com.waze.ui.r.a.c.b
    public final String a(int i2, Composer composer, int i3) {
        composer.startReplaceGroup(1650015419);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1650015419, i3, -1, "com.waze.ui.mobile.infra.strings.DefaultAndroidWazeStrings.getString (DefaultAndroidWazeStrings.kt:18)");
        }
        String strStringResource = StringResources_androidKt.stringResource(i2, composer, i3 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    @Override // com.waze.ui.r.a.c.b
    public final String b(String str, Composer composer, int i2) {
        x.f(str, "text");
        composer.startReplaceGroup(-1823496613);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1823496613, i2, -1, "com.waze.ui.mobile.infra.strings.DefaultAndroidWazeStrings.getString (DefaultAndroidWazeStrings.kt:28)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    @Override // com.waze.ui.r.a.c.b
    public final boolean c(Composer composer) {
        composer.startReplaceGroup(-859538786);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-859538786, 0, -1, "com.waze.ui.mobile.infra.strings.DefaultAndroidWazeStrings.getIsRtlLanguage (DefaultAndroidWazeStrings.kt:8)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return false;
    }

    @Override // com.waze.ui.r.a.c.b
    public final Locale d(Composer composer) {
        composer.startReplaceGroup(-169692328);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-169692328, 0, -1, "com.waze.ui.mobile.infra.strings.DefaultAndroidWazeStrings.getLocale (DefaultAndroidWazeStrings.kt:12)");
        }
        Locale locale = Locale.getDefault();
        x.e(locale, "getDefault(...)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return locale;
    }

    @Override // com.waze.ui.r.a.c.b
    public final String e(int i2, Object[] objArr, Composer composer) throws Resources.NotFoundException {
        x.f(objArr, "args");
        composer.startReplaceGroup(-1071899768);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1071899768, 0, -1, "com.waze.ui.mobile.infra.strings.DefaultAndroidWazeStrings.getString (DefaultAndroidWazeStrings.kt:24)");
        }
        String strStringResource = StringResources_androidKt.stringResource(i2, Arrays.copyOf(objArr, objArr.length), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }
}
