package com.bytedance.adsdk.uef;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xs implements zjm {
    @Override // com.bytedance.adsdk.uef.zjm
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public Number uef(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberUef = uef(objArr[0]);
        int iUef = uef(objArr[1], 0);
        boolean zUef = uef(objArr[2], false);
        if (numberUef == null) {
            return null;
        }
        return uef(numberUef, iUef, zUef);
    }

    public Number uef(Number number, int i5, boolean z2) {
        if (number == null) {
            return null;
        }
        int iMax = Math.max(i5, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z2 ? bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP) : bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        if (iMax != 0) {
            if ((scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).scale() > 0) {
                return Double.valueOf(scale.doubleValue());
            }
        }
        return Long.valueOf(scale.longValue());
    }

    private Number uef(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private int uef(Object obj, int i5) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i5;
    }

    private boolean uef(Object obj, boolean z2) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z2;
    }
}
