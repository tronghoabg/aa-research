package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class txj implements uml, tud {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/impl/LinesImpl");
    static final tyv b = new txi();
    public final typ c;
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    private final Map f;
    private final Context g;
    private final uaj h;
    private final uvg i;
    private final qrx j;
    private final gjv k;

    public txj(uvg uvgVar, typ typVar, Map map, gjv gjvVar, qrx qrxVar, Context context, uaj uajVar) {
        this.c = typVar;
        this.f = map;
        this.i = uvgVar;
        this.k = gjvVar;
        this.j = qrxVar;
        this.g = context;
        this.h = uajVar;
    }

    public static void e(tvz tvzVar) {
        woy.Z(tvzVar instanceof tvz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final tvz a(final abdd abddVar, final abfi abfiVar, final tqt tqtVar, utf utfVar, final aekf aekfVar, boolean z) {
        if (abfiVar == abfi.WORLD_ENCODING_UNKNOWN) {
            throw new IllegalArgumentException("Attempting to create a client-inject polyline with an unknown vertex encoding");
        }
        abnh abnhVar = abcz.g;
        abddVar.j(abnhVar);
        Object objJ = abddVar.w.j(abnhVar.d);
        List list = (List) (objJ == null ? abnhVar.b : abnhVar.c(objJ));
        abnh abnhVar2 = abcz.h;
        abddVar.j(abnhVar2);
        Object objJ2 = abddVar.w.j(abnhVar2.d);
        List list2 = (List) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2));
        ArrayList arrayList = new ArrayList();
        abnh abnhVar3 = abcz.f;
        abddVar.j(abnhVar3);
        abnl abnlVar = abddVar.w;
        abnu abnuVar = abnhVar3.d;
        if (abnlVar.m(abnuVar)) {
            if (!(tqtVar instanceof tyo)) {
                ((ynz) a.a(uys.a).ai((char) 9178)).u("We are trying to access a global style from a non-global style namespace.");
            }
            abddVar.j(abnhVar3);
            arrayList.add(tqtVar.b(((abcy) (abddVar.w.j(abnuVar) == null ? abnhVar3.b : abnhVar3.c(r0))).c));
        } else if (list.isEmpty()) {
            int i = abddVar.b;
            if ((i & 1024) != 0) {
                if (!(tqtVar instanceof tyo)) {
                    ((ynz) a.a(uys.a).ai((char) 9176)).u("We are trying to access a global style from a non-global style namespace.");
                }
                arrayList.add(tqtVar.b(abddVar.n));
            } else if ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                arrayList.add(tqtVar.b(abddVar.m));
            } else if (abddVar.f.size() != 0) {
                Iterator<E> it = abddVar.f.iterator();
                while (it.hasNext()) {
                    arrayList.add(tqtVar.b(((Long) it.next()).longValue()));
                }
            }
        } else {
            if (!(tqtVar instanceof tyo)) {
                ((ynz) a.a(uys.a).ai((char) 9177)).u("We are trying to access a global style from a non-global style namespace.");
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(tqtVar.b(((abcy) it2.next()).c));
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(tqtVar.b(((abcy) it3.next()).c));
            }
        }
        final tvz tvzVar = new tvz(this, this.c, this.i, this.f, this.k, this.j, this.g, utfVar, z, this.h);
        if (arrayList.isEmpty()) {
            ((ynz) ((ynz) a.h()).ai((char) 9175)).u("Line has no style.");
            return tvzVar;
        }
        ajju ajjuVar = new ajju(arrayList.size(), new Runnable() { // from class: txh
            /* JADX WARN: Removed duplicated region for block: B:118:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 457
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.txh.run():void");
            }
        });
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((tqo) arrayList.get(i2)).c(new tvv(ajjuVar, 12));
        }
        return tvzVar;
    }

    public final void b(tvz tvzVar) {
        e(tvzVar);
        Set set = this.d;
        synchronized (set) {
            set.remove(tvzVar);
        }
        tvzVar.v();
    }

    public final void d(tvz tvzVar) {
        e(tvzVar);
        Set set = this.d;
        synchronized (set) {
            set.add(tvzVar);
        }
        tvzVar.x();
    }

    @Override // defpackage.uml
    public final void gp() {
        Set set = this.d;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((tyw) it.next()).u();
            }
        }
        Set set2 = this.e;
        synchronized (set2) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                ((tyw) it2.next()).u();
            }
        }
    }
}
