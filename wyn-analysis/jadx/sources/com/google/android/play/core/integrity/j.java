package com.google.android.play.core.integrity;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    public final com.google.android.gms.common.api.j a(Bundle bundle) {
        int i5 = bundle.getInt("error");
        if (i5 == 0) {
            return null;
        }
        return new StandardIntegrityException(i5, null);
    }
}
