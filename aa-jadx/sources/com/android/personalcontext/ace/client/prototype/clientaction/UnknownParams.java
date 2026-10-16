package com.android.personalcontext.ace.client.prototype.clientaction;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005Ê\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000eÊ\u0001\u0002\b\u000fÊ\u0001\u0002\b\u0010¨\u0006\u000b"}, d2 = {"Lcom/android/personalcontext/ace/client/prototype/clientaction/UnknownParams;", "Lcom/android/personalcontext/ace/client/prototype/clientaction/ClientActionParams;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "java.com.google.android.apps.miphone.astrea.ace.java.com.android.personalcontext.ace.client.prototype.clientaction_clientaction", "Lkotlin/Deprecated;", "message", "Use Bundle-backed ClientActionParams instead (instead of Parcelable).", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class UnknownParams implements com.android.personalcontext.ace.client.prototype.clientaction.ClientActionParams {
    public static final android.os.Parcelable.Creator<com.android.personalcontext.ace.client.prototype.clientaction.UnknownParams> CREATOR = new defpackage.eep(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(1);
    }
}
