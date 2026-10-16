package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    protected String f37588a;

    /* renamed from: b, reason: collision with root package name */
    protected String f37589b;

    /* renamed from: c, reason: collision with root package name */
    protected char f37590c;

    /* renamed from: d, reason: collision with root package name */
    protected l f37591d;

    /* renamed from: e, reason: collision with root package name */
    protected l f37592e;

    /* synthetic */ l(String str, String str2, l lVar, int i5) {
        this(str, str2, lVar);
    }

    protected boolean b(char c10, char c11) {
        return c10 == c11;
    }

    private l(String str, String str2, l lVar) {
        this.f37588a = str;
        this.f37589b = str2;
        this.f37591d = lVar;
        if (str.isEmpty()) {
            this.f37590c = (char) 65535;
        } else {
            this.f37590c = this.f37588a.charAt(0);
        }
    }

    public static l e(Set set, q qVar) {
        l lVar = qVar.j() ? new l("", null, null) : new k("", null, null);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            lVar.a(str, str);
        }
        return lVar;
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!f(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f37588a.length() + index;
        l lVar = this.f37591d;
        if (lVar != null && length2 != length) {
            while (true) {
                if (b(lVar.f37590c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strC = lVar.c(charSequence, parsePosition);
                    if (strC != null) {
                        return strC;
                    }
                } else {
                    lVar = lVar.f37592e;
                    if (lVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f37589b;
    }

    protected l d(String str, String str2, l lVar) {
        return new l(str, str2, lVar);
    }

    protected boolean f(CharSequence charSequence, int i5, int i10) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f37588a, i5);
        }
        int length = this.f37588a.length();
        if (length > i10 - i5) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i13 = i11 + 1;
            int i14 = i5 + 1;
            if (!b(this.f37588a.charAt(i11), charSequence.charAt(i5))) {
                return false;
            }
            i5 = i14;
            length = i12;
            i11 = i13;
        }
    }

    private boolean a(String str, String str2) {
        int i5 = 0;
        while (i5 < str.length() && i5 < this.f37588a.length() && b(str.charAt(i5), this.f37588a.charAt(i5))) {
            i5++;
        }
        if (i5 == this.f37588a.length()) {
            if (i5 < str.length()) {
                String strSubstring = str.substring(i5);
                for (l lVar = this.f37591d; lVar != null; lVar = lVar.f37592e) {
                    if (b(lVar.f37590c, strSubstring.charAt(0))) {
                        return lVar.a(strSubstring, str2);
                    }
                }
                l lVarD = d(strSubstring, str2, null);
                lVarD.f37592e = this.f37591d;
                this.f37591d = lVarD;
                return true;
            }
            this.f37589b = str2;
            return true;
        }
        l lVarD2 = d(this.f37588a.substring(i5), this.f37589b, this.f37591d);
        this.f37588a = str.substring(0, i5);
        this.f37591d = lVarD2;
        if (i5 < str.length()) {
            this.f37591d.f37592e = d(str.substring(i5), str2, null);
            this.f37589b = null;
            return true;
        }
        this.f37589b = str2;
        return true;
    }
}
