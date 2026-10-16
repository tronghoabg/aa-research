package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import j$.time.Duration;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ius implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public ius(ajmd ajmdVar, erb erbVar, int i, String str, int i2, int i3) {
        this.f = i3;
        this.e = ajmdVar;
        this.c = erbVar;
        this.b = i;
        this.d = str;
        this.a = i2;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, RemoteException, IllegalArgumentException, InvocationTargetException {
        etg etgVar;
        if (this.f != 0) {
            erb erbVar = (erb) this.c;
            IBinder iBinderG = erbVar.G();
            ett ettVar = (ett) ((ajmd) this.e).a;
            yw ywVar = ettVar.c;
            ywVar.remove(iBinderG);
            Iterator it = ettVar.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                etg etgVar2 = (etg) it.next();
                int i = etgVar2.c;
                if (i == this.b) {
                    etgVar = (TextUtils.isEmpty(this.d) || this.a <= 0) ? new etg(ettVar, etgVar2.a, etgVar2.b, i, erbVar) : null;
                    it.remove();
                }
            }
            if (etgVar == null) {
                etgVar = new etg(ettVar, (String) this.d, this.a, this.b, erbVar);
            }
            ywVar.put(iBinderG, etgVar);
            try {
                iBinderG.linkToDeath(etgVar, 0);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "IBinder is already dead.");
                return;
            }
        }
        wer.c();
        xke xkeVar = (xke) this.c;
        xkd xkdVarB = xkd.b(xkeVar.c);
        iuu iuuVar = (iuu) this.e;
        iwb iwbVar = iuuVar.m;
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(iwbVar.d);
        String strName = iwb.c.contains(xkdVarB) ? xkdVarB.name() : "REDACTED";
        int i2 = this.a;
        int i3 = this.b;
        boolean z = (i2 & 128) != 0;
        String str = String.format(locale, "display=%d, keyCode=%s, down=%b, longPress=%b, repeatCount=%d", numValueOf, strName, Boolean.valueOf(xkeVar.d), Boolean.valueOf(z), Integer.valueOf(i3));
        ((ype) iwb.a.l().ai((char) 1444)).y("onKeyEvent(%s)", new zjd(zjc.a, str));
        iwbVar.b("KeyEvent", str);
        if (!xkeVar.d) {
            jfg jfgVar = iwbVar.e;
            yzz yzzVar = z ? yzz.KEY_LONG_PRESS_EVENT : yzz.KEY_PRESS_EVENT;
            yzy yzyVar = (yzy) iwb.b.getOrDefault(xkdVarB, yzy.jC);
            yzyVar.getClass();
            jfgVar.e(yzzVar, yzyVar);
        }
        iuuVar.h.e(1);
        Object objGu = iuuVar.i.gu();
        if (objGu != null) {
            ((iob) objGu).E(iuuVar.j, xkeVar, i2, i3, (Duration) this.d);
        }
    }

    public ius(iuu iuuVar, xke xkeVar, int i, int i2, Duration duration, int i3) {
        this.f = i3;
        this.c = xkeVar;
        this.a = i;
        this.b = i2;
        this.d = duration;
        this.e = iuuVar;
    }
}
