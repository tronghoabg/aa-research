package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rcd;
import defpackage.spu;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public class LogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogErrorParcelable> CREATOR = new rcd(15);
    public final String a;
    public final int b;
    public int c;

    public LogErrorParcelable(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogErrorParcelable)) {
            return false;
        }
        LogErrorParcelable logErrorParcelable = (LogErrorParcelable) obj;
        return Objects.equals(this.a, logErrorParcelable.a) && this.b == logErrorParcelable.b && this.c == logErrorParcelable.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        String str = this.a;
        if (str != null) {
            int iL2 = spu.l(parcel, 1);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        int i2 = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        int i3 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        spu.m(parcel, iL);
    }
}
