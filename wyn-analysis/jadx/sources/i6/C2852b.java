package i6;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import h6.C2783b;
import java.util.ArrayList;
import u6.v;

/* renamed from: i6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2852b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f36791a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f36792b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f36793c;

    /* renamed from: d, reason: collision with root package name */
    public int f36794d;

    /* renamed from: e, reason: collision with root package name */
    public int f36795e;

    /* renamed from: f, reason: collision with root package name */
    public int f36796f;

    /* renamed from: g, reason: collision with root package name */
    public int f36797g;

    /* renamed from: h, reason: collision with root package name */
    public int f36798h;

    public C2852b(int i5, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f36791a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f36792b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f36793c = sb2;
        this.f36797g = i5;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f36794d = 15;
        this.f36795e = 0;
        this.f36796f = 0;
        this.f36798h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f36793c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f36793c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f36791a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C2851a c2851a = (C2851a) arrayList.get(size);
                int i5 = c2851a.f36790c;
                if (i5 != length) {
                    return;
                }
                c2851a.f36790c = i5 - 1;
            }
        }
    }

    public final C2783b c(int i5) {
        float f10;
        int i10 = this.f36795e + this.f36796f;
        int i11 = 32 - i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f36792b;
            if (i12 >= arrayList.size()) {
                break;
            }
            CharSequence charSequenceSubSequence = (CharSequence) arrayList.get(i12);
            int i13 = v.f46721a;
            if (charSequenceSubSequence.length() > i11) {
                charSequenceSubSequence = charSequenceSubSequence.subSequence(0, i11);
            }
            spannableStringBuilder.append(charSequenceSubSequence);
            spannableStringBuilder.append('\n');
            i12++;
        }
        SpannableString spannableStringD = d();
        int i14 = v.f46721a;
        int length = spannableStringD.length();
        CharSequence charSequenceSubSequence2 = spannableStringD;
        if (length > i11) {
            charSequenceSubSequence2 = spannableStringD.subSequence(0, i11);
        }
        spannableStringBuilder.append(charSequenceSubSequence2);
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int length2 = i11 - spannableStringBuilder.length();
        int i15 = i10 - length2;
        int i16 = i5 != Integer.MIN_VALUE ? i5 : (this.f36797g != 2 || (Math.abs(i15) >= 3 && length2 >= 0)) ? (this.f36797g != 2 || i15 <= 0) ? 0 : 2 : 1;
        if (i16 != 1) {
            if (i16 == 2) {
                i10 = 32 - length2;
            }
            f10 = ((i10 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i17 = this.f36794d;
        if (i17 > 7) {
            i17 -= 17;
        } else if (this.f36797g == 1) {
            i17 -= this.f36798h - 1;
        }
        return new C2783b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i17, 1, Integer.MIN_VALUE, f11, i16, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f36793c);
        int length = spannableStringBuilder.length();
        int i5 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        int i14 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f36791a;
            if (i13 >= arrayList.size()) {
                break;
            }
            C2851a c2851a = (C2851a) arrayList.get(i13);
            boolean z10 = c2851a.f36789b;
            int i15 = c2851a.f36788a;
            if (i15 != 8) {
                boolean z11 = i15 == 7;
                if (i15 != 7) {
                    i12 = c.f36799A[i15];
                }
                z2 = z11;
            }
            int i16 = c2851a.f36790c;
            i13++;
            if (i16 != (i13 < arrayList.size() ? ((C2851a) arrayList.get(i13)).f36790c : length)) {
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
        return this.f36791a.isEmpty() && this.f36792b.isEmpty() && this.f36793c.length() == 0;
    }
}
