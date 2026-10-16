package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ygn implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final java.lang.Object a;

    public ygn(java.lang.Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.ygn a(defpackage.abax abaxVar) {
        int i = defpackage.ygw.d;
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        if (abaxVar != null) {
            int size = abaxVar.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.uav uavVarA = defpackage.uav.a((defpackage.abaw) abaxVar.b.get(i2));
                if (uavVarA != null) {
                    ygrVar.i(uavVarA);
                }
            }
        }
        return new defpackage.ygn(ygrVar.g());
    }

    java.lang.Object readResolve() {
        return new defpackage.ygo((java.util.EnumMap) this.a);
    }
}
