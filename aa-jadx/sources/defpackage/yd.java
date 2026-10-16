package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yd implements defpackage.yg {
    public final /* synthetic */ androidx.car.app.IOnDoneCallback a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ yd(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.Object obj, java.lang.String str, int i) {
        this.d = i;
        this.a = iOnDoneCallback;
        this.c = obj;
        this.b = str;
    }

    @Override // defpackage.yg
    public final java.lang.Object a() throws android.os.RemoteException {
        androidx.car.app.serialization.Bundleable bundleable;
        if (this.d == 0) {
            try {
                this.a.onFailure(new androidx.car.app.serialization.Bundleable(new androidx.car.app.FailureResponse((java.lang.Throwable) this.b)));
            } catch (defpackage.xy e) {
                android.util.Log.e("CarApp.Dispatch", "Serialization failure in ".concat(java.lang.String.valueOf(this.c)), e);
            }
            return null;
        }
        java.lang.Object obj = this.c;
        androidx.car.app.IOnDoneCallback iOnDoneCallback = this.a;
        if (obj == null) {
            bundleable = null;
        } else {
            try {
                bundleable = new androidx.car.app.serialization.Bundleable(obj);
            } catch (defpackage.xy e2) {
                defpackage.tw.f(iOnDoneCallback, (java.lang.String) this.b, e2);
            }
        }
        iOnDoneCallback.onSuccess(bundleable);
        return null;
    }

    public /* synthetic */ yd(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.Throwable th, java.lang.String str, int i) {
        this.d = i;
        this.a = iOnDoneCallback;
        this.b = th;
        this.c = str;
    }
}
