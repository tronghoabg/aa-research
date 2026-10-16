package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.MediaOptions;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.car.lifecycle.CarActivityLayoutConfig;

/* loaded from: classes.dex */
public final /* synthetic */ class jpd implements jpv {
    public final /* synthetic */ jpw a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jpd(jpw jpwVar, Object obj, int i) {
        this.c = i;
        this.a = jpwVar;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, qwg] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, qyn] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, rpg] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, qwg] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, quv] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, quy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, qwd] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, qus] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, quv] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, qyn] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, rpg] */
    @Override // defpackage.jpv
    public final void a() throws RemoteException {
        switch (this.c) {
            case 0:
                this.a.m().aV((MediaOptions) this.b);
                break;
            case 1:
                this.a.m().be(this.b);
                break;
            case 2:
                this.a.m().bb((CarRegionId) this.b);
                break;
            case 3:
                this.a.m().aB((CarFacet) this.b);
                break;
            case 4:
                this.a.m().aO(this.b);
                break;
            case 5:
                this.a.m().aN(this.b);
                break;
            case 6:
                this.a.m().aM(this.b);
                break;
            case 7:
                this.a.m().aw((CarInfo) this.b);
                break;
            case 8:
                this.a.m().bi(this.b);
                break;
            case 9:
                this.a.m().aC((CarFrxEvent) this.b);
                break;
            case 10:
                this.a.m().bj((CarActivityLayoutConfig) this.b);
                break;
            case 11:
                this.a.m().bh(this.b);
                break;
            case 12:
                this.a.m().bg(this.b);
                break;
            case 13:
                this.a.m().aK(this.b);
                break;
            case 14:
                this.a.m().aL(this.b);
                break;
            case 15:
                this.a.m().aq(this.b);
                break;
            default:
                this.a.m().bd(this.b);
                break;
        }
    }
}
