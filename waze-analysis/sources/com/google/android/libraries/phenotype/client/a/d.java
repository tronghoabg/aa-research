package com.google.android.libraries.phenotype.client.a;

import com.google.v.eg;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum d implements eg {
    SOURCE_UNSPECIFIED(0),
    DEFAULT_VALUES(1),
    LOCAL_STORAGE(2),
    SHARED_STORAGE(3),
    GET_CONFIGURATION_SNAPSHOT_CALL(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f5959h;

    d(int i2) {
        this.f5959h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f5959h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f5959h);
    }
}
