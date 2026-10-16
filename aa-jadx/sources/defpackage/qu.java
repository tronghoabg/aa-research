package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qu implements defpackage.yg {
    public final /* synthetic */ defpackage.qw a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ defpackage.qt d;
    private final /* synthetic */ int e;

    public /* synthetic */ qu(defpackage.qw qwVar, java.lang.String str, java.lang.String str2, defpackage.qt qtVar, int i) {
        this.e = i;
        this.a = qwVar;
        this.b = str;
        this.c = str2;
        this.d = qtVar;
    }

    @Override // defpackage.yg
    public final java.lang.Object a() throws android.os.RemoteException {
        int i = this.e;
        java.lang.String str = this.b;
        if (i != 0) {
            android.os.IInterface iInterfaceA = this.a.a(str);
            if (iInterfaceA == null) {
                android.util.Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat(this.c));
            } else {
                this.d.a(iInterfaceA);
            }
            return null;
        }
        android.os.IInterface iInterfaceA2 = this.a.a(str);
        if (iInterfaceA2 != null) {
            return this.d.a(iInterfaceA2);
        }
        android.util.Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat(this.c));
        return null;
    }
}
