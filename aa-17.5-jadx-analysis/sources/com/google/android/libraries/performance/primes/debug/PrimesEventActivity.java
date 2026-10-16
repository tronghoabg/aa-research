package com.google.android.libraries.performance.primes.debug;

import android.R;
import android.os.Bundle;
import defpackage.ep;
import defpackage.vlw;
import defpackage.w;

/* loaded from: classes3.dex */
public final class PrimesEventActivity extends ep {
    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            w wVar = new w(a());
            wVar.q(R.id.content, new vlw(), null);
            wVar.c();
        }
    }
}
