package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class toa implements tnz {
    public static final tot a;
    public final List b = new ArrayList();
    public tot c = a;

    static {
        too tooVar = new too(Integer.MIN_VALUE, Integer.MIN_VALUE);
        a = new tot(tooVar, tooVar);
    }

    @Override // defpackage.tnz
    public final tot a() {
        return this.c;
    }

    @Override // defpackage.tnz
    public final boolean b(tou touVar) {
        if (this.c.b(touVar)) {
            int i = 0;
            while (true) {
                List list = this.b;
                if (i >= list.size()) {
                    break;
                }
                if (((tnz) list.get(i)).b(touVar)) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
