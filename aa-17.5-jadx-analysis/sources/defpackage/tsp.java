package defpackage;

import android.util.LongSparseArray;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class tsp implements tsr {
    public final LongSparseArray a;
    public final tra b;
    public final aezk c;
    public final boolean d = false;

    static {
        new ymp(0);
    }

    public tsp(tra traVar, aezk aezkVar) {
        new HashMap();
        this.a = new LongSparseArray();
        this.b = traVar;
        this.c = aezkVar;
    }

    @Override // defpackage.tsr
    public final aekf a(long j) {
        aekf aekiVar;
        this.c.a();
        LongSparseArray longSparseArray = this.a;
        synchronized (longSparseArray) {
            yfa yfaVar = (yfa) longSparseArray.get(j);
            if (yfaVar == null) {
                aekiVar = aekj.a;
            } else {
                int size = yfaVar.size();
                aeke aekeVar = new aeke(size + size);
                Iterator itH = ysi.h(yfaVar);
                if (itH.hasNext()) {
                    abeg abegVar = ((tso) itH.next()).a;
                    tss.b(null);
                    throw null;
                }
                if (aekeVar.isEmpty()) {
                    aekiVar = aekj.a;
                } else {
                    aekg aekgVar = aekj.a;
                    aekiVar = new aeki(aekeVar);
                }
            }
        }
        return aekiVar;
    }
}
