package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.bb;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<z> CREATOR = new com.google.android.gms.auth.a.b(11);

    /* renamed from: a, reason: collision with root package name */
    final Bundle f10249a;

    /* renamed from: b, reason: collision with root package name */
    private Map f10250b;

    public z(Bundle bundle) {
        this.f10249a = bundle;
    }

    public final Map a() {
        if (this.f10250b == null) {
            Bundle bundle = this.f10249a;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(TypedValues.TransitionType.S_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.f10250b = arrayMap;
        }
        return this.f10250b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iD = bb.d(parcel);
        bb.k(parcel, 2, this.f10249a);
        bb.e(parcel, iD);
    }
}
