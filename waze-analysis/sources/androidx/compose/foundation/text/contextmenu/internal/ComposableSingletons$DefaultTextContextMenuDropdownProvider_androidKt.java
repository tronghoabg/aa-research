package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.s;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt {
    public static final ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt INSTANCE = new ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt();
    private static s<TextContextMenuSession, TextContextMenuDataProvider, a<? extends LayoutCoordinates>, Composer, Integer, ab> lambda$129995601 = ComposableLambdaKt.composableLambdaInstance(129995601, false, new s() { // from class: androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.s
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_129995601$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (a) obj3, (Composer) obj4, ((Integer) obj5).intValue());
        }
    });
    private static s<TextContextMenuSession, TextContextMenuDataProvider, a<? extends LayoutCoordinates>, Composer, Integer, ab> lambda$636288403 = ComposableLambdaKt.composableLambdaInstance(636288403, false, new s() { // from class: androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda1
        @Override // h.g.a.s
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_636288403$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (a) obj3, (Composer) obj4, ((Integer) obj5).intValue());
        }
    });

    /* renamed from: lambda$-1357803046, reason: not valid java name */
    private static s<TextContextMenuSession, TextContextMenuDataProvider, a<? extends LayoutCoordinates>, Composer, Integer, ab> f5lambda$1357803046 = ComposableLambdaKt.composableLambdaInstance(-1357803046, false, new s() { // from class: androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt$$ExternalSyntheticLambda2
        @Override // h.g.a.s
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda__1357803046$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (a) obj3, (Composer) obj4, ((Integer) obj5).intValue());
        }
    });

    static final ab lambda_129995601$lambda$0(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, a aVar, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composer.changedInstance(aVar) ? 128 : 256;
        }
        if (composer.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(129995601, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$129995601.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:74)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, aVar, composer, i3 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda_636288403$lambda$0(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, a aVar, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composer.changedInstance(aVar) ? 128 : 256;
        }
        if (composer.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(636288403, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$636288403.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:89)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, aVar, composer, i3 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda__1357803046$lambda$0(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, a aVar, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composer.changed(textContextMenuSession) : composer.changedInstance(textContextMenuSession)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composer.changed(textContextMenuDataProvider) : composer.changedInstance(textContextMenuDataProvider)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composer.changedInstance(aVar) ? 128 : 256;
        }
        if (composer.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357803046, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$-1357803046.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:98)");
            }
            DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, aVar, composer, i3 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-1357803046$foundation, reason: not valid java name */
    public final s<TextContextMenuSession, TextContextMenuDataProvider, a<? extends LayoutCoordinates>, Composer, Integer, ab> m3433getLambda$1357803046$foundation() {
        return f5lambda$1357803046;
    }

    public final s<TextContextMenuSession, TextContextMenuDataProvider, a<? extends LayoutCoordinates>, Composer, Integer, ab> getLambda$129995601$foundation() {
        return lambda$129995601;
    }

    public final s<TextContextMenuSession, TextContextMenuDataProvider, a<? extends LayoutCoordinates>, Composer, Integer, ab> getLambda$636288403$foundation() {
        return lambda$636288403;
    }
}
