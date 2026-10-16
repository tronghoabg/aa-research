package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class kfg extends ContentObserver {
    final /* synthetic */ kfi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfg(kfi kfiVar, Handler handler) {
        super(handler);
        this.a = kfiVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ((ype) kfi.a.l().ai((char) 2986)).u("Content observer changed");
        this.a.a();
    }
}
