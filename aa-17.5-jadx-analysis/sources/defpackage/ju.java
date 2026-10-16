package defpackage;

import android.graphics.Typeface;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class ju {
    private final Typeface a;
    private final String b;
    private final int c;

    public ju(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ju)) {
            return false;
        }
        ju juVar = (ju) obj;
        return this.c == juVar.c && Objects.equals(this.a, juVar.a) && Objects.equals(this.b, juVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
