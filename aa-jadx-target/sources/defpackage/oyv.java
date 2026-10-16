package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oyv extends defpackage.oyr {
    @Override // defpackage.oyr
    public final android.content.Intent g() {
        android.content.Intent intent = new android.content.Intent();
        defpackage.mqa.d();
        return intent.setComponent(defpackage.mqa.a);
    }

    @Override // defpackage.oyr
    public final android.content.Intent h() {
        defpackage.mqa.d();
        return defpackage.mqa.e().putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1);
    }

    @Override // defpackage.oyr
    protected final java.lang.String i() {
        return "CLUSTER display";
    }

    @Override // defpackage.oyr
    protected final defpackage.tho k() {
        return defpackage.msh.a().h();
    }
}
