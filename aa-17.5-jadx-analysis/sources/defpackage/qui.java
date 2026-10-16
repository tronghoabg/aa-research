package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.AudioFocusInfo;

/* loaded from: classes2.dex */
public final class qui extends ijo implements quj {
    public final itc a;
    private final Handler b;

    public qui(itc itcVar, Looper looper) {
        super("com.google.android.gms.car.IAudioPolicyFocusListener");
        this.a = itcVar;
        this.b = new Handler(looper);
    }

    @Override // defpackage.quj
    public final void e(AudioFocusInfo audioFocusInfo) {
        this.b.post(new ily(2));
    }

    @Override // defpackage.quj
    public final void f(AudioFocusInfo audioFocusInfo, int i) {
        this.b.post(new oa(this, audioFocusInfo, i, 5));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            AudioFocusInfo audioFocusInfo = (AudioFocusInfo) ijp.a(parcel, AudioFocusInfo.CREATOR);
            int i2 = parcel.readInt();
            ijp.d(parcel);
            f(audioFocusInfo, i2);
        } else if (i == 2) {
            AudioFocusInfo audioFocusInfo2 = (AudioFocusInfo) ijp.a(parcel, AudioFocusInfo.CREATOR);
            boolean zJ = ijp.j(parcel);
            ijp.d(parcel);
            g(audioFocusInfo2, zJ);
        } else if (i == 3) {
            AudioFocusInfo audioFocusInfo3 = (AudioFocusInfo) ijp.a(parcel, AudioFocusInfo.CREATOR);
            int i3 = parcel.readInt();
            ijp.d(parcel);
            h(audioFocusInfo3, i3);
        } else {
            if (i != 4) {
                return false;
            }
            AudioFocusInfo audioFocusInfo4 = (AudioFocusInfo) ijp.a(parcel, AudioFocusInfo.CREATOR);
            ijp.d(parcel);
            e(audioFocusInfo4);
        }
        return true;
    }

    @Override // defpackage.quj
    public final void g(AudioFocusInfo audioFocusInfo, boolean z) {
        this.b.post(new lvn(this, audioFocusInfo, z, 1));
    }

    @Override // defpackage.quj
    public final void h(AudioFocusInfo audioFocusInfo, int i) {
        this.b.post(new ily(3));
    }
}
