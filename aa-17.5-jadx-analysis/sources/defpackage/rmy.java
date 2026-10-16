package defpackage;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class rmy extends rng {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmy(boolean z, int i, int i2) {
        super("onAudioStateChanged");
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.rng
    public final void a(qwa qwaVar) throws RemoteException {
        qwaVar.f(this.a, this.b, this.c);
    }
}
