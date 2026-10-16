package com.google.firebase.crashlytics;

import com.google.android.gms.o.t;
import com.google.firebase.crashlytics.a.i;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f implements com.google.android.gms.o.a {
    @Override // com.google.android.gms.o.a
    public final Object a(t tVar) {
        if (tVar.k()) {
            return null;
        }
        i.a().e("Error fetching settings.", tVar.f());
        return null;
    }
}
