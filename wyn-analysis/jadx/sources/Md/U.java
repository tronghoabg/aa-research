package md;

import java.util.Comparator;

/* loaded from: classes5.dex */
public final class U implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) throws ClassNotFoundException {
        int i5;
        T t10 = (T) obj2;
        ((pd.i) ((T) obj)).getClass();
        int i10 = 3;
        try {
            Class.forName("android.app.Application", false, pd.i.class.getClassLoader());
            i5 = 8;
        } catch (Exception unused) {
            i5 = 3;
        }
        ((pd.i) t10).getClass();
        try {
            Class.forName("android.app.Application", false, pd.i.class.getClassLoader());
            i10 = 8;
        } catch (Exception unused2) {
        }
        return i5 - i10;
    }
}
