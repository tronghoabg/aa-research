package androidx.compose.ui.text.android;

import java.text.CharacterIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i2, int i3) {
        this.charSequence = charSequence;
        this.start = i2;
        this.end = i3;
        this.index = i2;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i2 = this.index;
        if (i2 == this.end) {
            return (char) 65535;
        }
        return this.charSequence.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i2 = this.start;
        int i3 = this.end;
        if (i2 == i3) {
            this.index = i3;
            return (char) 65535;
        }
        int i4 = i3 - 1;
        this.index = i4;
        return this.charSequence.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i2 = this.index + 1;
        this.index = i2;
        int i3 = this.end;
        if (i2 < i3) {
            return this.charSequence.charAt(i2);
        }
        this.index = i3;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i2 = this.index;
        if (i2 <= this.start) {
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.index = i3;
        return this.charSequence.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i2) {
        if (i2 > this.end || this.start > i2) {
            throw new IllegalArgumentException("invalid position");
        }
        this.index = i2;
        return current();
    }
}
