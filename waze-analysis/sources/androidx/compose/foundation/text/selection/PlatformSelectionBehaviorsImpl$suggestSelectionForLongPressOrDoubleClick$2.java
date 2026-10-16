package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends g implements p<TextClassifier, e<? super TextRange>, Object> {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(CharSequence charSequence, long j2, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, e<? super PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2> eVar) {
        super(2, eVar);
        this.$text = charSequence;
        this.$selection = j2;
        this.this$0 = platformSelectionBehaviorsImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.$text, this.$selection, this.this$0, eVar);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.L$0 = obj;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(TextClassifier textClassifier, e<? super TextRange> eVar) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create(textClassifier, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        long j2;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        TextClassificationResult textClassificationResult;
        a aVar;
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            TextClassifier textClassifierM66m = j$$ExternalSyntheticApiModelOutline1.m66m(this.L$0);
            CharSequence charSequence = this.$text;
            long j3 = this.$selection;
            TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(charSequence, TextRange.m10544getMinimpl(j3), TextRange.m10543getMaximpl(j3)).setDefaultLocales(this.this$0.getAndroidLocalList());
            if (Build.VERSION.SDK_INT >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierM66m.suggestSelection(defaultLocales.build());
            long jTextRange = TextRangeKt.TextRange(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (Build.VERSION.SDK_INT < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.J$0 = jTextRange;
                this.label = 2;
                if (this.this$0.m3857classifyTextM8tDOmk(this.$text, jTextRange, textClassifierM66m, this) != aVar2) {
                    j2 = jTextRange;
                }
            } else {
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = this.this$0;
                CharSequence charSequence2 = this.$text;
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                x.c(textClassification);
                TextClassificationResult textClassificationResultM3858createTextClassificationResultSbBc2M = platformSelectionBehaviorsImpl2.m3858createTextClassificationResultSbBc2M(charSequence2, jTextRange, textClassification);
                platformSelectionBehaviorsImpl = this.this$0;
                a aVar3 = platformSelectionBehaviorsImpl.mutex;
                this.L$0 = textClassificationResultM3858createTextClassificationResultSbBc2M;
                this.L$1 = aVar3;
                this.L$2 = platformSelectionBehaviorsImpl;
                this.J$0 = jTextRange;
                this.label = 1;
                if (aVar3.lock(null, this) != aVar2) {
                    textClassificationResult = textClassificationResultM3858createTextClassificationResultSbBc2M;
                    aVar = aVar3;
                    j2 = jTextRange;
                    platformSelectionBehaviorsImpl.setTextClassificationResult$foundation(textClassificationResult);
                }
            }
            return aVar2;
        }
        if (i2 == 1) {
            j2 = this.J$0;
            platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$2;
            aVar = (a) this.L$1;
            textClassificationResult = (TextClassificationResult) this.L$0;
            c.b(obj);
            try {
                platformSelectionBehaviorsImpl.setTextClassificationResult$foundation(textClassificationResult);
            } finally {
                aVar.unlock(null);
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.J$0;
            c.b(obj);
        }
        return TextRange.m10534boximpl(j2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(TextClassifier textClassifier, e<? super TextRange> eVar) {
        return invoke2(j$$ExternalSyntheticApiModelOutline1.m66m((Object) textClassifier), eVar);
    }
}
