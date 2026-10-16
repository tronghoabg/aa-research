package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class aiyr {
    private static final afec a = new airt(3);
    private static final afeg b = new ooh(14);

    public static final aiyk a(aiyk aiykVar) {
        return aiykVar instanceof aizz ? aiykVar : c(aiykVar, a, b);
    }

    public static final aiyk b(aiyk aiykVar, afec afecVar) {
        return c(aiykVar, afecVar, b);
    }

    private static final aiyk c(aiyk aiykVar, afec afecVar, afeg afegVar) {
        if (aiykVar instanceof aiyi) {
            aiyi aiyiVar = (aiyi) aiykVar;
            if (aiyiVar.a == afecVar && aiyiVar.b == afegVar) {
                return aiykVar;
            }
        }
        return new aiyi(aiykVar, afecVar, afegVar);
    }
}
