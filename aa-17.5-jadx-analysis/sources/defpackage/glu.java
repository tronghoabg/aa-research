package defpackage;

import android.content.ComponentName;
import android.os.RemoteException;
import androidx.car.app.ICarApp;
import androidx.car.app.ISurfaceCallback;
import androidx.car.app.SurfaceContainer;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final /* synthetic */ class glu implements gek {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ glu(ISurfaceCallback iSurfaceCallback, SurfaceContainer surfaceContainer, glp glpVar, urf urfVar, int i) {
        this.e = i;
        this.b = iSurfaceCallback;
        this.d = surfaceContainer;
        this.a = glpVar;
        this.c = urfVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.car.app.ICarApp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.car.app.ISurfaceCallback, java.lang.Object] */
    @Override // defpackage.gek
    public final void a(glf glfVar) throws RemoteException {
        if (this.e == 0) {
            gmg gmgVar = (gmg) this.a;
            this.b.getManager((String) this.c, new glw(gmgVar, gmgVar.g, glfVar, this.d));
            return;
        }
        Bundleable bundleable = new Bundleable(this.d);
        glp glpVar = (glp) this.a;
        urf urfVar = glpVar.d;
        gns gnsVar = glpVar.c;
        ComponentName componentName = glpVar.a;
        this.b.onSurfaceDestroyed(bundleable, new glo(glfVar, (urf) this.c, glpVar.b, componentName, gnsVar, urfVar));
    }

    public /* synthetic */ glu(gmg gmgVar, ICarApp iCarApp, String str, dzg dzgVar, int i) {
        this.e = i;
        this.a = gmgVar;
        this.b = iCarApp;
        this.c = str;
        this.d = dzgVar;
    }
}
