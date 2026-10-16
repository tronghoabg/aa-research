package h7;

import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Locale;

/* renamed from: h7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2793a {

    /* renamed from: a, reason: collision with root package name */
    public final String f36221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36222b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36223c;

    public C2793a(String str, String... strArr) {
        String string;
        int i5 = 2;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f36222b = string;
        this.f36221a = str;
        AbstractC1732v.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i5 <= 7 && !Log.isLoggable(this.f36221a, i5)) {
            i5++;
        }
        this.f36223c = i5;
    }

    public final void a(String str, Object... objArr) {
        if (this.f36223c <= 3) {
            Log.d(this.f36221a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f36221a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f36221a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f36222b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f36223c <= 2) {
            Log.v(this.f36221a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f36221a, d(str, objArr));
    }
}
