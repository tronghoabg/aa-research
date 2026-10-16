package androidx.car.app.serialization;

/* JADX INFO: loaded from: classes2.dex */
public final class Bundleable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.car.app.serialization.Bundleable> CREATOR = new defpackage.x(20);
    private final android.os.Bundle a;

    public Bundleable(java.lang.Object obj) throws defpackage.xy {
        java.lang.String strE = defpackage.xx.e(obj.getClass());
        if (android.util.Log.isLoggable("CarApp.Bun", 3)) {
            android.util.Log.d("CarApp.Bun", "Bundling ".concat(java.lang.String.valueOf(strE)));
        }
        this.a = defpackage.xx.a(obj, strE, defpackage.xv.a());
    }

    public final java.lang.Object a() throws defpackage.xy {
        return defpackage.xx.b(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public Bundleable(android.os.Bundle bundle) {
        this.a = bundle;
    }
}
