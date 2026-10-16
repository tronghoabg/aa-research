package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.FrameDebugInfo;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jkf {
    public volatile long b;
    public ArrayDeque i;
    final /* synthetic */ jkh k;
    public volatile jkf a = null;
    public volatile long c = 0;
    public volatile long d = 0;
    public volatile long e = 0;
    public volatile long f = 0;
    public volatile long g = 0;
    public volatile long h = 0;
    public boolean j = false;

    public jkf(jkh jkhVar) {
        this.k = jkhVar;
    }

    public final void a() {
        b();
        if (this.g != 0) {
            jkh jkhVar = this.k;
            FrameDebugInfo frameDebugInfo = new FrameDebugInfo(this.b, this.g, this.d, this.e, this.f);
            imv imvVar = ((ina) jkhVar.b).ar.b;
            if (imvVar != null) {
                try {
                    Object obj = imvVar.a;
                    Parcel parcelGh = ((ijn) obj).gh();
                    ijp.g(parcelGh, frameDebugInfo);
                    ((ijn) obj).gk(1, parcelGh);
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) ina.a.h()).p(e)).ai((char) 531)).u("Client disconnected before frame callback");
                }
            }
            this.g = 0L;
        }
    }

    public final synchronized void b() {
        this.j = true;
        ArrayDeque arrayDeque = this.i;
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                xop xopVar = (xop) it.next();
                ((ype) jkh.a.l().ai((char) 2247)).u("sendUpdateUiConfigReply");
                this.k.c.I(xopVar);
            }
            this.i = null;
        }
    }

    public final synchronized boolean c(xop xopVar) {
        if (this.j) {
            return false;
        }
        ArrayDeque arrayDeque = this.i;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.i = arrayDeque;
        }
        arrayDeque.add(xopVar);
        return true;
    }
}
