package androidx.work;

import android.content.Context;
import defpackage.fcj;
import defpackage.fiy;
import defpackage.fjo;
import defpackage.fjv;
import defpackage.flo;
import defpackage.vx;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class WorkManagerInitializer implements fcj<fjv> {
    private static final String a = fjo.b("WrkMgrInitializer");

    @Override // defpackage.fcj
    public final /* bridge */ /* synthetic */ Object a(Context context) {
        fjo.a().c(a, "Initializing WorkManager with default configuration.");
        fiy fiyVar = new fiy(new vx());
        context.getClass();
        flo.c(context, fiyVar);
        return fjv.a(context);
    }

    @Override // defpackage.fcj
    public final List b() {
        return Collections.EMPTY_LIST;
    }
}
