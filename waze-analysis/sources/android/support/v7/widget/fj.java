package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class fj {

    /* renamed from: b, reason: collision with root package name */
    private static fj f1479b;

    /* renamed from: d, reason: collision with root package name */
    private WeakHashMap f1481d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakHashMap f1482e = new WeakHashMap(0);

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f1483f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1484g;

    /* renamed from: h, reason: collision with root package name */
    private fi f1485h;

    /* renamed from: a, reason: collision with root package name */
    private static final PorterDuff.Mode f1478a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static final fh f1480c = new fh();

    public static synchronized PorterDuffColorFilter b(int i2, PorterDuff.Mode mode) {
        fh fhVar = f1480c;
        PorterDuffColorFilter porterDuffColorFilterA = fhVar.a(i2, mode);
        if (porterDuffColorFilterA != null) {
            return porterDuffColorFilterA;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        fhVar.b(i2, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    public static synchronized fj e() {
        fj fjVar;
        fjVar = f1479b;
        if (fjVar == null) {
            fjVar = new fj();
            f1479b = fjVar;
        }
        return fjVar;
    }

    static void h(Drawable drawable, gb gbVar, int[] iArr) {
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
        if (gbVar.f1543d) {
            colorStateList = gbVar.f1540a;
        } else {
            if (!gbVar.f1542c) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        PorterDuff.Mode mode = gbVar.f1542c ? gbVar.f1541b : f1478a;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterB);
    }

    private final synchronized Drawable i(Context context, long j2) {
        WeakReference weakReference;
        LongSparseArray longSparseArray = (LongSparseArray) this.f1482e.get(context);
        if (longSparseArray != null && (weakReference = (WeakReference) longSparseArray.get(j2)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.remove(j2);
        }
        return null;
    }

    private final synchronized void j(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.f1482e;
            LongSparseArray longSparseArray = (LongSparseArray) weakHashMap.get(context);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray();
                weakHashMap.put(context, longSparseArray);
            }
            longSparseArray.put(j2, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i2) {
        SparseArrayCompat sparseArrayCompat;
        WeakHashMap weakHashMap = this.f1481d;
        ColorStateList colorStateListA = null;
        ColorStateList colorStateList = (weakHashMap == null || (sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context)) == null) ? null : (ColorStateList) sparseArrayCompat.get(i2);
        if (colorStateList == null) {
            fi fiVar = this.f1485h;
            if (fiVar != null) {
                colorStateListA = fiVar.a(context, i2);
            }
            if (colorStateListA != null) {
                WeakHashMap weakHashMap2 = this.f1481d;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new WeakHashMap();
                    this.f1481d = weakHashMap2;
                }
                SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) weakHashMap2.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat();
                    this.f1481d.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.append(i2, colorStateListA);
                return colorStateListA;
            }
            colorStateList = colorStateListA;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context r7, int r8, boolean r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f1484g     // Catch: java.lang.Throwable -> Lb1
            r1 = 1
            if (r0 == 0) goto L7
            goto L26
        L7:
            r6.f1484g = r1     // Catch: java.lang.Throwable -> Lb1
            r0 = 2131230844(0x7f08007c, float:1.8077752E38)
            android.graphics.drawable.Drawable r0 = r6.c(r7, r0)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto La6
            boolean r2 = r0 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat     // Catch: java.lang.Throwable -> Lb1
            if (r2 != 0) goto L26
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r2 = "android.graphics.drawable.VectorDrawable"
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto La6
        L26:
            android.util.TypedValue r0 = r6.f1483f     // Catch: java.lang.Throwable -> Lb1
            if (r0 != 0) goto L31
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch: java.lang.Throwable -> Lb1
            r0.<init>()     // Catch: java.lang.Throwable -> Lb1
            r6.f1483f = r0     // Catch: java.lang.Throwable -> Lb1
        L31:
            android.content.res.Resources r2 = r7.getResources()     // Catch: java.lang.Throwable -> Lb1
            r2.getValue(r8, r0, r1)     // Catch: java.lang.Throwable -> Lb1
            int r1 = r0.assetCookie     // Catch: java.lang.Throwable -> Lb1
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lb1
            int r3 = r0.data     // Catch: java.lang.Throwable -> Lb1
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lb1
            r5 = 32
            long r1 = r1 << r5
            long r1 = r1 | r3
            android.graphics.drawable.Drawable r3 = r6.i(r7, r1)     // Catch: java.lang.Throwable -> Lb1
            r4 = 0
            if (r3 != 0) goto L5d
            android.support.v7.widget.fi r3 = r6.f1485h     // Catch: java.lang.Throwable -> Lb1
            if (r3 != 0) goto L4f
            r3 = r4
            goto L53
        L4f:
            android.graphics.drawable.Drawable r3 = r3.b(r6, r7, r8)     // Catch: java.lang.Throwable -> Lb1
        L53:
            if (r3 == 0) goto L5d
            int r0 = r0.changingConfigurations     // Catch: java.lang.Throwable -> Lb1
            r3.setChangingConfigurations(r0)     // Catch: java.lang.Throwable -> Lb1
            r6.j(r7, r1, r3)     // Catch: java.lang.Throwable -> Lb1
        L5d:
            if (r3 != 0) goto L63
            android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r7, r8)     // Catch: java.lang.Throwable -> Lb1
        L63:
            if (r3 == 0) goto L9e
            android.content.res.ColorStateList r0 = r6.a(r7, r8)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L85
            android.graphics.drawable.Drawable r7 = r3.mutate()     // Catch: java.lang.Throwable -> Lb1
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r7, r0)     // Catch: java.lang.Throwable -> Lb1
            android.support.v7.widget.fi r9 = r6.f1485h     // Catch: java.lang.Throwable -> Lb1
            if (r9 != 0) goto L77
            goto L7e
        L77:
            r9 = 2131230831(0x7f08006f, float:1.8077726E38)
            if (r8 != r9) goto L7e
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Throwable -> Lb1
        L7e:
            if (r4 == 0) goto L83
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r7, r4)     // Catch: java.lang.Throwable -> Lb1
        L83:
            r4 = r7
            goto L9f
        L85:
            android.support.v7.widget.fi r0 = r6.f1485h     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L90
            boolean r0 = r0.c(r7, r8, r3)     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L90
            goto L9e
        L90:
            android.support.v7.widget.fi r0 = r6.f1485h     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L9b
            boolean r7 = r0.d(r7, r8, r3)     // Catch: java.lang.Throwable -> Lb1
            if (r7 == 0) goto L9b
            goto L9e
        L9b:
            if (r9 == 0) goto L9e
            goto L9f
        L9e:
            r4 = r3
        L9f:
            if (r4 == 0) goto La4
            android.support.v7.widget.cg.b(r4)     // Catch: java.lang.Throwable -> Lb1
        La4:
            monitor-exit(r6)
            return r4
        La6:
            r7 = 0
            r6.f1484g = r7     // Catch: java.lang.Throwable -> Lb1
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r8 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lb1
            throw r7     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lb1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.fj.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        LongSparseArray longSparseArray = (LongSparseArray) this.f1482e.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public final synchronized void g(fi fiVar) {
        this.f1485h = fiVar;
    }
}
