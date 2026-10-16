package Va;

import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;

/* renamed from: Va.s8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1139s8 {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f14571e = {236};

    /* renamed from: f, reason: collision with root package name */
    public static int f14572f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f14573g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14574a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14575b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14576c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14577d;

    public C1139s8(Object obj) {
        this.f14574a = obj;
    }

    public static String f(int i5) throws UnsupportedEncodingException {
        String str;
        byte[] bytes = "\u0081".getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14571e;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r5 - 1) - i10] + i5] - 202);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if ((r3 instanceof java.lang.Long) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        return (java.lang.Long) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if ((r3 instanceof java.lang.Double) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        return (java.lang.Double) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if ((r3 instanceof java.lang.Integer) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r3 instanceof java.lang.Integer) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r3 = (java.lang.Integer) r3;
        r0 = r0 + 11;
        Va.C1139s8.f14573g = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number a() {
        /*
            r5 = this;
            int r0 = Va.C1139s8.f14572f
            int r1 = r0 + 51
            int r2 = r1 % 128
            Va.C1139s8.f14573g = r2
            int r1 = r1 % 2
            r2 = 0
            java.lang.Object r3 = r5.f14574a
            if (r1 != 0) goto L18
            boolean r1 = r3 instanceof java.lang.Integer
            r4 = 26
            int r4 = r4 / 0
            if (r1 != 0) goto L1c
            goto L2a
        L18:
            boolean r1 = r3 instanceof java.lang.Integer
            if (r1 == 0) goto L2a
        L1c:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r0 = r0 + 11
            int r1 = r0 % 128
            Va.C1139s8.f14573g = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L29
            return r3
        L29:
            throw r2
        L2a:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L31
            java.lang.Long r3 = (java.lang.Long) r3
            return r3
        L31:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L38
            java.lang.Double r3 = (java.lang.Double) r3
            return r3
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1139s8.a():java.lang.Number");
    }

    public final boolean b() {
        int i5 = f14572f + 63;
        f14573g = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f14575b;
        }
        throw null;
    }

    public final Object c() {
        f14573g = (f14572f + 11) % 128;
        return this.f14574a;
    }

    public final void d(boolean z2) {
        int i5 = f14572f + 115;
        int i10 = i5 % 128;
        f14573g = i10;
        int i11 = i5 % 2;
        if (i11 == 0) {
            this.f14575b = z2;
            int i12 = 28 / 0;
        } else {
            this.f14575b = z2;
        }
        f14573g = i10;
        if (i11 == 0) {
            int i13 = 99 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r3 instanceof java.lang.Boolean) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return ((java.lang.Boolean) r3).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if ((r3 instanceof java.lang.Integer) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (((java.lang.Integer) r3).intValue() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if ((r3 instanceof java.lang.Long) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        Va.C1139s8.f14572f = (r0 + 125) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (((java.lang.Long) r3).longValue() == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if ((r3 instanceof java.lang.Double) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (((java.lang.Double) r3).doubleValue() == 0.0d) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        Va.C1139s8.f14573g = (Va.C1139s8.f14572f + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if ((r3 instanceof java.lang.String) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if (android.text.TextUtils.isEmpty((java.lang.String) r3) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
    
        r0 = (Va.C1139s8.f14572f + 105) % 128;
        Va.C1139s8.f14573g = r0;
        Va.C1139s8.f14572f = (r0 + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r3 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r2 = r2 + 13;
        Va.C1139s8.f14573g = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r6 = this;
            int r0 = Va.C1139s8.f14573g
            int r1 = r0 + 49
            int r2 = r1 % 128
            Va.C1139s8.f14572f = r2
            int r1 = r1 % 2
            java.lang.Object r3 = r6.f14574a
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            r1 = 1
            int r1 = r1 / r4
            if (r3 != 0) goto L23
            goto L17
        L15:
            if (r3 != 0) goto L23
        L17:
            int r2 = r2 + 13
            int r0 = r2 % 128
            Va.C1139s8.f14573g = r0
            int r2 = r2 % 2
            if (r2 != 0) goto L22
            return r5
        L22:
            return r4
        L23:
            boolean r1 = r3 instanceof java.lang.Boolean
            if (r1 == 0) goto L2e
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            return r0
        L2e:
            boolean r1 = r3 instanceof java.lang.Integer
            if (r1 == 0) goto L3c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r0 = r3.intValue()
            if (r0 == 0) goto L3b
            return r5
        L3b:
            return r4
        L3c:
            boolean r1 = r3 instanceof java.lang.Long
            if (r1 == 0) goto L54
            int r0 = r0 + 125
            int r0 = r0 % 128
            Va.C1139s8.f14572f = r0
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L53
            return r5
        L53:
            return r4
        L54:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L6e
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L6d
            int r0 = Va.C1139s8.f14572f
            int r0 = r0 + 21
            int r0 = r0 % 128
            Va.C1139s8.f14573g = r0
            return r5
        L6d:
            return r4
        L6e:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L8a
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L89
            int r0 = Va.C1139s8.f14572f
            int r0 = r0 + 105
            int r0 = r0 % 128
            Va.C1139s8.f14573g = r0
            int r0 = r0 + 109
            int r0 = r0 % 128
            Va.C1139s8.f14572f = r0
            return r5
        L89:
            return r4
        L8a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1139s8.e():boolean");
    }

    public final boolean g() {
        int i5 = f14573g;
        boolean z2 = this.f14576c;
        int i10 = i5 + 15;
        f14572f = i10 % 128;
        if (i10 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final String toString() {
        int i5 = f14573g + 1;
        f14572f = i5 % 128;
        int i10 = i5 % 2;
        Object obj = this.f14574a;
        if (i10 != 0) {
            boolean z2 = obj instanceof String;
            throw null;
        }
        if (!(obj instanceof String)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f((ViewConfiguration.getScrollBarSize() >> 8) + 127).intern());
        sb3.append(obj);
        sb3.append(f(ExpandableListView.getPackedPositionChild(0L) + 128).intern());
        String string = sb3.toString();
        f14573g = (f14572f + 109) % 128;
        return string;
    }
}
