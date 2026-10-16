package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class siy implements svm {
    public final /* synthetic */ shr a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ siy(Object obj, shr shrVar, int i) {
        this.c = i;
        this.b = obj;
        this.a = shrVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, xwx] */
    @Override // defpackage.svm
    public final Object a(svz svzVar) {
        siu siuVar;
        if (this.c != 0) {
            sjm sjmVar = sjc.a;
            if (svzVar.g()) {
                return (svz) this.b.a(this.a);
            }
            Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", svzVar.d());
            return svzVar;
        }
        if (svzVar.g()) {
            siuVar = (siu) svzVar.e();
        } else {
            Log.e("ClearcutLoggerApiImpl", "Error sampling log.", svzVar.d());
            siuVar = siu.b;
        }
        return ((sjc) this.b).a(this.a, siuVar);
    }
}
