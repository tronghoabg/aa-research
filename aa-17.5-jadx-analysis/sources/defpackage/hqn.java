package defpackage;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class hqn {
    public final String a;
    public final String b;

    public hqn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            hqn hqnVar = (hqn) obj;
            if (TextUtils.equals(this.a, hqnVar.a) && TextUtils.equals(this.b, hqnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }
}
