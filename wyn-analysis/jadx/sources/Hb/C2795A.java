package hb;

import io.ktor.utils.io.T;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: hb.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2795A extends w {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f36230h = new Object();

    /* renamed from: g, reason: collision with root package name */
    public Object[] f36231g;

    @Override // hb.w
    public final long B() throws NumberFormatException {
        long jLongValueExact;
        v vVar = v.f36354g;
        Object objF0 = f0(Object.class, vVar);
        if (objF0 instanceof Number) {
            jLongValueExact = ((Number) objF0).longValue();
        } else {
            if (!(objF0 instanceof String)) {
                throw b0(objF0, vVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objF0);
                } catch (NumberFormatException unused) {
                    throw b0(objF0, vVar);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objF0).longValueExact();
            }
        }
        e0();
        return jLongValueExact;
    }

    @Override // hb.w
    public final void D() {
        f0(Void.class, v.f36356i);
        e0();
    }

    @Override // hb.w
    public final String J() {
        int i5 = this.f36358a;
        Object obj = i5 != 0 ? this.f36231g[i5 - 1] : null;
        if (obj instanceof String) {
            e0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            e0();
            return obj.toString();
        }
        if (obj == f36230h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw b0(obj, v.f36353f);
    }

    @Override // hb.w
    public final v P() {
        int i5 = this.f36358a;
        if (i5 == 0) {
            return v.f36357j;
        }
        Object obj = this.f36231g[i5 - 1];
        if (obj instanceof z) {
            return ((z) obj).f36377a;
        }
        if (obj instanceof List) {
            return v.f36348a;
        }
        if (obj instanceof Map) {
            return v.f36350c;
        }
        if (obj instanceof Map.Entry) {
            return v.f36352e;
        }
        if (obj instanceof String) {
            return v.f36353f;
        }
        if (obj instanceof Boolean) {
            return v.f36355h;
        }
        if (obj instanceof Number) {
            return v.f36354g;
        }
        if (obj == null) {
            return v.f36356i;
        }
        if (obj == f36230h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw b0(obj, "a JSON value");
    }

    @Override // hb.w
    public final void Q() {
        if (o()) {
            d0(c0());
        }
    }

    @Override // hb.w
    public final int W(u uVar) {
        v vVar = v.f36352e;
        Map.Entry entry = (Map.Entry) f0(Map.Entry.class, vVar);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw b0(key, vVar);
        }
        String str = (String) key;
        int length = uVar.f36346a.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (uVar.f36346a[i5].equals(str)) {
                this.f36231g[this.f36358a - 1] = entry.getValue();
                this.f36360c[this.f36358a - 2] = str;
                return i5;
            }
        }
        return -1;
    }

    @Override // hb.w
    public final int X(u uVar) {
        int i5 = this.f36358a;
        Object obj = i5 != 0 ? this.f36231g[i5 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f36230h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = uVar.f36346a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (uVar.f36346a[i10].equals(str)) {
                e0();
                return i10;
            }
        }
        return -1;
    }

    @Override // hb.w
    public final void Y() {
        if (!this.f36363f) {
            this.f36231g[this.f36358a - 1] = ((Map.Entry) f0(Map.Entry.class, v.f36352e)).getValue();
            this.f36360c[this.f36358a - 2] = "null";
        } else {
            v vVarP = P();
            c0();
            throw new E5.Q("Cannot skip unexpected " + vVarP + " at " + i(), 11);
        }
    }

    @Override // hb.w
    public final void Z() {
        if (this.f36363f) {
            throw new E5.Q("Cannot skip unexpected " + P() + " at " + i(), 11);
        }
        int i5 = this.f36358a;
        if (i5 > 1) {
            this.f36360c[i5 - 2] = "null";
        }
        Object obj = i5 != 0 ? this.f36231g[i5 - 1] : null;
        if (obj instanceof z) {
            throw new E5.Q("Expected a value but was " + P() + " at path " + i(), 11);
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f36231g;
            int i10 = i5 - 1;
            objArr[i10] = ((Map.Entry) objArr[i10]).getValue();
        } else {
            if (i5 > 0) {
                e0();
                return;
            }
            throw new E5.Q("Expected a value but was " + P() + " at path " + i(), 11);
        }
    }

    @Override // hb.w
    public final void a() {
        List list = (List) f0(List.class, v.f36348a);
        z zVar = new z(v.f36349b, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f36231g;
        int i5 = this.f36358a;
        objArr[i5 - 1] = zVar;
        this.f36359b[i5 - 1] = 1;
        this.f36361d[i5 - 1] = 0;
        if (zVar.hasNext()) {
            d0(zVar.next());
        }
    }

    @Override // hb.w
    public final void b() {
        Map map = (Map) f0(Map.class, v.f36350c);
        z zVar = new z(v.f36351d, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f36231g;
        int i5 = this.f36358a;
        objArr[i5 - 1] = zVar;
        this.f36359b[i5 - 1] = 3;
        if (zVar.hasNext()) {
            d0(zVar.next());
        }
    }

    public final String c0() {
        v vVar = v.f36352e;
        Map.Entry entry = (Map.Entry) f0(Map.Entry.class, vVar);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw b0(key, vVar);
        }
        String str = (String) key;
        this.f36231g[this.f36358a - 1] = entry.getValue();
        this.f36360c[this.f36358a - 2] = str;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.f36231g, 0, this.f36358a, (Object) null);
        this.f36231g[0] = f36230h;
        this.f36359b[0] = 8;
        this.f36358a = 1;
    }

    @Override // hb.w
    public final void d() {
        v vVar = v.f36349b;
        z zVar = (z) f0(z.class, vVar);
        if (zVar.f36377a != vVar || zVar.hasNext()) {
            throw b0(zVar, vVar);
        }
        e0();
    }

    public final void d0(Object obj) {
        int i5 = this.f36358a;
        if (i5 == this.f36231g.length) {
            if (i5 == 256) {
                throw new E5.Q("Nesting too deep at " + i(), 11);
            }
            int[] iArr = this.f36359b;
            this.f36359b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f36360c;
            this.f36360c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f36361d;
            this.f36361d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f36231g;
            this.f36231g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f36231g;
        int i10 = this.f36358a;
        this.f36358a = i10 + 1;
        objArr2[i10] = obj;
    }

    public final void e0() {
        int i5 = this.f36358a;
        int i10 = i5 - 1;
        this.f36358a = i10;
        Object[] objArr = this.f36231g;
        objArr[i10] = null;
        this.f36359b[i10] = 0;
        if (i10 > 0) {
            int[] iArr = this.f36361d;
            int i11 = i5 - 2;
            iArr[i11] = iArr[i11] + 1;
            Object obj = objArr[i5 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    d0(it.next());
                }
            }
        }
    }

    public final Object f0(Class cls, v vVar) {
        int i5 = this.f36358a;
        Object obj = i5 != 0 ? this.f36231g[i5 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && vVar == v.f36356i) {
            return null;
        }
        if (obj == f36230h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw b0(obj, vVar);
    }

    @Override // hb.w
    public final void h() {
        v vVar = v.f36351d;
        z zVar = (z) f0(z.class, vVar);
        if (zVar.f36377a != vVar || zVar.hasNext()) {
            throw b0(zVar, vVar);
        }
        this.f36360c[this.f36358a - 1] = null;
        e0();
    }

    @Override // hb.w
    public final boolean o() {
        int i5 = this.f36358a;
        if (i5 == 0) {
            return false;
        }
        Object obj = this.f36231g[i5 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // hb.w
    public final boolean w() {
        Boolean bool = (Boolean) f0(Boolean.class, v.f36355h);
        e0();
        return bool.booleanValue();
    }

    @Override // hb.w
    public final double y() throws T, NumberFormatException {
        double dDoubleValue;
        v vVar = v.f36354g;
        Object objF0 = f0(Object.class, vVar);
        if (objF0 instanceof Number) {
            dDoubleValue = ((Number) objF0).doubleValue();
        } else {
            if (!(objF0 instanceof String)) {
                throw b0(objF0, vVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objF0);
            } catch (NumberFormatException unused) {
                throw b0(objF0, vVar);
            }
        }
        if (this.f36362e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            e0();
            return dDoubleValue;
        }
        throw new T("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + i());
    }

    @Override // hb.w
    public final int z() throws NumberFormatException {
        int iIntValueExact;
        v vVar = v.f36354g;
        Object objF0 = f0(Object.class, vVar);
        if (objF0 instanceof Number) {
            iIntValueExact = ((Number) objF0).intValue();
        } else {
            if (!(objF0 instanceof String)) {
                throw b0(objF0, vVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objF0);
                } catch (NumberFormatException unused) {
                    throw b0(objF0, vVar);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objF0).intValueExact();
            }
        }
        e0();
        return iIntValueExact;
    }
}
