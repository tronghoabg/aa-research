package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class mjf implements lhg {
    private final Context a = mki.a.c;

    @Override // defpackage.lhg
    public final void c() {
        this.a.startService(new Intent().setComponent(mkn.G));
    }

    @Override // defpackage.lhg
    public final void d() {
        this.a.stopService(new Intent().setComponent(mkn.G));
    }
}
