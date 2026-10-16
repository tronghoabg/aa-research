package a1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f17132a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f17133b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f17134c = new Object();

    public static void a(C1320j c1320j, int i5, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f17134c) {
            try {
                WeakHashMap weakHashMap = f17133b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(c1320j);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(c1320j, sparseArray);
                }
                sparseArray.append(i5, new C1319i(colorStateList, c1320j.f17130a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface b(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, a1.AbstractC1312b r16, boolean r17, boolean r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.l.b(android.content.Context, int, android.util.TypedValue, int, a1.b, boolean, boolean):android.graphics.Typeface");
    }
}
