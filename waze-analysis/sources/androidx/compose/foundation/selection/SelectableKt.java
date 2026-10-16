package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import h.ab;
import h.g.a.a;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectableKt {
    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m3048selectableO2vRcR0(Modifier modifier, final boolean z, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, final a<ab> aVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new SelectableElement(z, mutableInteractionSource, (IndicationNodeFactory) indication, false, z2, role, aVar, null) : indication == null ? new SelectableElement(z, mutableInteractionSource, null, false, z2, role, aVar, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new SelectableElement(z, mutableInteractionSource, null, false, z2, role, aVar, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            public final Modifier invoke(Modifier modifier2, Composer composer, int i2) {
                composer.startReplaceGroup(-1525724089);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1525724089, i2, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:629)");
                }
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new SelectableElement(z, mutableInteractionSource2, null, false, z2, role, aVar, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierThen;
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }
        }, 1, null));
    }

    /* renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3049selectableO2vRcR0$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, a aVar, int i2, Object obj) {
        boolean z3 = z2 | (!((i2 & 8) == 0));
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m3048selectableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, aVar);
    }

    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ Modifier m3050selectableXHw0xAI(Modifier modifier, final boolean z, final boolean z2, final Role role, final a aVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new SelectableKt$selectableXHw0xAI$$inlined$debugInspectorInfo$1(z, z2, role, aVar) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.selection.SelectableKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SelectableKt.selectable_XHw0xAI$lambda$1(z, z2, role, aVar, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3051selectableXHw0xAI$default(Modifier modifier, boolean z, boolean z2, Role role, a aVar, int i2, Object obj) {
        boolean z3 = z2 | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m3050selectableXHw0xAI(modifier, z, z3, role, aVar);
    }

    /* renamed from: selectable-oSLSa3U, reason: not valid java name */
    public static final Modifier m3052selectableoSLSa3U(Modifier modifier, boolean z, boolean z2, Role role, MutableInteractionSource mutableInteractionSource, a<ab> aVar) {
        return modifier.then(new SelectableElement(z, mutableInteractionSource, null, true, z2, role, aVar, null));
    }

    /* renamed from: selectable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3053selectableoSLSa3U$default(Modifier modifier, boolean z, boolean z2, Role role, MutableInteractionSource mutableInteractionSource, a aVar, int i2, Object obj) {
        boolean z3 = z2 | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            mutableInteractionSource = null;
        }
        return m3052selectableoSLSa3U(modifier, z, z3, role, mutableInteractionSource, aVar);
    }

    static final Modifier selectable_XHw0xAI$lambda$1(boolean z, boolean z2, Role role, a aVar, Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-2124609672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124609672, i2, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:82)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(686451247);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(686583865);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer.endReplaceGroup();
        }
        Modifier modifierM3048selectableO2vRcR0 = m3048selectableO2vRcR0(Modifier.Companion, z, mutableInteractionSource, indication, z2, role, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM3048selectableO2vRcR0;
    }
}
