package defpackage;

import android.content.Context;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class okl extends ojj {
    public final Context a;

    public okl(Context context) {
        super(yxo.USB_DEBUGGING, false);
        this.a = context;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new okk(this);
    }

    @Override // defpackage.ojj
    public final int d() {
        return Settings.Global.getInt(this.a.getContentResolver(), "adb_enabled", 0) == 1 ? 2 : 1;
    }

    @Override // defpackage.ojj
    public final void b() {
    }
}
