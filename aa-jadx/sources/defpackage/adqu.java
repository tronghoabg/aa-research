package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adqu implements defpackage.admx {
    private final android.os.Parcelable.Creator a;
    private final boolean b;

    public adqu(android.os.Parcelable.Creator creator, boolean z) {
        this.a = creator;
        this.b = z;
    }

    @Override // defpackage.admx
    public final /* bridge */ /* synthetic */ java.io.InputStream a(java.lang.Object obj) {
        boolean z = this.b;
        return new defpackage.adrg(this.a, (android.os.Parcelable) obj, z);
    }

    @Override // defpackage.admx
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.io.InputStream inputStream) {
        if (!(inputStream instanceof defpackage.adrg)) {
            throw new java.lang.UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
        }
        defpackage.adrg adrgVar = (defpackage.adrg) inputStream;
        if (adrgVar.b) {
            return adrgVar.c;
        }
        if (adrgVar.e == null) {
            android.os.Parcelable parcelable = adrgVar.c;
            android.os.Parcelable.Creator creator = adrgVar.a;
            creator.getClass();
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            android.os.Parcelable parcelable2 = (android.os.Parcelable) creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            adrgVar.e = parcelable2;
        }
        return adrgVar.e;
    }
}
