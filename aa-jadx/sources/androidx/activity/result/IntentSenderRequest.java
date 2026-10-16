package androidx.activity.result;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001¨\u0006\u001c"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "intentSender", "Landroid/content/IntentSender;", "fillInIntent", "Landroid/content/Intent;", "flagsMask", "", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getIntentSender", "()Landroid/content/IntentSender;", "getFillInIntent", "()Landroid/content/Intent;", "getFlagsMask", "()I", "getFlagsValues", "describeContents", "writeToParcel", "", "dest", "flags", "Builder", "Companion", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntentSenderRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.activity.result.IntentSenderRequest> CREATOR = new defpackage.x(19);
    public final android.content.IntentSender a;
    public final android.content.Intent b;
    public final int c;
    public final int d;

    public IntentSenderRequest(android.content.IntentSender intentSender, android.content.Intent intent, int i, int i2) {
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
