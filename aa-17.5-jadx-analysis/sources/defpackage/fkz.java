package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class fkz extends dsy {
    public static final String a = fjo.b("WorkContinuationImpl");
    public final flo b;
    public final List c;
    public final List d;
    public boolean e;
    private final List f = new ArrayList();

    public fkz(flo floVar, List list) {
        this.b = floVar;
        this.c = list;
        this.d = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String strA = ((ncp) list.get(i)).A();
            this.d.add(strA);
            this.f.add(strA);
        }
    }
}
