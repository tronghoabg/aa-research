package com.google.w.c.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum c implements eg {
    AGGREGATOR_TYPE_UNSPECIFIED(0),
    SUM(100),
    RESERVOIR_SAMPLE(101),
    MP_QUANTILE(102),
    BOOTSTRAP_SUM(103),
    MAX(104),
    MIN(105),
    SET(106),
    WEIGHTED_SAMPLE(107),
    MINCOUNT_UNIQUE(108),
    HYPERLOGLOG_UNIQUE(109),
    CMS_MOST_FREQUENT(110),
    VARIANCE(111),
    HYPERLOGLOG_PLUS_UNIQUE(112),
    KLL_QUANTILES(113),
    FAST_AGMS_JOIN(114),
    KHYPERLOGLOG(115),
    WEIGHTED_VARIANCE(116),
    IBLT(117),
    HYPERLOGLOG_DIM_UNIQUE(118),
    HYPERMINHASH(119),
    D3A_UNIQUE(120),
    D4M_QUANTILES(121),
    FREQUENCY_COUNTING(122),
    XCF_UNIQUES_BY_FREQUENCY(123),
    XCF_ANON_WRAPPER(124),
    XCI_UNIQUES(125),
    XCI_ANON_WRAPPER(127),
    CMS_MOST_FREQUENT_PACKED_ENCODING(126);

    private final int E;

    c(int i2) {
        this.E = i2;
    }

    public static c a(int i2) {
        if (i2 == 0) {
            return AGGREGATOR_TYPE_UNSPECIFIED;
        }
        switch (i2) {
            case 100:
                return SUM;
            case 101:
                return RESERVOIR_SAMPLE;
            case 102:
                return MP_QUANTILE;
            case 103:
                return BOOTSTRAP_SUM;
            case 104:
                return MAX;
            case 105:
                return MIN;
            case 106:
                return SET;
            case 107:
                return WEIGHTED_SAMPLE;
            case 108:
                return MINCOUNT_UNIQUE;
            case 109:
                return HYPERLOGLOG_UNIQUE;
            case 110:
                return CMS_MOST_FREQUENT;
            case 111:
                return VARIANCE;
            case 112:
                return HYPERLOGLOG_PLUS_UNIQUE;
            case 113:
                return KLL_QUANTILES;
            case 114:
                return FAST_AGMS_JOIN;
            case 115:
                return KHYPERLOGLOG;
            case 116:
                return WEIGHTED_VARIANCE;
            case 117:
                return IBLT;
            case 118:
                return HYPERLOGLOG_DIM_UNIQUE;
            case 119:
                return HYPERMINHASH;
            case 120:
                return D3A_UNIQUE;
            case 121:
                return D4M_QUANTILES;
            case 122:
                return FREQUENCY_COUNTING;
            case 123:
                return XCF_UNIQUES_BY_FREQUENCY;
            case 124:
                return XCF_ANON_WRAPPER;
            case 125:
                return XCI_UNIQUES;
            case 126:
                return CMS_MOST_FREQUENT_PACKED_ENCODING;
            case 127:
                return XCI_ANON_WRAPPER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.E;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.E);
    }
}
