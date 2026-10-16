package X0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1283k {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f15849a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f15850b;

    /* renamed from: c, reason: collision with root package name */
    public final T[] f15851c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15852d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15853e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15854f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15855g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15856h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f15857i;

    /* renamed from: j, reason: collision with root package name */
    public final PendingIntent f15858j;

    public C1283k(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, T[] tArr, T[] tArr2, boolean z2, int i5, boolean z10, boolean z11) {
        this.f15853e = true;
        this.f15850b = iconCompat;
        if (iconCompat != null) {
            int i10 = iconCompat.f18067a;
            if ((i10 == -1 ? Fe.c.w(iconCompat.f18068b) : i10) == 2) {
                this.f15856h = iconCompat.h();
            }
        }
        this.f15857i = C1289q.b(charSequence);
        this.f15858j = pendingIntent;
        this.f15849a = bundle == null ? new Bundle() : bundle;
        this.f15851c = tArr;
        this.f15852d = z2;
        this.f15854f = i5;
        this.f15853e = z10;
        this.f15855g = z11;
    }

    public final IconCompat a() {
        int i5;
        if (this.f15850b == null && (i5 = this.f15856h) != 0) {
            this.f15850b = IconCompat.g(null, "", i5);
        }
        return this.f15850b;
    }
}
