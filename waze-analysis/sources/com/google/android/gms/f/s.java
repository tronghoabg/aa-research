package com.google.android.gms.f;

import android.os.Bundle;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class s extends q {
    @Override // com.google.android.gms.f.q
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // com.google.android.gms.f.q
    final boolean b() {
        return false;
    }
}
