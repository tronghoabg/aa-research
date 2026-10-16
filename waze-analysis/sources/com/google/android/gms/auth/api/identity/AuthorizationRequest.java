package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.bb;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AuthorizationRequest extends com.google.android.gms.common.internal.a.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new n(1);

    /* renamed from: a, reason: collision with root package name */
    private final List f4438a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4439b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4440c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4441d;

    /* renamed from: e, reason: collision with root package name */
    private final Account f4442e;

    /* renamed from: f, reason: collision with root package name */
    private final String f4443f;

    /* renamed from: g, reason: collision with root package name */
    private final String f4444g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f4445h;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f4446i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f4447j;

    /* renamed from: k, reason: collision with root package name */
    private final int f4448k;

    AuthorizationRequest(List list, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3, Bundle bundle, boolean z4, int i2) {
        boolean z5 = false;
        if (list != null && !list.isEmpty()) {
            z5 = true;
        }
        av.d(z5, "requestedScopes cannot be null or empty");
        this.f4438a = list;
        this.f4439b = str;
        this.f4440c = z;
        this.f4441d = z2;
        this.f4442e = account;
        this.f4443f = str2;
        this.f4444g = str3;
        this.f4445h = z3;
        this.f4446i = bundle;
        this.f4447j = z4;
        this.f4448k = i2;
    }

    public static b a(AuthorizationRequest authorizationRequest) {
        c cVar;
        b bVar = new b();
        bVar.i(authorizationRequest.f4438a);
        Bundle bundle = authorizationRequest.f4446i;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                c[] cVarArrValues = c.values();
                int length = cVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = cVarArrValues[i2];
                    if (cVar.f4489l.equals(str)) {
                        break;
                    }
                    i2++;
                }
                if (string != null && cVar != null) {
                    bVar.b(cVar, string);
                }
            }
        }
        boolean z = authorizationRequest.f4445h;
        String str2 = authorizationRequest.f4444g;
        String str3 = authorizationRequest.f4443f;
        Account account = authorizationRequest.f4442e;
        String str4 = authorizationRequest.f4439b;
        if (str2 != null) {
            bVar.j(str2);
        }
        if (str3 != null) {
            bVar.c(str3);
        }
        if (account != null) {
            bVar.f(account);
        }
        if (authorizationRequest.f4441d && str4 != null) {
            bVar.d(str4);
        }
        if (authorizationRequest.f4440c && str4 != null) {
            bVar.e(str4, z);
        }
        bVar.g(authorizationRequest.f4447j);
        bVar.h(authorizationRequest.f4448k);
        return bVar;
    }

    private static boolean b(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        if (!setKeySet.equals(bundle2.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!b((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (obj == null || obj2 == null || !obj.getClass().isArray() || !obj2.getClass().isArray()) {
                if (!Objects.equals(obj, obj2)) {
                    return false;
                }
            } else if (!Objects.deepEquals(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f4438a;
        int size = list.size();
        List list2 = authorizationRequest.f4438a;
        return size == list2.size() && list.containsAll(list2) && b(this.f4446i, authorizationRequest.f4446i) && this.f4440c == authorizationRequest.f4440c && this.f4445h == authorizationRequest.f4445h && this.f4441d == authorizationRequest.f4441d && this.f4447j == authorizationRequest.f4447j && this.f4448k == authorizationRequest.f4448k && Objects.equals(this.f4439b, authorizationRequest.f4439b) && Objects.equals(this.f4442e, authorizationRequest.f4442e) && Objects.equals(this.f4443f, authorizationRequest.f4443f) && Objects.equals(this.f4444g, authorizationRequest.f4444g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4438a, this.f4439b, Boolean.valueOf(this.f4440c), Boolean.valueOf(this.f4445h), Boolean.valueOf(this.f4441d), this.f4442e, this.f4443f, this.f4444g, this.f4446i, Boolean.valueOf(this.f4447j), Integer.valueOf(this.f4448k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.f4438a;
        int iD = bb.d(parcel);
        bb.y(parcel, 1, list);
        bb.u(parcel, 2, this.f4439b);
        bb.f(parcel, 3, this.f4440c);
        bb.f(parcel, 4, this.f4441d);
        bb.t(parcel, 5, this.f4442e, i2);
        bb.u(parcel, 6, this.f4443f);
        bb.u(parcel, 7, this.f4444g);
        bb.f(parcel, 8, this.f4445h);
        bb.k(parcel, 9, this.f4446i);
        bb.f(parcel, 10, this.f4447j);
        bb.g(parcel, 11, this.f4448k);
        bb.e(parcel, iD);
    }
}
