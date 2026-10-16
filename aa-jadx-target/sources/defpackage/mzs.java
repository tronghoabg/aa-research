package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mzs implements defpackage.affc {
    private final /* synthetic */ int a;

    public mzs(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z = false;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                defpackage.mzu.a.l().y("connectionTimeoutHasElapsed: %s", bool);
                return obj;
            case 1:
                lok lokVar = (lok) obj;
                defpackage.yqm yqmVar = defpackage.mzu.a;
                lokVar.getClass();
                return lokVar.e;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                bool2.booleanValue();
                defpackage.mzu.a.l().y("timedOutAfterPlaybackStateChange: %s", bool2);
                return obj;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                bool3.booleanValue();
                defpackage.mzu.a.l().y("isMediaSessionValid: %s", bool3);
                return obj;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Boolean bool4 = (java.lang.Boolean) obj;
                bool4.booleanValue();
                defpackage.mzu.a.l().y("isMediaSuggestionAvailable: %s", bool4);
                return obj;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mzu.a.l().y("cardState: %s", (defpackage.mzq) obj);
                return obj;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afau afauVar = (defpackage.afau) obj;
                j$.time.Duration duration = nab.a;
                afauVar.getClass();
                return (defpackage.acbb) afauVar.b;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = (com.google.android.apps.auto.components.graphics.icon.GhIcon) obj;
                j$.time.Duration duration2 = nab.a;
                return java.lang.Boolean.valueOf(ghIcon == null);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                componentName.getClass();
                android.content.Context context = defpackage.mkp.a.c;
                context.getClass();
                return new mot(context, componentName);
            case 9:
                mot motVar = (mot) obj;
                if (motVar != null) {
                    return motVar.b();
                }
                return null;
            case 10:
                mot motVar2 = (mot) obj;
                if (motVar2 != null) {
                    return motVar2.c();
                }
                return null;
            case 11:
                android.content.ComponentName componentName2 = (android.content.ComponentName) obj;
                componentName2.getClass();
                android.content.Context context2 = defpackage.mkp.a.c;
                context2.getClass();
                return new mot(context2, componentName2).b();
            case 12:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                aaPlaybackState.getClass();
                if (aaPlaybackState.Q() != 1 && aaPlaybackState.Q() != 2) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 13:
                android.graphics.drawable.Icon icon = (android.graphics.drawable.Icon) obj;
                if (icon != null) {
                    return com.google.android.apps.auto.components.graphics.icon.GhIcon.o(defpackage.dtq.d(icon));
                }
                return null;
            case 14:
                defpackage.afau afauVar2 = (defpackage.afau) obj;
                afauVar2.getClass();
                return (android.graphics.Bitmap) afauVar2.a;
            case 15:
                nak nakVar = (ltv) obj;
                nakVar.getClass();
                return nakVar;
            case 16:
                nak nakVar2 = (nak) obj;
                nakVar2.getClass();
                return nakVar2.i();
            case 17:
                nak nakVar3 = (nak) obj;
                nakVar3.getClass();
                return nakVar3.h();
            case 18:
                defpackage.afau afauVar3 = (defpackage.afau) obj;
                afauVar3.getClass();
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) afauVar3.a;
                defpackage.gjv gjvVar = (defpackage.gjv) afauVar3.b;
                if (bitmap != null) {
                    return defpackage.duu.b((1 & 1) != 0 ? defpackage.afdp.a : null, (1 & 2) != 0 ? 5000L : 0L, new dxi(bitmap, gjvVar, (defpackage.afdk) null, 4));
                }
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.eqs(null);
            case 19:
                android.content.ComponentName componentName3 = (android.content.ComponentName) obj;
                componentName3.getClass();
                return com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName3);
            default:
                defpackage.lke lkeVar = (defpackage.lke) obj;
                if (lkeVar == null) {
                    defpackage.afdo afdoVar2 = defpackage.tcu.a;
                    return new defpackage.eqs(null);
                }
                int i = lkeVar.f;
                if (i != 0) {
                    com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconR = com.google.android.apps.auto.components.graphics.icon.GhIcon.r(lkeVar.b, i);
                    defpackage.afdo afdoVar3 = defpackage.tcu.a;
                    return new defpackage.eqs(ghIconR);
                }
                if (!defpackage.lmp.a.a().d()) {
                    defpackage.afdo afdoVar4 = defpackage.tcu.a;
                    return new defpackage.eqs(null);
                }
                defpackage.lov lovVarA = defpackage.lov.a.a();
                java.lang.String str = lkeVar.b;
                str.getClass();
                return defpackage.tcu.v(defpackage.tcu.v(lovVarA.c, new defpackage.llr(str, 7)), new defpackage.mzs(13));
        }
    }
}
