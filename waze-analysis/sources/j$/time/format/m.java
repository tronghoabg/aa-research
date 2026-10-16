package j$.time.format;

import java.text.ParsePosition;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public String f49962a;

    /* renamed from: b, reason: collision with root package name */
    public String f49963b;

    /* renamed from: c, reason: collision with root package name */
    public final char f49964c;

    /* renamed from: d, reason: collision with root package name */
    public m f49965d;

    /* renamed from: e, reason: collision with root package name */
    public m f49966e;

    public m(String str, String str2, m mVar) {
        this.f49962a = str;
        this.f49963b = str2;
        this.f49965d = mVar;
        if (str.isEmpty()) {
            this.f49964c = (char) 65535;
        } else {
            this.f49964c = this.f49962a.charAt(0);
        }
    }

    public final boolean a(String str, String str2) {
        int i2 = 0;
        while (i2 < str.length() && i2 < this.f49962a.length() && b(str.charAt(i2), this.f49962a.charAt(i2))) {
            i2++;
        }
        if (i2 != this.f49962a.length()) {
            m mVarD = d(this.f49962a.substring(i2), this.f49963b, this.f49965d);
            this.f49962a = str.substring(0, i2);
            this.f49965d = mVarD;
            if (i2 >= str.length()) {
                this.f49963b = str2;
                return true;
            }
            this.f49965d.f49966e = d(str.substring(i2), str2, null);
            this.f49963b = null;
            return true;
        }
        if (i2 >= str.length()) {
            this.f49963b = str2;
            return true;
        }
        String strSubstring = str.substring(i2);
        for (m mVar = this.f49965d; mVar != null; mVar = mVar.f49966e) {
            if (b(mVar.f49964c, strSubstring.charAt(0))) {
                return mVar.a(strSubstring, str2);
            }
        }
        m mVarD2 = d(strSubstring, str2, null);
        mVarD2.f49966e = this.f49965d;
        this.f49965d = mVarD2;
        return true;
    }

    public boolean b(char c2, char c3) {
        return c2 == c3;
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f49962a.length() + index;
        m mVar = this.f49965d;
        if (mVar != null && length2 != length) {
            while (true) {
                if (b(mVar.f49964c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strC = mVar.c(charSequence, parsePosition);
                    if (strC != null) {
                        return strC;
                    }
                } else {
                    mVar = mVar.f49966e;
                    if (mVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f49963b;
    }

    public m d(String str, String str2, m mVar) {
        return new m(str, str2, mVar);
    }

    public boolean e(CharSequence charSequence, int i2, int i3) {
        boolean z = charSequence instanceof String;
        String str = this.f49962a;
        if (z) {
            return ((String) charSequence).startsWith(str, i2);
        }
        int length = str.length();
        if (length > i3 - i2) {
            return false;
        }
        int i4 = 0;
        while (true) {
            int i5 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i6 = i4 + 1;
            int i7 = i2 + 1;
            if (!b(this.f49962a.charAt(i4), charSequence.charAt(i2))) {
                return false;
            }
            i2 = i7;
            length = i5;
            i4 = i6;
        }
    }
}
