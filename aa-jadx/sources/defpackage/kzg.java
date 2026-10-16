package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kzg implements defpackage.kxe {
    public final /* synthetic */ defpackage.kzh a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ defpackage.eqs c;
    private final /* synthetic */ int d;

    public /* synthetic */ kzg(defpackage.kzh kzhVar, defpackage.eqs eqsVar, int i) {
        this.d = i;
        this.a = kzhVar;
        this.b = "AssistantCoolwalkSuggestionsEnabled";
        this.c = eqsVar;
    }

    @Override // defpackage.kxe
    public final void a(java.lang.Object obj) {
        if (this.d != 0) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            if (bool != null) {
                defpackage.eqs eqsVar = this.c;
                this.a.a.edit().putBoolean(this.b, bool.booleanValue()).apply();
                defpackage.kzh.h(eqsVar, bool);
                return;
            }
            return;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        if (bool2 != null) {
            defpackage.eqs eqsVar2 = this.c;
            this.a.a.edit().putBoolean(this.b, bool2.booleanValue()).apply();
            defpackage.kzh.h(eqsVar2, bool2);
        }
    }

    public /* synthetic */ kzg(defpackage.kzh kzhVar, java.lang.String str, defpackage.eqs eqsVar, int i) {
        this.d = i;
        this.a = kzhVar;
        this.b = str;
        this.c = eqsVar;
    }
}
