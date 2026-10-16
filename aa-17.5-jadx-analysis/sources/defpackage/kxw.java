package defpackage;

import android.media.AudioDeviceInfo;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class kxw extends ebj {
    public final String a;
    public final int b;
    public final AudioDeviceInfo c;
    private final String d;

    public kxw(String str, String str2, int i, AudioDeviceInfo audioDeviceInfo) {
        this.d = str;
        this.a = str2;
        this.b = i;
        this.c = audioDeviceInfo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kxw) {
            kxw kxwVar = (kxw) obj;
            if (this.b == kxwVar.b && Objects.equals(this.d, kxwVar.d) && Objects.equals(this.a, kxwVar.a) && Objects.equals(this.c, kxwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.a)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.d, this.a, Integer.valueOf(this.b), this.c};
        String[] strArrSplit = "name;address;type;deviceInfo".split(";");
        StringBuilder sb = new StringBuilder("kxw[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
