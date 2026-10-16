package d2;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f34070a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34071b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34072c;

    public r(String str, boolean z2, boolean z10) {
        this.f34070a = str;
        this.f34071b = z2;
        this.f34072c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == r.class) {
            r rVar = (r) obj;
            if (TextUtils.equals(this.f34070a, rVar.f34070a) && this.f34071b == rVar.f34071b && this.f34072c == rVar.f34072c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((N0.a.c(31, 31, this.f34070a) + (this.f34071b ? 1231 : 1237)) * 31) + (this.f34072c ? 1231 : 1237);
    }
}
