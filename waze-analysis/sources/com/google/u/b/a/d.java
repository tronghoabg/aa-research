package com.google.u.b.a;

import com.google.v.el;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d implements el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f12618a;

    d(int i2) {
        this.f12618a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        int i3 = this.f12618a;
        if (i3 == 0) {
            b bVarA = b.a(i2);
            return bVarA == null ? b.CB_NONE : bVarA;
        }
        if (i3 == 1) {
            b bVarA2 = b.a(i2);
            return bVarA2 == null ? b.CB_NONE : bVarA2;
        }
        if (i3 != 2) {
            b bVarA3 = b.a(i2);
            return bVarA3 == null ? b.CB_NONE : bVarA3;
        }
        b bVarA4 = b.a(i2);
        return bVarA4 == null ? b.CB_NONE : bVarA4;
    }
}
