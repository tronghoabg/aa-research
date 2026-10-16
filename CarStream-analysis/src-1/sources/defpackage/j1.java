package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ j1(l7 l7Var, int i) {
        this.a = i;
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        switch (this.a) {
            case 0:
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException unused) {
                }
                try {
                    this.b.b();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
        }
        while (this.b.e) {
            try {
                byte[] bArr = (byte[]) this.b.g.take();
                OutputStream outputStream = this.b.d;
                if (outputStream != null) {
                    try {
                        synchronized (this.b) {
                            outputStream.write(bArr);
                            outputStream.flush();
                        }
                        this.b.i = false;
                    } catch (Exception e) {
                        e0 e0Var = this.b.a;
                        String strConcat = "[MIRROR] gui touch loi: ".concat(String.valueOf(e));
                        e0Var.getClass();
                        e0.d(strConcat);
                    }
                } else if (!this.b.k) {
                    this.b.k = true;
                    this.b.a.getClass();
                    e0.d("[MIRROR] CHAM BI BO o hang doi: socket dut giua chung");
                }
            } catch (InterruptedException unused3) {
                return;
            }
        }
    }
}
