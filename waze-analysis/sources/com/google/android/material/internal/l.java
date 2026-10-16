package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f6604a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f6605b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6606c;

    /* renamed from: d, reason: collision with root package name */
    private int f6607d;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6614k;
    private com.google.firebase.messaging.l m;

    /* renamed from: e, reason: collision with root package name */
    private Layout.Alignment f6608e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    private int f6609f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    private float f6610g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f6611h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    private int f6612i = 1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6613j = true;

    /* renamed from: l, reason: collision with root package name */
    private TextUtils.TruncateAt f6615l = null;

    private l(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f6604a = charSequence;
        this.f6605b = textPaint;
        this.f6606c = i2;
        this.f6607d = charSequence.length();
    }

    public static l b(CharSequence charSequence, TextPaint textPaint, int i2) {
        return new l(charSequence, textPaint, i2);
    }

    public final StaticLayout a() {
        if (this.f6604a == null) {
            this.f6604a = "";
        }
        int iMax = Math.max(0, this.f6606c);
        CharSequence charSequenceEllipsize = this.f6604a;
        if (this.f6609f == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f6605b, iMax, this.f6615l);
        }
        this.f6607d = Math.min(charSequenceEllipsize.length(), this.f6607d);
        if (this.f6614k && this.f6609f == 1) {
            this.f6608e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, this.f6607d, this.f6605b, iMax);
        builderObtain.setAlignment(this.f6608e);
        builderObtain.setIncludePad(this.f6613j);
        builderObtain.setTextDirection(this.f6614k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f6615l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f6609f);
        float f2 = this.f6610g;
        if (f2 != 0.0f || this.f6611h != 1.0f) {
            builderObtain.setLineSpacing(f2, this.f6611h);
        }
        if (this.f6609f > 1) {
            builderObtain.setHyphenationFrequency(this.f6612i);
        }
        com.google.firebase.messaging.l lVar = this.m;
        if (lVar != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) lVar.f10212a).w.getBreakStrategy());
        }
        return builderObtain.build();
    }

    public final void c(Layout.Alignment alignment) {
        this.f6608e = alignment;
    }

    public final void d(TextUtils.TruncateAt truncateAt) {
        this.f6615l = truncateAt;
    }

    public final void e(boolean z) {
        this.f6613j = z;
    }

    public final void f(boolean z) {
        this.f6614k = z;
    }

    public final void g(float f2, float f3) {
        this.f6610g = f2;
        this.f6611h = f3;
    }

    public final void h(int i2) {
        this.f6609f = i2;
    }

    public final void i() {
        this.f6612i = 1;
    }

    public final void j(com.google.firebase.messaging.l lVar) {
        this.m = lVar;
    }
}
