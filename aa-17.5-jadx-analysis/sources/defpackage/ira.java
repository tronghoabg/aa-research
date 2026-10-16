package defpackage;

import android.os.RemoteException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class ira implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ira(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, rcf] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, jcx] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            int i2 = this.a;
            Object obj = ((izj) this.b).a;
            if (i2 == 3) {
                ((irb) obj).s = true;
            } else if (i2 == 5) {
                ((irb) obj).t = true;
            }
            irb irbVar = (irb) obj;
            if (irbVar.r < 5 && irbVar.s && irbVar.t) {
                ((ype) ((ype) irb.a.f()).ai((char) 1214)).u("Audio capture restarted.");
                jfg jfgVar = irbVar.h;
                jfgVar.getClass();
                jfgVar.e(yzz.AUDIO_DIAGNOSTICS, yzy.wC);
                return;
            }
            return;
        }
        if (i == 1) {
            ((duz) this.b).a(this.a);
            return;
        }
        if (i == 2) {
            this.b.b(this.a);
            return;
        }
        if (i == 3) {
            ((jjp) this.b).a.A(this.a);
            return;
        }
        if (i != 4) {
            this.b.a(this.a);
            return;
        }
        jqa jqaVar = ((jpz) this.b).a;
        int i3 = this.a;
        Set set = jqaVar.d;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                qwg qwgVar = (qwg) it.next();
                try {
                    qwgVar.b(i3);
                } catch (RemoteException unused) {
                    ((ype) ((ype) jqa.a.f()).ai(2583)).y("RemoteException notifying listener %s onConnected.", new zjd(zjc.a, qwgVar));
                    it.remove();
                }
            }
        }
    }

    public ira(jpz jpzVar, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = jpzVar;
    }
}
