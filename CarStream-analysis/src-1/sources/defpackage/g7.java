package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ l7 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ OutputStream d;

    public /* synthetic */ g7(l7 l7Var, String str, int i, OutputStream outputStream) {
        this.a = l7Var;
        this.b = str;
        this.c = i;
        this.d = outputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l7 l7Var = this.a;
        String str = this.b;
        int i = this.c;
        OutputStream outputStream = this.d;
        try {
            byte[] bytes = str == null ? new byte[0] : str.getBytes("UTF-8");
            byte[] bArr = new byte[13];
            bArr[0] = 80;
            l7.h(bArr, 1, i);
            l7.h(bArr, 5, bytes.length);
            synchronized (l7Var) {
                try {
                    outputStream.write(bArr);
                    if (bytes.length > 0) {
                        outputStream.write(bytes);
                    }
                    outputStream.flush();
                } finally {
                }
            }
        } catch (Exception e) {
            e0 e0Var = l7Var.a;
            String strConcat = "[MIRROR] bao app cua o loi: ".concat(String.valueOf(e));
            e0Var.getClass();
            e0.d(strConcat);
        }
    }
}
