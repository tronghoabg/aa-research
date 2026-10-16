package defpackage;

/* loaded from: classes3.dex */
public abstract class aiit {
    public static final aiir Companion = new aiir(null);
    public static final aiit EMPTY = new aiiq();

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    public final aiiy buildSubstitutor() {
        return aiiy.create(this);
    }

    public agfk filterAnnotations(agfk agfkVar) {
        agfkVar.getClass();
        return agfkVar;
    }

    public abstract aiin get(aigl aiglVar);

    public boolean isEmpty() {
        return false;
    }

    public aigl prepareTopLevelType(aigl aiglVar, aijg aijgVar) {
        aiglVar.getClass();
        aijgVar.getClass();
        return aiglVar;
    }

    public final aiit replaceWithNonApproximating() {
        return new aiis(this);
    }
}
