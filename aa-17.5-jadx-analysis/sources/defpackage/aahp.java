package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aahp extends LinkedHashMap {
    private final int a;
    private final aaho b;

    public aahp(aaho aahoVar) {
        super(16, 0.75f, true);
        this.a = 16;
        this.b = aahoVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= this.a) {
            return false;
        }
        aaho aahoVar = this.b;
        entry.getKey();
        Integer num = (Integer) entry.getValue();
        if (num.intValue() == 0) {
            return true;
        }
        ((aafq) aahoVar).c.add(num);
        return true;
    }
}
