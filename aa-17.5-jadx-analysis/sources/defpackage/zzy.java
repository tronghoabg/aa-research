package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzy extends hro {
    private final String n;

    public zzy(String str, hqy hqyVar, String str2) {
        super(str, hqyVar, zzz.b);
        this.n = str2;
    }

    @Override // defpackage.hqt
    public final Map d() throws hqg {
        HashMap map = new HashMap();
        map.put("User-Agent", this.n);
        return map;
    }
}
