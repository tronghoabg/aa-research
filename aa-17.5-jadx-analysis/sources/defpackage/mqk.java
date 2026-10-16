package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class mqk extends qz {
    public qw c;

    @Override // defpackage.qz
    public final qw b(Intent intent) {
        intent.getClass();
        if (lzf.c() && nrd.a().e() && acpf.k()) {
            this.c = new mqn(a(), new mqi());
            return f();
        }
        this.c = new mqj(a(), new mqg());
        return f();
    }

    public final qw f() {
        qw qwVar = this.c;
        if (qwVar != null) {
            return qwVar;
        }
        affa.d("launcherScreen");
        return null;
    }
}
