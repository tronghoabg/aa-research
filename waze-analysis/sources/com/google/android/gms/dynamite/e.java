package com.google.android.gms.dynamite;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements k {
    @Override // com.google.android.gms.dynamite.k
    public final j a(Context context, i iVar) {
        int iB;
        j jVar = new j();
        int iA = iVar.a(context);
        jVar.f5187a = iA;
        int i2 = 1;
        int i3 = 0;
        if (iA != 0) {
            iB = iVar.b(context, false);
            jVar.f5188b = iB;
        } else {
            iB = iVar.b(context, true);
            jVar.f5188b = iB;
        }
        int i4 = jVar.f5187a;
        if (i4 == 0) {
            if (iB == 0) {
                i2 = 0;
            }
            jVar.f5189c = i2;
            return jVar;
        }
        i3 = i4;
        if (i3 >= iB) {
            i2 = -1;
        }
        jVar.f5189c = i2;
        return jVar;
    }
}
