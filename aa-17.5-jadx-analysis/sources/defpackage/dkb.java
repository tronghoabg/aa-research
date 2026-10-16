package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dkb {
    private LocaleList a;
    private dkd b;
    private final dka c = new dka();

    public final dkd a() {
        dka dkaVar = this.c;
        LocaleList localeList = LocaleList.getDefault();
        synchronized (dkaVar) {
            dkd dkdVar = this.b;
            if (dkdVar != null && localeList == this.a) {
                return dkdVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new dkc(localeList.get(i)));
            }
            dkd dkdVar2 = new dkd(arrayList);
            this.a = localeList;
            this.b = dkdVar2;
            return dkdVar2;
        }
    }
}
