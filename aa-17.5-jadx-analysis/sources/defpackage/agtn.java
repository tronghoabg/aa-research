package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agtn<T> implements agtl<T> {
    private final aieb<ahnf, T> cache;
    private final Map<ahnf, T> states;
    private final aidz storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public agtn(Map<ahnf, ? extends T> map) {
        map.getClass();
        this.states = map;
        aidz aidzVar = new aidz("Java nullability annotation states");
        this.storageManager = aidzVar;
        aieb<ahnf, T> aiebVarCreateMemoizedFunctionWithNullableValues = aidzVar.createMemoizedFunctionWithNullableValues(new agtm(this));
        aiebVarCreateMemoizedFunctionWithNullableValues.getClass();
        this.cache = aiebVarCreateMemoizedFunctionWithNullableValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object cache$lambda$0(agtn agtnVar, ahnf ahnfVar) {
        ahnfVar.getClass();
        return ahni.findValueForMostSpecificFqname(ahnfVar, agtnVar.states);
    }

    @Override // defpackage.agtl
    public T get(ahnf ahnfVar) {
        ahnfVar.getClass();
        return this.cache.invoke(ahnfVar);
    }
}
