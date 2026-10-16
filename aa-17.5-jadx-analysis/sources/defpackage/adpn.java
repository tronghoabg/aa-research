package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class adpn implements zge {
    final /* synthetic */ adqs a;

    public adpn(adqs adqsVar) {
        this.a = adqsVar;
    }

    @Override // defpackage.zge
    public final void a(Throwable th) {
        List list = Collections.EMPTY_LIST;
        this.a.u(new admp(adns.b(adnq.c(th)), adis.a, null));
    }

    @Override // defpackage.zge
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.u((admp) obj);
    }
}
