package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aijt {
    public static final defpackage.aijr Companion = new defpackage.aijr(null);
    public static final defpackage.aijt EMPTY = new defpackage.aijq();

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    public final defpackage.aijy buildSubstitutor() {
        return defpackage.aijy.create(this);
    }

    public defpackage.aggk filterAnnotations(defpackage.aggk aggkVar) {
        aggkVar.getClass();
        return aggkVar;
    }

    public abstract defpackage.aijn get(defpackage.aihl aihlVar);

    public boolean isEmpty() {
        return false;
    }

    public defpackage.aihl prepareTopLevelType(defpackage.aihl aihlVar, defpackage.aikg aikgVar) {
        aihlVar.getClass();
        aikgVar.getClass();
        return aihlVar;
    }

    public final defpackage.aijt replaceWithNonApproximating() {
        return new defpackage.aijs(this);
    }
}
