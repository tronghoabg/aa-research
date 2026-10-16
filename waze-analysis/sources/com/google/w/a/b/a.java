package com.google.w.a.b;

import com.google.v.el;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class a implements el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f13086a;

    a(int i2) {
        this.f13086a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        int i3 = this.f13086a;
        if (i3 == 0) {
            i iVarA = i.a(i2);
            return iVarA == null ? i.EC_NONE : iVarA;
        }
        if (i3 == 1) {
            g gVarA = g.a(i2);
            return gVarA == null ? g.UC_DEFAULT : gVarA;
        }
        if (i3 != 2) {
            i iVarA2 = i.a(i2);
            return iVarA2 == null ? i.EC_NONE : iVarA2;
        }
        g gVarA2 = g.a(i2);
        return gVarA2 == null ? g.UC_DEFAULT : gVarA2;
    }
}
