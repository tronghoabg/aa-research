package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class mnh {
    public final String a;
    public final int b;
    public final char c;
    public final boolean d;
    public final boolean e;

    public mnh(String str, int i, char c, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = c;
        this.d = z;
        this.e = z2;
    }

    public static mng a() {
        mng mngVar = new mng();
        mngVar.c = (byte) (mngVar.c | 1);
        mngVar.c((char) 0);
        mngVar.b();
        mngVar.c = (byte) (mngVar.c | 2);
        mngVar.d(false);
        mngVar.b = Alert.DURATION_SHOW_INDEFINITELY;
        mngVar.c = (byte) (mngVar.c | 4);
        return mngVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mnh) {
            mnh mnhVar = (mnh) obj;
            String str = this.a;
            if (str != null ? str.equals(mnhVar.a) : mnhVar.a == null) {
                if (this.b == mnhVar.b && this.c == mnhVar.c && this.d == mnhVar.d && this.e == mnhVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.b;
        char c = this.c;
        return ((((((((iHashCode ^ 1000003) * 583896283) ^ i) * 1000003) ^ c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        return "Column{name=" + this.a + ", width=0, minWidth=0, maxWidth=" + this.b + ", border=" + this.c + ", autoWidth=" + this.d + ", leftAligned=" + this.e + "}";
    }

    public mnh() {
        throw null;
    }
}
