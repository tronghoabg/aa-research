package i6;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f36827A;

    /* renamed from: B, reason: collision with root package name */
    public static final boolean[] f36828B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f36829C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f36830D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f36831E;

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f36832F;

    /* renamed from: w, reason: collision with root package name */
    public static final int f36833w = c(2, 2, 2, 0);

    /* renamed from: x, reason: collision with root package name */
    public static final int f36834x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f36835y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f36836z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f36837a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f36838b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f36839c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f36840d;

    /* renamed from: e, reason: collision with root package name */
    public int f36841e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f36842f;

    /* renamed from: g, reason: collision with root package name */
    public int f36843g;

    /* renamed from: h, reason: collision with root package name */
    public int f36844h;

    /* renamed from: i, reason: collision with root package name */
    public int f36845i;

    /* renamed from: j, reason: collision with root package name */
    public int f36846j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public int f36847l;

    /* renamed from: m, reason: collision with root package name */
    public int f36848m;

    /* renamed from: n, reason: collision with root package name */
    public int f36849n;

    /* renamed from: o, reason: collision with root package name */
    public int f36850o;

    /* renamed from: p, reason: collision with root package name */
    public int f36851p;

    /* renamed from: q, reason: collision with root package name */
    public int f36852q;

    /* renamed from: r, reason: collision with root package name */
    public int f36853r;

    /* renamed from: s, reason: collision with root package name */
    public int f36854s;

    /* renamed from: t, reason: collision with root package name */
    public int f36855t;

    /* renamed from: u, reason: collision with root package name */
    public int f36856u;

    /* renamed from: v, reason: collision with root package name */
    public int f36857v;

    static {
        int iC = c(0, 0, 0, 0);
        f36834x = iC;
        int iC2 = c(0, 0, 0, 3);
        f36835y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f36836z = new int[]{0, 0, 0, 0, 0, 0, 2};
        f36827A = new int[]{3, 3, 3, 3, 3, 3, 1};
        f36828B = new boolean[]{false, false, false, true, true, true, false};
        f36829C = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        f36830D = new int[]{0, 1, 2, 3, 4, 3, 4};
        f36831E = new int[]{0, 0, 0, 0, 0, 3, 3};
        f36832F = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            u6.AbstractC4256a.h(r4, r0)
            u6.AbstractC4256a.h(r5, r0)
            u6.AbstractC4256a.h(r6, r0)
            u6.AbstractC4256a.h(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f36838b;
        if (c10 != '\n') {
            spannableStringBuilder.append(c10);
            return;
        }
        ArrayList arrayList = this.f36837a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f36851p != -1) {
            this.f36851p = 0;
        }
        if (this.f36852q != -1) {
            this.f36852q = 0;
        }
        if (this.f36853r != -1) {
            this.f36853r = 0;
        }
        if (this.f36855t != -1) {
            this.f36855t = 0;
        }
        while (true) {
            if ((!this.k || arrayList.size() < this.f36846j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f36838b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f36851p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f36851p, length, 33);
            }
            if (this.f36852q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f36852q, length, 33);
            }
            if (this.f36853r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f36854s), this.f36853r, length, 33);
            }
            if (this.f36855t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f36856u), this.f36855t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f36837a.clear();
        this.f36838b.clear();
        this.f36851p = -1;
        this.f36852q = -1;
        this.f36853r = -1;
        this.f36855t = -1;
        this.f36857v = 0;
        this.f36839c = false;
        this.f36840d = false;
        this.f36841e = 4;
        this.f36842f = false;
        this.f36843g = 0;
        this.f36844h = 0;
        this.f36845i = 0;
        this.f36846j = 15;
        this.k = true;
        this.f36847l = 0;
        this.f36848m = 0;
        this.f36849n = 0;
        int i5 = f36834x;
        this.f36850o = i5;
        this.f36854s = f36833w;
        this.f36856u = i5;
    }

    public final void e(boolean z2, boolean z10) {
        int i5 = this.f36851p;
        SpannableStringBuilder spannableStringBuilder = this.f36838b;
        if (i5 != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f36851p, spannableStringBuilder.length(), 33);
                this.f36851p = -1;
            }
        } else if (z2) {
            this.f36851p = spannableStringBuilder.length();
        }
        if (this.f36852q == -1) {
            if (z10) {
                this.f36852q = spannableStringBuilder.length();
            }
        } else {
            if (z10) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f36852q, spannableStringBuilder.length(), 33);
            this.f36852q = -1;
        }
    }

    public final void f(int i5, int i10) {
        int i11 = this.f36853r;
        SpannableStringBuilder spannableStringBuilder = this.f36838b;
        if (i11 != -1 && this.f36854s != i5) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f36854s), this.f36853r, spannableStringBuilder.length(), 33);
        }
        if (i5 != f36833w) {
            this.f36853r = spannableStringBuilder.length();
            this.f36854s = i5;
        }
        if (this.f36855t != -1 && this.f36856u != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f36856u), this.f36855t, spannableStringBuilder.length(), 33);
        }
        if (i10 != f36834x) {
            this.f36855t = spannableStringBuilder.length();
            this.f36856u = i10;
        }
    }
}
