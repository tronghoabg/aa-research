package defpackage;

/* loaded from: classes2.dex */
public abstract class aivr extends aitu {
    protected final String e() {
        aivr aivrVarI;
        aitu aituVar = aium.a;
        aivr aivrVar = ajct.a;
        if (this == aivrVar) {
            return "Dispatchers.Main";
        }
        try {
            aivrVarI = aivrVar.i();
        } catch (UnsupportedOperationException unused) {
            aivrVarI = null;
        }
        if (this == aivrVarI) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract aivr i();

    @Override // defpackage.aitu
    public String toString() {
        String strE = e();
        if (strE != null) {
            return strE;
        }
        return aiua.a(this) + "@" + aiua.b(this);
    }
}
