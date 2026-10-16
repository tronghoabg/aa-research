package com.google.mlkit.vision.text.internal;

import Ea.h;
import L8.a;
import L8.b;
import L8.l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import m9.S;
import wa.C4398a;
import ya.d;
import ya.g;

/* loaded from: classes4.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a aVarB = b.b(h.class);
        aVarB.c(l.d(g.class));
        aVarB.f6989g = new S(17);
        b bVarD = aVarB.d();
        a aVarB2 = b.b(Ea.g.class);
        aVarB2.c(l.d(h.class));
        aVarB2.c(l.d(d.class));
        aVarB2.f6989g = new C4398a(17);
        return zzbk.zzi(bVarD, aVarB2.d());
    }
}
