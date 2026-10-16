package defpackage;

/* loaded from: classes3.dex */
public final class ahmu {
    public static final byte[] stringsToBytes(String[] strArr) {
        strArr.getClass();
        int i = 0;
        int length = 0;
        while (true) {
            if (i >= strArr.length) {
                break;
            }
            length += strArr[i].length();
            i++;
        }
        byte[] bArr = new byte[length];
        int i2 = 0;
        for (String str : strArr) {
            int length2 = str.length();
            int i3 = 0;
            while (i3 < length2) {
                bArr[i2] = (byte) str.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }
}
