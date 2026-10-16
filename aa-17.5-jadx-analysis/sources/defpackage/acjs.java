package defpackage;

import android.graphics.Typeface;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
public final class acjs {
    public final int a;
    public final Object b;

    public acjs(int i) {
        this.a = i;
        this.b = new zor(this, ((i * 4) / 3) + 1);
    }

    public static acjs e(int i, adnq adnqVar) {
        if (i != 4) {
            i = 5;
        }
        adnqVar.getClass();
        return new acjs(i, adnqVar);
    }

    public static acjs i(int i, Exception exc) {
        new pml(i, exc);
        return new acjs((Object) null, i);
    }

    public final int a() {
        int i = 0;
        int i2 = 0;
        while (true) {
            acjr[] acjrVarArr = (acjr[]) this.b;
            if (i >= acjrVarArr.length) {
                return i2;
            }
            i2 += acjrVarArr[i].a;
            i++;
        }
    }

    public final int b() {
        return this.a * a();
    }

    public final synchronized Object c(Object obj) {
        return ((LinkedHashMap) this.b).get(obj);
    }

    public final synchronized void d(Object obj, Object obj2) {
        ((LinkedHashMap) this.b).put(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final byte f(uhx uhxVar) {
        ?? r1 = this.b;
        if (r1.containsKey(uhxVar)) {
            return ((Byte) r1.get(uhxVar)).byteValue();
        }
        return (byte) 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Set g() {
        return this.b.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final int h(uhx uhxVar) {
        ?? r0 = this.b;
        if (r0.containsKey(uhxVar)) {
            return 2;
        }
        if (r0.size() >= this.a) {
            return 3;
        }
        r0.put(uhxVar, Byte.valueOf((byte) r0.size()));
        return 1;
    }

    public acjs(int i, byte[] bArr, byte[] bArr2) {
        this.b = null;
        this.a = i;
    }

    public acjs(Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public acjs(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public acjs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public acjs(ConnectionResult connectionResult, int i) {
        spu.aw(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    public acjs(int i, byte[] bArr) {
        this.b = new HashMap();
        this.a = i;
    }
}
