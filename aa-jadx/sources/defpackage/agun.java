package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agun<T> implements defpackage.agul<T> {
    private final defpackage.aifb<defpackage.ahof, T> cache;
    private final java.util.Map<defpackage.ahof, T> states;
    private final defpackage.aiez storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public agun(java.util.Map<defpackage.ahof, ? extends T> map) {
        map.getClass();
        this.states = map;
        defpackage.aiez aiezVar = new defpackage.aiez("Java nullability annotation states");
        this.storageManager = aiezVar;
        defpackage.aifb<defpackage.ahof, T> aifbVarCreateMemoizedFunctionWithNullableValues = aiezVar.createMemoizedFunctionWithNullableValues(new defpackage.agum(this));
        aifbVarCreateMemoizedFunctionWithNullableValues.getClass();
        this.cache = aifbVarCreateMemoizedFunctionWithNullableValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object cache$lambda$0(defpackage.agun agunVar, defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return defpackage.ahoi.findValueForMostSpecificFqname(ahofVar, agunVar.states);
    }

    @Override // defpackage.agul
    public T get(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        return this.cache.invoke(ahofVar);
    }
}
