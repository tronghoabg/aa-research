package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kzh extends defpackage.lhm implements defpackage.kxf {
    public static final /* synthetic */ int i = 0;
    private static final defpackage.yqm k = defpackage.yqm.c("GH.AssisSettingMgr");
    public android.content.SharedPreferences a;
    public boolean b;
    public boolean c;
    public final defpackage.szw d;
    public final defpackage.eqs e = new defpackage.eqs();
    public final defpackage.eqs f = new defpackage.eqs();
    public final defpackage.eqs g = new defpackage.eqs();
    public final defpackage.eqs h = new defpackage.eqs();
    private final android.content.Context l;

    public kzh(android.content.Context context, defpackage.szw szwVar) {
        this.l = context;
        this.d = szwVar;
    }

    public static void e(kxe kxeVar, java.lang.Object obj) {
        defpackage.kza kzaVar = new defpackage.kza(kxeVar, obj, 4);
        if (defpackage.wfp.g()) {
            kzaVar.run();
        } else {
            defpackage.wfp.e(kzaVar);
        }
    }

    public static void h(defpackage.eqs eqsVar, java.lang.Object obj) {
        if (defpackage.wfp.g()) {
            eqsVar.m(obj);
        } else {
            eqsVar.j(obj);
        }
    }

    @Override // defpackage.kxf
    public final boolean a() {
        return java.lang.Boolean.TRUE.equals(java.lang.Boolean.valueOf(this.c));
    }

    public final java.lang.Object b(com.google.android.gearhead.sdk.assistant.CarAssistantSetting carAssistantSetting, java.lang.Class cls) {
        java.lang.Object objValueOf;
        defpackage.ypu ypuVarE = k.e();
        if (carAssistantSetting == null) {
            ((defpackage.yqj) ((defpackage.yqj) ypuVarE).ai((char) 3646)).u("loadSetting#callback setting is null");
            return null;
        }
        ((defpackage.yqj) ((defpackage.yqj) ypuVarE).ai((char) 3645)).y("loadSetting#callback setting=%s", carAssistantSetting);
        java.lang.String name = cls.getName();
        if (name.equals(java.lang.Boolean.class.getName())) {
            objValueOf = java.lang.Boolean.valueOf(carAssistantSetting.b);
        } else if (name.equals(java.lang.Integer.class.getName())) {
            objValueOf = java.lang.Integer.valueOf(carAssistantSetting.c);
        } else {
            if (!name.equals(java.lang.String.class.getName())) {
                throw new java.lang.IllegalStateException("Unsupported setting type: ".concat(java.lang.String.valueOf(name)));
            }
            objValueOf = carAssistantSetting.d;
        }
        return cls.cast(objValueOf);
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        android.content.SharedPreferences sharedPreferences = this.l.getSharedPreferences("AssistantPreferences", 0);
        this.a = sharedPreferences;
        this.e.m(sharedPreferences.getString("AssistantPrimaryLanguage", null));
        this.f.m(java.lang.Boolean.valueOf(this.a.getBoolean("AssistantRailInvokedMediaRecEnabled", false)));
        this.g.m(java.lang.Boolean.valueOf(this.a.getBoolean("AssistantCoolwalkSuggestionsEnabled", false)));
        defpackage.kqk kqkVar = new defpackage.kqk(this, 9);
        defpackage.eqs eqsVar = this.h;
        eqsVar.eM(this, kqkVar);
        eqsVar.m(java.lang.Boolean.valueOf(this.a.getBoolean("AssistantTranscriptionEnabled", false)));
    }

    public final void f(int i2, kxe kxeVar, java.lang.Class cls) {
        this.d.c(i2, new defpackage.ipk(this, kxeVar, cls, 7));
    }

    public final void g(int i2, java.lang.String str, defpackage.eqs eqsVar) {
        f(2, new kzd(this, i2, str, eqsVar), java.lang.Boolean.class);
    }
}
