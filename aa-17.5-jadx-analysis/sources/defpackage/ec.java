package defpackage;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes2.dex */
public final class ec implements Runnable {
    final int a;
    final Bundle b;
    final /* synthetic */ ResultReceiver c;

    public ec(ResultReceiver resultReceiver, int i, Bundle bundle) {
        this.c = resultReceiver;
        this.a = i;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b);
    }
}
