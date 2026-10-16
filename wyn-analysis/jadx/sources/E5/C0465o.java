package E5;

import android.os.SystemClock;
import android.text.TextUtils;
import f6.C2611x;
import u6.AbstractC4256a;

/* renamed from: E5.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0465o extends Exception implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3483a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3484b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3485c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3487e;

    /* renamed from: f, reason: collision with root package name */
    public final T f3488f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3489g;

    /* renamed from: h, reason: collision with root package name */
    public final C2611x f3490h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3491i;

    public C0465o(int i5, Exception exc, int i10) {
        this(i5, exc, i10, null, -1, null, 4, false);
    }

    public final C0465o a(C2611x c2611x) {
        String message = getMessage();
        int i5 = u6.v.f46721a;
        return new C0465o(message, getCause(), this.f3483a, this.f3485c, this.f3486d, this.f3487e, this.f3488f, this.f3489g, c2611x, this.f3484b, this.f3491i);
    }

    public C0465o(String str, Throwable th, int i5, int i10, String str2, int i11, T t10, int i12, C2611x c2611x, long j8, boolean z2) {
        super(str, th);
        this.f3483a = i5;
        this.f3484b = j8;
        AbstractC4256a.e(!z2 || i10 == 1);
        AbstractC4256a.e(th != null || i10 == 3);
        this.f3485c = i10;
        this.f3486d = str2;
        this.f3487e = i11;
        this.f3488f = t10;
        this.f3489g = i12;
        this.f3490h = c2611x;
        this.f3491i = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0465o(int i5, Exception exc, int i10, String str, int i11, T t10, int i12, boolean z2) {
        String str2;
        int i13;
        T t11;
        String string;
        String str3;
        if (i5 == 0) {
            str2 = str;
            i13 = i11;
            t11 = t10;
            string = "Source error";
        } else if (i5 != 1) {
            if (i5 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i13 = i11;
            t11 = t10;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i13 = i11;
            sb2.append(i13);
            sb2.append(", format=");
            t11 = t10;
            sb2.append(t11);
            sb2.append(", format_supported=");
            int i14 = u6.v.f46721a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i12 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : N0.a.f(string, ": null"), exc, i10, i5, str2, i13, t11, i12, null, SystemClock.elapsedRealtime(), z2);
    }
}
