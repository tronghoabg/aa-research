package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ojy extends ojj {
    public final Context a;
    boolean b;

    public ojy(Context context) {
        super(yxo.ONLY_KNOWN_CARS, false);
        this.b = false;
        this.a = context;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new ojx(this);
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
