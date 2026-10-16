package com.google.w.i.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum a implements eg {
    UNKNOWN(0),
    FRONTEND_REGION_CODE(1),
    TRUSTED_LOCATION_VIEW_REGION_CODE(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f13255f;

    a(int i2) {
        this.f13255f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13255f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13255f);
    }
}
