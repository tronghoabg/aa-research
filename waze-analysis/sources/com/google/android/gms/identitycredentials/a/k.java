package com.google.android.gms.identitycredentials.a;

import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class k {
    static /* synthetic */ void a(Status status) {
        x.f(status, NotificationCompat.CATEGORY_STATUS);
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ int[] b() {
        return new int[]{1, 2, 3};
    }

    public static com.google.android.gms.common.api.k c() {
        com.google.android.gms.k.a.a.a();
        Parcelable.Creator<m> creator = m.CREATOR;
        m mVarA = new l().a();
        Parcelable.Creator<com.google.android.gms.common.api.k> creator2 = com.google.android.gms.common.api.k.CREATOR;
        com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j();
        jVar.b(mVarA);
        return jVar.a();
    }
}
