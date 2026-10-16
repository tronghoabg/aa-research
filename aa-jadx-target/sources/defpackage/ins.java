package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ins implements defpackage.iob {
    public final /* synthetic */ com.google.android.gms.car.ActivityLaunchInfo a;
    private final /* synthetic */ int b;

    public /* synthetic */ ins(com.google.android.gms.car.ActivityLaunchInfo activityLaunchInfo, int i) {
        this.b = i;
        this.a = activityLaunchInfo;
    }

    @Override // defpackage.iob
    public final void a(java.lang.Object obj) {
        if (this.b != 0) {
            android.content.Intent intent = defpackage.ioh.a;
            ((qvr) obj).e(this.a);
        } else {
            android.content.Intent intent2 = defpackage.ioh.a;
            ((qvo) obj).f(this.a);
        }
    }
}
