package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acku {
    public final int a;
    public final java.lang.Object b;

    public acku(int i) {
        this.a = i;
        this.b = new defpackage.zpu(this, ((i * 4) / 3) + 1);
    }

    public static defpackage.acku e(int i, defpackage.ador adorVar) {
        if (i != 4) {
            i = 5;
        }
        adorVar.getClass();
        return new defpackage.acku(i, adorVar);
    }

    public static defpackage.acku i(int i, java.lang.Exception exc) {
        new defpackage.pnh(i, exc);
        return new defpackage.acku((java.lang.Object) null, i);
    }

    public final int a() {
        int i = 0;
        int i2 = 0;
        while (true) {
            defpackage.ackt[] acktVarArr = (defpackage.ackt[]) this.b;
            if (i >= acktVarArr.length) {
                return i2;
            }
            i2 += acktVarArr[i].a;
            i++;
        }
    }

    public final int b() {
        return this.a * a();
    }

    public final synchronized java.lang.Object c(java.lang.Object obj) {
        return ((java.util.LinkedHashMap) this.b).get(obj);
    }

    public final synchronized void d(java.lang.Object obj, java.lang.Object obj2) {
        ((java.util.LinkedHashMap) this.b).put(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final byte f(defpackage.uit uitVar) {
        ?? r1 = this.b;
        if (r1.containsKey(uitVar)) {
            return ((java.lang.Byte) r1.get(uitVar)).byteValue();
        }
        return (byte) 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final java.util.Set g() {
        return this.b.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final int h(defpackage.uit uitVar) {
        ?? r0 = this.b;
        if (r0.containsKey(uitVar)) {
            return 2;
        }
        if (r0.size() >= this.a) {
            return 3;
        }
        r0.put(uitVar, java.lang.Byte.valueOf((byte) r0.size()));
        return 1;
    }

    public acku(int i, byte[] bArr, byte[] bArr2) {
        this.b = null;
        this.a = i;
    }

    public acku(android.graphics.Typeface typeface) {
        this.b = typeface;
        this.a = 0;
    }

    public acku(java.lang.Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    public acku(int i, java.lang.Object obj) {
        this.a = i;
        this.b = obj;
    }

    public acku(com.google.android.gms.common.ConnectionResult connectionResult, int i) {
        defpackage.sqs.aA(connectionResult);
        this.b = connectionResult;
        this.a = i;
    }

    public acku(int i, byte[] bArr) {
        this.b = new java.util.HashMap();
        this.a = i;
    }
}
