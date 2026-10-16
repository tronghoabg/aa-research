package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zcz implements Comparable, Serializable {
    private static final long serialVersionUID = -1105194233979842380L;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public transient Charset e;
    volatile transient String f;
    private final String g;
    private volatile transient zdc h;

    public zcz(String str, String str2, String str3, String str4, String str5, Charset charset) {
        this.a = c(str);
        this.b = str2;
        this.c = str3;
        this.g = str4;
        this.d = str5;
        this.e = charset;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ENGLISH);
    }

    private static String d(String str, String str2) {
        return str != null ? str2 : "";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        object.getClass();
        this.e = Charset.forName((String) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.e.name());
    }

    public final zcw a() {
        char cCharAt;
        String str = this.b;
        woy.ad(!woy.am(str), "Uri has no authority: %s", this);
        str.getClass();
        int iIndexOf = str.indexOf("@") + 1;
        int iIndexOf2 = str.indexOf(58, iIndexOf);
        if (iIndexOf2 < 0) {
            iIndexOf2 = str.length();
        } else {
            int i = iIndexOf2 + 1;
            int i2 = i;
            while (i2 < str.length() && (cCharAt = str.charAt(i2)) >= '0' && cCharAt <= '9') {
                i2++;
            }
            woy.ad(i2 == str.length() && i2 > i, "Authority doesn't match web pattern: %s", this);
        }
        String strSubstring = str.substring(iIndexOf, iIndexOf2);
        try {
            strSubstring.getClass();
            return new zcw(strSubstring);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("Invalid domain '" + strSubstring + "' found in URI '" + toString() + "'", e);
        }
    }

    public final zdc b() {
        zdc zdcVar;
        if (this.h == null) {
            String str = this.g;
            if (str == null) {
                zdcVar = zdc.a;
            } else {
                Charset charset = this.e;
                charset.getClass();
                zdc zdcVar2 = new zdc();
                if (!str.isEmpty()) {
                    String strName = charset.name();
                    int length = strName.length();
                    int i = 0;
                    boolean z = true;
                    if ((length < 9 || !strName.regionMatches(true, length - 9, "SHIFT_JIS", 0, 9)) && (length < 11 || !strName.regionMatches(true, length - 11, "WINDOWS-31J", 0, 11))) {
                        z = false;
                    }
                    while (i <= str.length()) {
                        int iIndexOf = str.indexOf(38, i);
                        if (iIndexOf == -1) {
                            iIndexOf = str.length();
                        }
                        int iIndexOf2 = str.indexOf(61, i);
                        if (iIndexOf2 > iIndexOf) {
                            iIndexOf2 = -1;
                        }
                        zdcVar2.t(zdc.j(str, i, iIndexOf2 == -1 ? iIndexOf : iIndexOf2, charset, z), iIndexOf2 == -1 ? "" : zdc.j(str, iIndexOf2 + 1, iIndexOf, charset, z));
                        i = iIndexOf + 1;
                    }
                }
                zdcVar = new zdc(new yky(zdcVar2.b));
            }
            this.h = zdcVar;
        }
        return this.h;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zcz zczVar = (zcz) obj;
        zczVar.getClass();
        return toString().compareTo(zczVar.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zcz) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        if (this.f != null) {
            return this.f;
        }
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.g;
        String str5 = this.d;
        String str6 = woy.al(str) + d(str, ":") + d(str2, "//") + woy.al(str2) + woy.al(str3) + d(str4, "?") + woy.al(str4) + d(str5, "#") + woy.al(str5);
        this.f = str6;
        return str6;
    }

    public zcz(String str, String str2, String str3, String str4, String str5, Charset charset, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.g = str4;
        this.d = str5;
        this.e = charset;
        this.f = str6;
    }
}
