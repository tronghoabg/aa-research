package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import h.k.n;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class DateVisualTransformation implements VisualTransformation {
    private final int dateFormatLength;
    private final DateInputFormat dateInputFormat;
    private final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i2) {
            return i2 >= this.this$0.firstDelimiterOffset ? i2 < this.this$0.secondDelimiterOffset ? i2 + 1 : i2 <= this.this$0.dateFormatLength ? i2 + 2 : this.this$0.dateFormatLength + 2 : i2;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i2) {
            return i2 > this.this$0.firstDelimiterOffset + (-1) ? i2 <= this.this$0.secondDelimiterOffset + (-1) ? i2 - 1 : i2 <= this.this$0.dateFormatLength + 1 ? i2 - 2 : this.this$0.dateFormatLength : i2;
        }
    };
    private final int firstDelimiterOffset;
    private final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = o.W(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, 6);
        this.secondDelimiterOffset = o.Y(dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, 6);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        int i2 = 0;
        String strZ = annotatedString.getText().length() > this.dateFormatLength ? o.z(annotatedString.getText(), n.u(0, this.dateFormatLength)) : annotatedString.getText();
        String str = "";
        int i3 = 0;
        while (i2 < strZ.length()) {
            int i4 = i3 + 1;
            str = str + strZ.charAt(i2);
            if (i4 == this.firstDelimiterOffset || i3 + 2 == this.secondDelimiterOffset) {
                str = str + this.dateInputFormat.getDelimiter();
            }
            i2++;
            i3 = i4;
        }
        return new TransformedText(new AnnotatedString(str, null, 2, null), this.dateOffsetTranslator);
    }
}
