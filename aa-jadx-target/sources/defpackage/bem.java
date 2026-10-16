package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bem {
    public final java.lang.Object a;
    public java.lang.Object b;

    public bem() {
        this.a = new java.util.ArrayList();
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.b = fArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void a(java.lang.Object obj, float f) {
        ?? r0 = this.a;
        r0.add(obj);
        if (((float[]) this.b).length < r0.size()) {
            float[] fArrCopyOf = java.util.Arrays.copyOf((float[]) this.b, r0.size() + 2);
            fArrCopyOf.getClass();
            this.b = fArrCopyOf;
        }
        ((float[]) this.b)[r0.size() - 1] = f;
    }

    public bem(defpackage.dfb dfbVar) {
        this.a = dfbVar;
        this.b = dfbVar;
    }
}
