package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.q;
import h.g.a.v;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposableSingletons$ContextMenuUiKt {
    public static final ComposableSingletons$ContextMenuUiKt INSTANCE = new ComposableSingletons$ContextMenuUiKt();

    /* renamed from: lambda$-1571120048, reason: not valid java name */
    private static v<Modifier, String, Boolean, ContextMenuColors, q<? super Color, ? super Composer, ? super Integer, ab>, a<ab>, Composer, Integer, ab> f3lambda$1571120048 = ComposableLambdaKt.composableLambdaInstance(-1571120048, false, new v() { // from class: androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt$$ExternalSyntheticLambda0
        @Override // h.g.a.v
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            return ComposableSingletons$ContextMenuUiKt.lambda__1571120048$lambda$0((Modifier) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (ContextMenuColors) obj4, (q) obj5, (a) obj6, (Composer) obj7, ((Integer) obj8).intValue());
        }
    });

    /* renamed from: lambda$-1455401925, reason: not valid java name */
    private static q<ContextMenuColors, Composer, Integer, ab> f2lambda$1455401925 = ComposableLambdaKt.composableLambdaInstance(-1455401925, false, new q() { // from class: androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt$$ExternalSyntheticLambda1
        @Override // h.g.a.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ContextMenuUiKt.lambda__1455401925$lambda$0((ContextMenuColors) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    static final ab lambda__1455401925$lambda$0(ContextMenuColors contextMenuColors, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(contextMenuColors) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1455401925, i2, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1455401925.<anonymous> (ContextMenuUi.kt:305)");
            }
            BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m2757paddingVpY3zN4$default(Modifier.Companion, 0.0f, ContextMenuSpec.INSTANCE.m2099getDividerVerticalPaddingD9Ej5fM(), 1, null), 0.0f, 1, null), ContextMenuSpec.INSTANCE.m2098getDividerHeightD9Ej5fM()), contextMenuColors.m2092getIconColor0d7_KjU(), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab lambda__1571120048$lambda$0(Modifier modifier, String str, boolean z, ContextMenuColors contextMenuColors, q qVar, a aVar, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = (true != composer.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composer.changed(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composer.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composer.changed(contextMenuColors) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composer.changedInstance(qVar) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i3 |= true != composer.changedInstance(aVar) ? 65536 : 131072;
        }
        if (composer.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1571120048, i3, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1571120048.<anonymous> (ContextMenuUi.kt:136)");
            }
            ContextMenuUiKt.ContextMenuItem(str, z, contextMenuColors, modifier, qVar, aVar, composer, ((i3 >> 3) & 1022) | ((i3 << 9) & 7168) | (57344 & i3) | (i3 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* renamed from: getLambda$-1455401925$foundation, reason: not valid java name */
    public final q<ContextMenuColors, Composer, Integer, ab> m2087getLambda$1455401925$foundation() {
        return f2lambda$1455401925;
    }

    /* renamed from: getLambda$-1571120048$foundation, reason: not valid java name */
    public final v<Modifier, String, Boolean, ContextMenuColors, q<? super Color, ? super Composer, ? super Integer, ab>, a<ab>, Composer, Integer, ab> m2088getLambda$1571120048$foundation() {
        return f3lambda$1571120048;
    }
}
