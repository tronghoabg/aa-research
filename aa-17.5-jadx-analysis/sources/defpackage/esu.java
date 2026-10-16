package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class esu extends ContentObserver {
    final /* synthetic */ esv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esu(esv esvVar) {
        super(new Handler());
        this.a = esvVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.o();
    }
}
