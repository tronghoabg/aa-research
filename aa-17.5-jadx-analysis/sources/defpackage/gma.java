package defpackage;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final /* synthetic */ class gma implements gek {
    public final /* synthetic */ Object a;
    public final /* synthetic */ IInterface b;
    private final /* synthetic */ int c;

    public /* synthetic */ gma(Object obj, IInterface iInterface, int i) {
        this.c = i;
        this.a = obj;
        this.b = iInterface;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.IInterface, androidx.car.app.ICarApp] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.os.IInterface, androidx.car.app.ICarApp] */
    @Override // defpackage.gek
    public final void a(glf glfVar) throws RemoteException {
        int i = this.c;
        if (i == 0) {
            gmf gmfVar = (gmf) this.a;
            gmg gmgVar = gmfVar.a;
            ?? r6 = this.b;
            r6.getAppInfo(new gmc(gmfVar, gmgVar.g, glfVar, r6));
            return;
        }
        if (i == 1) {
            ((geh) this.a).a(this.b, glfVar);
            return;
        }
        gmf gmfVar2 = (gmf) this.a;
        gmg gmgVar2 = gmfVar2.a;
        Intent intent = gmgVar2.k;
        intent.getClass();
        this.b.onAppCreate(gmgVar2.d, intent, gmgVar2.g.getResources().getConfiguration(), new gme(gmfVar2, gmgVar2.g, glfVar));
    }
}
