package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ojs extends ojj {
    private final Context a;
    private int b;

    public ojs(Context context) {
        super(yxo.NO_HFP, false);
        this.b = 1;
        this.a = context;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new ojr(this, this.a);
    }

    @Override // defpackage.ojj
    public final void b() {
        this.b = 2;
    }

    @Override // defpackage.ojj
    public final int d() {
        return this.b;
    }
}
