package com.android.personalcontext.ace.client.prototype.richcard;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afeu;
import defpackage.affa;
import defpackage.eeh;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/android/personalcontext/ace/client/prototype/richcard/RichCardError;", "Landroid/os/Parcelable;", "message", "", "exceptionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getExceptionName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "java.com.google.android.apps.miphone.astrea.ace.java.com.android.personalcontext.ace.client.prototype.richcard_richcard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RichCardError implements Parcelable {
    public static final Parcelable.Creator<RichCardError> CREATOR = new eeh(18);
    private final String exceptionName;
    private final String message;

    public RichCardError(String str, String str2) {
        str.getClass();
        this.message = str;
        this.exceptionName = str2;
    }

    public static /* synthetic */ RichCardError copy$default(RichCardError richCardError, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richCardError.message;
        }
        if ((i & 2) != 0) {
            str2 = richCardError.exceptionName;
        }
        return richCardError.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExceptionName() {
        return this.exceptionName;
    }

    public final RichCardError copy(String message, String exceptionName) {
        message.getClass();
        return new RichCardError(message, exceptionName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichCardError)) {
            return false;
        }
        RichCardError richCardError = (RichCardError) other;
        return affa.f(this.message, richCardError.message) && affa.f(this.exceptionName, richCardError.exceptionName);
    }

    public final String getExceptionName() {
        return this.exceptionName;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        String str = this.exceptionName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RichCardError(message=" + this.message + ", exceptionName=" + this.exceptionName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.message);
        dest.writeString(this.exceptionName);
    }

    public /* synthetic */ RichCardError(String str, String str2, int i, afeu afeuVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
