package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ PlatformSelectionBehaviors $platformSelectionBehaviors;
    final /* synthetic */ TextRange $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$maybeSuggestSelection$1(PlatformSelectionBehaviors platformSelectionBehaviors, String str, long j2, TextRange textRange, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, e<? super TextFieldSelectionManager$maybeSuggestSelection$1> eVar) {
        super(2, eVar);
        this.$platformSelectionBehaviors = platformSelectionBehaviors;
        this.$text = str;
        this.$transformedSelection = j2;
        this.$selection = textRange;
        this.this$0 = textFieldSelectionManager;
        this.$offsetMapping = offsetMapping;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            PlatformSelectionBehaviors platformSelectionBehaviors = this.$platformSelectionBehaviors;
            String str = this.$text;
            this.label = 1;
            obj = platformSelectionBehaviors.mo3853suggestSelectionForLongPressOrDoubleClickpYaCww(str, this.$transformedSelection, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        TextRange textRange = (TextRange) obj;
        if (textRange != null) {
            OffsetMapping offsetMapping = this.$offsetMapping;
            long jM10550unboximpl = textRange.m10550unboximpl();
            long jTextRange = TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextRange.m10546getStartimpl(jM10550unboximpl)), offsetMapping.transformedToOriginal(TextRange.m10541getEndimpl(jM10550unboximpl)));
            if (!TextRange.m10538equalsimpl(jTextRange, this.$selection) && x.n(this.this$0.getValue$foundation().getText(), this.$text) && this.$offsetMapping == this.this$0.getOffsetMapping$foundation()) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.getOnValueChange$foundation().invoke(textFieldSelectionManager.m3917createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().getAnnotatedString(), jTextRange));
                this.this$0.m3929setLatestSelectionOEnZFl4$foundation(TextRange.m10534boximpl(jTextRange));
            }
        }
        return ab.f48028a;
    }
}
