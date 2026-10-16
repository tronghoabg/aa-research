package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class ajul {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;

    public ajul(String str, int i, String str2, boolean z) {
        ahgm.b(str, "Host");
        ahgm.e(str2, "Path");
        this.a = str.toLowerCase(Locale.ROOT);
        this.b = i;
        if (ahku.a(str2)) {
            this.c = "/";
        } else {
            this.c = str2;
        }
        this.d = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.d) {
            sb.append("(secure)");
        }
        sb.append(this.a);
        sb.append(':');
        sb.append(Integer.toString(this.b));
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
