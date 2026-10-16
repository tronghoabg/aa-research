package defpackage;

import android.content.res.Resources;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class mpn implements nsg {
    @Override // defpackage.nsg
    public final void a(qrn qrnVar, nso nsoVar) throws Resources.NotFoundException, qrz {
        int i = mpo.a;
        mpm.c();
        int i2 = 1;
        wer.c();
        CarActivityLayoutConfig carActivityLayoutConfigB = mpm.b(qrnVar, Arrays.asList(nsoVar));
        mki.a.g();
        raj rajVar = raj.t;
        rce rceVar = ((raz) qrnVar).a;
        rdj rdjVar = (rdj) rceVar;
        if (!rdjVar.p(rajVar)) {
            throw new IllegalStateException("This API can only be used if multi-display is enabled");
        }
        rdjVar.f.g(new rcu(rceVar, carActivityLayoutConfigB, i2, null));
    }
}
