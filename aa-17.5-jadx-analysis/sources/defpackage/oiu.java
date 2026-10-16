package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import j$.util.Optional;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oiu extends eqj {
    private final rxi a;
    private final Context h;
    private final rxh i = new oiw(this, 1);

    public oiu(Context context, rxi rxiVar) {
        this.h = context;
        this.a = rxiVar;
    }

    public final void a(okx okxVar) {
        super.q(okxVar);
    }

    @Override // defpackage.eqj
    protected final void c() {
        this.a.s(this.i);
        ypf ypfVar = rxf.a;
        m(Optional.ofNullable(rxi.q(this.h)));
    }

    @Override // defpackage.eqj
    protected final void d() {
        rxh rxhVar = this.i;
        rxhVar.getClass();
        rxi rxiVar = this.a;
        Map map = rxiVar.e;
        synchronized (map) {
            ContentObserver contentObserver = (ContentObserver) map.get(rxhVar);
            contentObserver.getClass();
            rxiVar.d.getContentResolver().unregisterContentObserver(contentObserver);
            map.remove(rxhVar);
        }
        p();
    }
}
