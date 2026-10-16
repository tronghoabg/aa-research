package com.waze.o;

import com.google.v.el;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class am implements el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f32634a;

    am(int i2) {
        this.f32634a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        if (this.f32634a != 0) {
            i.c.a.a.c cVarB = i.c.a.a.c.b(i2);
            return cVarB == null ? i.c.a.a.c.UNKNOWN : cVarB;
        }
        i.c.a.a.d dVarB = i.c.a.a.d.b(i2);
        return dVarB == null ? i.c.a.a.d.UNKNOWN : dVarB;
    }
}
