package defpackage;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class dgf {
    public final CharSequence a;
    public final int b;
    public final TextPaint c;
    public final int d;
    public final TextDirectionHeuristic e;
    public final Layout.Alignment f;
    public final int g;
    public final TextUtils.TruncateAt h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m = 0;
    public final int n = 0;

    public dgf(CharSequence charSequence, int i, TextPaint textPaint, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = charSequence;
        this.b = i;
        this.c = textPaint;
        this.d = i2;
        this.e = textDirectionHeuristic;
        this.f = alignment;
        this.g = i3;
        this.h = truncateAt;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        if (i < 0) {
            dka.c("invalid start value");
        }
        int length = charSequence.length();
        if (i < 0 || i > length) {
            dka.c("invalid end value");
        }
        if (i3 < 0) {
            dka.c("invalid maxLines value");
        }
        if (i2 < 0) {
            dka.c("invalid width value");
        }
        if (i4 >= 0) {
            return;
        }
        dka.c("invalid ellipsizedWidth value");
    }
}
