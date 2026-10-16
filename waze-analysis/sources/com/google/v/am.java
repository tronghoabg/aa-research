package com.google.v;

import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum am implements eg {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(900),
    EDITION_PROTO2(998),
    EDITION_PROTO3(999),
    EDITION_2023(1000),
    EDITION_2024(1001),
    EDITION_2026(1002),
    EDITION_UNSTABLE(DescriptorProtos.Edition.EDITION_UNSTABLE_VALUE),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(DescriptorProtos.Edition.EDITION_99997_TEST_ONLY_VALUE),
    EDITION_99998_TEST_ONLY(DescriptorProtos.Edition.EDITION_99998_TEST_ONLY_VALUE),
    EDITION_99999_TEST_ONLY(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE),
    EDITION_MAX(Integer.MAX_VALUE);

    private final int p;

    am(int i2) {
        this.p = i2;
    }

    public static am a(int i2) {
        if (i2 == 0) {
            return EDITION_UNKNOWN;
        }
        if (i2 == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i2 == 2) {
            return EDITION_2_TEST_ONLY;
        }
        if (i2 == 900) {
            return EDITION_LEGACY;
        }
        if (i2 == 9999) {
            return EDITION_UNSTABLE;
        }
        if (i2 == Integer.MAX_VALUE) {
            return EDITION_MAX;
        }
        switch (i2) {
            case 998:
                return EDITION_PROTO2;
            case 999:
                return EDITION_PROTO3;
            case 1000:
                return EDITION_2023;
            case 1001:
                return EDITION_2024;
            case 1002:
                return EDITION_2026;
            default:
                switch (i2) {
                    case EDITION_99997_TEST_ONLY_VALUE:
                        return EDITION_99997_TEST_ONLY;
                    case EDITION_99998_TEST_ONLY_VALUE:
                        return EDITION_99998_TEST_ONLY;
                    case EDITION_99999_TEST_ONLY_VALUE:
                        return EDITION_99999_TEST_ONLY;
                    default:
                        return null;
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
