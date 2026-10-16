package w1;

import A.AbstractC0213f;
import androidx.datastore.preferences.protobuf.AbstractC1402t;
import androidx.datastore.preferences.protobuf.AbstractC1404v;
import androidx.datastore.preferences.protobuf.C1383a0;
import androidx.datastore.preferences.protobuf.C1403u;
import androidx.datastore.preferences.protobuf.W;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: w1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4358i extends AbstractC1404v {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final C4358i DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile W PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C4358i c4358i = new C4358i();
        DEFAULT_INSTANCE = c4358i;
        AbstractC1404v.h(C4358i.class, c4358i);
    }

    public static void i(C4358i c4358i, long j8) {
        c4358i.valueCase_ = 4;
        c4358i.value_ = Long.valueOf(j8);
    }

    public static void j(C4358i c4358i, String str) {
        c4358i.getClass();
        str.getClass();
        c4358i.valueCase_ = 5;
        c4358i.value_ = str;
    }

    public static void k(C4358i c4358i, C4355f c4355f) {
        c4358i.getClass();
        c4358i.value_ = c4355f.a();
        c4358i.valueCase_ = 6;
    }

    public static void l(C4358i c4358i, double d3) {
        c4358i.valueCase_ = 7;
        c4358i.value_ = Double.valueOf(d3);
    }

    public static void m(C4358i c4358i, boolean z2) {
        c4358i.valueCase_ = 1;
        c4358i.value_ = Boolean.valueOf(z2);
    }

    public static void n(C4358i c4358i, float f10) {
        c4358i.valueCase_ = 2;
        c4358i.value_ = Float.valueOf(f10);
    }

    public static void o(C4358i c4358i, int i5) {
        c4358i.valueCase_ = 3;
        c4358i.value_ = Integer.valueOf(i5);
    }

    public static C4358i q() {
        return DEFAULT_INSTANCE;
    }

    public static C4357h y() {
        return (C4357h) ((AbstractC1402t) DEFAULT_INSTANCE.d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1404v
    public final Object d(int i5) {
        W c1403u;
        switch (AbstractC0213f.f(i5)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1383a0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C4356g.class});
            case 3:
                return new C4358i();
            case 4:
                return new C4357h(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                W w2 = PARSER;
                if (w2 != null) {
                    return w2;
                }
                synchronized (C4358i.class) {
                    try {
                        c1403u = PARSER;
                        if (c1403u == null) {
                            c1403u = new C1403u();
                            PARSER = c1403u;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1403u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float s() {
        return this.valueCase_ == 2 ? ((Float) this.value_).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String v() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final C4356g w() {
        return this.valueCase_ == 6 ? (C4356g) this.value_ : C4356g.j();
    }

    public final int x() {
        switch (this.valueCase_) {
            case 0:
                return 8;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }
}
