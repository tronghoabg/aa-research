package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class kzb implements kwx {
    public final /* synthetic */ kzc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ eqm c;
    private final /* synthetic */ int d;

    public /* synthetic */ kzb(kzc kzcVar, eqm eqmVar, int i) {
        this.d = i;
        this.a = kzcVar;
        this.b = "AssistantCoolwalkSuggestionsEnabled";
        this.c = eqmVar;
    }

    @Override // defpackage.kwx
    public final void a(Object obj) {
        if (this.d != 0) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                eqm eqmVar = this.c;
                this.a.a.edit().putBoolean(this.b, bool.booleanValue()).apply();
                kzc.h(eqmVar, bool);
                return;
            }
            return;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            eqm eqmVar2 = this.c;
            this.a.a.edit().putBoolean(this.b, bool2.booleanValue()).apply();
            kzc.h(eqmVar2, bool2);
        }
    }

    public /* synthetic */ kzb(kzc kzcVar, String str, eqm eqmVar, int i) {
        this.d = i;
        this.a = kzcVar;
        this.b = str;
        this.c = eqmVar;
    }
}
