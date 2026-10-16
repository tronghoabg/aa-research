package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ojg extends ojj {
    public final Context a;
    boolean b;

    public ojg(Context context) {
        super(yxo.FLAKY_USB_CABLE, false);
        this.b = false;
        this.a = context;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new ojf(this);
    }

    @Override // defpackage.ojj
    public final void b() {
        this.b = true;
    }

    @Override // defpackage.ojj
    public final int d() {
        return this.b ? 2 : 1;
    }
}
