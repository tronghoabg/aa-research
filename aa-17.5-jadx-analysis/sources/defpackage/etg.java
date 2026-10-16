package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class etg implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final HashMap d = new HashMap();
    public etf e;
    public final /* synthetic */ ett f;
    public final erb g;

    public etg(ett ettVar, String str, int i, int i2, erb erbVar) {
        this.f = ettVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        new etu(str, i, i2);
        this.g = erbVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f.d.post(new elt(this, 4, null));
    }
}
