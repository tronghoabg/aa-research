package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final /* synthetic */ class rda implements rzd {
    public final /* synthetic */ rdj a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rda(rdj rdjVar, Object obj, int i) {
        this.c = i;
        this.a = rdjVar;
        this.b = obj;
    }

    @Override // defpackage.rzd, java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        int i = this.c;
        if (i == 0) {
            return Boolean.valueOf(this.a.C().bp((String) this.b, false));
        }
        int i2 = 1;
        if (i == 1) {
            rdj rdjVar = this.a;
            Object obj = this.b;
            qup qupVarC = rdjVar.C();
            roy royVar = (roy) obj;
            String str = royVar.f;
            boolean z = royVar.g;
            return Boolean.valueOf(qupVarC.bq(str, false));
        }
        int i3 = 2;
        if (i == 2) {
            CarDisplayId carDisplayId = (CarDisplayId) this.b;
            String strA = carDisplayId.a();
            rdj rdjVar2 = this.a;
            return (sab) rdjVar2.g.c(sab.class, strA, new rcx(rdjVar2, carDisplayId, i3));
        }
        Object obj2 = this.b;
        if (i == 3) {
            return this.a.M((CarDisplayId) obj2);
        }
        CarDisplayId carDisplayId2 = (CarDisplayId) obj2;
        String strA2 = carDisplayId2.a();
        rdj rdjVar3 = this.a;
        return (rob) rdjVar3.g.c(rob.class, strA2, new rcx(rdjVar3, carDisplayId2, i2));
    }
}
