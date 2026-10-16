package androidx.compose.foundation.text.input.internal;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MaskCodepointTransformation implements CodepointTransformation {
    private final char character;

    public MaskCodepointTransformation(char c2) {
        this.character = c2;
    }

    public static /* synthetic */ MaskCodepointTransformation copy$default(MaskCodepointTransformation maskCodepointTransformation, char c2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c2 = maskCodepointTransformation.character;
        }
        return maskCodepointTransformation.copy(c2);
    }

    public final char component1() {
        return this.character;
    }

    public final MaskCodepointTransformation copy(char c2) {
        return new MaskCodepointTransformation(c2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaskCodepointTransformation) && this.character == ((MaskCodepointTransformation) obj).character;
    }

    public final char getCharacter() {
        return this.character;
    }

    public int hashCode() {
        return this.character;
    }

    public String toString() {
        return "MaskCodepointTransformation(character=" + this.character + ')';
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public int transform(int i2, int i3) {
        return this.character;
    }
}
