package defpackage;

import java.util.Locale;

@Deprecated
/* loaded from: classes2.dex */
public final class ajtp {
    public final String a;
    public final ajtu b;
    public final int c;
    public final boolean d;
    private String e;

    public ajtp(String str, int i, ajtu ajtuVar) {
        this.a = str.toLowerCase(Locale.ENGLISH);
        this.c = i;
        if (ajtuVar instanceof ajtq) {
            this.d = true;
            this.b = ajtuVar;
        } else if (ajtuVar instanceof ajtm) {
            this.d = true;
            this.b = new ajtr((ajtm) ajtuVar);
        } else {
            this.d = false;
            this.b = ajtuVar;
        }
    }

    public final int a(int i) {
        return i <= 0 ? this.c : i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajtp) {
            ajtp ajtpVar = (ajtp) obj;
            if (this.a.equals(ajtpVar.a) && this.c == ajtpVar.c && this.d == ajtpVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (ahku.c(this.c + 629, this.a) * 37) + (this.d ? 1 : 0);
    }

    public final String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String str2 = this.a + ':' + Integer.toString(this.c);
        this.e = str2;
        return str2;
    }

    @Deprecated
    public ajtp(String str, ajtw ajtwVar, int i) {
        boolean z;
        this.a = str.toLowerCase(Locale.ENGLISH);
        if (ajtwVar instanceof ajtn) {
            this.b = new ajts((ajtn) ajtwVar);
            z = true;
        } else {
            this.b = new ajtv(ajtwVar);
            z = false;
        }
        this.d = z;
        this.c = i;
    }
}
