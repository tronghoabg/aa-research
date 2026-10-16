package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahcv {
    private final String errorsSinceLanguageVersion;
    private final String functionName;
    private final List<aezu<String, ahdb>> parameters;
    private aezu<String, ahdb> returnType;
    private ahtq returnValueStatus;
    final /* synthetic */ ahcw this$0;

    public ahcv(ahcw ahcwVar, String str, String str2) {
        str.getClass();
        this.this$0 = ahcwVar;
        this.functionName = str;
        this.errorsSinceLanguageVersion = str2;
        this.parameters = new ArrayList();
        this.returnType = new aezu<>("V", null);
    }

    public final aezu<String, ahco> build() {
        List<aezu<String, ahdb>> list = this.parameters;
        ahft ahftVar = ahft.INSTANCE;
        String className = this.this$0.getClassName();
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((aezu) it.next()).a);
        }
        String strSignature = ahftVar.signature(className, ahftVar.jvmDescriptor(this.functionName, arrayList, (String) this.returnType.a));
        ahdb ahdbVar = (ahdb) this.returnType.b;
        List<aezu<String, ahdb>> list2 = this.parameters;
        ArrayList arrayList2 = new ArrayList(woy.bp(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((ahdb) ((aezu) it2.next()).b);
        }
        return new aezu<>(strSignature, new ahco(ahdbVar, arrayList2, this.errorsSinceLanguageVersion, this.returnValueStatus));
    }

    public final void mustUseReturnValue() {
        this.returnValueStatus = ahtq.MustUse;
    }

    public final void parameter(String str, ahar... aharVarArr) {
        ahdb ahdbVar;
        str.getClass();
        aharVarArr.getClass();
        if (aharVarArr.length == 0) {
            ahdbVar = null;
        } else {
            Iterable<afbh> iterableCT = woy.cT(aharVarArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(iterableCT, 10)), 16));
            for (afbh afbhVar : iterableCT) {
                linkedHashMap.put(Integer.valueOf(afbhVar.a), (ahar) afbhVar.b);
            }
            ahdbVar = new ahdb(linkedHashMap);
        }
        this.parameters.add(new aezu<>(str, ahdbVar));
    }

    public final void returns(String str, ahar... aharVarArr) {
        str.getClass();
        aharVarArr.getClass();
        Iterable<afbh> iterableCT = woy.cT(aharVarArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(iterableCT, 10)), 16));
        for (afbh afbhVar : iterableCT) {
            linkedHashMap.put(Integer.valueOf(afbhVar.a), (ahar) afbhVar.b);
        }
        this.returnType = new aezu<>(str, new ahdb(linkedHashMap));
    }

    public final void returns(ahwe ahweVar) {
        ahweVar.getClass();
        this.returnType = new aezu<>(ahweVar.getDesc(), null);
    }
}
