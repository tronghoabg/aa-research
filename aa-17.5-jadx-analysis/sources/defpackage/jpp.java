package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;

/* loaded from: classes.dex */
public final /* synthetic */ class jpp implements jpv {
    public final /* synthetic */ jpw a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpp(jpw jpwVar, CarDisplayId carDisplayId, qwd qwdVar, int i) {
        this.d = i;
        this.a = jpwVar;
        this.c = carDisplayId;
        this.b = qwdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qwd] */
    @Override // defpackage.jpv
    public final void a() throws RemoteException {
        int i = this.d;
        jpw jpwVar = this.a;
        if (i != 0) {
            jpwVar.m().ar((CarDisplayId) this.c, this.b);
        } else {
            Object obj = this.c;
            jpwVar.m().aW((String) this.b, (String) obj);
        }
    }

    public /* synthetic */ jpp(jpw jpwVar, String str, String str2, int i) {
        this.d = i;
        this.a = jpwVar;
        this.b = str;
        this.c = str2;
    }
}
