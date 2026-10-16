package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class euz {
    public static final /* synthetic */ int g = 0;
    private CharSequence a;
    public final String c;
    public final ewq d;
    public eva e;
    public final aau f;

    static {
        new LinkedHashMap();
    }

    public euz(evp evpVar) {
        Map map = evq.a;
        this.c = ebh.h(evpVar.getClass());
        this.d = new ewq(this);
        this.f = new aau(null);
    }

    private final List j() {
        return this.d.c;
    }

    public void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, evy.e);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(2);
        ewq ewqVar = this.d;
        if (string == null) {
            ewqVar.a(0);
        } else {
            if (afyh.v(string)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            List listC = ebg.c(ewqVar.d, new ewm(new euw(strConcat, null, null), 4));
            if (!listC.isEmpty()) {
                throw new IllegalArgumentException("Cannot set route \"" + string + "\" for destination " + ewqVar.a + ". Following required arguments are missing: " + listC);
            }
            ewqVar.g = new aezy(new epp(strConcat, 15));
            ewqVar.a(strConcat.hashCode());
        }
        ewqVar.f = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            ewqVar.a(typedArrayObtainAttributes.getResourceId(1, 0));
            ewqVar.b = ebf.K(new erb(context, (byte[]) null), c());
        }
        this.a = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public boolean b() {
        return true;
    }

    public final int c() {
        return this.d.e;
    }

    public final Bundle d(Bundle bundle) {
        ewq ewqVar = this.d;
        if (bundle == null && ewqVar.d.isEmpty()) {
            return null;
        }
        Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        Map map = ewqVar.d;
        for (Map.Entry entry : map.entrySet()) {
            ((euo) entry.getValue()).a((String) entry.getKey(), bundleZ);
        }
        if (bundle != null) {
            bundleZ.putAll(bundle);
            for (Map.Entry entry2 : map.entrySet()) {
                String str = (String) entry2.getKey();
                euo euoVar = (euo) entry2.getValue();
                str.getClass();
                if (euoVar.b || !fbb.f(bundleZ, str) || !fbb.g(bundleZ, str)) {
                    try {
                        euoVar.a.b(bundleZ, str);
                    } catch (IllegalStateException unused) {
                    }
                }
                throw new IllegalArgumentException("Wrong argument type for '" + str + "' in argument savedState. " + euoVar.a.e() + " expected.");
            }
        }
        return bundleZ;
    }

    public final eun e(int i) {
        aau aauVar = this.f;
        eun eunVar = aauVar.c() == 0 ? null : (eun) aav.a(aauVar, i);
        if (eunVar != null) {
            return eunVar;
        }
        eva evaVar = this.e;
        if (evaVar == null) {
            return null;
        }
        return evaVar.e(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2 A[EDGE_INSN: B:31:0x00b2->B:32:0x00b3 BREAK  A[LOOP:1: B:23:0x007f->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Ld2
            boolean r2 = r9 instanceof defpackage.euz
            if (r2 != 0) goto Ld
            goto Ld2
        Ld:
            java.util.List r2 = r8.j()
            euz r9 = (defpackage.euz) r9
            java.util.List r3 = r9.j()
            boolean r2 = defpackage.affa.f(r2, r3)
            aau r3 = r8.f
            aau r4 = r9.f
            int r5 = r3.c()
            int r4 = r4.c()
            if (r5 != r4) goto L5c
            r3.getClass()
            aaw r4 = new aaw
            r4.<init>(r3)
            airp r4 = defpackage.afrg.b(r4)
            java.util.Iterator r4 = r4.a()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = defpackage.aav.a(r3, r5)
            aau r7 = r9.f
            java.lang.Object r5 = defpackage.aav.a(r7, r5)
            boolean r5 = defpackage.affa.f(r6, r5)
            if (r5 != 0) goto L39
            goto L5c
        L5a:
            r3 = r0
            goto L5d
        L5c:
            r3 = r1
        L5d:
            java.util.Map r4 = r8.i()
            int r4 = r4.size()
            java.util.Map r5 = r9.i()
            int r5 = r5.size()
            if (r4 != r5) goto Lb2
            java.util.Map r4 = r8.i()
            java.util.Set r4 = r4.entrySet()
            airp r4 = defpackage.woy.cm(r4)
            java.util.Iterator r4 = r4.a()
        L7f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb0
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.i()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto Lb2
            java.util.Map r6 = r9.i()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = defpackage.affa.f(r6, r5)
            if (r5 == 0) goto Lb2
            goto L7f
        Lb0:
            r4 = r0
            goto Lb3
        Lb2:
            r4 = r1
        Lb3:
            int r5 = r8.c()
            int r6 = r9.c()
            if (r5 != r6) goto Ld2
            java.lang.String r8 = r8.h()
            java.lang.String r9 = r9.h()
            boolean r8 = defpackage.affa.f(r8, r9)
            if (r8 == 0) goto Ld2
            if (r2 == 0) goto Ld2
            if (r3 == 0) goto Ld2
            if (r4 == 0) goto Ld2
            return r0
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euz.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.euy f(defpackage.eux r25) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euz.f(eux):euy");
    }

    public final String g() {
        return this.d.b;
    }

    public final String h() {
        return this.d.f;
    }

    public int hashCode() {
        int iC = c() * 31;
        String strH = h();
        int iHashCode = iC + (strH != null ? strH.hashCode() : 0);
        for (euw euwVar : j()) {
            int i = iHashCode * 31;
            String str = euwVar.c;
            int iHashCode2 = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = euwVar.d;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = euwVar.e;
            iHashCode = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
        Iterator itAc = ca.ac(this.f);
        while (itAc.hasNext()) {
            eun eunVar = (eun) itAc.next();
            int i2 = ((iHashCode * 31) + eunVar.a) * 31;
            eve eveVar = eunVar.b;
            iHashCode = i2 + (eveVar != null ? eveVar.hashCode() : 0);
            Bundle bundle = eunVar.c;
            if (bundle != null) {
                iHashCode = (iHashCode * 31) + dan.m(bundle);
            }
        }
        for (String str4 : i().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str4.hashCode()) * 31;
            Object obj = i().get(str4);
            iHashCode = iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Map i() {
        return woy.bd(this.d.d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (g() == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(c()));
        } else {
            sb.append(g());
        }
        sb.append(")");
        String strH = h();
        if (strH != null && !afyh.v(strH)) {
            sb.append(" route=");
            sb.append(h());
        }
        if (this.a != null) {
            sb.append(" label=");
            sb.append(this.a);
        }
        return sb.toString();
    }
}
