package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ghs {
    public static final Map a = new LinkedHashMap();

    public static final ghr a(wb wbVar) {
        ghr ghrVar;
        wbVar.getClass();
        afec afecVar = (afec) a.get(wbVar.getClass());
        return (afecVar == null || (ghrVar = (ghr) afecVar.invoke(wbVar)) == null) ? new ghr(true, false) : ghrVar;
    }
}
