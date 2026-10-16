package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public /* synthetic */ PasswordVisualTransformation(char c2, int i2, o oVar) {
        this(1 == (i2 & 1) ? (char) 8226 : c2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasswordVisualTransformation) && this.mask == ((PasswordVisualTransformation) obj).mask;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(h.n.o.j(String.valueOf(this.mask), annotatedString.getText().length()), null, 2, null), OffsetMapping.Companion.getIdentity());
    }

    public final char getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public PasswordVisualTransformation(char c2) {
        this.mask = c2;
    }

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }
}
