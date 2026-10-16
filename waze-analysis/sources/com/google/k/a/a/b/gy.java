package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gy implements com.google.v.eg {
    SOURCE_AUTHORITY_UNSPECIFIED(0),
    SOURCE_AUTHORITY_CHANDIAGARH_TRAFFIC_POLICE(1),
    SOURCE_AUTHORITY_CYBERABAD_TRAFFIC_POLICE(2),
    SOURCE_AUTHORITY_GURUGRAM_TRAFFIC_POLICE(3),
    SOURCE_AUTHORITY_FARIDABAD_TRAFFIC_POLICE(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f11433g;

    gy(int i2) {
        this.f11433g = i2;
    }

    public static gy a(int i2) {
        if (i2 == 0) {
            return SOURCE_AUTHORITY_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SOURCE_AUTHORITY_CHANDIAGARH_TRAFFIC_POLICE;
        }
        if (i2 == 2) {
            return SOURCE_AUTHORITY_CYBERABAD_TRAFFIC_POLICE;
        }
        if (i2 == 3) {
            return SOURCE_AUTHORITY_GURUGRAM_TRAFFIC_POLICE;
        }
        if (i2 != 4) {
            return null;
        }
        return SOURCE_AUTHORITY_FARIDABAD_TRAFFIC_POLICE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11433g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11433g);
    }
}
