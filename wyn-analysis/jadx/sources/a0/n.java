package A0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f214a;

    /* renamed from: b, reason: collision with root package name */
    public final int f215b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f216c;

    /* renamed from: d, reason: collision with root package name */
    public final int f217d;

    /* renamed from: e, reason: collision with root package name */
    public final TextDirectionHeuristic f218e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout.Alignment f219f;

    /* renamed from: g, reason: collision with root package name */
    public final int f220g;

    /* renamed from: h, reason: collision with root package name */
    public final TextUtils.TruncateAt f221h;

    /* renamed from: i, reason: collision with root package name */
    public final int f222i;

    /* renamed from: j, reason: collision with root package name */
    public final int f223j;

    public n(CharSequence text, int i5, TextPaint paint, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13) {
        AbstractC3340k.e(text, "text");
        AbstractC3340k.e(paint, "paint");
        this.f214a = text;
        this.f215b = i5;
        this.f216c = paint;
        this.f217d = i10;
        this.f218e = textDirectionHeuristic;
        this.f219f = alignment;
        this.f220g = i11;
        this.f221h = truncateAt;
        this.f222i = i12;
        this.f223j = i13;
        if (i5 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int length = text.length();
        if (i5 < 0 || i5 > length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
