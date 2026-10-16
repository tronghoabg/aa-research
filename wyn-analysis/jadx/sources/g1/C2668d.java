package g1;

import android.os.Build;
import java.util.Locale;

/* renamed from: g1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2668d {

    /* renamed from: b, reason: collision with root package name */
    public static final C2668d f35496b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2670f f35497a;

    public C2668d(InterfaceC2670f interfaceC2670f) {
        this.f35497a = interfaceC2670f;
    }

    public static C2668d a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C2668d(new g(Y0.a.b(localeArr))) : new C2668d(new C2669e(localeArr));
    }

    public static C2668d b(String str) {
        if (str == null || str.isEmpty()) {
            return f35496b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str2 = strArrSplit[i5];
            int i10 = AbstractC2667c.f35495a;
            localeArr[i5] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2668d) {
            return this.f35497a.equals(((C2668d) obj).f35497a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35497a.hashCode();
    }

    public final String toString() {
        return this.f35497a.toString();
    }
}
