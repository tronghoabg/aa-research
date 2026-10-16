package defpackage;

/* loaded from: classes2.dex */
final class ejw implements ekc {
    public static final ejw a = new ejw(1);
    private final /* synthetic */ int b;

    public ejw(int i) {
        this.b = i;
    }

    @Override // defpackage.ekc
    public final ekb a(Class cls) throws ClassNotFoundException {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!eji.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            Class<?> clsAsSubclass = cls.asSubclass(eji.class);
            eji ejiVarF = eji.defaultInstanceMap.get(clsAsSubclass);
            if (ejiVarF == null) {
                try {
                    Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    ejiVarF = eji.defaultInstanceMap.get(clsAsSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (ejiVarF == null) {
                ejiVarF = ((eji) elf.e(clsAsSubclass)).f();
                if (ejiVarF == null) {
                    throw new IllegalStateException();
                }
                eji.defaultInstanceMap.put(clsAsSubclass, ejiVarF);
            }
            return (ekb) ejiVarF.a(3);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    @Override // defpackage.ekc
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return eji.class.isAssignableFrom(cls);
        }
        return false;
    }
}
