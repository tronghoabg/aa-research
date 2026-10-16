package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dgm {
    public final java.lang.CharSequence a;
    public final int b;
    public final android.text.TextPaint c;
    public final int d;
    public final android.text.TextDirectionHeuristic e;
    public final android.text.Layout.Alignment f;
    public final int g;
    public final android.text.TextUtils.TruncateAt h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m = 0;
    public final int n = 0;

    public dgm(java.lang.CharSequence charSequence, int i, android.text.TextPaint textPaint, int i2, android.text.TextDirectionHeuristic textDirectionHeuristic, android.text.Layout.Alignment alignment, int i3, android.text.TextUtils.TruncateAt truncateAt, int i4, int i5, int i6, int i7, int i8, int i9) {
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
            defpackage.dki.c("invalid start value");
        }
        int length = charSequence.length();
        if (i < 0 || i > length) {
            defpackage.dki.c("invalid end value");
        }
        if (i3 < 0) {
            defpackage.dki.c("invalid maxLines value");
        }
        if (i2 < 0) {
            defpackage.dki.c("invalid width value");
        }
        if (i4 >= 0) {
            return;
        }
        defpackage.dki.c("invalid ellipsizedWidth value");
    }
}
