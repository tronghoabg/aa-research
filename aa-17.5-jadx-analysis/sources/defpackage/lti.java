package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.time.Duration;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class lti implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ lti(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        Uri uri;
        Uri uri2;
        String string;
        String string2;
        CharSequence charSequence = null;
        switch (this.a) {
            case 0:
                loz lozVar = (loz) obj;
                Duration duration = lto.a;
                lozVar.getClass();
                return lozVar.a;
            case 1:
                lmd lmdVar = (lmd) obj;
                lmdVar.getClass();
                return lmdVar.h().R();
            case 2:
                loz lozVar2 = (loz) obj;
                Duration duration2 = lto.a;
                lozVar2.getClass();
                return loy.j().e(lozVar2);
            case 3:
                ComponentName componentName = (ComponentName) obj;
                Duration duration3 = lto.a;
                componentName.getClass();
                eqj eqjVarF = loy.j().f(componentName);
                eqjVarF.getClass();
                return eqjVarF;
            case 4:
                lmd lmdVar2 = (lmd) obj;
                lmdVar2.getClass();
                return lmdVar2.h().S();
            case 5:
                lmd lmdVar3 = (lmd) obj;
                lmdVar3.getClass();
                return lmdVar3.h().R();
            case 6:
                lmd lmdVar4 = (lmd) obj;
                lmdVar4.getClass();
                Uri uriB = ljt.b(lmdVar4);
                Bitmap bitmapA = ljt.a(lmdVar4);
                CharSequence charSequenceQ = lmdVar4.h().Q();
                if (charSequenceQ != null && !afyh.v(charSequenceQ)) {
                    charSequence = charSequenceQ;
                }
                return new gjo(uriB, bitmapA, charSequence);
            case 7:
                lmd lmdVar5 = (lmd) obj;
                lmdVar5.getClass();
                return lnm.g(lmdVar5, "com.google.android.apps.auto.radio.FREQUENCY", "com.google.android.apps.auto.radio.STATION_NAME");
            case 8:
                lmd lmdVar6 = (lmd) obj;
                lmdVar6.getClass();
                Bitmap bitmapP = lmdVar6.P("android.media.metadata.DISPLAY_ICON");
                String strQ = lmdVar6.Q("android.media.metadata.DISPLAY_ICON_URI");
                if (strQ != null) {
                    uri = Uri.parse(strQ);
                    uri.getClass();
                } else {
                    uri = null;
                }
                return new gjo(uri, bitmapP, null);
            case 9:
                lmd lmdVar7 = (lmd) obj;
                lmdVar7.getClass();
                Bitmap bitmapP2 = lmdVar7.P("android.media.metadata.ALBUM_ART");
                if (bitmapP2 == null) {
                    bitmapP2 = lmdVar7.P("android.media.metadata.DISPLAY_ICON");
                }
                String strQ2 = lmdVar7.Q("android.media.metadata.ALBUM_ART_URI");
                if (strQ2 == null) {
                    strQ2 = lmdVar7.Q("android.media.metadata.DISPLAY_ICON_URI");
                }
                if (strQ2 != null) {
                    uri2 = Uri.parse(strQ2);
                    uri2.getClass();
                } else {
                    uri2 = null;
                }
                return new gjo(uri2, bitmapP2, null);
            case 10:
                gjo gjoVar = (gjo) obj;
                gjoVar.getClass();
                return lnm.f(gjoVar.b);
            case 11:
                lmd lmdVar8 = (lmd) obj;
                lmdVar8.getClass();
                String strQ3 = lmdVar8.Q("android.media.metadata.ARTIST");
                return (strQ3 == null || (string = afyh.l(strQ3).toString()) == null) ? lnm.g(lmdVar8, "com.google.android.apps.auto.radio.MESSAGE", "com.google.android.apps.auto.radio.PROGRAM_TYPE") : string;
            case 12:
                lmd lmdVar9 = (lmd) obj;
                lmdVar9.getClass();
                String strQ4 = lmdVar9.Q("android.media.metadata.TITLE");
                return (strQ4 == null || (string2 = afyh.l(strQ4).toString()) == null) ? lnm.h(lmdVar9, "com.google.android.apps.auto.radio.STATION_NAME", "com.google.android.apps.auto.radio.HD_SUB_CHANNEL") : string2;
            case 13:
                String str = (String) obj;
                str.getClass();
                return afyh.l(str).toString();
            case 14:
                List list = (List) obj;
                lwn lwnVar = lwo.a;
                list.getClass();
                List list2 = (List) woy.bH(list);
                return list2 == null ? afbe.a : list2;
            case 15:
                return Boolean.valueOf(mad.l(((Integer) obj).intValue()));
            case 16:
                ((mcr) obj).getClass();
                return afak.a;
            case 17:
                ComponentName componentName2 = (ComponentName) obj;
                mct mctVar = mcu.a;
                return Boolean.valueOf(componentName2 != null);
            case 18:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                mct mctVar2 = mcu.a;
                resolveInfo.getClass();
                return roc.al(resolveInfo);
            case 19:
                ComponentName componentName3 = (ComponentName) obj;
                mct mctVar3 = mcu.a;
                componentName3.getClass();
                return new mqc(componentName3, mpz.g, false, 28);
            default:
                obj.getClass();
                if (obj instanceof mer) {
                    return new mes();
                }
                if (obj instanceof mfa) {
                    return new mfc();
                }
                if (obj instanceof mej) {
                    return (acuy.c() || lnm.H()) ? new mek() : new mem();
                }
                if (obj instanceof meu) {
                    return new lkt(7);
                }
                afhe afheVarB = affw.b(obj.getClass());
                Objects.toString(afheVarB);
                throw new IllegalStateException("Unknown model type ".concat(String.valueOf(afheVarB)));
        }
    }
}
