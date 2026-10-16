package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eke implements defpackage.ekk {
    public static final defpackage.eke a = new defpackage.eke(1);
    private final /* synthetic */ int b;

    public eke(int i) {
        this.b = i;
    }

    @Override // defpackage.ekk
    public final defpackage.ekj a(java.lang.Class cls) {
        if (this.b == 0) {
            throw new java.lang.IllegalStateException("This should never be called.");
        }
        if (!defpackage.ejq.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            java.lang.Class<?> clsAsSubclass = cls.asSubclass(defpackage.ejq.class);
            defpackage.ejq ejqVarF = defpackage.ejq.defaultInstanceMap.get(clsAsSubclass);
            if (ejqVarF == null) {
                try {
                    java.lang.Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    ejqVarF = defpackage.ejq.defaultInstanceMap.get(clsAsSubclass);
                } catch (java.lang.ClassNotFoundException e) {
                    throw new java.lang.IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (ejqVarF == null) {
                ejqVarF = ((defpackage.ejq) defpackage.eln.e(clsAsSubclass)).f();
                if (ejqVarF == null) {
                    throw new java.lang.IllegalStateException();
                }
                defpackage.ejq.defaultInstanceMap.put(clsAsSubclass, ejqVarF);
            }
            return (defpackage.ekj) ejqVarF.a(3);
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e2);
        }
    }

    @Override // defpackage.ekk
    public final boolean b(java.lang.Class cls) {
        if (this.b != 0) {
            return defpackage.ejq.class.isAssignableFrom(cls);
        }
        return false;
    }
}
