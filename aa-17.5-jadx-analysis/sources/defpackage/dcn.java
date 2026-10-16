package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class dcn extends ContentObserver {
    final /* synthetic */ aixl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcn(aixl aixlVar, Handler handler) {
        super(handler);
        this.a = aixlVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.j(afak.a);
    }
}
