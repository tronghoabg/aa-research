package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nao implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ nao(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        defpackage.lke lkeVar;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                lok lokVar = (los) obj;
                lokVar.getClass();
                lok lokVar2 = lokVar instanceof lok ? lokVar : null;
                if (lokVar2 == null || (lkeVar = lokVar2.c) == null) {
                    return null;
                }
                return java.lang.Integer.valueOf(lkeVar.h);
            case 1:
                defpackage.eqp eqpVarF = defpackage.lpg.j().f((android.content.ComponentName) obj);
                eqpVarF.getClass();
                return eqpVarF;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.getClass();
                return new defpackage.acbb(num.intValue());
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.acbb acbbVar = (defpackage.acbb) obj;
                acbbVar.getClass();
                return java.lang.Integer.valueOf(acbbVar.e.a(25));
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((java.lang.Integer) obj).intValue();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.cuw) obj).getClass();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.cuw) obj).getClass();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.util.List list = (java.util.List) obj;
                list.getClass();
                return defpackage.afga.aO(list);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.afar afarVar = defpackage.nbg.d;
                return defpackage.lqf.d().b((android.content.ComponentName) obj);
            case 9:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                defpackage.afar afarVar2 = defpackage.nbg.d;
                ygwVar.getClass();
                return java.lang.Boolean.valueOf(!defpackage.afga.aO(ygwVar).isEmpty());
            case 10:
                lqa lqaVar = (lqa) obj;
                lqaVar.getClass();
                return lqaVar.d();
            case 11:
                com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload assistantMediaSuggestionPlaybackPayload = (com.google.android.apps.auto.components.media.repository.suggestion.AssistantMediaSuggestionPlaybackPayload) obj;
                assistantMediaSuggestionPlaybackPayload.getClass();
                return assistantMediaSuggestionPlaybackPayload.b.c;
            case 12:
                defpackage.mzq mzqVar = (defpackage.mzq) obj;
                mzqVar.getClass();
                int iOrdinal = mzqVar.ordinal();
                if (iOrdinal == 1) {
                    return nbk.b;
                }
                if (iOrdinal != 2) {
                    return iOrdinal != 4 ? nbk.c : nbk.d;
                }
                return nbk.a;
            case 13:
                return java.lang.Boolean.valueOf(((java.lang.Float) obj).floatValue() < 0.2f);
            case 14:
                java.lang.Float f = (java.lang.Float) obj;
                f.getClass();
                return java.lang.Float.valueOf(defpackage.afqt.d((f.floatValue() - 0.4f) / 0.20000002f, 0.0f, 1.0f));
            case 15:
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = (com.google.android.apps.auto.components.media.compat.AaPlaybackState) obj;
                aaPlaybackState.getClass();
                return java.lang.Integer.valueOf(aaPlaybackState.Q());
            case 16:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                num2.intValue();
                return java.lang.Boolean.valueOf(nbp.c.contains(num2));
            case 17:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                lmkVar.getClass();
                java.lang.String strQ = lmkVar.Q("android.media.metadata.TITLE");
                return (strQ == null || (string = afzh.l(strQ).toString()) == null) ? defpackage.lnt.h(lmkVar, "com.google.android.apps.auto.radio.HD_SUB_CHANNEL", "com.google.android.apps.auto.radio.STATION_NAME") : string;
            case 18:
                defpackage.lmk lmkVar2 = (defpackage.lmk) obj;
                lmkVar2.getClass();
                return defpackage.lnt.g(lmkVar2, "com.google.android.apps.auto.radio.FREQUENCY", "com.google.android.apps.auto.radio.HD_SUB_CHANNEL");
            case 19:
                defpackage.lmk lmkVar3 = (defpackage.lmk) obj;
                lmkVar3.getClass();
                java.lang.String strQ2 = lmkVar3.Q("android.media.metadata.TITLE");
                return (strQ2 == null || (string2 = afzh.l(strQ2).toString()) == null) ? defpackage.lnt.g(lmkVar3, "com.google.android.apps.auto.radio.FREQUENCY", "com.google.android.apps.auto.radio.HD_SUB_CHANNEL") : string2;
            default:
                defpackage.lmk lmkVar4 = (defpackage.lmk) obj;
                lmkVar4.getClass();
                java.lang.String strQ3 = lmkVar4.Q("android.media.metadata.ARTIST");
                if (strQ3 != null && (string3 = afzh.l(strQ3).toString()) != null) {
                    return string3;
                }
                java.lang.String strQ4 = lmkVar4.Q("com.google.android.apps.auto.radio.STATION_NAME");
                if (strQ4 != null) {
                    return afzh.l(strQ4).toString();
                }
                return null;
        }
    }
}
