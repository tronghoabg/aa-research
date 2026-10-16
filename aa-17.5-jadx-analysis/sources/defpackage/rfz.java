package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.AudioFocusInfo;

/* loaded from: classes2.dex */
public final class rfz implements rfx {
    private final quj a;

    public rfz(quj qujVar) {
        this.a = qujVar;
    }

    @Override // defpackage.rfx
    public final void c(AudioFocusInfo audioFocusInfo) {
        try {
            this.a.e(audioFocusInfo);
        } catch (RemoteException e) {
            rgb.a.h().p(e).ai(7985).u("Failed to notify for onAudioFocusAbandon");
        }
    }

    @Override // defpackage.rfx
    public final void d(AudioFocusInfo audioFocusInfo, int i) {
        try {
            this.a.f(audioFocusInfo, i);
        } catch (RemoteException e) {
            rgb.a.h().p(e).ai(7986).u("Failed to notify for onAudioFocusGrant");
        }
    }

    @Override // defpackage.rfx
    public final void e(AudioFocusInfo audioFocusInfo, boolean z) {
        try {
            this.a.g(audioFocusInfo, z);
        } catch (RemoteException e) {
            rgb.a.h().p(e).ai(7987).u("Failed to notify for onAudioFocusLoss");
        }
    }

    @Override // defpackage.rfx
    public final void f(AudioFocusInfo audioFocusInfo, int i) {
        try {
            this.a.h(audioFocusInfo, i);
        } catch (RemoteException e) {
            rgb.a.h().p(e).ai(7988).u("Failed to notify for onAudioFocusRequest");
        }
    }
}
