package defpackage;

import com.carstream.tech.launcher.Weather;
import java.io.OutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e7(l7 l7Var, int i, OutputStream outputStream) {
        this.c = l7Var;
        this.b = i;
        this.d = outputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l7 l7Var = (l7) this.c;
                int i = this.b;
                OutputStream outputStream = (OutputStream) this.d;
                try {
                    byte[] bArr = new byte[13];
                    bArr[0] = 76;
                    l7.h(bArr, 1, i);
                    synchronized (l7Var) {
                        outputStream.write(bArr);
                        outputStream.flush();
                    }
                    break;
                } catch (Exception e) {
                    e0 e0Var = l7Var.a;
                    String strConcat = "[MIRROR] do sang loi: ".concat(String.valueOf(e));
                    e0Var.getClass();
                    e0.d(strConcat);
                    return;
                }
            default:
                ((Weather) this.c).lambda$nap$0((String) this.d, this.b);
                break;
        }
    }

    public /* synthetic */ e7(Weather weather, String str, int i) {
        this.c = weather;
        this.d = str;
        this.b = i;
    }
}
