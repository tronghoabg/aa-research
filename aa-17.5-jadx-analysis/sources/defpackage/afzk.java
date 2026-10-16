package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class afzk {
    public static final afzi Companion = new afzi(null);
    private static final afzk Default = new afzk(woy.bi(afzd.INSTANCE, afzg.INSTANCE, afze.INSTANCE, afzf.INSTANCE));
    private final List<afzh> kinds;
    private final Map<ahnf, List<afzh>> knownKindsByPackageFqName;

    /* JADX WARN: Multi-variable type inference failed */
    public afzk(List<? extends afzh> list) {
        list.getClass();
        this.kinds = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            ahnf packageFqName = ((afzh) obj).getPackageFqName();
            Object arrayList = linkedHashMap.get(packageFqName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(packageFqName, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.knownKindsByPackageFqName = linkedHashMap;
    }

    private final Integer toInt(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iCharAt = str.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i = (i * 10) + iCharAt;
        }
        return Integer.valueOf(i);
    }

    public final afzh getFunctionalClassKind(ahnf ahnfVar, String str) {
        ahnfVar.getClass();
        str.getClass();
        afzj functionalClassKindWithArity = getFunctionalClassKindWithArity(ahnfVar, str);
        if (functionalClassKindWithArity != null) {
            return functionalClassKindWithArity.getKind();
        }
        return null;
    }

    public final afzj getFunctionalClassKindWithArity(ahnf ahnfVar, String str) {
        ahnfVar.getClass();
        str.getClass();
        List<afzh> list = this.knownKindsByPackageFqName.get(ahnfVar);
        if (list == null) {
            return null;
        }
        for (afzh afzhVar : list) {
            if (afyh.g(str, afzhVar.getClassNamePrefix(), false)) {
                String strSubstring = str.substring(afzhVar.getClassNamePrefix().length());
                strSubstring.getClass();
                Integer num = toInt(strSubstring);
                if (num != null) {
                    return new afzj(afzhVar, num.intValue());
                }
            }
        }
        return null;
    }
}
