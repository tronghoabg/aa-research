package com.google.android.gms.f;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p extends q {
    @Override // com.google.android.gms.f.q
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new r("Invalid response to one way request"));
        }
    }

    @Override // com.google.android.gms.f.q
    final boolean b() {
        return true;
    }
}
