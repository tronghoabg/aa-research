package A0;

import android.text.Layout;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f228a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout f229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f230c;

    /* renamed from: d, reason: collision with root package name */
    public final int f231d;

    /* renamed from: e, reason: collision with root package name */
    public final int f232e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f233f;

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Type inference failed for: r4v7, types: [ef.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [ef.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.CharSequence r17, float r18, android.text.TextPaint r19, int r20, android.text.TextUtils.TruncateAt r21, int r22, int r23, int r24, Dd.c r25) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.q.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, int, int, Dd.c):void");
    }

    public final float a(int i5) {
        return this.f231d + this.f229b.getLineBaseline(i5);
    }

    public final float b(int i5) {
        return this.f231d + this.f229b.getLineBottom(i5) + (i5 == this.f230c + (-1) ? this.f232e : 0);
    }

    public final float c(int i5) {
        return this.f229b.getLineTop(i5) + (i5 == 0 ? 0 : this.f231d);
    }

    public final CharSequence d() {
        CharSequence text = this.f229b.getText();
        AbstractC3340k.d(text, "layout.text");
        return text;
    }
}
