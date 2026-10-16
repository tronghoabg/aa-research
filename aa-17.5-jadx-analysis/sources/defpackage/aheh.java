package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;

/* loaded from: classes3.dex */
public final class aheh {
    private aheh() {
    }

    public static final ajkh a(String str) throws IOException {
        ajib ajibVar;
        int i;
        String strSubstring;
        if (afyh.g(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                ajibVar = ajib.a;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                ajibVar = ajib.b;
            }
        } else if (afyh.g(str, "ICY ", false)) {
            ajibVar = ajib.a;
            i = 4;
        } else {
            if (!afyh.g(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            ajibVar = ajib.b;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String strSubstring2 = str.substring(i, i2);
        strSubstring2.getClass();
        Integer numC = afyh.c(strSubstring2);
        if (numC == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int length = str.length();
        int iIntValue = numC.intValue();
        if (length <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
            strSubstring.getClass();
        }
        return new ajkh(ajibVar, iIntValue, strSubstring);
    }

    public static final String b(ajhx ajhxVar) {
        String strB = ajhxVar.b();
        String strC = ajhxVar.c();
        return strC != null ? a.bJ(strC, strB, "?") : strB;
    }

    public final aheg createModuleData(ahfc ahfcVar, ahfc ahfcVar2, agsm agsmVar, String str, ahzh ahzhVar, agze agzeVar) {
        ahfcVar.getClass();
        ahfcVar2.getClass();
        agsmVar.getClass();
        str.getClass();
        ahzhVar.getClass();
        agzeVar.getClass();
        aidz aidzVar = new aidz("DeserializationComponentsForJava.ModuleData");
        agab agabVar = new agab(aidzVar, afzz.FROM_DEPENDENCIES);
        agic agicVar = new agic(ahnj.special("<" + str + '>'), aidzVar, agabVar, null, null, null, 56, null);
        agabVar.setBuiltInsModule(agicVar);
        agabVar.initialize(agicVar, true);
        ahen ahenVar = new ahen();
        agvy agvyVar = new agvy();
        agdb agdbVar = new agdb(aidzVar, agicVar);
        agvt agvtVarMakeLazyJavaPackageFragmentProvider = ahek.makeLazyJavaPackageFragmentProvider(agsmVar, agicVar, aidzVar, agdbVar, ahfcVar, ahenVar, ahzhVar, agzeVar, agvyVar, (sk.AUDIO_CONTENT_BUFFER_SIZE & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? ahfq.INSTANCE : null);
        ahei aheiVarMakeDeserializationComponentsForJava = ahek.makeDeserializationComponentsForJava(agicVar, aidzVar, agdbVar, agvtVarMakeLazyJavaPackageFragmentProvider, ahfcVar, ahenVar, ahzhVar, ahlc.INSTANCE);
        ahenVar.setComponents(aheiVarMakeDeserializationComponentsForJava);
        agup agupVar = agup.EMPTY;
        agupVar.getClass();
        ahwc ahwcVar = new ahwc(agvtVarMakeLazyJavaPackageFragmentProvider, agupVar);
        agvyVar.setResolver(ahwcVar);
        agar agarVar = new agar(aidzVar, ahfcVar2, agicVar, agdbVar, agabVar.getCustomizer(), agabVar.getCustomizer(), ahyw.INSTANCE, aike.Companion.getDefault(), new ahwi(aidzVar, afbe.a));
        agicVar.setDependencies(agicVar);
        List listBi = woy.bi(ahwcVar.getPackageFragmentProvider(), agarVar);
        agicVar.toString();
        agicVar.initialize(new aggx(listBi, "CompositeProvider@RuntimeModuleData for ".concat(agicVar.toString())));
        return new aheg(aheiVarMakeDeserializationComponentsForJava, ahenVar);
    }

    public /* synthetic */ aheh(afeu afeuVar) {
        this();
    }
}
