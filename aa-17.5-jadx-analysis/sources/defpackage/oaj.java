package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
public final class oaj extends ContentObserver {
    final /* synthetic */ oak a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oaj(oak oakVar, Handler handler) {
        super(handler);
        this.a = oakVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.j(Boolean.valueOf(oak.a()));
    }
}
