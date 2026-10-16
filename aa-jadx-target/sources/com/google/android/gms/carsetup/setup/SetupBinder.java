package com.google.android.gms.carsetup.setup;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class SetupBinder extends android.os.Binder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.carsetup.setup.SetupBinder> CREATOR = new defpackage.rcy(12);
    public android.content.Intent a;
    private boolean b = false;
    private defpackage.slu c;

    public SetupBinder(defpackage.slu sluVar) {
        this.c = sluVar;
    }

    public void a() {
        this.b = false;
    }

    public boolean b() {
        return this.b;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.slu c() {
        defpackage.slu sluVar = this.c;
        this.c = null;
        return sluVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStrongBinder(this);
    }

    public SetupBinder() {
    }
}
