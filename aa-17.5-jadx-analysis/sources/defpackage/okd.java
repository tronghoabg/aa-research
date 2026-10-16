package defpackage;

import android.content.Context;
import j$.time.Clock;
import j$.time.ZoneId;

/* loaded from: classes2.dex */
public final class okd extends ojj {
    public final Context a;
    public final Clock b;
    boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okd(Context context) {
        super(yxo.SESSION_OVERVIEW, true);
        Clock clockSystem = Clock.system(ZoneId.systemDefault());
        this.e = false;
        this.a = context;
        this.b = clockSystem;
    }

    @Override // defpackage.ojj
    public final ojn a() {
        return new okc(this);
    }

    @Override // defpackage.ojj
    public final void b() {
        this.e = true;
    }

    @Override // defpackage.ojj
    public final int d() {
        return this.e ? 2 : 1;
    }
}
