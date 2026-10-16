package com.waze.bg.a;

import com.google.v.el;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class n implements el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f16554a;

    n(int i2) {
        this.f16554a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        int i3 = this.f16554a;
        if (i3 == 0) {
            p pVarA = p.a(i2);
            return pVarA == null ? p.ALERT_REPORTING_SOURCE_UNKNOWN : pVarA;
        }
        if (i3 == 1) {
            bl blVarA = bl.a(i2);
            return blVarA == null ? bl.ALERT_TRAIT_UNKNOWN : blVarA;
        }
        if (i3 != 2) {
            cb cbVarA = cb.a(i2);
            return cbVarA == null ? cb.CAMERA_TYPE_UNSPECIFIED : cbVarA;
        }
        cb cbVarA2 = cb.a(i2);
        return cbVarA2 == null ? cb.CAMERA_TYPE_UNSPECIFIED : cbVarA2;
    }
}
