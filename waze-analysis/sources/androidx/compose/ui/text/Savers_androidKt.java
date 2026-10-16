package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Savers_androidKt {
    private static final Saver<PlatformParagraphStyle, Object> PlatformParagraphStyleSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Savers_androidKt.PlatformParagraphStyleSaver$lambda$0((SaverScope) obj, (PlatformParagraphStyle) obj2);
        }
    }, new l() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Savers_androidKt.PlatformParagraphStyleSaver$lambda$1(obj);
        }
    });
    private static final Saver<EmojiSupportMatch, Object> emojiSupportMatchSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda2
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((EmojiSupportMatch) obj2).m10399unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda3
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Savers_androidKt.emojiSupportMatchSaver$lambda$1(obj);
        }
    });
    private static final Saver<LineBreak, Object> LineBreakSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda4
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((LineBreak) obj2).m10921unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda5
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Savers_androidKt.LineBreakSaver$lambda$1(obj);
        }
    });
    private static final Saver<TextMotion, Object> TextMotionSaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda6
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            TextMotion textMotion = (TextMotion) obj2;
            return i.f(SaversKt.save(TextMotion.Linearity.m11046boximpl(textMotion.m11045getLinearity4e0Vf04$ui_text()), Savers_androidKt.getSaver(TextMotion.Linearity.Companion), (SaverScope) obj), Boolean.valueOf(textMotion.getSubpixelTextPositioning$ui_text()));
        }
    }, new l() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda7
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Savers_androidKt.TextMotionSaver$lambda$1(obj);
        }
    });
    private static final Saver<TextMotion.Linearity, Object> TextMotionLinearitySaver = SaverKt.Saver(new p() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda8
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(((TextMotion.Linearity) obj2).m11052unboximpl());
        }
    }, new l() { // from class: androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda9
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return Savers_androidKt.TextMotionLinearitySaver$lambda$1(obj);
        }
    });

    static final LineBreak LineBreakSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        LineBreak.Companion companion = LineBreak.Companion;
        return LineBreak.m10909boximpl(iIntValue);
    }

    static final Object PlatformParagraphStyleSaver$lambda$0(SaverScope saverScope, PlatformParagraphStyle platformParagraphStyle) {
        Boolean boolValueOf = Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding());
        int i2 = SaversKt.f1679a;
        return i.f(boolValueOf, SaversKt.save(EmojiSupportMatch.m10393boximpl(platformParagraphStyle.m10474getEmojiSupportMatch_3YsG6Y()), getSaver(EmojiSupportMatch.Companion), saverScope));
    }

    static final PlatformParagraphStyle PlatformParagraphStyleSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        x.c(bool);
        boolean zBooleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        Saver<EmojiSupportMatch, Object> saver = getSaver(EmojiSupportMatch.Companion);
        EmojiSupportMatch emojiSupportMatchRestore = ((!x.n(obj3, false) || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? saver.restore(obj3) : null;
        x.c(emojiSupportMatchRestore);
        return new PlatformParagraphStyle(emojiSupportMatchRestore.m10399unboximpl(), zBooleanValue, (o) null);
    }

    static final TextMotion.Linearity TextMotionLinearitySaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return TextMotion.Linearity.m11046boximpl(((Integer) obj).intValue());
    }

    static final TextMotion TextMotionSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Saver<TextMotion.Linearity, Object> saver = getSaver(TextMotion.Linearity.Companion);
        TextMotion.Linearity linearityRestore = ((!x.n(obj2, false) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
        x.c(linearityRestore);
        int iM11052unboximpl = linearityRestore.m11052unboximpl();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        x.c(bool);
        return new TextMotion(iM11052unboximpl, bool.booleanValue(), null);
    }

    static final EmojiSupportMatch emojiSupportMatchSaver$lambda$1(Object obj) {
        x.d(obj, "null cannot be cast to non-null type kotlin.Int");
        return EmojiSupportMatch.m10393boximpl(((Integer) obj).intValue());
    }

    public static final Saver<EmojiSupportMatch, Object> getEmojiSupportMatchSaver() {
        return emojiSupportMatchSaver;
    }

    public static final Saver<EmojiSupportMatch, Object> getSaver(EmojiSupportMatch.Companion companion) {
        return emojiSupportMatchSaver;
    }

    public static final Saver<PlatformParagraphStyle, Object> getSaver(PlatformParagraphStyle.Companion companion) {
        return PlatformParagraphStyleSaver;
    }

    public static final Saver<LineBreak, Object> getSaver(LineBreak.Companion companion) {
        return LineBreakSaver;
    }

    public static final Saver<TextMotion, Object> getSaver(TextMotion.Companion companion) {
        return TextMotionSaver;
    }

    private static final Saver<TextMotion.Linearity, Object> getSaver(TextMotion.Linearity.Companion companion) {
        return TextMotionLinearitySaver;
    }
}
