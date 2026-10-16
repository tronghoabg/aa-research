package defpackage;

import androidx.core.view.InputDeviceCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e4 {
    public final byte[] a;
    public final int b;

    public e4(int i, byte[] bArr) {
        this.a = w1.g(bArr);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        if (e4Var.b != this.b) {
            return false;
        }
        return Arrays.equals(this.a, e4Var.a);
    }

    public final int hashCode() {
        int i;
        byte[] bArr = this.a;
        if (bArr == null) {
            i = 0;
        } else {
            int length = bArr.length;
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * InputDeviceCompat.SOURCE_KEYBOARD) ^ bArr[length];
            }
            i = i2;
        }
        return i ^ this.b;
    }
}
