package androidx.compose.material3.internal;

import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ProvideContentColorTextStyleKt {
    /* renamed from: ProvideContentColorTextStyle-3J-VO9M, reason: not valid java name */
    public static final void m6286ProvideContentColorTextStyle3JVO9M(final long j2, final TextStyle textStyle, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-684938728);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(textStyle) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-684938728, i3, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:38)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)), TextKt.getLocalTextStyle().provides(((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).merge(textStyle))}, pVar, composerStartRestartGroup, ((i3 >> 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.internal.ProvideContentColorTextStyleKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ProvideContentColorTextStyleKt.ProvideContentColorTextStyle_3J_VO9M$lambda$0(j2, textStyle, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: ProvideContentColorTextStyle-KTwxG1Y, reason: not valid java name */
    public static final void m6287ProvideContentColorTextStyleKTwxG1Y(final long j2, final TextStyle textStyle, final ProvidedValue<?>[] providedValueArr, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1730739611);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changed(j2) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(textStyle) ? 16 : 32;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        int length = providedValueArr.length;
        composerStartRestartGroup.startMovableGroup(-1088419735, Integer.valueOf(length));
        int i5 = i4 | (true != composerStartRestartGroup.changed(length) ? 0 : 256);
        for (ProvidedValue<?> providedValue : providedValueArr) {
            i5 |= true != ((i2 & 512) == 0 ? composerStartRestartGroup.changed(providedValue) : composerStartRestartGroup.changedInstance(providedValue)) ? 0 : 256;
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i5 & DisplayStrings.DS_TAP_TO_VERIFY) == 0) {
            i5 |= 128;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1730739611, i5, -1, "androidx.compose.material3.internal.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:60)");
            }
            TextStyle textStyleMerge = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).merge(textStyle);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j2)));
            arrayList.add(TextKt.getLocalTextStyle().provides(textStyleMerge));
            x.q(providedValueArr, arrayList);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) arrayList.toArray(new ProvidedValue[arrayList.size()]), pVar, composerStartRestartGroup, ((i5 >> 6) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.internal.ProvideContentColorTextStyleKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ProvideContentColorTextStyleKt.ProvideContentColorTextStyle_KTwxG1Y$lambda$0(j2, textStyle, providedValueArr, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ProvideContentColorTextStyle_3J_VO9M$lambda$0(long j2, TextStyle textStyle, p pVar, int i2, Composer composer, int i3) {
        m6286ProvideContentColorTextStyle3JVO9M(j2, textStyle, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab ProvideContentColorTextStyle_KTwxG1Y$lambda$0(long j2, TextStyle textStyle, ProvidedValue[] providedValueArr, p pVar, int i2, Composer composer, int i3) {
        m6287ProvideContentColorTextStyleKTwxG1Y(j2, textStyle, providedValueArr, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }
}
