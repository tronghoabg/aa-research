package A0;

import java.text.CharacterIterator;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class a implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f198b;

    /* renamed from: c, reason: collision with root package name */
    public int f199c;

    public a(CharSequence charSequence, int i5) {
        AbstractC3340k.e(charSequence, "charSequence");
        this.f197a = charSequence;
        this.f198b = i5;
        this.f199c = 0;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            Object objClone = super.clone();
            AbstractC3340k.d(objClone, "{\n            @Suppress(…  super.clone()\n        }");
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i5 = this.f199c;
        if (i5 == this.f198b) {
            return (char) 65535;
        }
        return this.f197a.charAt(i5);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f199c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f198b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f199c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i5 = this.f198b;
        if (i5 == 0) {
            this.f199c = i5;
            return (char) 65535;
        }
        int i10 = i5 - 1;
        this.f199c = i10;
        return this.f197a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i5 = this.f199c + 1;
        this.f199c = i5;
        int i10 = this.f198b;
        if (i5 < i10) {
            return this.f197a.charAt(i5);
        }
        this.f199c = i10;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i5 = this.f199c;
        if (i5 <= 0) {
            return (char) 65535;
        }
        int i10 = i5 - 1;
        this.f199c = i10;
        return this.f197a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i5) {
        if (i5 > this.f198b || i5 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f199c = i5;
        return current();
    }
}
