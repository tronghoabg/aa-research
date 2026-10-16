package defpackage;

import android.os.RemoteException;
import androidx.car.app.ISurfaceCallback;

/* loaded from: classes2.dex */
public final /* synthetic */ class glj implements afdr {
    public final /* synthetic */ ISurfaceCallback a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    private final /* synthetic */ int d;

    public /* synthetic */ glj(ISurfaceCallback iSurfaceCallback, float f, float f2, int i) {
        this.d = i;
        this.a = iSurfaceCallback;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.afdr
    public final Object invoke() throws RemoteException {
        int i = this.d;
        if (i == 0) {
            float f = this.c;
            this.a.onFling(this.b, f);
            return afak.a;
        }
        float f2 = this.c;
        if (i != 1) {
            this.a.onClick(this.b, f2);
            return afak.a;
        }
        this.a.onScroll(this.b, f2);
        return afak.a;
    }
}
