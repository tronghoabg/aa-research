package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tcz implements defpackage.zhh {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public tcz(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zhh
    public final void a(java.lang.Throwable th) {
        if (this.b != 0) {
            ((ohv) this.a).b(th);
        } else {
            ((defpackage.eqp) this.a).j(new thj(th));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.enterprise.connectedapps.internal.Bundler, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, qdz] */
    @Override // defpackage.zhh
    public final void b(java.lang.Object obj) {
        if (this.b == 0) {
            ((defpackage.eqp) this.a).j(new defpackage.thk(obj));
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
        java.lang.Object obj2 = this.a;
        ohv ohvVar = (ohv) obj2;
        ohvVar.c.c(bundle, "result", obj, (com.google.android.enterprise.connectedapps.internal.BundlerType) ohvVar.b);
        try {
            new qem((qdz) ((ohv) obj2).a).makeBundleCall(bundle);
        } catch (qei unused) {
            android.util.Log.e("FutureResult", "Connection was dropped before response");
        } catch (java.lang.RuntimeException e) {
            ohvVar.b(new qei("Error when writing result of future", e));
        }
    }
}
