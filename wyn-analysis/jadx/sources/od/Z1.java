package od;

import java.util.logging.Logger;
import k8.AbstractC3198g;

/* loaded from: classes5.dex */
public abstract class Z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f41868a = Logger.getLogger(Z1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f41869b = "-bin".getBytes(AbstractC3198g.f39299a);

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i5 = length; i5 < bArr.length; i5++) {
            if (bArr[i5] != bArr2[i5 - length]) {
                return false;
            }
        }
        return true;
    }
}
