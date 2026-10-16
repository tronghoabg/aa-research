package E4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class v implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final Appendable f2992a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2993b = true;

    public v(Appendable appendable) {
        this.f2992a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c10) throws IOException {
        boolean z2 = this.f2993b;
        Appendable appendable = this.f2992a;
        if (z2) {
            this.f2993b = false;
            appendable.append("  ");
        }
        this.f2993b = c10 == '\n';
        appendable.append(c10);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i5, int i10) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z2 = this.f2993b;
        Appendable appendable = this.f2992a;
        boolean z10 = false;
        if (z2) {
            this.f2993b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
            z10 = true;
        }
        this.f2993b = z10;
        appendable.append(charSequence, i5, i10);
        return this;
    }
}
