package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jqa extends jpw implements qup, jni, jnk {
    public static final yph a = yph.c("GH.CarService");
    public static final ygr b = ygr.r(3, 0, 1, 2);
    public jpy e;
    public final Handler f;
    public final rpz g;
    public final jpz h;
    private final jew k;
    public final AtomicReference c = new AtomicReference();
    public final Set d = new LinkedHashSet();
    private final xyc l = wub.L(new ilk(this, 18));
    public final AtomicMarkableReference i = new AtomicMarkableReference(-1, false);
    public final Set j = Collections.newSetFromMap(new ConcurrentHashMap());

    public jqa(Handler handler, Context context, jew jewVar) {
        this.f = handler;
        this.k = jewVar;
        this.h = new jpz(this, handler);
        this.g = rpz.a(context);
    }

    @Override // defpackage.jpw, defpackage.quo, defpackage.qup
    public final qwl C() {
        this.k.al();
        return (qwl) this.l.gu();
    }

    @Override // defpackage.jpw
    public final qup a() {
        qup qupVar = (qup) this.c.get();
        if (qupVar == null) {
            ((ype) ((ype) a.h()).ai((char) 2580)).u("Returning null delegate car service!");
        }
        return qupVar;
    }

    @Override // defpackage.jpw, defpackage.qup
    public final void aM(qwg qwgVar) throws RemoteException {
        Set set = this.d;
        synchronized (set) {
            set.add(qwgVar);
            boolean[] zArr = new boolean[1];
            int iIntValue = ((Integer) this.i.get(zArr)).intValue();
            if (zArr[0]) {
                qwgVar.b(iIntValue);
            }
        }
    }

    @Override // defpackage.jpw, defpackage.qup
    public final void bg(qwg qwgVar) {
        Set set = this.d;
        synchronized (set) {
            set.remove(qwgVar);
        }
    }

    @Override // defpackage.jpw, defpackage.qup, defpackage.jew
    public final boolean bs() {
        return this.i.isMarked();
    }

    @Override // defpackage.jpw
    public final void d() {
        ((ype) ((ype) a.f()).ai((char) 2590)).u("tearDown()");
        super.d();
    }

    @Override // defpackage.jpw, defpackage.qup, defpackage.jew
    public final int h() {
        Integer num = (Integer) this.i.getReference();
        int iIntValue = num.intValue();
        woy.aa(b.contains(num), "OutOfCarLifecycle");
        return iIntValue;
    }

    @Override // defpackage.jpw
    protected final boolean i(int i) {
        return false;
    }
}
