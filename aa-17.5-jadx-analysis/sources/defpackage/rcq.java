package defpackage;

import android.content.Intent;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class rcq implements rzd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rcq(rdj rdjVar, Intent intent, int i, int i2) {
        this.d = i2;
        this.c = rdjVar;
        this.b = intent;
        this.a = i;
    }

    @Override // defpackage.rzd, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        int i = this.d;
        if (i == 0) {
            return Boolean.valueOf(((rdj) this.b).C().bv((String) this.c, this.a));
        }
        if (i == 1) {
            return ((rdj) this.c).C().ag((Intent) this.b, this.a);
        }
        if (i == 2) {
            return ((rdj) this.c).C().ae((Intent) this.b, this.a);
        }
        Object obj = this.c;
        if (i != 3) {
            return ((rdj) obj).C().ah((Intent) this.b, this.a);
        }
        return ((rdj) obj).C().af((Intent) this.b, this.a);
    }

    public /* synthetic */ rcq(rdj rdjVar, String str, int i, int i2) {
        this.d = i2;
        this.b = rdjVar;
        this.c = str;
        this.a = i;
    }
}
