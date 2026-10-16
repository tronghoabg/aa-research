package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* loaded from: classes3.dex */
public final class zzde {
    public static void zza(Spannable spannable, Object obj, int i5, int i10, int i11) {
        for (Object obj2 : spannable.getSpans(i5, i10, obj.getClass())) {
            zzc(spannable, obj2, i5, i10, 33);
        }
        spannable.setSpan(obj, i5, i10, 33);
    }

    public static void zzb(Spannable spannable, float f10, int i5, int i10, int i11) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i5, i10, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i5 && spannable.getSpanEnd(relativeSizeSpan) >= i10) {
                f10 = relativeSizeSpan.getSizeChange() * f10;
            }
            zzc(spannable, relativeSizeSpan, i5, i10, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f10), i5, i10, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int i5, int i10, int i11) {
        if (spannable.getSpanStart(obj) == i5 && spannable.getSpanEnd(obj) == i10 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
