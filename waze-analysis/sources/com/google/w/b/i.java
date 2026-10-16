package com.google.w.b;

import com.google.v.el;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i implements el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f13140a;

    i(int i2) {
        this.f13140a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        int i3 = this.f13140a;
        if (i3 == 0) {
            t tVarB = t.b(i2);
            return tVarB == null ? t.ST_NOT_SPECIFIED : tVarB;
        }
        if (i3 != 1) {
            t tVarB2 = t.b(i2);
            return tVarB2 == null ? t.ST_NOT_SPECIFIED : tVarB2;
        }
        t tVarB3 = t.b(i2);
        return tVarB3 == null ? t.ST_NOT_SPECIFIED : tVarB3;
    }
}
