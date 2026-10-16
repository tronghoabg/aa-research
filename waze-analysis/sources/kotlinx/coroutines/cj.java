package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class cj extends ab {
    protected final String a() {
        cj cjVarC;
        int i2 = av.f51370a;
        cj cjVar = kotlinx.coroutines.e.ac.f51860a;
        if (this == cjVar) {
            return "Dispatchers.Main";
        }
        try {
            cjVarC = cjVar.c();
        } catch (UnsupportedOperationException unused) {
            cjVarC = null;
        }
        if (this == cjVarC) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract cj c();

    @Override // kotlinx.coroutines.ab
    public ab limitedParallelism(int i2, String str) {
        h.g.b.au.m(i2);
        return h.g.b.au.l(this, str);
    }

    @Override // kotlinx.coroutines.ab
    public String toString() {
        String strA = a();
        if (strA != null) {
            return strA;
        }
        return aj.a(this) + "@" + aj.b(this);
    }
}
