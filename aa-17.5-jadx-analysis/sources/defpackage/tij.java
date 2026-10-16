package defpackage;

import android.content.Intent;
import android.content.res.Configuration;

/* loaded from: classes3.dex */
public final class tij extends qz {
    final /* synthetic */ tib c;
    private final aezr d = woy.dG(new tim(this, 1));

    public tij(tib tibVar) {
        this.c = tibVar;
    }

    @Override // defpackage.qz
    public final qw b(Intent intent) {
        intent.getClass();
        return this.c.e();
    }

    @Override // defpackage.qz
    public final void d(Configuration configuration) {
        configuration.getClass();
        f().b(configuration);
    }

    public final bwq f() {
        return (bwq) this.d.a();
    }
}
