package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class inp implements defpackage.iob {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ inp(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.iob
    public final void a(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            android.content.Intent intent = defpackage.ioh.a;
            ((qvr) obj).e((com.google.android.gms.car.ActivityLaunchInfo) this.a);
            return;
        }
        if (i == 1) {
            android.content.Intent intent2 = defpackage.ioh.a;
            ((qvo) obj).e((com.google.android.gms.car.ActivityLaunchInfo) this.a);
        } else if (i == 2) {
            android.content.Intent intent3 = defpackage.ioh.a;
            ((qvr) obj).f((android.content.Intent) this.a);
        } else if (i != 3) {
            android.content.Intent intent4 = defpackage.ioh.a;
            ((qvr) obj).f((android.content.Intent) this.a);
        } else {
            android.content.Intent intent5 = defpackage.ioh.a;
            ((qvo) obj).g((com.google.android.gms.car.ActivityLaunchInfo) this.a);
        }
    }
}
