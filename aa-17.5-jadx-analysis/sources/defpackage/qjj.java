package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.inputmethod.InputConnection;

/* loaded from: classes2.dex */
public final class qjj extends qjm {
    public final InputConnection a;
    private final Handler b = new Handler(Looper.getMainLooper(), new gly(this, 9));
    private final Runnable c;

    public qjj(InputConnection inputConnection, Runnable runnable) {
        this.a = inputConnection;
        this.c = runnable;
    }

    private final void h(String str) {
        Handler handler = this.b;
        handler.removeMessages(1);
        Message messageObtainMessage = handler.obtainMessage(1);
        messageObtainMessage.obj = str;
        handler.sendMessage(messageObtainMessage);
    }

    @Override // defpackage.qjm
    public final void c() {
        h("");
    }

    @Override // defpackage.qjm
    public final void d(String str, String str2) {
        if (str == null) {
            return;
        }
        h(str);
    }

    @Override // defpackage.qjm
    public final void e(String str) {
        if (str == null) {
            return;
        }
        h(str);
        Handler handler = this.b;
        handler.post(this.c);
        handler.post(new qjv(this, 1));
    }

    @Override // defpackage.qjm
    public final void f() {
    }

    @Override // defpackage.qjm
    public final void a(String str, int i) {
    }

    @Override // defpackage.qjm
    public final void b(String str, int i, Bitmap bitmap) {
    }
}
