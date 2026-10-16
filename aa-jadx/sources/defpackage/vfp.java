package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vfp extends defpackage.ijw implements defpackage.vfq {
    final /* synthetic */ defpackage.zif a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfp(defpackage.zif zifVar) {
        super("com.google.android.libraries.maps.internal.IMapsAppCheckTokenCallback");
        this.a = zifVar;
    }

    @Override // defpackage.vfq
    public final void e() {
        this.a.p(new java.lang.RuntimeException("Failed to fetch App Check token."));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            e();
            return true;
        }
        java.lang.String string = parcel.readString();
        defpackage.ijx.d(parcel);
        f(string);
        return true;
    }

    @Override // defpackage.vfq
    public final void f(java.lang.String str) {
        this.a.o(str);
    }
}
