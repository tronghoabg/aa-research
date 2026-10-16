package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gzf implements defpackage.hew {
    private final java.util.Map a = new java.util.LinkedHashMap();

    public final defpackage.gwm a(java.lang.Class cls) {
        cls.getClass();
        defpackage.gwm gwmVarB = b(cls);
        if (gwmVarB != null) {
            return gwmVarB;
        }
        throw new java.lang.IllegalStateException("No InternalModel to UiModel converter found for " + cls + ". Registered converters: " + this.a.keySet());
    }

    public final defpackage.gwm b(java.lang.Class cls) {
        cls.getClass();
        defpackage.afer aferVar = (defpackage.afer) this.a.get(cls);
        if (aferVar == null) {
            return null;
        }
        java.lang.Object objInvoke = aferVar.invoke();
        objInvoke.getClass();
        return (defpackage.gwm) objInvoke;
    }

    public final void c(java.lang.Class cls, defpackage.afer aferVar) {
        this.a.put(cls, aferVar);
    }
}
