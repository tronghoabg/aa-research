package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.Role;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.aq;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ClickableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean changedToUp(IndirectPointerInputChange indirectPointerInputChange) {
        return (indirectPointerInputChange.isConsumed() || !indirectPointerInputChange.getPreviousPressed() || indirectPointerInputChange.getPressed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean changedToUpIgnoreConsumed(IndirectPointerInputChange indirectPointerInputChange) {
        return indirectPointerInputChange.getPreviousPressed() && !indirectPointerInputChange.getPressed();
    }

    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m2002clickableO2vRcR0(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, final a<ab> aVar) {
        ClickableElement clickableElementComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            clickableElementComposed$default = new ClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, false, z, str, role, aVar, null);
        } else if (indication == null) {
            clickableElementComposed$default = new ClickableElement(mutableInteractionSource, null, false, z, str, role, aVar, null);
        } else if (mutableInteractionSource != null) {
            clickableElementComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ClickableElement(mutableInteractionSource, null, false, z, str, role, aVar, null));
        } else {
            clickableElementComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new ClickableElement(mutableInteractionSource2, null, false, z, str, role, aVar, null));
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
            }, 1, null);
        }
        return modifier.then(clickableElementComposed$default);
    }

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2003clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, a aVar, int i2, Object obj) {
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        return m2002clickableO2vRcR0(modifier, mutableInteractionSource, indication, z2, str, role, aVar);
    }

    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final /* synthetic */ Modifier m2004clickableXHw0xAI(Modifier modifier, final boolean z, final String str, final Role role, final a aVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1(z, str, role, aVar) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda3
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ClickableKt.clickable_XHw0xAI$lambda$1(z, str, role, aVar, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2005clickableXHw0xAI$default(Modifier modifier, boolean z, String str, Role role, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        return m2004clickableXHw0xAI(modifier, 1 == ((z ? 1 : 0) | (i2 & 1)), str, role, aVar);
    }

    /* renamed from: clickable-oSLSa3U, reason: not valid java name */
    public static final Modifier m2006clickableoSLSa3U(Modifier modifier, boolean z, String str, Role role, MutableInteractionSource mutableInteractionSource, a<ab> aVar) {
        return modifier.then(new ClickableElement(mutableInteractionSource, null, true, z, str, role, aVar, null));
    }

    /* renamed from: clickable-oSLSa3U$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2007clickableoSLSa3U$default(Modifier modifier, boolean z, String str, Role role, MutableInteractionSource mutableInteractionSource, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            mutableInteractionSource = null;
        }
        return m2006clickableoSLSa3U(modifier, 1 == ((z ? 1 : 0) | (i2 & 1)), str, role, mutableInteractionSource, aVar);
    }

    public static final Modifier clickableWithIndicationIfNeeded(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final p<? super MutableInteractionSource, ? super IndicationNodeFactory, ? extends Modifier> pVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? pVar.invoke(mutableInteractionSource, indication) : indication == null ? pVar.invoke(mutableInteractionSource, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(pVar.invoke(mutableInteractionSource, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt.clickableWithIndicationIfNeeded.1
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
                Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(pVar.invoke(mutableInteractionSource2, null));
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

    static final Modifier clickable_XHw0xAI$lambda$1(boolean z, String str, Role role, a aVar, Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-756081143);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-756081143, i2, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:136)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(-1604682242);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(-1604549624);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer.endReplaceGroup();
        }
        Modifier modifierM2002clickableO2vRcR0 = m2002clickableO2vRcR0(Modifier.Companion, mutableInteractionSource, indication, z, str, role, aVar);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM2002clickableO2vRcR0;
    }

    /* renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final /* synthetic */ Modifier m2008combinedClickableXVZzFYc(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, final String str2, final a aVar, final a aVar2, final a aVar3) {
        CombinedClickableElement combinedClickableElementComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            combinedClickableElementComposed$default = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, false, z, str, role, aVar3, str2, aVar, aVar2, true, null);
        } else if (indication == null) {
            combinedClickableElementComposed$default = new CombinedClickableElement(mutableInteractionSource, null, false, z, str, role, aVar3, str2, aVar, aVar2, true, null);
        } else if (mutableInteractionSource != null) {
            combinedClickableElementComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, false, z, str, role, aVar3, str2, aVar, aVar2, true, null));
        } else {
            combinedClickableElementComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new CombinedClickableElement(mutableInteractionSource2, null, false, z, str, role, aVar3, str2, aVar, aVar2, true, null));
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
            }, 1, null);
        }
        return modifier.then(combinedClickableElementComposed$default);
    }

    /* renamed from: combinedClickable-XVZzFYc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2009combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, String str2, a aVar, a aVar2, a aVar3, int i2, Object obj) {
        boolean z2 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            aVar = null;
        }
        if ((i2 & 128) != 0) {
            aVar2 = null;
        }
        return m2008combinedClickableXVZzFYc(modifier, mutableInteractionSource, indication, z2, str, role, str2, aVar, aVar2, aVar3);
    }

    /* renamed from: combinedClickable-auXiCPI, reason: not valid java name */
    public static final Modifier m2010combinedClickableauXiCPI(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z, final String str, final Role role, final String str2, final a<ab> aVar, final a<ab> aVar2, final boolean z2, final a<ab> aVar3) {
        CombinedClickableElement combinedClickableElementComposed$default;
        if (indication instanceof IndicationNodeFactory) {
            combinedClickableElementComposed$default = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, false, z, str, role, aVar3, str2, aVar, aVar2, z2, null);
        } else if (indication == null) {
            combinedClickableElementComposed$default = new CombinedClickableElement(mutableInteractionSource, null, false, z, str, role, aVar3, str2, aVar, aVar2, z2, null);
        } else if (mutableInteractionSource != null) {
            combinedClickableElementComposed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, false, z, str, role, aVar3, str2, aVar, aVar2, z2, null));
        } else {
            combinedClickableElementComposed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier modifierThen = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, indication).then(new CombinedClickableElement(mutableInteractionSource2, null, false, z, str, role, aVar3, str2, aVar, aVar2, z2, null));
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
            }, 1, null);
        }
        return modifier.then(combinedClickableElementComposed$default);
    }

    /* renamed from: combinedClickable-auXiCPI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2011combinedClickableauXiCPI$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, String str2, a aVar, a aVar2, boolean z2, a aVar3, int i2, Object obj) {
        boolean z3 = z | (!((i2 & 4) == 0));
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            role = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            aVar = null;
        }
        if ((i2 & 128) != 0) {
            aVar2 = null;
        }
        return m2010combinedClickableauXiCPI(modifier, mutableInteractionSource, indication, z3, str, role, str2, aVar, aVar2, z2 | (!((i2 & 256) == 0)), aVar3);
    }

    /* renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final /* synthetic */ Modifier m2012combinedClickablecJG_KMw(Modifier modifier, final boolean z, final String str, final Role role, final String str2, final a aVar, final a aVar2, final a aVar3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$combinedClickablecJG_KMw$$inlined$debugInspectorInfo$1(z, str, role, aVar3, aVar2, aVar, str2) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ClickableKt.combinedClickable_cJG_KMw$lambda$1(z, str, role, str2, aVar, aVar2, aVar3, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: combinedClickable-cJG_KMw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2013combinedClickablecJG_KMw$default(Modifier modifier, boolean z, String str, Role role, String str2, a aVar, a aVar2, a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            aVar = null;
        }
        if ((i2 & 32) != 0) {
            aVar2 = null;
        }
        return m2012combinedClickablecJG_KMw(modifier, 1 == ((z ? 1 : 0) | (i2 & 1)), str, role, str2, aVar, aVar2, aVar3);
    }

    /* renamed from: combinedClickable-f5TDLPQ, reason: not valid java name */
    public static final /* synthetic */ Modifier m2014combinedClickablef5TDLPQ(Modifier modifier, final boolean z, final String str, final Role role, final String str2, final a aVar, final a aVar2, final boolean z2, final a aVar3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ClickableKt$combinedClickablef5TDLPQ$$inlined$debugInspectorInfo$1(z, str, role, aVar3, aVar2, aVar, str2, z2) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ClickableKt.combinedClickable_f5TDLPQ$lambda$1(z, str, role, str2, aVar, aVar2, z2, aVar3, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: combinedClickable-f5TDLPQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2015combinedClickablef5TDLPQ$default(Modifier modifier, boolean z, String str, Role role, String str2, a aVar, a aVar2, boolean z2, a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            aVar = null;
        }
        if ((i2 & 32) != 0) {
            aVar2 = null;
        }
        return m2014combinedClickablef5TDLPQ(modifier, 1 == ((z ? 1 : 0) | (i2 & 1)), str, role, str2, aVar, aVar2, z2 | (!((i2 & 64) == 0)), aVar3);
    }

    /* renamed from: combinedClickable-hoGz1lA, reason: not valid java name */
    public static final Modifier m2016combinedClickablehoGz1lA(Modifier modifier, boolean z, String str, Role role, String str2, a<ab> aVar, a<ab> aVar2, boolean z2, MutableInteractionSource mutableInteractionSource, a<ab> aVar3) {
        return modifier.then(new CombinedClickableElement(mutableInteractionSource, null, true, z, str, role, aVar3, str2, aVar, aVar2, z2, null));
    }

    /* renamed from: combinedClickable-hoGz1lA$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2017combinedClickablehoGz1lA$default(Modifier modifier, boolean z, String str, Role role, String str2, a aVar, a aVar2, boolean z2, MutableInteractionSource mutableInteractionSource, a aVar3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            role = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            aVar = null;
        }
        if ((i2 & 32) != 0) {
            aVar2 = null;
        }
        boolean z3 = z2 | (!((i2 & 64) == 0));
        if ((i2 & 128) != 0) {
            mutableInteractionSource = null;
        }
        return m2016combinedClickablehoGz1lA(modifier, 1 == ((z ? 1 : 0) | (i2 & 1)), str, role, str2, aVar, aVar2, z3, mutableInteractionSource, aVar3);
    }

    static final Modifier combinedClickable_cJG_KMw$lambda$1(boolean z, String str, Role role, String str2, a aVar, a aVar2, a aVar3, Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(1969174843);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1969174843, i2, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:466)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(-1270399604);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(-1270266986);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer.endReplaceGroup();
        }
        Modifier modifierM2010combinedClickableauXiCPI = m2010combinedClickableauXiCPI(Modifier.Companion, mutableInteractionSource, indication, z, str, role, str2, aVar, aVar2, true, aVar3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM2010combinedClickableauXiCPI;
    }

    static final Modifier combinedClickable_f5TDLPQ$lambda$1(boolean z, String str, Role role, String str2, a aVar, a aVar2, boolean z2, a aVar3, Modifier modifier, Composer composer, int i2) {
        MutableInteractionSource mutableInteractionSource;
        composer.startReplaceGroup(-1534186401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1534186401, i2, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:345)");
        }
        Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
        if (indication instanceof IndicationNodeFactory) {
            composer.startReplaceGroup(2095040488);
            composer.endReplaceGroup();
            mutableInteractionSource = null;
        } else {
            composer.startReplaceGroup(2095173106);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer.endReplaceGroup();
        }
        Modifier modifierM2010combinedClickableauXiCPI = m2010combinedClickableauXiCPI(Modifier.Companion, mutableInteractionSource, indication, z, str, role, str2, aVar, aVar2, z2, aVar3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM2010combinedClickableauXiCPI;
    }

    public static final boolean hasWaitingParent(DelegatingNode delegatingNode) {
        final aq aqVar = new aq();
        GestureNodeKt.traverseAncestorGestures(delegatingNode, new l() { // from class: androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ClickableKt.hasWaitingParent$lambda$0(aqVar, (GestureConnection) obj));
            }
        });
        return aqVar.f48105a != null;
    }

    static final boolean hasWaitingParent$lambda$0(aq aqVar, GestureConnection gestureConnection) {
        if (!GestureState.m2029equalsimpl0(gestureConnection.mo1934getGestureState7meUWtM(), GestureState.Companion.m2035getWaiting7meUWtM())) {
            return true;
        }
        aqVar.f48105a = gestureConnection;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m2018isClickZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9433getKeyUpCS__XNY()) && m2019isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m2019isEnterZmokQxo(KeyEvent keyEvent) {
        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
        return Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9188getDirectionCenterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9202getEnterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9299getNumPadEnterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9350getSpacebarEK5gGoQ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m2020isPressZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY()) && m2019isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsupportedIndicationExceptionMessage(Indication indication) {
        Objects.toString(indication);
        return "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: ".concat(String.valueOf(indication));
    }
}
