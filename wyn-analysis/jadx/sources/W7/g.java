package W7;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f15260a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f15261b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15262c;

    /* renamed from: d, reason: collision with root package name */
    public int f15263d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15269j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f15264e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f15265f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: g, reason: collision with root package name */
    public float f15266g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f15267h = 1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15268i = true;
    public TextUtils.TruncateAt k = null;

    public g(int i5, TextPaint textPaint, CharSequence charSequence) {
        this.f15260a = charSequence;
        this.f15261b = textPaint;
        this.f15262c = i5;
        this.f15263d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f15260a == null) {
            this.f15260a = "";
        }
        int iMax = Math.max(0, this.f15262c);
        CharSequence charSequenceEllipsize = this.f15260a;
        int i5 = this.f15265f;
        TextPaint textPaint = this.f15261b;
        if (i5 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f15263d);
        this.f15263d = iMin;
        if (this.f15269j && this.f15265f == 1) {
            this.f15264e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f15264e);
        builderObtain.setIncludePad(this.f15268i);
        builderObtain.setTextDirection(this.f15269j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f15265f);
        float f10 = this.f15266g;
        if (f10 != 1.0f) {
            builderObtain.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10);
        }
        if (this.f15265f > 1) {
            builderObtain.setHyphenationFrequency(this.f15267h);
        }
        return builderObtain.build();
    }
}
