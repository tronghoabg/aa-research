package l7;

import android.util.Base64;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k7.C3190a;
import ka.AbstractC3256n;
import n7.AbstractC3598c;
import n7.AbstractC3599d;

/* renamed from: l7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3398b {
    public static final void e(StringBuilder sb2, C3397a c3397a, Object obj) {
        int i5 = c3397a.f40013b;
        if (i5 == 11) {
            Class cls = c3397a.f40019h;
            AbstractC1732v.i(cls);
            sb2.append(((AbstractC3398b) cls.cast(obj)).toString());
        } else {
            if (i5 != 7) {
                sb2.append(obj);
                return;
            }
            sb2.append("\"");
            sb2.append(AbstractC3599d.a((String) obj));
            sb2.append("\"");
        }
    }

    public static final Object zaD(C3397a c3397a, Object obj) {
        C3190a c3190a = c3397a.k;
        if (c3190a != null) {
            obj = (String) c3190a.f39287c.get(((Integer) obj).intValue());
            if (obj == null && c3190a.f39286b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
        }
        return obj;
    }

    public <T extends AbstractC3398b> void addConcreteTypeArrayInternal(C3397a c3397a, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends AbstractC3398b> void addConcreteTypeInternal(C3397a c3397a, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(C3397a c3397a, Object obj) {
        C3190a c3190a = c3397a.k;
        AbstractC1732v.i(c3190a);
        HashMap map = c3190a.f39286b;
        Integer num = (Integer) map.get((String) obj);
        Integer num2 = num;
        if (num == null) {
            num2 = (Integer) map.get("gms_unknown");
        }
        AbstractC1732v.i(num2);
        int i5 = c3397a.f40015d;
        String str = c3397a.f40017f;
        switch (i5) {
            case 0:
                setIntegerInternal(c3397a, str, num2.intValue());
                return;
            case 1:
                zaf(c3397a, str, (BigInteger) num2);
                return;
            case 2:
                setLongInternal(c3397a, str, ((Long) num2).longValue());
                return;
            case 3:
            default:
                throw new IllegalStateException(AbstractC3256n.g(i5, "Unsupported type for conversion: "));
            case 4:
                zan(c3397a, str, ((Double) num2).doubleValue());
                return;
            case 5:
                zab(c3397a, str, (BigDecimal) num2);
                return;
            case 6:
                setBooleanInternal(c3397a, str, ((Boolean) num2).booleanValue());
                return;
            case 7:
                setStringInternal(c3397a, str, (String) num2);
                return;
            case 8:
            case 9:
                setDecodedBytesInternal(c3397a, str, (byte[]) num2);
                return;
        }
    }

    public abstract Map<String, C3397a> getFieldMappings();

    public Object getFieldValue(C3397a c3397a) {
        String str = c3397a.f40017f;
        if (c3397a.f40019h == null) {
            return getValueObject(str);
        }
        if (!(getValueObject(str) == null)) {
            throw new IllegalStateException("Concrete field shouldn't be value object: " + c3397a.f40017f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }

    public abstract Object getValueObject(String str);

    public boolean isFieldSet(C3397a c3397a) {
        if (c3397a.f40015d != 11) {
            return isPrimitiveFieldSet(c3397a.f40017f);
        }
        if (c3397a.f40016e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public void setBooleanInternal(C3397a c3397a, String str, boolean z2) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setDecodedBytesInternal(C3397a c3397a, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setIntegerInternal(C3397a c3397a, String str, int i5) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setLongInternal(C3397a c3397a, String str, long j8) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setStringInternal(C3397a c3397a, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringMapInternal(C3397a c3397a, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringsInternal(C3397a c3397a, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        Map<String, C3397a> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            C3397a c3397a = fieldMappings.get(str);
            if (isFieldSet(c3397a)) {
                Object objZaD = zaD(c3397a, getFieldValue(c3397a));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                N0.a.r(sb2, "\"", str, "\":");
                if (objZaD != null) {
                    switch (c3397a.f40015d) {
                        case 8:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) objZaD, 0));
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            sb2.append(Base64.encodeToString((byte[]) objZaD, 10));
                            sb2.append("\"");
                            break;
                        case 10:
                            AbstractC3598c.o(sb2, (HashMap) objZaD);
                            break;
                        default:
                            if (c3397a.f40014c) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    if (i5 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i5);
                                    if (obj != null) {
                                        e(sb2, c3397a, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            } else {
                                e(sb2, c3397a, objZaD);
                                break;
                            }
                    }
                } else {
                    sb2.append("null");
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append(JsonUtils.EMPTY_JSON);
        }
        return sb2.toString();
    }

    public final void zaA(C3397a c3397a, String str) {
        if (c3397a.k != null) {
            c(c3397a, str);
        } else {
            setStringInternal(c3397a, c3397a.f40017f, str);
        }
    }

    public final void zaB(C3397a c3397a, Map map) {
        if (c3397a.k != null) {
            c(c3397a, map);
        } else {
            setStringMapInternal(c3397a, c3397a.f40017f, map);
        }
    }

    public final void zaC(C3397a c3397a, ArrayList arrayList) {
        if (c3397a.k != null) {
            c(c3397a, arrayList);
        } else {
            setStringsInternal(c3397a, c3397a.f40017f, arrayList);
        }
    }

    public final void zaa(C3397a c3397a, BigDecimal bigDecimal) {
        if (c3397a.k != null) {
            c(c3397a, bigDecimal);
        } else {
            zab(c3397a, c3397a.f40017f, bigDecimal);
        }
    }

    public void zab(C3397a c3397a, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(C3397a c3397a, ArrayList arrayList) {
        if (c3397a.k != null) {
            c(c3397a, arrayList);
        } else {
            zad(c3397a, c3397a.f40017f, arrayList);
        }
    }

    public void zad(C3397a c3397a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(C3397a c3397a, BigInteger bigInteger) {
        if (c3397a.k != null) {
            c(c3397a, bigInteger);
        } else {
            zaf(c3397a, c3397a.f40017f, bigInteger);
        }
    }

    public void zaf(C3397a c3397a, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(C3397a c3397a, ArrayList arrayList) {
        if (c3397a.k != null) {
            c(c3397a, arrayList);
        } else {
            zah(c3397a, c3397a.f40017f, arrayList);
        }
    }

    public void zah(C3397a c3397a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(C3397a c3397a, boolean z2) {
        if (c3397a.k != null) {
            c(c3397a, Boolean.valueOf(z2));
        } else {
            setBooleanInternal(c3397a, c3397a.f40017f, z2);
        }
    }

    public final void zaj(C3397a c3397a, ArrayList arrayList) {
        if (c3397a.k != null) {
            c(c3397a, arrayList);
        } else {
            zak(c3397a, c3397a.f40017f, arrayList);
        }
    }

    public void zak(C3397a c3397a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(C3397a c3397a, byte[] bArr) {
        if (c3397a.k != null) {
            c(c3397a, bArr);
        } else {
            setDecodedBytesInternal(c3397a, c3397a.f40017f, bArr);
        }
    }

    public final void zam(C3397a c3397a, double d3) {
        if (c3397a.k != null) {
            c(c3397a, Double.valueOf(d3));
        } else {
            zan(c3397a, c3397a.f40017f, d3);
        }
    }

    public void zan(C3397a c3397a, String str, double d3) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(C3397a c3397a, ArrayList arrayList) {
        if (c3397a.k != null) {
            c(c3397a, arrayList);
        } else {
            zap(c3397a, c3397a.f40017f, arrayList);
        }
    }

    public void zap(C3397a c3397a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(C3397a c3397a, float f10) {
        if (c3397a.k != null) {
            c(c3397a, Float.valueOf(f10));
        } else {
            zar(c3397a, c3397a.f40017f, f10);
        }
    }

    public void zar(C3397a c3397a, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(C3397a c3397a, ArrayList arrayList) {
        if (c3397a.k != null) {
            c(c3397a, arrayList);
        } else {
            zat(c3397a, c3397a.f40017f, arrayList);
        }
    }

    public void zat(C3397a c3397a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(C3397a c3397a, int i5) {
        if (c3397a.k != null) {
            c(c3397a, Integer.valueOf(i5));
        } else {
            setIntegerInternal(c3397a, c3397a.f40017f, i5);
        }
    }

    public final void zav(C3397a c3397a, ArrayList arrayList) {
        if (c3397a.k != null) {
            c(c3397a, arrayList);
        } else {
            zaw(c3397a, c3397a.f40017f, arrayList);
        }
    }

    public void zaw(C3397a c3397a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(C3397a c3397a, long j8) {
        if (c3397a.k != null) {
            c(c3397a, Long.valueOf(j8));
        } else {
            setLongInternal(c3397a, c3397a.f40017f, j8);
        }
    }

    public final void zay(C3397a c3397a, ArrayList arrayList) {
        if (c3397a.k != null) {
            c(c3397a, arrayList);
        } else {
            zaz(c3397a, c3397a.f40017f, arrayList);
        }
    }

    public void zaz(C3397a c3397a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
