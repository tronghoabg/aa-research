package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ltk implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ ltk(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.net.Uri uri;
        android.net.Uri uri2;
        java.lang.String string;
        java.lang.String string2;
        java.lang.CharSequence charSequence = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                lmkVar.getClass();
                return lmkVar.h().S();
            case 1:
                return defpackage.tna.aJ((los) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.lmk lmkVar2 = (defpackage.lmk) obj;
                lmkVar2.getClass();
                defpackage.afct afctVar = new defpackage.afct(10);
                if (lmkVar2.O("android.media.extra.DOWNLOAD_STATUS") == 2) {
                    afctVar.add(2131231731);
                }
                if (lmkVar2.O("android.media.IS_EXPLICIT") == 1) {
                    afctVar.add(2131231664);
                }
                return afctVar.f();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.lmk lmkVar3 = (defpackage.lmk) obj;
                lmkVar3.getClass();
                android.net.Uri uriB = lka.b(lmkVar3);
                android.graphics.Bitmap bitmapA = lka.a(lmkVar3);
                java.lang.CharSequence charSequenceQ = lmkVar3.h().Q();
                if (charSequenceQ != null && !afzh.v(charSequenceQ)) {
                    charSequence = charSequenceQ;
                }
                return new defpackage.gjv(uriB, bitmapA, charSequence);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.lmk lmkVar4 = (defpackage.lmk) obj;
                lmkVar4.getClass();
                return lmkVar4.h().R();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                lph lphVar = (lph) obj;
                j$.time.Duration duration = defpackage.ltu.a;
                lphVar.getClass();
                return lphVar.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                lph lphVar2 = (lph) obj;
                j$.time.Duration duration2 = defpackage.ltu.a;
                lphVar2.getClass();
                return defpackage.lpg.j().e(lphVar2);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                j$.time.Duration duration3 = defpackage.ltu.a;
                componentName.getClass();
                defpackage.eqp eqpVarF = defpackage.lpg.j().f(componentName);
                eqpVarF.getClass();
                return eqpVarF;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.lmk lmkVar5 = (defpackage.lmk) obj;
                lmkVar5.getClass();
                return lmkVar5.h().S();
            case 9:
                defpackage.lmk lmkVar6 = (defpackage.lmk) obj;
                lmkVar6.getClass();
                return lmkVar6.h().R();
            case 10:
                defpackage.lmk lmkVar7 = (defpackage.lmk) obj;
                lmkVar7.getClass();
                android.net.Uri uriB2 = lka.b(lmkVar7);
                android.graphics.Bitmap bitmapA2 = lka.a(lmkVar7);
                java.lang.CharSequence charSequenceQ2 = lmkVar7.h().Q();
                if (charSequenceQ2 != null && !afzh.v(charSequenceQ2)) {
                    charSequence = charSequenceQ2;
                }
                return new defpackage.gjv(uriB2, bitmapA2, charSequence);
            case 11:
                defpackage.lmk lmkVar8 = (defpackage.lmk) obj;
                lmkVar8.getClass();
                return defpackage.lnt.g(lmkVar8, "com.google.android.apps.auto.radio.FREQUENCY", "com.google.android.apps.auto.radio.STATION_NAME");
            case 12:
                defpackage.lmk lmkVar9 = (defpackage.lmk) obj;
                lmkVar9.getClass();
                android.graphics.Bitmap bitmapP = lmkVar9.P("android.media.metadata.DISPLAY_ICON");
                java.lang.String strQ = lmkVar9.Q("android.media.metadata.DISPLAY_ICON_URI");
                if (strQ != null) {
                    uri = android.net.Uri.parse(strQ);
                    uri.getClass();
                } else {
                    uri = null;
                }
                return new defpackage.gjv(uri, bitmapP, null);
            case 13:
                defpackage.lmk lmkVar10 = (defpackage.lmk) obj;
                lmkVar10.getClass();
                android.graphics.Bitmap bitmapP2 = lmkVar10.P("android.media.metadata.ALBUM_ART");
                if (bitmapP2 == null) {
                    bitmapP2 = lmkVar10.P("android.media.metadata.DISPLAY_ICON");
                }
                java.lang.String strQ2 = lmkVar10.Q("android.media.metadata.ALBUM_ART_URI");
                if (strQ2 == null) {
                    strQ2 = lmkVar10.Q("android.media.metadata.DISPLAY_ICON_URI");
                }
                if (strQ2 != null) {
                    uri2 = android.net.Uri.parse(strQ2);
                    uri2.getClass();
                } else {
                    uri2 = null;
                }
                return new defpackage.gjv(uri2, bitmapP2, null);
            case 14:
                defpackage.gjv gjvVar = (defpackage.gjv) obj;
                gjvVar.getClass();
                return defpackage.lnt.f(gjvVar.b);
            case 15:
                defpackage.lmk lmkVar11 = (defpackage.lmk) obj;
                lmkVar11.getClass();
                java.lang.String strQ3 = lmkVar11.Q("android.media.metadata.ARTIST");
                return (strQ3 == null || (string = afzh.l(strQ3).toString()) == null) ? defpackage.lnt.g(lmkVar11, "com.google.android.apps.auto.radio.MESSAGE", "com.google.android.apps.auto.radio.PROGRAM_TYPE") : string;
            case 16:
                defpackage.lmk lmkVar12 = (defpackage.lmk) obj;
                lmkVar12.getClass();
                java.lang.String strQ4 = lmkVar12.Q("android.media.metadata.TITLE");
                return (strQ4 == null || (string2 = afzh.l(strQ4).toString()) == null) ? defpackage.lnt.h(lmkVar12, "com.google.android.apps.auto.radio.STATION_NAME", "com.google.android.apps.auto.radio.HD_SUB_CHANNEL") : string2;
            case 17:
                java.lang.String str = (java.lang.String) obj;
                str.getClass();
                return afzh.l(str).toString();
            case 18:
                java.util.List list = (java.util.List) obj;
                lwu lwuVar = lwv.a;
                list.getClass();
                java.util.List list2 = (java.util.List) defpackage.afga.aB(list);
                return list2 == null ? defpackage.afce.a : list2;
            case 19:
                return java.lang.Boolean.valueOf(defpackage.mak.l(((java.lang.Integer) obj).intValue()));
            default:
                ((mcx) obj).getClass();
                return defpackage.afbk.a;
        }
    }
}
