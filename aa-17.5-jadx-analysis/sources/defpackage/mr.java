package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mr {
    private static mr b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private jb g;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final zu h = new zu(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        zu zuVar = h;
        int i2 = (i + 31) * 31;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) zuVar.b(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        return porterDuffColorFilter2;
    }

    public static synchronized mr e() {
        mr mrVar;
        mrVar = b;
        if (mrVar == null) {
            mrVar = new mr();
            b = mrVar;
        }
        return mrVar;
    }

    static void g(Drawable drawable, nd ndVar, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        PorterDuffColorFilter porterDuffColorFilterB = null;
        if (ndVar.d) {
            colorStateList = ndVar.a;
        } else {
            if (!ndVar.c) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        PorterDuff.Mode mode = ndVar.c ? ndVar.b : a;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterB);
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        zs zsVar = (zs) this.d.get(context);
        if (zsVar != null && (weakReference = (WeakReference) zsVar.d(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            zsVar.h(j);
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.d;
            zs zsVar = (zs) weakHashMap.get(context);
            if (zsVar == null) {
                zsVar = new zs(10);
                weakHashMap.put(context, zsVar);
            }
            zsVar.g(j, new WeakReference(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized android.content.res.ColorStateList a(android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr.a(android.content.Context, int):android.content.res.ColorStateList");
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183 A[Catch: all -> 0x01ad, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ab, B:36:0x00b1, B:38:0x00b7, B:45:0x00cc, B:83:0x019e, B:43:0x00c8, B:47:0x00d2, B:51:0x00e9, B:55:0x0117, B:57:0x0141, B:76:0x0183, B:78:0x0194, B:62:0x0150, B:65:0x015a, B:67:0x0165, B:70:0x016d, B:19:0x005a, B:32:0x00a1, B:24:0x0065, B:26:0x0082, B:28:0x008c, B:30:0x0096, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x01a3, B:87:0x01ac), top: B:91:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        zs zsVar = (zs) this.d.get(context);
        if (zsVar != null) {
            zsVar.f();
        }
    }

    public final synchronized void h(jb jbVar) {
        this.g = jbVar;
    }
}
