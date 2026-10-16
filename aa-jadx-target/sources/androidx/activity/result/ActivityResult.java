package androidx.activity.result;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001¨\u0006\u0017"}, d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "resultCode", "", "data", "Landroid/content/Intent;", "<init>", "(ILandroid/content/Intent;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getResultCode", "()I", "getData", "()Landroid/content/Intent;", "toString", "", "writeToParcel", "", "dest", "flags", "describeContents", "Companion", "activity"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, 1, defpackage.abnt.b}, xi = 48)
public final class ActivityResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.ActivityResult> CREATOR = new x(18);
    public final int a;
    public final android.content.Intent b;

    public ActivityResult(int i, android.content.Intent intent) {
        this.a = i;
        this.b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf;
        int i = this.a;
        if (i != -1) {
            strValueOf = i != 0 ? java.lang.String.valueOf(i) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        return "ActivityResult{resultCode=" + strValueOf + ", data=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a);
        android.content.Intent intent = this.b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
