package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import h.g.a.a;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TextForegroundStyle {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final TextForegroundStyle from(Brush brush, float f2) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m11038from8_81llA(TextDrawStyleKt.m11037modulateDxMtmZc(((SolidColor) brush).m8614getValue0d7_KjU(), f2));
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush, f2);
            }
            throw new i();
        }

        /* renamed from: from-8_81llA, reason: not valid java name */
        public final TextForegroundStyle m11038from8_81llA(long j2) {
            return j2 != 16 ? new ColorStyle(j2, null) : Unspecified.INSTANCE;
        }
    }

    /* compiled from: WazeSource */
    public final class Unspecified implements TextForegroundStyle {
        public static final int $stable = 0;
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        /* renamed from: getColor-0d7_KjU */
        public long mo10891getColor0d7_KjU() {
            return Color.Companion.m8264getUnspecified0d7_KjU();
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
            return CC.$default$merge(this, textForegroundStyle);
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public /* synthetic */ TextForegroundStyle takeOrElse(a aVar) {
            return CC.$default$takeOrElse(this, aVar);
        }
    }

    float getAlpha();

    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo10891getColor0d7_KjU();

    TextForegroundStyle merge(TextForegroundStyle textForegroundStyle);

    TextForegroundStyle takeOrElse(a<? extends TextForegroundStyle> aVar);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.style.TextForegroundStyle$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static TextForegroundStyle $default$merge(final TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2) {
            boolean z = textForegroundStyle2 instanceof BrushStyle;
            if (!z || !(textForegroundStyle instanceof BrushStyle)) {
                return (!z || (textForegroundStyle instanceof BrushStyle)) ? (z || !(textForegroundStyle instanceof BrushStyle)) ? textForegroundStyle2.takeOrElse(new a() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return textForegroundStyle;
                    }
                }) : textForegroundStyle : textForegroundStyle2;
            }
            BrushStyle brushStyle = (BrushStyle) textForegroundStyle2;
            return new BrushStyle(brushStyle.getValue(), TextDrawStyleKt.takeOrElse(brushStyle.getAlpha(), new a() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return Float.valueOf(((BrushStyle) textForegroundStyle).getAlpha());
                }
            }));
        }

        public static TextForegroundStyle $default$takeOrElse(TextForegroundStyle textForegroundStyle, a aVar) {
            return !x.n(textForegroundStyle, Unspecified.INSTANCE) ? textForegroundStyle : (TextForegroundStyle) aVar.invoke();
        }

        public static TextForegroundStyle merge$lambda$1(TextForegroundStyle textForegroundStyle) {
            return textForegroundStyle;
        }
    }
}
