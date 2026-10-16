package Q2;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public static final boolean[] f9778A;

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f9779B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f9780C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f9781D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f9782E;

    /* renamed from: v, reason: collision with root package name */
    public static final int f9783v = c(2, 2, 2, 0);

    /* renamed from: w, reason: collision with root package name */
    public static final int f9784w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f9785x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f9786y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f9787z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9788a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f9789b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f9790c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9791d;

    /* renamed from: e, reason: collision with root package name */
    public int f9792e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9793f;

    /* renamed from: g, reason: collision with root package name */
    public int f9794g;

    /* renamed from: h, reason: collision with root package name */
    public int f9795h;

    /* renamed from: i, reason: collision with root package name */
    public int f9796i;

    /* renamed from: j, reason: collision with root package name */
    public int f9797j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f9798l;

    /* renamed from: m, reason: collision with root package name */
    public int f9799m;

    /* renamed from: n, reason: collision with root package name */
    public int f9800n;

    /* renamed from: o, reason: collision with root package name */
    public int f9801o;

    /* renamed from: p, reason: collision with root package name */
    public int f9802p;

    /* renamed from: q, reason: collision with root package name */
    public int f9803q;

    /* renamed from: r, reason: collision with root package name */
    public int f9804r;

    /* renamed from: s, reason: collision with root package name */
    public int f9805s;

    /* renamed from: t, reason: collision with root package name */
    public int f9806t;

    /* renamed from: u, reason: collision with root package name */
    public int f9807u;

    static {
        int iC = c(0, 0, 0, 0);
        f9784w = iC;
        int iC2 = c(0, 0, 0, 3);
        f9785x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f9786y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f9787z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f9778A = new boolean[]{false, false, false, true, true, true, false};
        f9779B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        f9780C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f9781D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f9782E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
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
            Q1.k.e(r4, r0)
            Q1.k.e(r5, r0)
            Q1.k.e(r6, r0)
            Q1.k.e(r7, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: Q2.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f9789b;
        if (c10 != '\n') {
            spannableStringBuilder.append(c10);
            return;
        }
        ArrayList arrayList = this.f9788a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f9801o != -1) {
            this.f9801o = 0;
        }
        if (this.f9802p != -1) {
            this.f9802p = 0;
        }
        if (this.f9803q != -1) {
            this.f9803q = 0;
        }
        if (this.f9805s != -1) {
            this.f9805s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f9797j && arrayList.size() < 15) {
                this.f9807u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9789b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f9801o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f9801o, length, 33);
            }
            if (this.f9802p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9802p, length, 33);
            }
            if (this.f9803q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9804r), this.f9803q, length, 33);
            }
            if (this.f9805s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9806t), this.f9805s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f9788a.clear();
        this.f9789b.clear();
        this.f9801o = -1;
        this.f9802p = -1;
        this.f9803q = -1;
        this.f9805s = -1;
        this.f9807u = 0;
        this.f9790c = false;
        this.f9791d = false;
        this.f9792e = 4;
        this.f9793f = false;
        this.f9794g = 0;
        this.f9795h = 0;
        this.f9796i = 0;
        this.f9797j = 15;
        this.k = 0;
        this.f9798l = 0;
        this.f9799m = 0;
        int i5 = f9784w;
        this.f9800n = i5;
        this.f9804r = f9783v;
        this.f9806t = i5;
    }

    public final void e(boolean z2, boolean z10) {
        int i5 = this.f9801o;
        SpannableStringBuilder spannableStringBuilder = this.f9789b;
        if (i5 != -1) {
            if (!z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f9801o, spannableStringBuilder.length(), 33);
                this.f9801o = -1;
            }
        } else if (z2) {
            this.f9801o = spannableStringBuilder.length();
        }
        if (this.f9802p == -1) {
            if (z10) {
                this.f9802p = spannableStringBuilder.length();
            }
        } else {
            if (z10) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f9802p, spannableStringBuilder.length(), 33);
            this.f9802p = -1;
        }
    }

    public final void f(int i5, int i10) {
        int i11 = this.f9803q;
        SpannableStringBuilder spannableStringBuilder = this.f9789b;
        if (i11 != -1 && this.f9804r != i5) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f9804r), this.f9803q, spannableStringBuilder.length(), 33);
        }
        if (i5 != f9783v) {
            this.f9803q = spannableStringBuilder.length();
            this.f9804r = i5;
        }
        if (this.f9805s != -1 && this.f9806t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f9806t), this.f9805s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f9784w) {
            this.f9805s = spannableStringBuilder.length();
            this.f9806t = i10;
        }
    }
}
