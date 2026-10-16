package com.google.android.libraries.e.a.c;

import com.google.android.libraries.e.a.d;
import com.google.android.libraries.e.a.e;
import java.io.OutputStream;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.datatransport.runtime.backends.c[] f5839a;

    public static c b() {
        return new c();
    }

    @Override // com.google.android.libraries.e.a.e
    public final /* bridge */ /* synthetic */ Object a(d dVar) {
        List listD = dVar.d(dVar.b().j(dVar.a()));
        com.google.android.datatransport.runtime.backends.c[] cVarArr = this.f5839a;
        if (cVarArr != null) {
            cVarArr[0].d(listD);
        }
        return (OutputStream) listD.get(0);
    }

    public final void c(com.google.android.datatransport.runtime.backends.c... cVarArr) {
        this.f5839a = cVarArr;
    }
}
