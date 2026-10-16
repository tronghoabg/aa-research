package com.google.firebase.i;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.c;
import com.google.firebase.components.h;
import com.google.firebase.h.e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements h {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f9917b;

    public a(int i2) {
        this.f9917b = i2;
    }

    @Override // com.google.firebase.components.h
    public final List a(ComponentRegistrar componentRegistrar) {
        if (this.f9917b != 0) {
            return componentRegistrar.getComponents();
        }
        ArrayList arrayList = new ArrayList();
        for (c<?> cVarH : componentRegistrar.getComponents()) {
            String strJ = cVarH.j();
            if (strJ != null) {
                cVarH = cVarH.h(new e(strJ, cVarH, 2));
            }
            arrayList.add(cVarH);
        }
        return arrayList;
    }
}
