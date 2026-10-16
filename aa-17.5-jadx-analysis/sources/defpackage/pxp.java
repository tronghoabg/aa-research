package defpackage;

import android.os.RemoteException;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class pxp {
    public final Object a;
    public final /* synthetic */ Object b;

    public pxp(lgu lguVar) {
        this.b = lguVar;
        this.a = nsr.c().b().r(nsn.y);
    }

    public final ows a() throws RemoteException {
        owm owmVar = ((lzv) this.b).f;
        if (owmVar != null) {
            return owmVar.f();
        }
        ((ype) ((ype) lzv.a.g()).ai((char) 4535)).u("Nav service is null when dismissing a suggestion");
        return null;
    }

    public pxp(pxr pxrVar, pxq pxqVar) {
        this.b = pxrVar;
        this.a = pxqVar;
    }

    public pxp(lzv lzvVar) {
        this.b = lzvVar;
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }
}
