package defpackage;

import androidx.core.internal.view.SupportMenu;
import java.io.OutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ l7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ OutputStream g;

    public /* synthetic */ h7(l7 l7Var, int i, int i2, int i3, int i4, int i5, OutputStream outputStream) {
        this.a = l7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = outputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l7 l7Var = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        OutputStream outputStream = this.g;
        try {
            byte[] bArr = new byte[13];
            bArr[0] = 81;
            l7.h(bArr, 1, i);
            l7.h(bArr, 5, ((i2 & SupportMenu.USER_MASK) << 16) | (i3 & SupportMenu.USER_MASK));
            l7.h(bArr, 9, (65535 & i5) | ((i4 & SupportMenu.USER_MASK) << 16));
            synchronized (l7Var) {
                outputStream.write(bArr);
                outputStream.flush();
            }
        } catch (Exception e) {
            e0 e0Var = l7Var.a;
            String strConcat = "[MIRROR] bao o bang loi: ".concat(String.valueOf(e));
            e0Var.getClass();
            e0.d(strConcat);
        }
    }
}
