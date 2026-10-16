package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class okb extends ojj {
    public final Context a;
    boolean b;

    public okb(Context context) {
        super(yxo.REJECTED_CARS, false);
        this.b = false;
        this.a = context;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new oka(this);
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
