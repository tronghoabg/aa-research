package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public final class oja extends ojj {
    public final Context a;

    public oja(Context context) {
        super(yxo.BLUETOOTH_CONNECT_PERMISSION_MISSING, false);
        this.a = context;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new oiz(this);
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 31 && this.a.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == -1;
    }

    @Override // defpackage.ojj
    public final int d() {
        return c() ? 2 : 1;
    }

    @Override // defpackage.ojj
    public final void b() {
    }
}
