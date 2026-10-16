package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* loaded from: classes2.dex */
public class ajpd extends Exception {
    private static final long serialVersionUID = -5437299376222011036L;

    public ajpd(String str, Throwable th) {
        super(a(str));
        initCause(th);
    }

    static String a(String str) {
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
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c < ' ') {
                sb.append("[0x");
                String hexString = Integer.toHexString(i2);
                if (hexString.length() == 1) {
                    sb.append(CloudRecognizerProtocolStrings.DBG_VALUE);
                }
                sb.append(hexString);
                sb.append("]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public ajpd(String str) {
        super(a(str));
    }

    public ajpd() {
    }
}
