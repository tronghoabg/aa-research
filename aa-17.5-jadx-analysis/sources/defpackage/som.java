package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
final class som implements IInterface {
    public final IBinder a;

    public som(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
