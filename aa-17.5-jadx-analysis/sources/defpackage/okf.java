package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes2.dex */
public final class okf extends ojj {
    public final Context a;

    public okf(Context context) {
        super(yxo.SIDELOAD, false);
        this.a = context;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new oke(this);
    }

    @Override // defpackage.ojj
    public final int d() {
        return (Build.VERSION.SDK_INT < 29 || this.a.checkSelfPermission("android.permission.MANAGE_USB") == 0) ? 1 : 2;
    }

    @Override // defpackage.ojj
    public final void b() {
    }
}
