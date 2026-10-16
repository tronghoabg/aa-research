package com.google.mlkit.common.internal;

import L8.a;
import L8.b;
import L8.l;
import a9.C1341a;
import a9.C1342b;
import ad.C1355I;
import ad.r;
import androidx.fragment.app.X;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import wa.C4398a;
import xa.c;
import xa.d;
import ya.C4570a;
import ya.g;
import ya.h;
import ya.k;
import za.C4658a;

/* loaded from: classes4.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b bVar = k.f48058b;
        a aVarB = b.b(C4658a.class);
        aVarB.c(l.d(g.class));
        aVarB.f6989g = new X(14);
        b bVarD = aVarB.d();
        a aVarB2 = b.b(h.class);
        aVarB2.f6989g = new a2.k();
        b bVarD2 = aVarB2.d();
        a aVarB3 = b.b(d.class);
        aVarB3.c(new l(2, 0, c.class));
        aVarB3.f6989g = new C1341a();
        b bVarD3 = aVarB3.d();
        a aVarB4 = b.b(ya.d.class);
        aVarB4.c(new l(1, 1, h.class));
        aVarB4.f6989g = new C1342b();
        b bVarD4 = aVarB4.d();
        a aVarB5 = b.b(C4570a.class);
        aVarB5.f6989g = new ab.b();
        b bVarD5 = aVarB5.d();
        a aVarB6 = b.b(ya.b.class);
        aVarB6.c(l.d(C4570a.class));
        aVarB6.f6989g = new r();
        b bVarD6 = aVarB6.d();
        a aVarB7 = b.b(C4398a.class);
        aVarB7.c(l.d(g.class));
        aVarB7.f6989g = new C1355I(15);
        b bVarD7 = aVarB7.d();
        a aVarB8 = b.b(c.class);
        aVarB8.f6985c = 1;
        aVarB8.c(new l(1, 1, C4398a.class));
        aVarB8.f6989g = new ae.b();
        return zzaf.zzi(bVar, bVarD, bVarD2, bVarD3, bVarD4, bVarD5, bVarD6, bVarD7, aVarB8.d());
    }
}
