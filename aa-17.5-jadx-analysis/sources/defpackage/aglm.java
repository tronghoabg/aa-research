package defpackage;

/* loaded from: classes3.dex */
public final class aglm {
    public static final void record(aglq aglqVar, aglo agloVar, agba agbaVar, ahnj ahnjVar) {
        agln location;
        aglqVar.getClass();
        agloVar.getClass();
        agbaVar.getClass();
        ahnjVar.getClass();
        if (aglqVar == aglp.INSTANCE || (location = agloVar.getLocation()) == null) {
            return;
        }
        aglt position = aglqVar.getRequiresPosition() ? location.getPosition() : aglt.Companion.getNO_POSITION();
        String filePath = location.getFilePath();
        String strAsString = ahst.getFqName(agbaVar).asString();
        aglu agluVar = aglu.CLASSIFIER;
        String strAsString2 = ahnjVar.asString();
        strAsString2.getClass();
        aglqVar.record(filePath, position, strAsString, agluVar, strAsString2);
    }

    public static final void recordPackageLookup(aglq aglqVar, aglo agloVar, String str, String str2) {
        agln location;
        aglqVar.getClass();
        agloVar.getClass();
        str.getClass();
        str2.getClass();
        if (aglqVar == aglp.INSTANCE || (location = agloVar.getLocation()) == null) {
            return;
        }
        aglqVar.record(location.getFilePath(), aglqVar.getRequiresPosition() ? location.getPosition() : aglt.Companion.getNO_POSITION(), str, aglu.PACKAGE, str2);
    }

    public static final void record(aglq aglqVar, aglo agloVar, agdc agdcVar, ahnj ahnjVar) {
        aglqVar.getClass();
        agloVar.getClass();
        agdcVar.getClass();
        ahnjVar.getClass();
        String strAsString = agdcVar.getFqName().asString();
        String strAsString2 = ahnjVar.asString();
        strAsString2.getClass();
        recordPackageLookup(aglqVar, agloVar, strAsString, strAsString2);
    }
}
