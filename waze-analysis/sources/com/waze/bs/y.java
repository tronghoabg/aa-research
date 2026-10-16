package com.waze.bs;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum y implements eg {
    PLACE_TYPE_UNSPECIFIED(0),
    DESTINATION(1),
    WAYPOINT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f17456e;

    y(int i2) {
        this.f17456e = i2;
    }

    public static y a(int i2) {
        if (i2 == 0) {
            return PLACE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return DESTINATION;
        }
        if (i2 != 2) {
            return null;
        }
        return WAYPOINT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f17456e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f17456e);
    }
}
