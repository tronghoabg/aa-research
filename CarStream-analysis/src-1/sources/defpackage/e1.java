package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class e1 {
    public final Handler a = new Handler(Looper.getMainLooper());
    public String b;
    public Bitmap c;

    public final void a(String str, d1 d1Var) {
        if (str.isEmpty() || str.equals(this.b)) {
            return;
        }
        this.b = str;
        this.c = null;
        new Thread(new y(this, str, d1Var, 1), "cnmedia-art").start();
    }
}
