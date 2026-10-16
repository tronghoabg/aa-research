package Q2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9742a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9743b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f9744c;

    /* renamed from: d, reason: collision with root package name */
    public int f9745d;

    /* renamed from: e, reason: collision with root package name */
    public int f9746e;

    /* renamed from: f, reason: collision with root package name */
    public int f9747f;

    /* renamed from: g, reason: collision with root package name */
    public int f9748g;

    /* renamed from: h, reason: collision with root package name */
    public int f9749h;

    public b(int i5, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f9742a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f9743b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f9744c = sb2;
        this.f9748g = i5;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f9745d = 15;
        this.f9746e = 0;
        this.f9747f = 0;
        this.f9749h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f9744c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f9744c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f9742a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i5 = aVar.f9741c;
                if (i5 != length) {
                    return;
                }
                aVar.f9741c = i5 - 1;
            }
        }
    }

    public final P1.b c(int i5) {
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9743b;
            if (i10 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i10));
            spannableStringBuilder.append('\n');
            i10++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i11 = this.f9746e + this.f9747f;
        int length = (32 - i11) - spannableStringBuilder.length();
        int i12 = i11 - length;
        int i13 = i5 != Integer.MIN_VALUE ? i5 : (this.f9748g != 2 || (Math.abs(i12) >= 3 && length >= 0)) ? (this.f9748g != 2 || i12 <= 0) ? 0 : 2 : 1;
        if (i13 != 1) {
            if (i13 == 2) {
                i11 = 32 - length;
            }
            f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i14 = this.f9745d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.f9748g == 1) {
            i14 -= this.f9749h - 1;
        }
        return new P1.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, Integer.MIN_VALUE, f11, i13, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f9744c);
        int length = spannableStringBuilder.length();
        int i5 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f9742a;
            if (i13 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i13);
            boolean z10 = aVar.f9740b;
            int i15 = aVar.f9739a;
            if (i15 != 8) {
                boolean z11 = i15 == 7;
                if (i15 != 7) {
                    i12 = c.f9751B[i15];
                }
                z2 = z11;
            }
            int i16 = aVar.f9741c;
            i13++;
            if (i16 != (i13 < arrayList.size() ? ((a) arrayList.get(i13)).f9741c : length)) {
                if (i5 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i5, i16, 33);
                    i5 = -1;
                } else if (i5 == -1 && z10) {
                    i5 = i16;
                }
                if (i10 != -1 && !z2) {
                    N0.a.m(2, spannableStringBuilder, i10, i16, 33);
                    i10 = -1;
                } else if (i10 == -1 && z2) {
                    i10 = i16;
                }
                if (i12 != i11) {
                    if (i11 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, i16, 33);
                    }
                    i11 = i12;
                    i14 = i16;
                }
            }
        }
        if (i5 != -1 && i5 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
        }
        if (i10 != -1 && i10 != length) {
            N0.a.m(2, spannableStringBuilder, i10, length, 33);
        }
        if (i14 != length && i11 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i11), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f9742a.isEmpty() && this.f9743b.isEmpty() && this.f9744c.length() == 0;
    }
}
