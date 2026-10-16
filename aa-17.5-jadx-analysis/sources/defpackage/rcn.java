package defpackage;

import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class rcn implements Consumer {
    private final /* synthetic */ int a;

    public /* synthetic */ rcn(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, qye] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, qyb] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                roj rojVar = (roj) obj;
                if (omc.c("CAR.SENSOR", 3)) {
                    rrd.a("CAR.SENSOR", null, "handleCarDisconnection");
                }
                SparseArray sparseArray = rojVar.c;
                synchronized (sparseArray) {
                    sparseArray.clear();
                    rojVar.b = null;
                }
                return;
            case 1:
                qsb qsbVar = (qsb) obj;
                if (omc.c("CAR.RADIO", 3)) {
                    rrd.a("CAR.RADIO", null, "handleCarDisconnection");
                }
                try {
                    qsbVar.a.x(qsbVar.d);
                } catch (RemoteException unused) {
                }
                ?? r4 = qsbVar.b;
                for (ajmd ajmdVar : r4) {
                    yph yphVar = RadioMediaBrowserService.g;
                    ((RadioMediaBrowserService) ajmdVar.a).l.b(new mis(0, null, null));
                }
                r4.clear();
                return;
            case 2:
                return;
            case 3:
                throw null;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
                return;
            case 9:
                ((tug) obj).a();
                return;
            case 10:
                ((tue) obj).a();
                return;
            case 11:
                ((tuc) obj).a();
                return;
            case 12:
                ((tuf) obj).a();
                return;
            case 13:
                ((tub) obj).a();
                return;
            case 14:
                xtk xtkVar = xtu.a;
                ((xum) obj).a();
                return;
            default:
                ((xum) obj).a();
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
