package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class yoe extends yos {
    public yoe(Class cls) {
        super("tags", cls, false, true);
    }

    @Override // defpackage.yos
    public final /* bridge */ /* synthetic */ void b(Object obj, yor yorVar) {
        yrt yrtVar = (yrt) obj;
        if (yrtVar == null) {
            return;
        }
        yrp yrpVar = new yrp((yrq) yrtVar.c.d);
        while (yrpVar.hasNext()) {
            Map.Entry entry = (Map.Entry) yrpVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                yorVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    yorVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
