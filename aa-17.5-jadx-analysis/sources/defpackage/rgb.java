package defpackage;

import android.os.Binder;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class rgb extends quf {
    public static final ypf a = ols.R("CAR.AUDIO.PolicyBndr");
    private final qud b;
    private final yfq c;
    private final rwz d;
    private final rga e = new rga(this, 0);
    private final rhj f;

    public rgb(rhj rhjVar, qud qudVar, yfq yfqVar, rwz rwzVar) {
        this.f = rhjVar;
        this.b = qudVar;
        this.c = yfqVar;
        this.d = rwzVar;
    }

    @Override // defpackage.qug
    @ResultIgnorabilityUnspecified
    public final int e() throws RemoteException {
        try {
            this.b.asBinder().linkToDeath(this.e, 0);
            return this.f.b();
        } catch (RemoteException e) {
            throw new IllegalStateException("Unable to link to client death", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qug
    @ResultIgnorabilityUnspecified
    public final qum f(int i) {
        boolean z = false;
        if (i >= 0 && i < ((yls) this.c).c) {
            z = true;
        }
        yfq yfqVar = this.c;
        woy.Q(z, "index must be >= 0 and < %s", ((yls) yfqVar).c);
        int iIntValue = ((Integer) yfqVar.get(i)).intValue();
        rhj rhjVar = this.f;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        rge rgeVarD = rhjVar.d(iIntValue);
        Binder.restoreCallingIdentity(jClearCallingIdentity);
        if (rgeVarD == null) {
            return null;
        }
        return new rgd(rgeVarD, this.b, this.d);
    }

    @Override // defpackage.qug
    public final qum g(int i, int[] iArr) {
        yfq yfqVarO = yfq.o(wub.ax(iArr));
        rhj rhjVar = this.f;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        rge rgeVarE = rhjVar.e(i, yfqVarO);
        Binder.restoreCallingIdentity(jClearCallingIdentity);
        if (rgeVarE == null) {
            return null;
        }
        return new rgd(rgeVarE, this.b, this.d);
    }

    @Override // defpackage.qug
    public final void h() {
        try {
            this.b.asBinder().unlinkToDeath(this.e, 0);
        } catch (NoSuchElementException e) {
            a.h().p(e).ai(7989).u("Failed to unlink to client death; unregistering audio policy anyway.");
        }
        this.f.f();
    }
}
