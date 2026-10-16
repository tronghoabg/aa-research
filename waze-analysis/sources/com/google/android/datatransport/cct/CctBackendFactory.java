package com.google.android.datatransport.cct;

import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.l;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class CctBackendFactory implements com.google.android.datatransport.runtime.backends.a {
    @Override // com.google.android.datatransport.runtime.backends.a
    public l create(f fVar) {
        return new d(fVar.a(), fVar.c(), fVar.b());
    }
}
