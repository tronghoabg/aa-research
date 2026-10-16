package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akfo {
    public static final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.concurrent.atomic.AtomicReferenceArray(25);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[RETURN] */
    public static boolean a(java.lang.String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public static java.lang.String b(int[] iArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = iArr[0];
        char cCharAt = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i < 25) {
                char cCharAt2 = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(cCharAt2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i2) != '\'') {
                        z = !z;
                    } else {
                        sb.append('\'');
                        i = i2;
                    }
                }
                i++;
            }
        } else {
            sb.append(cCharAt);
            while (true) {
                int i3 = i + 1;
                if (i3 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i3) != cCharAt) {
                    break;
                }
                sb.append(cCharAt);
                i = i3;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }
}
