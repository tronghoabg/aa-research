package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class agar extends ahyg {
    public static final agaq Companion = new agaq(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agar(aiei aieiVar, ahfc ahfcVar, agcu agcuVar, agdb agdbVar, agfx agfxVar, aggb aggbVar, ahyx ahyxVar, aike aikeVar, ahwh ahwhVar) {
        super(aieiVar, ahfcVar, agcuVar);
        aieiVar.getClass();
        ahfcVar.getClass();
        agcuVar.getClass();
        agdbVar.getClass();
        agfxVar.getClass();
        aggbVar.getClass();
        ahyxVar.getClass();
        aikeVar.getClass();
        ahwhVar.getClass();
        ahyz ahyzVar = new ahyz(this);
        ahyj ahyjVar = new ahyj(agcuVar, agdbVar, aiar.INSTANCE);
        ahzn ahznVar = ahzn.INSTANCE;
        ahzh ahzhVar = ahzh.DO_NOTHING;
        ahzhVar.getClass();
        setComponents(new ahyv(aieiVar, agcuVar, ahyxVar, ahyzVar, ahyjVar, this, ahznVar, ahzhVar, aglp.INSTANCE, ahzi.INSTANCE, woy.bi(new afyt(aieiVar, agcuVar), new afzv(aieiVar, agcuVar, null, 4, null)), agdbVar, ahyu.Companion.getDEFAULT(), agfxVar, aggbVar, aiar.INSTANCE.getExtensionRegistry(), aikeVar, ahwhVar, null, ahzl.INSTANCE, 262144, null));
    }

    @Override // defpackage.ahyg
    protected ahza findPackage(ahnf ahnfVar) {
        ahnfVar.getClass();
        InputStream inputStreamFindBuiltInsData = getFinder().findBuiltInsData(ahnfVar);
        if (inputStreamFindBuiltInsData != null) {
            return aiau.Companion.create(ahnfVar, getStorageManager(), getModuleDescriptor(), inputStreamFindBuiltInsData, false);
        }
        return null;
    }
}
