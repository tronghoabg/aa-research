package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class kfv {
    public Uri a;
    private int b = 2048;
    private int c = 2048;
    private final Context d;

    public kfv(Context context) {
        this.d = context;
    }

    public final kfw a() {
        kfw kfwVar = new kfw();
        if (!TextUtils.isEmpty(null)) {
            kfwVar.a = new Intent.ShortcutIconResource();
            kfwVar.a.packageName = null;
            kfwVar.a.resourceName = null;
        }
        int iMax = Math.max(this.b, this.c);
        if (iMax > 2048) {
            double d = 2048.0d / iMax;
            this.b = (int) (this.b * d);
            this.c = (int) (this.c * d);
        }
        kfwVar.b = this.a;
        kfwVar.c = this.b;
        kfwVar.d = this.c;
        kfwVar.e = this.d;
        if (kfwVar.a == null && kfwVar.b == null) {
            throw new RuntimeException("Both Icon and ResourceUri are null");
        }
        return kfwVar;
    }

    public final void b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bp(i, "Can't set height to "));
        }
        this.c = i;
    }

    public final void c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bp(i, "Can't set width to "));
        }
        this.b = i;
    }
}
