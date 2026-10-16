package com.google.w.t;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum d implements eg {
    NETWORK_ENVIRONMENT_UNKNOWN(0),
    NETWORK_ENVIRONMENT_STANDALONE(1),
    NETWORK_ENVIRONMENT_WORKGROUP(2),
    NETWORK_ENVIRONMENT_DOMAIN(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f13389g;

    d(int i2) {
        this.f13389g = i2;
    }

    public static ei a() {
        return b.f13368c;
    }

    public static d b(int i2) {
        if (i2 == 0) {
            return NETWORK_ENVIRONMENT_UNKNOWN;
        }
        if (i2 == 1) {
            return NETWORK_ENVIRONMENT_STANDALONE;
        }
        if (i2 == 2) {
            return NETWORK_ENVIRONMENT_WORKGROUP;
        }
        if (i2 != 3) {
            return null;
        }
        return NETWORK_ENVIRONMENT_DOMAIN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.f13389g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13389g);
    }
}
