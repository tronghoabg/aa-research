package com.google.android.gms.fido.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class be extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<be> CREATOR = new e(19, null);

    /* renamed from: a, reason: collision with root package name */
    private final List f5368a;

    be(List list) {
        this.f5368a = list;
    }

    public final JSONArray a() throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f5368a;
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    bf bfVar = (bf) list.get(i2);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(bfVar.a());
                    jSONArray2.put(Short.toString(bfVar.b()));
                    jSONArray2.put(Short.toString(bfVar.c()));
                    jSONArray.put(i2, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e2);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        List list2 = this.f5368a;
        if (list2 == null && beVar.f5368a == null) {
            return true;
        }
        return list2 != null && (list = beVar.f5368a) != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f5368a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        List list = this.f5368a;
        int iD = com.google.android.gms.common.internal.bb.d(parcel);
        com.google.android.gms.common.internal.bb.y(parcel, 1, list);
        com.google.android.gms.common.internal.bb.e(parcel, iD);
    }
}
