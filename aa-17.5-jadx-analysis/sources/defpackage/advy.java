package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class advy extends admr {
    final /* synthetic */ advz b;

    public advy(advz advzVar) {
        this.b = advzVar;
    }

    @Override // defpackage.admr
    public final String a() {
        return this.b.b;
    }

    @Override // defpackage.admr
    public final void d(adqs adqsVar) {
        List list = Collections.EMPTY_LIST;
        adis adisVar = adis.a;
        adqsVar.u(new admp(new adns(null, Collections.singletonList(new adjv(this.b.a))), adis.a, null));
    }

    @Override // defpackage.admr
    public final void c() {
    }
}
