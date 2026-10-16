package J3;

import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import zc.AbstractC4660a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5569a;

    public g(int i5) {
        switch (i5) {
            case 1:
                this.f5569a = new HashMap();
                break;
            default:
                this.f5569a = new HashMap();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static J3.g h(a9.C1342b r7, t6.q r8, android.app.Activity r9, md.J r10, int r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.g.h(a9.b, t6.q, android.app.Activity, md.J, int):J3.g");
    }

    public h a() {
        h hVar = new h(this.f5569a);
        h.c(hVar);
        return hVar;
    }

    public Cc.a b() {
        AbstractC4660a abstractC4660a = (AbstractC4660a) this.f5569a.get("EXPOSURE_OFFSET");
        Objects.requireNonNull(abstractC4660a);
        return (Cc.a) abstractC4660a;
    }

    public Dc.a c() {
        AbstractC4660a abstractC4660a = (AbstractC4660a) this.f5569a.get("EXPOSURE_POINT");
        Objects.requireNonNull(abstractC4660a);
        return (Dc.a) abstractC4660a;
    }

    public Fc.a d() {
        AbstractC4660a abstractC4660a = (AbstractC4660a) this.f5569a.get("FOCUS_POINT");
        Objects.requireNonNull(abstractC4660a);
        return (Fc.a) abstractC4660a;
    }

    public Ic.a e() {
        AbstractC4660a abstractC4660a = (AbstractC4660a) this.f5569a.get("RESOLUTION");
        Objects.requireNonNull(abstractC4660a);
        return (Ic.a) abstractC4660a;
    }

    public Jc.b f() {
        AbstractC4660a abstractC4660a = (AbstractC4660a) this.f5569a.get("SENSOR_ORIENTATION");
        Objects.requireNonNull(abstractC4660a);
        return (Jc.b) abstractC4660a;
    }

    public Kc.a g() {
        AbstractC4660a abstractC4660a = (AbstractC4660a) this.f5569a.get("ZOOM_LEVEL");
        Objects.requireNonNull(abstractC4660a);
        return (Kc.a) abstractC4660a;
    }

    public void i(Object obj, String str) {
        HashMap map = this.f5569a;
        if (obj == null) {
            map.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
            map.put(str, obj);
            return;
        }
        int i5 = 0;
        if (cls == boolean[].class) {
            boolean[] zArr = (boolean[]) obj;
            String str2 = h.f5570b;
            Boolean[] boolArr = new Boolean[zArr.length];
            while (i5 < zArr.length) {
                boolArr[i5] = Boolean.valueOf(zArr[i5]);
                i5++;
            }
            map.put(str, boolArr);
            return;
        }
        if (cls == byte[].class) {
            byte[] bArr = (byte[]) obj;
            String str3 = h.f5570b;
            Byte[] bArr2 = new Byte[bArr.length];
            while (i5 < bArr.length) {
                bArr2[i5] = Byte.valueOf(bArr[i5]);
                i5++;
            }
            map.put(str, bArr2);
            return;
        }
        if (cls == int[].class) {
            int[] iArr = (int[]) obj;
            String str4 = h.f5570b;
            Integer[] numArr = new Integer[iArr.length];
            while (i5 < iArr.length) {
                numArr[i5] = Integer.valueOf(iArr[i5]);
                i5++;
            }
            map.put(str, numArr);
            return;
        }
        if (cls == long[].class) {
            long[] jArr = (long[]) obj;
            String str5 = h.f5570b;
            Long[] lArr = new Long[jArr.length];
            while (i5 < jArr.length) {
                lArr[i5] = Long.valueOf(jArr[i5]);
                i5++;
            }
            map.put(str, lArr);
            return;
        }
        if (cls == float[].class) {
            float[] fArr = (float[]) obj;
            String str6 = h.f5570b;
            Float[] fArr2 = new Float[fArr.length];
            while (i5 < fArr.length) {
                fArr2[i5] = Float.valueOf(fArr[i5]);
                i5++;
            }
            map.put(str, fArr2);
            return;
        }
        if (cls != double[].class) {
            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
        }
        double[] dArr = (double[]) obj;
        String str7 = h.f5570b;
        Double[] dArr2 = new Double[dArr.length];
        while (i5 < dArr.length) {
            dArr2[i5] = Double.valueOf(dArr[i5]);
            i5++;
        }
        map.put(str, dArr2);
    }

    public void j(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            i(entry.getValue(), (String) entry.getKey());
        }
    }
}
