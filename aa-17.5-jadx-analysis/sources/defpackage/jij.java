package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
final class jij extends ContentObserver {
    final /* synthetic */ jkk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jij(Handler handler, jkk jkkVar) {
        super(handler);
        this.a = jkkVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        jim.D(((ina) this.a).l);
    }
}
