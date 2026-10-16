package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import defpackage.afbe;
import defpackage.afec;
import defpackage.afyo;
import defpackage.agcu;
import defpackage.agdb;
import defpackage.agdd;
import defpackage.agdg;
import defpackage.agfx;
import defpackage.agfy;
import defpackage.aggb;
import defpackage.aglp;
import defpackage.ahnf;
import defpackage.ahwi;
import defpackage.ahyj;
import defpackage.ahyu;
import defpackage.ahyv;
import defpackage.ahyw;
import defpackage.ahyz;
import defpackage.ahzh;
import defpackage.ahzi;
import defpackage.ahzn;
import defpackage.aiar;
import defpackage.aias;
import defpackage.aiau;
import defpackage.aiav;
import defpackage.aiei;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

/* loaded from: classes3.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    private final aiav resourceLoader = new aiav();

    public final agdd createBuiltInPackageFragmentProvider(aiei aieiVar, agcu agcuVar, Set<ahnf> set, Iterable<? extends agfy> iterable, aggb aggbVar, agfx agfxVar, boolean z, afec<? super String, ? extends InputStream> afecVar) {
        aieiVar.getClass();
        agcuVar.getClass();
        set.getClass();
        iterable.getClass();
        aggbVar.getClass();
        agfxVar.getClass();
        afecVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (ahnf ahnfVar : set) {
            InputStream inputStreamInvoke = afecVar.invoke(aiar.INSTANCE.getBuiltInsFilePath(ahnfVar));
            aiau aiauVarCreate = inputStreamInvoke != null ? aiau.Companion.create(ahnfVar, aieiVar, agcuVar, inputStreamInvoke, z) : null;
            if (aiauVarCreate != null) {
                arrayList.add(aiauVarCreate);
            }
        }
        agdg agdgVar = new agdg(arrayList);
        agdb agdbVar = new agdb(aieiVar, agcuVar);
        ahyw ahywVar = ahyw.INSTANCE;
        ahyz ahyzVar = new ahyz(agdgVar);
        ahyj ahyjVar = new ahyj(agcuVar, agdbVar, aiar.INSTANCE);
        ahzn ahznVar = ahzn.INSTANCE;
        ahzh ahzhVar = ahzh.DO_NOTHING;
        ahzhVar.getClass();
        ahyv ahyvVar = new ahyv(aieiVar, agcuVar, ahywVar, ahyzVar, ahyjVar, agdgVar, ahznVar, ahzhVar, aglp.INSTANCE, ahzi.INSTANCE, iterable, agdbVar, ahyu.Companion.getDEFAULT(), agfxVar, aggbVar, aiar.INSTANCE.getExtensionRegistry(), null, new ahwi(aieiVar, afbe.a), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((aiau) it.next()).initialize(ahyvVar);
        }
        return agdgVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public agdd createPackageFragmentProvider(aiei aieiVar, agcu agcuVar, Iterable<? extends agfy> iterable, aggb aggbVar, agfx agfxVar, boolean z) {
        aieiVar.getClass();
        agcuVar.getClass();
        iterable.getClass();
        aggbVar.getClass();
        agfxVar.getClass();
        return createBuiltInPackageFragmentProvider(aieiVar, agcuVar, afyo.BUILT_INS_PACKAGE_FQ_NAMES, iterable, aggbVar, agfxVar, z, new aias(this.resourceLoader));
    }
}
