package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class abol {
    public static final defpackage.abol a = new defpackage.abol(null);
    public static volatile int b = 1;
    private static volatile boolean c = false;
    private static volatile defpackage.abol d;
    private final java.util.Map e;

    public abol() {
        this.e = new java.util.HashMap();
    }

    public static defpackage.abol a() {
        defpackage.abol abolVar = d;
        if (abolVar != null) {
            return abolVar;
        }
        synchronized (defpackage.abol.class) {
            defpackage.abol abolVar2 = d;
            if (abolVar2 != null) {
                return abolVar2;
            }
            defpackage.abol abolVarB = defpackage.aboq.b(defpackage.abol.class);
            d = abolVarB;
            return abolVarB;
        }
    }

    public defpackage.aboj b(defpackage.abpy abpyVar, int i) {
        return (defpackage.aboj) this.e.get(new defpackage.abok(abpyVar, i));
    }

    public final void c(defpackage.aboj abojVar) {
        this.e.put(new defpackage.abok(abojVar.a, abojVar.a()), abojVar);
    }

    public abol(byte[] bArr) {
        this.e = java.util.Collections.EMPTY_MAP;
    }
}
