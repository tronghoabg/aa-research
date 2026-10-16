package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gearhead.sdk.assistant.CarAssistantSetting;

/* loaded from: classes.dex */
public final class kzc extends lhf implements kwy {
    public static final /* synthetic */ int i = 0;
    private static final yph k = yph.c("GH.AssisSettingMgr");
    public SharedPreferences a;
    public boolean b;
    public boolean c;
    public final syy d;
    public final eqm e = new eqm();
    public final eqm f = new eqm();
    public final eqm g = new eqm();
    public final eqm h = new eqm();
    private final Context l;

    public kzc(Context context, syy syyVar) {
        this.l = context;
        this.d = syyVar;
    }

    public static void e(kwx kwxVar, Object obj) {
        kyv kyvVar = new kyv(kwxVar, obj, 2);
        if (wer.g()) {
            kyvVar.run();
        } else {
            wer.e(kyvVar);
        }
    }

    public static void h(eqm eqmVar, Object obj) {
        if (wer.g()) {
            eqmVar.m(obj);
        } else {
            eqmVar.j(obj);
        }
    }

    @Override // defpackage.kwy
    public final boolean a() {
        return Boolean.TRUE.equals(Boolean.valueOf(this.c));
    }

    public final Object b(CarAssistantSetting carAssistantSetting, Class cls) {
        Object objValueOf;
        yop yopVarE = k.e();
        if (carAssistantSetting == null) {
            ((ype) ((ype) yopVarE).ai((char) 3643)).u("loadSetting#callback setting is null");
            return null;
        }
        ((ype) ((ype) yopVarE).ai((char) 3642)).y("loadSetting#callback setting=%s", carAssistantSetting);
        String name = cls.getName();
        if (name.equals(Boolean.class.getName())) {
            objValueOf = Boolean.valueOf(carAssistantSetting.b);
        } else if (name.equals(Integer.class.getName())) {
            objValueOf = Integer.valueOf(carAssistantSetting.c);
        } else {
            if (!name.equals(String.class.getName())) {
                throw new IllegalStateException("Unsupported setting type: ".concat(String.valueOf(name)));
            }
            objValueOf = carAssistantSetting.d;
        }
        return cls.cast(objValueOf);
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        SharedPreferences sharedPreferences = this.l.getSharedPreferences("AssistantPreferences", 0);
        this.a = sharedPreferences;
        this.e.m(sharedPreferences.getString("AssistantPrimaryLanguage", null));
        this.f.m(Boolean.valueOf(this.a.getBoolean("AssistantRailInvokedMediaRecEnabled", false)));
        this.g.m(Boolean.valueOf(this.a.getBoolean("AssistantCoolwalkSuggestionsEnabled", false)));
        kqc kqcVar = new kqc(this, 9);
        eqm eqmVar = this.h;
        eqmVar.fE(this, kqcVar);
        eqmVar.m(Boolean.valueOf(this.a.getBoolean("AssistantTranscriptionEnabled", false)));
    }

    public final void f(int i2, kwx kwxVar, Class cls) {
        this.d.c(i2, new hgf(this, kwxVar, cls, 8));
    }

    public final void g(final int i2, final String str, final eqm eqmVar) {
        f(2, new kwx() { // from class: kyy
            @Override // defpackage.kwx
            public final void a(Object obj) {
                boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
                kzc kzcVar = this.a;
                String str2 = str;
                eqm eqmVar2 = eqmVar;
                int i3 = 0;
                if (zEquals) {
                    kzcVar.f(i2, new kzb(kzcVar, str2, eqmVar2, i3), Boolean.class);
                } else {
                    kzcVar.a.edit().remove(str2).apply();
                    kzc.h(eqmVar2, false);
                }
            }
        }, Boolean.class);
    }
}
