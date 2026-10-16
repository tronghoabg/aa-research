package androidx.compose.ui.text.style;

import androidx.compose.ui.text.SpanStyleKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextIndentKt {
    public static final TextIndent lerp(TextIndent textIndent, TextIndent textIndent2, float f2) {
        return new TextIndent(SpanStyleKt.m10493lerpTextUnitInheritableC3pnCVY(textIndent.m11041getFirstLineXSAIIZE(), textIndent2.m11041getFirstLineXSAIIZE(), f2), SpanStyleKt.m10493lerpTextUnitInheritableC3pnCVY(textIndent.m11042getRestLineXSAIIZE(), textIndent2.m11042getRestLineXSAIIZE(), f2), null);
    }
}
