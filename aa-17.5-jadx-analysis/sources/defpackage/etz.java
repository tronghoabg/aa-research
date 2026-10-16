package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class etz {
    public int a;
    public int b;

    public etz(byte[] bArr) {
        this.a = Alert.DURATION_SHOW_INDEFINITELY;
        this.b = 0;
    }

    static /* synthetic */ Object a(String str) throws NumberFormatException {
        int i;
        str.getClass();
        if (afyh.g(str, "0x", false)) {
            String strSubstring = str.substring(2);
            strSubstring.getClass();
            i = Integer.parseInt(strSubstring, 16);
        } else {
            i = Integer.parseInt(str);
        }
        return Integer.valueOf(i);
    }

    public final void b() {
        this.b = 2;
    }

    public final void c(mo moVar) {
        View view = moVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public etz() {
        this.a = -1;
        this.b = -1;
    }

    public etz(byte[] bArr, byte[] bArr2) {
    }
}
