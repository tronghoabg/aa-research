package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajqd extends java.lang.Exception {
    private static final long serialVersionUID = -5437299376222011036L;

    public ajqd(java.lang.String str, java.lang.Throwable th) {
        super(a(str));
        initCause(th);
    }

    static java.lang.String a(java.lang.String str) {
        int length;
        char[] charArray = str.toCharArray();
        int i = 0;
        while (true) {
            length = charArray.length;
            if (i >= length || charArray[i] < ' ') {
                break;
            }
            i++;
        }
        if (i == length) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c < ' ') {
                sb.append("[0x");
                java.lang.String hexString = java.lang.Integer.toHexString(i2);
                if (hexString.length() == 1) {
                    sb.append(com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.DBG_VALUE);
                }
                sb.append(hexString);
                sb.append("]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public ajqd(java.lang.String str) {
        super(a(str));
    }

    public ajqd() {
    }
}
