package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qfs extends defpackage.mkp {
    public static final /* synthetic */ int g = 0;

    @Override // defpackage.mkp
    public final defpackage.mko a() {
        return defpackage.mko.b;
    }

    @Override // defpackage.mkp
    public final void f() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("CarApi is not supported in Lite CSL on Android R+");
        }
    }

    @Override // defpackage.mkp
    public final void g() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            throw new java.lang.UnsupportedOperationException("CarFirstPartyApi is not supported in Lite CSL on Android R+");
        }
    }
}
