package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class rpf extends ijo implements rpg {
    public final qup a;
    private final Set b;
    private final Map c;
    private boolean d;
    private final sss e;

    public rpf(qup qupVar) {
        super("com.google.android.gms.car.lifecycle.ICarDisplayLayoutUpdateCompleteListener");
        this.b = new yy(0);
        this.c = new HashMap();
        this.e = new sss(Looper.getMainLooper());
        this.a = qupVar;
    }

    private final void d() {
        rox.l(new rea(this, 0));
        this.d = false;
    }

    public final synchronized void a() {
        if (rrd.e("GH.MpCarDispUpdateLstnr", 3)) {
            rrd.d(3, "GH.MpCarDispUpdateLstnr", null, "Clearing local CarDisplayLayoutUpdateCompleteListener %s", this.b);
        }
        this.b.clear();
        if (this.d) {
            d();
        }
    }

    public final synchronized void b(wyd wydVar) throws RemoteException {
        if (rrd.e("GH.MpCarDispUpdateLstnr", 3)) {
            rrd.d(3, "GH.MpCarDispUpdateLstnr", null, "Registering local CarDisplayLayoutUpdateCompleteListener %s", wydVar);
        }
        Set set = this.b;
        woy.aa(!set.contains(wydVar), "Attempted to re-register a CarDisplayLayoutUpdateCompleteListener");
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            this.e.post(new qqy(wydVar, (Map.Entry) it.next(), 9));
        }
        set.add(wydVar);
        if (this.d) {
            return;
        }
        this.a.aN(this);
        this.d = true;
    }

    public final synchronized void c(wyd wydVar) {
        Set set = this.b;
        if (!set.remove(wydVar)) {
            throw new IllegalStateException("Attempted to unregister listener that was never registered");
        }
        if (set.isEmpty() && this.d) {
            d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rpg
    public final synchronized void e(String str, CarDisplayId carDisplayId) throws RemoteException {
        yx yxVar = new yx((yy) this.b);
        while (yxVar.hasNext()) {
            wyd wydVar = (wyd) yxVar.next();
            UUID uuidFromString = UUID.fromString(str);
            this.c.put(carDisplayId, uuidFromString);
            this.e.post(new imp(wydVar, uuidFromString, carDisplayId, 8));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        String string = parcel.readString();
        CarDisplayId carDisplayId = (CarDisplayId) ijp.a(parcel, CarDisplayId.CREATOR);
        ijp.d(parcel);
        e(string, carDisplayId);
        return true;
    }

    public rpf() {
        throw null;
    }
}
