package com.google.mlkit.vision.common.internal;

import Ba.c;
import Ba.d;
import L8.a;
import L8.b;
import L8.l;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes4.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a aVarB = b.b(d.class);
        aVarB.c(new l(2, 0, c.class));
        aVarB.f6989g = d.f1663b;
        return zzp.zzi(aVarB.d());
    }
}
