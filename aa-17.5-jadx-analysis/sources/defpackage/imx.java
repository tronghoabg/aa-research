package defpackage;

import android.window.InputTransferToken;
import j$.util.Objects;

/* loaded from: classes.dex */
final class imx extends ebj {
    public final int a;
    public final InputTransferToken b;
    public final int c;

    public imx(int i, InputTransferToken inputTransferToken, int i2) {
        this.a = i;
        this.b = inputTransferToken;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof imx) {
            imx imxVar = (imx) obj;
            if (this.a == imxVar.a && this.c == imxVar.c && Objects.equals(this.b, imxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), this.b, Integer.valueOf(this.c)};
        String[] strArrSplit = "windowId;token;virtualDisplayId".split(";");
        StringBuilder sb = new StringBuilder("imx[");
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
