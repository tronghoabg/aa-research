package defpackage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ujs {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/model/MapTileInfo");
    public static final byte[] b = {76, 84, 73, 80, 10};
    public acjc c;
    public acja d;

    public static void b(Collection collection, Collection collection2, int i, DataOutputStream dataOutputStream) throws IOException {
        abnp abnpVarN = acjc.a.n();
        if (collection != null || collection2 != null) {
            abnp abnpVarN2 = acja.a.n();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                abnpVarN2.t();
                acja acjaVar = (acja) abnpVarN2.b;
                str.getClass();
                aboh abohVar = acjaVar.c;
                if (!abohVar.c()) {
                    acjaVar.c = abnv.I(abohVar);
                }
                acjaVar.c.add(str);
            }
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                abnpVarN2.t();
                acja acjaVar2 = (acja) abnpVarN2.b;
                str2.getClass();
                aboh abohVar2 = acjaVar2.d;
                if (!abohVar2.c()) {
                    acjaVar2.d = abnv.I(abohVar2);
                }
                acjaVar2.d.add(str2);
            }
            abnpVarN2.t();
            acja acjaVar3 = (acja) abnpVarN2.b;
            acjaVar3.b |= 1;
            acjaVar3.e = i;
            abnpVarN.t();
            acjc acjcVar = (acjc) abnpVarN.b;
            acja acjaVar4 = (acja) abnpVarN2.q();
            acjaVar4.getClass();
            acjcVar.c = acjaVar4;
            acjcVar.b |= 4;
        }
        dataOutputStream.write(b);
        abnv abnvVarQ = abnpVarN.q();
        new DataOutputStream(dataOutputStream).writeInt(abnvVarQ.m());
        abnvVarQ.g(dataOutputStream);
    }

    public final acja a() {
        acjc acjcVar;
        if (this.d == null && (acjcVar = this.c) != null && (acjcVar.b & 4) != 0) {
            acja acjaVar = acjcVar.c;
            if (acjaVar == null) {
                acjaVar = acja.a;
            }
            this.d = acjaVar;
        }
        return this.d;
    }
}
