package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jpg implements defpackage.jpw {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpg(defpackage.jpy jpyVar, android.content.Intent intent, android.os.Bundle bundle, int i) {
        this.d = i;
        this.a = jpyVar;
        this.b = intent;
        this.c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, quz] */
    @Override // defpackage.jpw, java.util.concurrent.Callable
    public final java.lang.Object call() throws defpackage.jny {
        int i = this.d;
        if (i == 0) {
            return java.lang.Boolean.valueOf(((defpackage.jpy) this.a).m().bA((android.content.Intent) this.b, (android.os.Bundle) this.c));
        }
        if (i == 1) {
            return ((defpackage.jpy) this.b).m().x((com.google.android.gms.car.CreateAudioRecordRequest) this.c, this.a);
        }
        if (i == 2) {
            return ((defpackage.jpy) this.b).m().Z((java.lang.String) this.c, (java.lang.String) this.a);
        }
        java.lang.Object obj = this.b;
        if (i != 3) {
            return ((defpackage.jpy) obj).m().ad((java.lang.String) this.c, this.a);
        }
        return ((defpackage.jpy) obj).m().Y((java.lang.String) this.c, (java.lang.String) this.a);
    }

    public /* synthetic */ jpg(defpackage.jpy jpyVar, java.lang.Object obj, java.lang.Object obj2, int i) {
        this.d = i;
        this.b = jpyVar;
        this.c = obj;
        this.a = obj2;
    }
}
