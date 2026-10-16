package n4;

import android.content.Context;
import android.graphics.Typeface;
import x.C4429v;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3593a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4429v f40915a = new C4429v(0);

    public static Typeface a(Context context, String str) {
        C4429v c4429v = f40915a;
        synchronized (c4429v) {
            try {
                if (c4429v.containsKey(str)) {
                    return (Typeface) c4429v.get(str);
                }
                try {
                    Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/" + str);
                    c4429v.put(str, typefaceCreateFromAsset);
                    return typefaceCreateFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
