package androidx.compose.foundation.text;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.a.a;
import h.g.a.l;
import h.g.a.q;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldScrollKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Modifier defaultTextFieldScroll(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, OverscrollEffect overscrollEffect, a<TextLayoutResultProxy> aVar) {
        VerticalScrollLayoutModifier verticalScrollLayoutModifier;
        Orientation orientation = textFieldScrollerPosition.getOrientation();
        int iM3413getOffsetToFollow5zctL8 = textFieldScrollerPosition.m3413getOffsetToFollow5zctL8(textFieldValue.m10831getSelectiond9O1mEE());
        textFieldScrollerPosition.m3415setPreviousSelection5zctL8(textFieldValue.m10831getSelectiond9O1mEE());
        TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation, textFieldValue.getAnnotatedString());
        Orientation orientation2 = Orientation.Vertical;
        int iOrdinal = orientation.ordinal();
        if (iOrdinal == 0) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, iM3413getOffsetToFollow5zctL8, transformedTextFilterWithValidation, aVar);
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, iM3413getOffsetToFollow5zctL8, transformedTextFilterWithValidation, aVar);
        }
        return ClipKt.clipToBounds(OverscrollKt.overscroll(modifier, overscrollEffect)).then(verticalScrollLayoutModifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getCursorRectInScroller(Density density, int i2, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z, int i3) {
        Rect cursorRect = textLayoutResult != null ? textLayoutResult.getCursorRect(transformedText.getOffsetMapping().originalToTransformed(i2)) : Rect.Companion.getZero();
        int iMo2121roundToPx0680j_4 = density.mo2121roundToPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness());
        return Rect.copy$default(cursorRect, z ? (i3 - cursorRect.getLeft()) - iMo2121roundToPx0680j_4 : cursorRect.getLeft(), 0.0f, z ? i3 - cursorRect.getLeft() : iMo2121roundToPx0680j_4 + cursorRect.getLeft(), 0.0f, 10, null);
    }

    public static final Modifier textFieldScrollable(Modifier modifier, final TextFieldScrollerPosition textFieldScrollerPosition, final MutableInteractionSource mutableInteractionSource, final boolean z, final OverscrollEffect overscrollEffect) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1(textFieldScrollerPosition, mutableInteractionSource, z) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TextFieldScrollKt.textFieldScrollable$lambda$1(textFieldScrollerPosition, z, overscrollEffect, mutableInteractionSource, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    public static /* synthetic */ Modifier textFieldScrollable$default(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, MutableInteractionSource mutableInteractionSource, boolean z, OverscrollEffect overscrollEffect, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return textFieldScrollable(modifier, textFieldScrollerPosition, mutableInteractionSource, z | (!((i2 & 4) == 0)), overscrollEffect);
    }

    static final Modifier textFieldScrollable$lambda$1(final TextFieldScrollerPosition textFieldScrollerPosition, boolean z, OverscrollEffect overscrollEffect, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(-2137546592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2137546592, i2, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:76)");
        }
        boolean z2 = textFieldScrollerPosition.getOrientation() == Orientation.Vertical || composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl;
        boolean zChanged = composer.changed(textFieldScrollerPosition);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new l() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Float.valueOf(TextFieldScrollKt.textFieldScrollable$lambda$1$0$0(textFieldScrollerPosition, ((Float) obj).floatValue()));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ScrollableState scrollableStateRememberScrollableState = ScrollableStateKt.rememberScrollableState((l) objRememberedValue, composer, 0);
        boolean zChanged2 = composer.changed(scrollableStateRememberScrollableState) | composer.changed(textFieldScrollerPosition);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1(scrollableStateRememberScrollableState, textFieldScrollerPosition);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Modifier modifierScrollable$default = ScrollableKt.scrollable$default(Modifier.Companion, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) objRememberedValue2, textFieldScrollerPosition.getOrientation(), overscrollEffect, z && textFieldScrollerPosition.getMaximum() != 0.0f, z2, null, mutableInteractionSource, null, 160, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierScrollable$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float textFieldScrollable$lambda$1$0$0(TextFieldScrollerPosition textFieldScrollerPosition, float f2) {
        float offset = textFieldScrollerPosition.getOffset() + f2;
        if (offset > textFieldScrollerPosition.getMaximum()) {
            f2 = textFieldScrollerPosition.getMaximum() - textFieldScrollerPosition.getOffset();
        } else if (offset < 0.0f) {
            f2 = -textFieldScrollerPosition.getOffset();
        }
        textFieldScrollerPosition.setOffset(textFieldScrollerPosition.getOffset() + f2);
        return f2;
    }
}
