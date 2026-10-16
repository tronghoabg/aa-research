package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class xwz extends xwq implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public xwz(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.xwq
    public final oct a(CharSequence charSequence) {
        return new oct(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
