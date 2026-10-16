package Y4;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16700a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f16701b = new char[64];

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(int i5, int i10, Bitmap.Config config) {
        int i11 = i5 * i10;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i12 = l.f16699a[config.ordinal()];
        int i13 = 1;
        if (i12 != 1) {
            i13 = 2;
            if (i12 != 2 && i12 != 3) {
                i13 = 4;
                if (i12 == 4) {
                    i13 = 8;
                }
            }
        }
        return i11 * i13;
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static ArrayList d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int e(int i5, int i10) {
        return (i10 * 31) + i5;
    }

    public static int f(int i5, Object obj) {
        return e(obj == null ? 0 : obj.hashCode(), i5);
    }

    public static boolean g(int i5, int i10) {
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }
        return false;
    }
}
