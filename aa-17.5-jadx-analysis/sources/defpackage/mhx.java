package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class mhx extends ijo implements mhy {
    final /* synthetic */ mid a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhx(mid midVar) {
        super("com.google.android.apps.auto.components.projectionstate.IProjectionStateOwner");
        this.a = midVar;
    }

    @Override // defpackage.mhy
    public final boolean e() {
        return this.a.e;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        boolean zE = e();
        parcel2.writeNoException();
        ClassLoader classLoader = ijp.a;
        parcel2.writeInt(zE ? 1 : 0);
        return true;
    }
}
