package defpackage;

import com.google.android.gms.common.api.Status;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class sjl extends sje {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicReference b = new AtomicReference();
    public final sjd c;
    public final String d;
    public final /* synthetic */ sjm e;
    private final List f;

    public sjl(sjm sjmVar, sjd sjdVar, List list, String str) {
        this.e = sjmVar;
        this.c = sjdVar;
        this.f = list;
        this.d = str;
    }

    @Override // defpackage.sje
    public final void c(Status status) {
        List list = this.f;
        if (sjm.b(list)) {
            sji.a(((sjk) list.get(0)).a.a.f, 1035);
        } else {
            sji.a(this.d, 1028);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sji.a(((sjk) it.next()).a.a.f, 1029);
            }
        }
        Stream map = Collection.EL.stream(list).map(new ric(10));
        int i = yfq.d;
        yfq yfqVar = (yfq) map.collect(ycm.a);
        int size = yfqVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            a$$ExternalSyntheticApiModelOutline3.m39m((Object) yfqVar.get(i2)).accept(status);
        }
        if (this.a.getAndSet(true)) {
            sji.a(this.d, 1031);
            return;
        }
        Future future = (Future) this.b.get();
        if (future != null) {
            future.cancel(false);
        }
        this.e.a(this.c, this.d);
    }
}
