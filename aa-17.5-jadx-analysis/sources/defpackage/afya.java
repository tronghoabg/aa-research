package defpackage;

import java.util.EnumMap;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class afya implements afdr {
    final /* synthetic */ afye this$0;

    public afya(afye afyeVar) {
        this.this$0 = afyeVar;
    }

    @Override // defpackage.afdr
    public afyd invoke() {
        EnumMap enumMap = new EnumMap(afyi.class);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        for (afyi afyiVar : afyi.values()) {
            aigw builtInTypeByClassName = this.this$0.getBuiltInTypeByClassName(afyiVar.getTypeName().asString());
            aigw builtInTypeByClassName2 = this.this$0.getBuiltInTypeByClassName(afyiVar.getArrayTypeName().asString());
            enumMap.put((EnumMap) afyiVar, (afyi) builtInTypeByClassName2);
            map.put(builtInTypeByClassName, builtInTypeByClassName2);
            map2.put(builtInTypeByClassName2, builtInTypeByClassName);
        }
        return new afyd(enumMap, map, map2, null);
    }
}
