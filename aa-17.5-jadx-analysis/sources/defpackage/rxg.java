package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class rxg extends ContentObserver {
    final /* synthetic */ rxh a;
    public final /* synthetic */ rxi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxg(rxi rxiVar, Handler handler, rxh rxhVar) {
        super(handler);
        this.a = rxhVar;
        this.b = rxiVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        super.onChange(z, uri);
        this.b.c.execute(new rpo(this, this.a, 10, null));
    }
}
