package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aais extends java.util.LinkedHashMap {
    private final int a;
    private final defpackage.aair b;

    public aais(defpackage.aair aairVar) {
        super(16, 0.75f, true);
        this.a = 16;
        this.b = aairVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        if (size() <= this.a) {
            return false;
        }
        defpackage.aair aairVar = this.b;
        entry.getKey();
        java.lang.Integer num = (java.lang.Integer) entry.getValue();
        if (num.intValue() == 0) {
            return true;
        }
        ((defpackage.aagt) aairVar).c.add(num);
        return true;
    }
}
