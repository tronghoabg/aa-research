package com.google.w.t;

import com.google.v.eg;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum c implements eg {
    D3D_FEATURE_LEVEL_UNKNOWN(0),
    D3D_FEATURE_LEVEL_1_0_CORE(1),
    D3D_FEATURE_LEVEL_9_1(2),
    D3D_FEATURE_LEVEL_9_2(3),
    D3D_FEATURE_LEVEL_9_3(4),
    D3D_FEATURE_LEVEL_10_0(5),
    D3D_FEATURE_LEVEL_10_1(6),
    D3D_FEATURE_LEVEL_11_0(7),
    D3D_FEATURE_LEVEL_11_1(8),
    D3D_FEATURE_LEVEL_12_0(9),
    D3D_FEATURE_LEVEL_12_1(10),
    D3D_FEATURE_LEVEL_12_2(11),
    UNRECOGNIZED(-1);

    private final int o;

    c(int i2) {
        this.o = i2;
    }

    public static ei a() {
        return b.f13366a;
    }

    public static c b(int i2) {
        switch (i2) {
            case 0:
                return D3D_FEATURE_LEVEL_UNKNOWN;
            case 1:
                return D3D_FEATURE_LEVEL_1_0_CORE;
            case 2:
                return D3D_FEATURE_LEVEL_9_1;
            case 3:
                return D3D_FEATURE_LEVEL_9_2;
            case 4:
                return D3D_FEATURE_LEVEL_9_3;
            case 5:
                return D3D_FEATURE_LEVEL_10_0;
            case 6:
                return D3D_FEATURE_LEVEL_10_1;
            case 7:
                return D3D_FEATURE_LEVEL_11_0;
            case 8:
                return D3D_FEATURE_LEVEL_11_1;
            case 9:
                return D3D_FEATURE_LEVEL_12_0;
            case 10:
                return D3D_FEATURE_LEVEL_12_1;
            case 11:
                return D3D_FEATURE_LEVEL_12_2;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
