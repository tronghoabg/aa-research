package q;

import K8.C0694f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* renamed from: q.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3830p {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f43864b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C3830p f43865c;

    /* renamed from: a, reason: collision with root package name */
    public O0 f43866a;

    public static synchronized C3830p a() {
        try {
            if (f43865c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f43865c;
    }

    public static synchronized PorterDuffColorFilter c(int i5, PorterDuff.Mode mode) {
        return O0.h(i5, mode);
    }

    public static synchronized void d() {
        if (f43865c == null) {
            C3830p c3830p = new C3830p();
            f43865c = c3830p;
            c3830p.f43866a = O0.d();
            f43865c.f43866a.m(new C6.l());
        }
    }

    public static void e(Drawable drawable, C0694f c0694f, int[] iArr) {
        PorterDuff.Mode mode = O0.f43685h;
        int[] state = drawable.getState();
        int[] iArr2 = AbstractC3827n0.f43839a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c0694f.f6640b;
        if (z2 || c0694f.f6639a) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z2 ? (ColorStateList) c0694f.f6641c : null;
            PorterDuff.Mode mode2 = c0694f.f6639a ? (PorterDuff.Mode) c0694f.f6642d : O0.f43685h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = O0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i5) {
        return this.f43866a.f(context, i5);
    }
}
