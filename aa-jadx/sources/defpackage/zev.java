package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class zev {
    public final defpackage.yhe c;

    public zev() {
        this.c = defpackage.ync.a;
    }

    public java.lang.reflect.Type a(java.lang.reflect.TypeVariable typeVariable, defpackage.zev zevVar) {
        java.lang.reflect.Type type = (java.lang.reflect.Type) this.c.get(new defpackage.zew(typeVariable));
        if (type != null) {
            return new defpackage.odn(zevVar).l(type);
        }
        java.lang.reflect.Type[] bounds = typeVariable.getBounds();
        if (bounds.length != 0) {
            java.lang.reflect.Type[] typeArrM = new defpackage.odn(zevVar).m(bounds);
            if (!defpackage.zfl.a || !java.util.Arrays.equals(bounds, typeArrM)) {
                return defpackage.zfq.d(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrM);
            }
        }
        return typeVariable;
    }

    public zev(defpackage.yhe yheVar) {
        this.c = yheVar;
    }
}
