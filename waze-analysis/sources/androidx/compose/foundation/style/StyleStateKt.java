package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.state.ToggleableState;
import h.ab;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleStateKt {
    private static final int EnabledStateMask = 16;
    private static final int FocusedStateMask = 4;
    private static final int HoveredStateMask = 2;
    private static final int PressedStateMask = 1;
    private static final int SelectedStateMask = 8;
    private static final int ToggleStateIndeterminate = 64;
    private static final int ToggleStateMask = 96;
    private static final int ToggleStateOff = 0;
    private static final int ToggleStateOn = 32;
    private static final int ToggleStateShift = 5;

    public static final void checked(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getToggle(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda8
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(((StyleState) obj2).isChecked());
            }
        });
    }

    public static final void disabled(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getEnabled(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda4
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(StyleStateKt.disabled$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            }
        });
    }

    static final boolean disabled$lambda$0(StyleStateKey styleStateKey, StyleState styleState) {
        return !styleState.isEnabled();
    }

    public static final void focused(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getFocused(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(((StyleState) obj2).isFocused());
            }
        });
    }

    public static final void hovered(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getHovered(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda6
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(((StyleState) obj2).isHovered());
            }
        });
    }

    public static final void pressed(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getPressed(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda2
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(((StyleState) obj2).isPressed());
            }
        });
    }

    public static final StyleState rememberUpdatedStyleState(InteractionSource interactionSource, q<? super MutableStyleState, ? super Composer, ? super Integer, ab> qVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            qVar = new q<MutableStyleState, Composer, Integer, ab>() { // from class: androidx.compose.foundation.style.StyleStateKt.rememberUpdatedStyleState.1
                @Override // h.g.a.q
                public /* bridge */ /* synthetic */ ab invoke(MutableStyleState mutableStyleState, Composer composer2, Integer num) {
                    num.intValue();
                    return ab.f48028a;
                }

                public final void invoke(MutableStyleState mutableStyleState, Composer composer2, int i4) {
                }
            };
        }
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(interactionSource)) && (i2 & 6) != 4) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new MutableStyleState(interactionSource);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableStyleState mutableStyleState = (MutableStyleState) objRememberedValue;
        qVar.invoke(mutableStyleState, composer, Integer.valueOf(i2 & 112));
        return mutableStyleState;
    }

    public static final void selected(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getSelected(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda5
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(((StyleState) obj2).isSelected());
            }
        });
    }

    public static final void triStateToggleIndeterminate(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getToggle(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda7
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(StyleStateKt.triStateToggleIndeterminate$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            }
        });
    }

    static final boolean triStateToggleIndeterminate$lambda$0(StyleStateKey styleStateKey, StyleState styleState) {
        return styleState.getTriStateToggle() == ToggleableState.Indeterminate;
    }

    public static final void triStateToggleOff(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getToggle(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(StyleStateKt.triStateToggleOff$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            }
        });
    }

    static final boolean triStateToggleOff$lambda$0(StyleStateKey styleStateKey, StyleState styleState) {
        return styleState.getTriStateToggle() == ToggleableState.Off;
    }

    public static final void triStateToggleOn(StyleScope styleScope, Style style) {
        styleScope.state(StyleStateKey.Companion.getToggle(), style, new p() { // from class: androidx.compose.foundation.style.StyleStateKt$$ExternalSyntheticLambda0
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(StyleStateKt.triStateToggleOn$lambda$0((StyleStateKey) obj, (StyleState) obj2));
            }
        });
    }

    static final boolean triStateToggleOn$lambda$0(StyleStateKey styleStateKey, StyleState styleState) {
        return styleState.getTriStateToggle() == ToggleableState.On;
    }

    private static final int updateFromMask(int i2, int i3, boolean z) {
        return (i2 & (~i3)) | (true != z ? 0 : i3);
    }
}
