package h.n;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.b.x;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f48235a;

    /* renamed from: b, reason: collision with root package name */
    private int f48236b;

    /* renamed from: c, reason: collision with root package name */
    private int f48237c;

    /* renamed from: d, reason: collision with root package name */
    private int f48238d;

    /* renamed from: e, reason: collision with root package name */
    private int f48239e;

    public e(CharSequence charSequence) {
        x.f(charSequence, TypedValues.Custom.S_STRING);
        this.f48235a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i3;
        int i4 = this.f48236b;
        if (i4 != 0) {
            return i4 == 1;
        }
        if (this.f48239e < 0) {
            this.f48236b = 2;
            return false;
        }
        CharSequence charSequence = this.f48235a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i5 = this.f48237c; i5 < length2; i5++) {
            char cCharAt = charSequence.charAt(i5);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i2 = (cCharAt == '\r' && (i3 = i5 + 1) < charSequence.length() && charSequence.charAt(i3) == '\n') ? 2 : 1;
                length = i5;
                this.f48236b = 1;
                this.f48239e = i2;
                this.f48238d = length;
                return true;
            }
        }
        i2 = -1;
        this.f48236b = 1;
        this.f48239e = i2;
        this.f48238d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f48236b = 0;
        int i2 = this.f48238d;
        int i3 = this.f48237c;
        this.f48237c = this.f48239e + i2;
        return this.f48235a.subSequence(i3, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
