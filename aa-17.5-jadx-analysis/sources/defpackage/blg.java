package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.List;

/* loaded from: classes.dex */
public final class blg {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final List d;

    public blg(CharSequence charSequence, long j, TextClassification textClassification, List list) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blg)) {
            return false;
        }
        blg blgVar = (blg) obj;
        if (!affa.f(this.a, blgVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = blgVar.b;
        long j3 = dfv.a;
        return a.j(j, j2) && affa.f(this.c, blgVar.c) && affa.f(this.d, blgVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = dfv.a;
        return ((((iHashCode + a.g(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + dfv.f(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ")";
    }
}
