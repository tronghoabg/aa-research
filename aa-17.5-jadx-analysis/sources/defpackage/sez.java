package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class sez implements dny {
    public Collection a;
    final /* synthetic */ Context b;
    final /* synthetic */ xxj c;
    final /* synthetic */ Executor d;

    public sez(Context context, xxj xxjVar, Executor executor) {
        this.b = context;
        this.c = xxjVar;
        this.d = executor;
    }

    @Override // defpackage.dny
    public final Object a(dnw dnwVar) {
        this.a = new yco(sfb.b, new rgf(this.b, 3));
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sez sezVar = this;
            wub.ah((zgp) it.next(), new sey(sezVar, atomicInteger, this.c, dnwVar, 0), sezVar.d);
            this = sezVar;
        }
        return "getConnectedBluetoothDevice";
    }
}
