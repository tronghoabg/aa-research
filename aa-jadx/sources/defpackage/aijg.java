package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aijg extends defpackage.aijt {
    public static final defpackage.aijf Companion = new defpackage.aijf(null);

    public static final defpackage.aijt create(defpackage.aijd aijdVar, java.util.List<? extends defpackage.aijn> list) {
        return Companion.create(aijdVar, list);
    }

    public static final defpackage.aijg createByConstructorsMap(java.util.Map<defpackage.aijd, ? extends defpackage.aijn> map) {
        return Companion.createByConstructorsMap(map);
    }

    @Override // defpackage.aijt
    public defpackage.aijn get(defpackage.aihl aihlVar) {
        aihlVar.getClass();
        return get(aihlVar.getConstructor());
    }

    public abstract defpackage.aijn get(defpackage.aijd aijdVar);
}
