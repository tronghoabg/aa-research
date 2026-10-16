package P1;

import Q1.x;
import android.os.Bundle;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9038a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f9039b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f9040c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f9041d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f9042e;

    static {
        int i5 = x.f9724a;
        f9038a = Integer.toString(0, 36);
        f9039b = Integer.toString(1, 36);
        f9040c = Integer.toString(2, 36);
        f9041d = Integer.toString(3, 36);
        f9042e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i5, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f9038a, spanned.getSpanStart(obj));
        bundle2.putInt(f9039b, spanned.getSpanEnd(obj));
        bundle2.putInt(f9040c, spanned.getSpanFlags(obj));
        bundle2.putInt(f9041d, i5);
        if (bundle != null) {
            bundle2.putBundle(f9042e, bundle);
        }
        return bundle2;
    }
}
