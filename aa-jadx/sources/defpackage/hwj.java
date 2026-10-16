package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hwj {
    public final defpackage.idf a;
    public final defpackage.dzr b;
    private final java.lang.Class c;
    private final java.util.List d;
    private final java.lang.String e;

    public hwj(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3, java.util.List list, defpackage.idf idfVar, defpackage.dzr dzrVar) {
        this.c = cls;
        this.d = list;
        this.a = idfVar;
        this.b = dzrVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final defpackage.hxg a(defpackage.hvh hvhVar, int i, int i2, defpackage.huw huwVar, java.util.List list) throws defpackage.hxc {
        java.util.List list2 = this.d;
        int size = list2.size();
        defpackage.hxg hxgVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.huy huyVar = (defpackage.huy) list2.get(i3);
            try {
                if (huyVar.b(hvhVar.a(), huwVar)) {
                    hxgVarA = huyVar.a(hvhVar.a(), i, i2, huwVar);
                }
            } catch (java.io.IOException | java.lang.OutOfMemoryError | java.lang.RuntimeException e) {
                if (android.util.Log.isLoggable("DecodePath", 2)) {
                    android.util.Log.v("DecodePath", "Failed to decode data for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(huyVar))), e);
                }
                list.add(e);
            }
            if (hxgVarA != null) {
                break;
            }
        }
        if (hxgVarA != null) {
            return hxgVarA;
        }
        throw new defpackage.hxc(this.e, new java.util.ArrayList(list));
    }

    public final java.lang.String toString() {
        defpackage.idf idfVar = this.a;
        java.util.List list = this.d;
        return "DecodePath{ dataClass=" + java.lang.String.valueOf(this.c) + ", decoders=" + java.lang.String.valueOf(list) + ", transcoder=" + idfVar.toString() + "}";
    }
}
