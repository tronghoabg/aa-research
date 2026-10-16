package com.vungle.ads.internal.task;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class a {
    public static f a(String str) {
        f fVar = new f("CleanupJob");
        fVar.f33688e = 0;
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("AD_ID_KEY", str);
        }
        f fVarA = fVar.a(bundle);
        fVarA.f33685b = str == null;
        return fVarA;
    }
}
