package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final /* synthetic */ class rcx implements rdn {
    public final /* synthetic */ rdj a;
    public final /* synthetic */ CarDisplayId b;
    private final /* synthetic */ int c;

    public /* synthetic */ rcx(rdj rdjVar, CarDisplayId carDisplayId, int i) {
        this.c = i;
        this.a = rdjVar;
        this.b = carDisplayId;
    }

    @Override // defpackage.rdn
    public final Object a() throws RemoteException {
        qzf qzfVarL;
        int i = this.c;
        if (i == 0) {
            CarDisplayId carDisplayId = this.b;
            rdj rdjVar = this.a;
            return new rdx(new sgk(rdjVar, carDisplayId), new qep(rdjVar, 20));
        }
        if (i == 1) {
            return new rob(this.a.M(this.b));
        }
        rdj rdjVar2 = this.a;
        saa saaVar = new saa(new koy(rdjVar2, 4), new koy(rdjVar2, 11), new koy(rdjVar2, 12), new koy(rdjVar2, 13), new koy(rdjVar2, 14), new koy(rdjVar2, 15), new koy(rdjVar2, 5), new koy(rdjVar2, 16), new koy(rdjVar2, 17), new koy(rdjVar2, 10), new koy(rdjVar2, 9), new koy(rdjVar2, 18), new koy(rdjVar2, 19), new koy(rdjVar2, 6), new koy(rdjVar2, 7), new koy(rdjVar2, 8));
        mko mkoVar = new mko();
        roy[] royVarArr = {roy.FULLSCREEN_PRESENTATION, roy.PRESENTATION_CLEAR_PARENT_PADDING};
        for (int i2 = 0; i2 < 2; i2++) {
            roy royVar = royVarArr[i2];
            boolean zK = rdjVar2.K(royVar);
            royVar.getClass();
            ((yfu) mkoVar.b).e(royVar, Boolean.valueOf(zK));
        }
        CarDisplayId carDisplayId2 = this.b;
        roz rozVar = new roz(mkoVar);
        if (rdjVar2.p(raj.t)) {
            if (omc.c("CAR.CLIENT", 3)) {
                rrd.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarWindowManager for: %s", new zjd(zjc.a, carDisplayId2));
            }
            rjx rjxVarE = rdjVar2.C().S().e(carDisplayId2);
            rjxVarE.getClass();
            qzfVarL = rjxVarE.d();
        } else {
            woy.O(CarDisplayId.a.equals(carDisplayId2), "Legacy ICarWindowManager should only be used for the primary car display.");
            qzfVarL = rdjVar2.C().L();
        }
        return new sab(rdjVar2.M(carDisplayId2), carDisplayId2, qzfVarL, rdjVar2.c, saaVar, rozVar, rdjVar2);
    }
}
