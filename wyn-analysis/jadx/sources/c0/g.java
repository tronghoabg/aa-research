package C0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class g extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f1766a;

    /* renamed from: b, reason: collision with root package name */
    public int f1767b;

    /* renamed from: c, reason: collision with root package name */
    public int f1768c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1769d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f1766a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        AbstractC3340k.m("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f1769d) {
            return this.f1768c;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i5, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        AbstractC3340k.e(canvas, "canvas");
        AbstractC3340k.e(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i5, int i10, Paint.FontMetricsInt fontMetricsInt) {
        AbstractC3340k.e(paint, "paint");
        this.f1769d = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        AbstractC3340k.d(fontMetricsInt2, "paint.fontMetricsInt");
        this.f1766a = fontMetricsInt2;
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        this.f1767b = (int) Math.ceil(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f1768c = (int) Math.ceil(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (this.f1769d) {
            return this.f1767b;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }
}
