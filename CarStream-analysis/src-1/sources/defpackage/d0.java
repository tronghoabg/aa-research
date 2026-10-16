package defpackage;

import android.os.Bundle;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.mediaextensions.analytics.client.AnalyticsCallback;
import androidx.car.app.mediaextensions.analytics.client.AnalyticsParser;
import androidx.car.app.utils.RemoteUtils;
import androidx.lifecycle.Lifecycle;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d0(Lifecycle lifecycle, RemoteUtils.HostCall hostCall, String str) {
        this.a = 2;
        this.c = lifecycle;
        this.d = hostCall;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws UnsupportedEncodingException {
        switch (this.a) {
            case 0:
                AnalyticsParser.lambda$parseAnalyticsBundle$1((AnalyticsCallback) this.c, this.b, (Bundle) this.d);
                return;
            case 1:
                l7 l7Var = (l7) this.c;
                String str = this.b;
                OutputStream outputStream = (OutputStream) this.d;
                try {
                    byte[] bytes = str.getBytes("UTF-8");
                    byte[] bArr = new byte[13];
                    bArr[0] = 83;
                    l7.h(bArr, 1, bytes.length);
                    synchronized (l7Var) {
                        outputStream.write(bArr);
                        outputStream.write(bytes);
                        outputStream.flush();
                    }
                    return;
                } catch (Exception e) {
                    e0 e0Var = l7Var.a;
                    String strConcat = "[MIRROR] mo cai dat loi: ".concat(String.valueOf(e));
                    e0Var.getClass();
                    e0.d(strConcat);
                    return;
                }
            case 2:
                RemoteUtils.lambda$dispatchCallFromHost$2((Lifecycle) this.c, (RemoteUtils.HostCall) this.d, this.b);
                return;
            default:
                RemoteUtils.lambda$dispatchCallFromHost$0((IOnDoneCallback) this.c, this.b, (RemoteUtils.HostCall) this.d);
                return;
        }
    }

    public /* synthetic */ d0(Object obj, String str, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
        this.d = obj2;
    }
}
