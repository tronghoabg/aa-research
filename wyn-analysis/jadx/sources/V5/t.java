package V5;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f13144a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13145b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13146c;

    public t(String str, boolean z2, boolean z10) {
        this.f13144a = str;
        this.f13145b = z2;
        this.f13146c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != t.class) {
            return false;
        }
        t tVar = (t) obj;
        return TextUtils.equals(this.f13144a, tVar.f13144a) && this.f13145b == tVar.f13145b && this.f13146c == tVar.f13146c;
    }

    public final int hashCode() {
        return ((N0.a.c(31, 31, this.f13144a) + (this.f13145b ? 1231 : 1237)) * 31) + (this.f13146c ? 1231 : 1237);
    }
}
