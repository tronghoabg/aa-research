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
import androidx.compose.ui.state.ToggleableState;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ToggleableKt {
    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m3055toggleableO2vRcR0(Modifier modifier, final boolean z, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z2, final Role role, final l<? super Boolean, ab> lVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new ToggleableElement(z, mutableInteractionSource, (IndicationNodeFactory) indication, false, z2, role, lVar, null) : indication == null ? new ToggleableElement(z, mutableInteractionSource, null, false, z2, role, lVar, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ToggleableElement(z, mutableInteractionSource, null, false, z2, role, lVar, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new ToggleableElement(z, mutableInteractionSource2, null, false, z2, role, lVar, null));
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

    /* renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3056toggleableO2vRcR0$default(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, l lVar, int i2, Object obj) {
        boolean z3 = z2 | (!((i2 & 8) == 0));
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m3055toggleableO2vRcR0(modifier, z, mutableInteractionSource, indication, z3, role, lVar);
    }

    /* renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ Modifier m3057toggleableXHw0xAI(Modifier modifier, final boolean z, final boolean z2, final Role role, final l lVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ToggleableKt$toggleableXHw0xAI$$inlined$debugInspectorInfo$1(z, z2, role, lVar) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.selection.ToggleableKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ToggleableKt.toggleable_XHw0xAI$lambda$1(z, z2, role, lVar, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3058toggleableXHw0xAI$default(Modifier modifier, boolean z, boolean z2, Role role, l lVar, int i2, Object obj) {
        boolean z3 = z2 | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m3057toggleableXHw0xAI(modifier, z, z3, role, lVar);
    }

    /* renamed from: toggleable-oSLSa3U, reason: not valid java name */
    public static final Modifier m3059toggleableoSLSa3U(Modifier modifier, boolean z, boolean z2, Role role, MutableInteractionSource mutableInteractionSource, l<? super Boolean, ab> lVar) {
        return modifier.then(new ToggleableElement(z, mutableInteractionSource, null, true, z2, role, lVar, null));
    }

    /* renamed from: toggleable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3060toggleableoSLSa3U$default(Modifier modifier, boolean z, boolean z2, Role role, MutableInteractionSource mutableInteractionSource, l lVar, int i2, Object obj) {
        boolean z3 = z2 | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            mutableInteractionSource = null;
        }
        return m3059toggleableoSLSa3U(modifier, z, z3, role, mutableInteractionSource, lVar);
    }

    static final Modifier toggleable_XHw0xAI$lambda$1(boolean z, boolean z2, Role role, l lVar, Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(290332169);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(290332169, i2, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:86)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(-778338818);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(-778206200);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer.endReplaceGroup();
        }
        Modifier modifierM3055toggleableO2vRcR0 = m3055toggleableO2vRcR0(Modifier.Companion, z, mutableInteractionSource, indication, z2, role, lVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM3055toggleableO2vRcR0;
    }

    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m3061triStateToggleableO2vRcR0(Modifier modifier, final ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final Role role, final a<ab> aVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new TriStateToggleableElement(toggleableState, mutableInteractionSource, (IndicationNodeFactory) indication, false, z, role, aVar, null) : indication == null ? new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, false, z, role, aVar, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, false, z, role, aVar, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource2, null, false, z, role, aVar, null));
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

    /* renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3062triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, Role role, a aVar, int i2, Object obj) {
        boolean z2 = z | (!((i2 & 8) == 0));
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m3061triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z2, role, aVar);
    }

    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ Modifier m3063triStateToggleableXHw0xAI(Modifier modifier, final ToggleableState toggleableState, final boolean z, final Role role, final a aVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ToggleableKt$triStateToggleableXHw0xAI$$inlined$debugInspectorInfo$1(toggleableState, z, role, aVar) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.selection.ToggleableKt$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ToggleableKt.triStateToggleable_XHw0xAI$lambda$1(toggleableState, z, role, aVar, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3064triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, a aVar, int i2, Object obj) {
        boolean z2 = z | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m3063triStateToggleableXHw0xAI(modifier, toggleableState, z2, role, aVar);
    }

    /* renamed from: triStateToggleable-oSLSa3U, reason: not valid java name */
    public static final Modifier m3065triStateToggleableoSLSa3U(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, MutableInteractionSource mutableInteractionSource, a<ab> aVar) {
        return modifier.then(new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, true, z, role, aVar, null));
    }

    /* renamed from: triStateToggleable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3066triStateToggleableoSLSa3U$default(Modifier modifier, ToggleableState toggleableState, boolean z, Role role, MutableInteractionSource mutableInteractionSource, a aVar, int i2, Object obj) {
        boolean z2 = z | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            mutableInteractionSource = null;
        }
        return m3065triStateToggleableoSLSa3U(modifier, toggleableState, z2, role, mutableInteractionSource, aVar);
    }

    static final Modifier triStateToggleable_XHw0xAI$lambda$1(ToggleableState toggleableState, boolean z, Role role, a aVar, Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-1808118329);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1808118329, i2, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:393)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(1826835840);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(1826968458);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer.endReplaceGroup();
        }
        Modifier modifierM3061triStateToggleableO2vRcR0 = m3061triStateToggleableO2vRcR0(Modifier.Companion, toggleableState, mutableInteractionSource, indication, z, role, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM3061triStateToggleableO2vRcR0;
    }
}
