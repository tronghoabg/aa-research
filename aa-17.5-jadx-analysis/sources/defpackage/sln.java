package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class sln extends sll {
    public final rjr b;

    public sln(rjr rjrVar, nok nokVar) {
        super(3, nokVar);
        this.b = rjrVar;
    }

    @Override // defpackage.slk
    public final int a(sme smeVar) {
        return ((smw) this.b.b).d;
    }

    @Override // defpackage.slk
    public final boolean c(sme smeVar) {
        return ((smw) this.b.b).c;
    }

    @Override // defpackage.slk
    public final Feature[] d(sme smeVar) {
        return ((smw) this.b.b).b;
    }

    @Override // defpackage.sll
    public final void e(sme smeVar) throws RemoteException {
        rjr rjrVar = this.b;
        smw smwVar = (smw) rjrVar.b;
        smwVar.b(smeVar.b, this.a);
        smp smpVarA = smwVar.a();
        if (smpVarA != null) {
            smeVar.e.put(smpVarA, rjrVar);
        }
    }

    @Override // defpackage.sll, defpackage.slq
    public final /* bridge */ /* synthetic */ void i(rju rjuVar, boolean z) {
    }
}
