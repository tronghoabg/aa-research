package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hhl implements hhk {
    private final List a;

    public hhl(List list) {
        this.a = list;
    }

    @Override // defpackage.hhk
    public final String a(int i) {
        Object obj = this.a.get(i);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
