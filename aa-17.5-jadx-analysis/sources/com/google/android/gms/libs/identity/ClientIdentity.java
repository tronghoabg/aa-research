package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.affa;
import defpackage.afyh;
import defpackage.spu;
import defpackage.sqy;
import defpackage.wub;
import defpackage.yfq;
import defpackage.yls;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 X2\u00020\u0001¨\u0006Y"}, d2 = {"Lcom/google/android/gms/libs/identity/ClientIdentity;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "uid", "", "pid", "packageName", "", "attributionTag", "listenerId", "clientSdkVersion", "clientFeatures", "", "Lcom/google/android/gms/common/Feature;", "clientType", "Lcom/google/android/gms/libs/identity/ClientType;", "impersonator", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientType;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "getUid", "()I", "getPid", "getPackageName", "()Ljava/lang/String;", "getAttributionTag", "getListenerId", "_clientSdkVersion", "Ljava/lang/Integer;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "getClientSdkVersion", "()Lkotlin/jvm/functions/Function1;", "getClientFeatures", "()Ljava/util/List;", "_clientType", "getClientType", "isImpersonatedIdentity", "", "()Z", "realIdentity", "getRealIdentity", "()Lcom/google/android/gms/libs/identity/ClientIdentity;", "getImpersonator", "asImpersonator", "Lcom/google/android/gms/libs/identity/Impersonator;", "enforcePackageName", "", "enforceZeroParty", "enforceFirstParty", "supportsFeature", "feature", "version", "", "checkPermissions", "permissions", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "checkAnyPermissions", "enforcePermissions", "(Landroid/content/Context;[Ljava/lang/String;)V", "enforceAnyPermissions", "userHandle", "Landroid/os/UserHandle;", "getUserHandle", "()Landroid/os/UserHandle;", "isMyUser", "isMyUid", "isSystemServer", "isMyProcess", "isZeroParty", "isFirstParty", "copy", "impersonate", "impersonatee", "impersonateeListenerId", "forAggregation", "toString", "equals", "other", "", "hashCode", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "Companion", "java.com.google.android.gms.libs.identity_identity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new sqy(12);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final ClientIdentity f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ClientIdentity(int i, String str, String str2, String str3, List list, ClientIdentity clientIdentity) {
        if (clientIdentity != null && clientIdentity.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? clientIdentity != null ? clientIdentity.d : null : str3;
        if (list == null) {
            list = clientIdentity != null ? clientIdentity.e : null;
            if (list == null) {
                int i2 = yfq.d;
                list = yls.a;
                list.getClass();
            }
        }
        this.e = wub.t(list);
        this.f = clientIdentity;
    }

    public final boolean a() {
        return this.f != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.a == clientIdentity.a && affa.f(this.b, clientIdentity.b) && affa.f(this.c, clientIdentity.c) && affa.f(this.d, clientIdentity.d) && affa.f(this.f, clientIdentity.f) && affa.f(this.e, clientIdentity.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, this.f);
    }

    public final String toString() {
        String str = this.c;
        int length = str != null ? str.length() : 0;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + 18 + length);
        sb.append(this.a);
        sb.append("/");
        sb.append(str2);
        if (str != null) {
            sb.append("[");
            if (afyh.g(str, str2, false)) {
                sb.append((CharSequence) str, str2.length(), str.length());
            } else {
                sb.append(str);
            }
            sb.append("]");
        }
        String str3 = this.d;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.a;
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, i2);
        spu.F(parcel, 3, this.b);
        spu.F(parcel, 4, this.c);
        spu.F(parcel, 6, this.d);
        spu.E(parcel, 7, this.f, i);
        spu.J(parcel, 8, this.e);
        spu.m(parcel, iL);
    }
}
