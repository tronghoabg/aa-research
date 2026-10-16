package D6;

import android.os.RemoteException;
import x6.InterfaceC4484o;

/* renamed from: D6.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0398t0 implements InterfaceC4484o {

    /* renamed from: a, reason: collision with root package name */
    public final String f2496a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0396s0 f2497b;

    public C0398t0(InterfaceC0396s0 interfaceC0396s0) {
        String strZze;
        this.f2497b = interfaceC0396s0;
        try {
            strZze = interfaceC0396s0.zze();
        } catch (RemoteException e7) {
            H6.l.d("", e7);
            strZze = null;
        }
        this.f2496a = strZze;
    }

    public final String toString() {
        return this.f2496a;
    }
}
