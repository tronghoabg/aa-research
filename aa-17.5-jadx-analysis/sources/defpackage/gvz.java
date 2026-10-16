package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gvz implements aiyl {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public gvz(axr axrVar, ajju ajjuVar, hcl hclVar, int i) {
        this.d = i;
        this.a = axrVar;
        this.c = ajjuVar;
        this.b = hclVar;
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aiyl
    public final /* synthetic */ Object a(Object obj, afck afckVar) {
        int i = this.d;
        boolean z = false;
        if (i == 0) {
            Object obj2 = this.a;
            hju hjuVar = (hju) obj;
            gwa gwaVar = (gwa) obj2;
            gwaVar.b = hjuVar;
            affq affqVar = (affq) this.b;
            if (affqVar.a) {
                gwaVar.a.c();
                affqVar.a = false;
            }
            gfh gfhVar = gwaVar.a;
            gzc gzcVar = ((hlf) obj2).o;
            gzcVar.getClass();
            gfhVar.e(gzcVar);
            gfhVar.d(hjuVar, String.valueOf(((gwc) this.c).hashCode()));
            return afak.a;
        }
        if (i == 1) {
            asd asdVar = (asd) obj;
            if (asdVar instanceof asa) {
                this.c.add(asdVar);
            } else if (asdVar instanceof asb) {
                this.c.remove(((asb) asdVar).a);
            } else if (asdVar instanceof ary) {
                this.c.add(asdVar);
            } else if (asdVar instanceof arz) {
                this.c.remove(((arz) asdVar).a);
            } else if (asdVar instanceof asi) {
                this.c.add(asdVar);
            } else if (asdVar instanceof asj) {
                this.c.remove(((asj) asdVar).a);
            } else if (asdVar instanceof ash) {
                this.c.remove(((ash) asdVar).a);
            }
            ahnc.d(this.b, null, 0, new bns((bnw) this.a, (asd) woy.bL(this.c), (afck) null, 0), 3);
            return afak.a;
        }
        aezu aezuVar = (aezu) obj;
        int iIntValue = ((Number) aezuVar.a).intValue();
        int iIntValue2 = ((Number) aezuVar.b).intValue();
        List list = ((axr) this.a).l().j;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((axk) it.next()).a));
        }
        Object obj3 = this.c;
        if (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == 0) {
            ?? r2 = ((ajju) obj3).b;
            aezu aezuVar2 = (aezu) r2.get(arrayList.get(0));
            if (aezuVar2 != null) {
                hck hckVar = (hck) aezuVar2.a;
                int size = arrayList.size();
                int i2 = 1;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    aezu aezuVar3 = (aezu) r2.get(Integer.valueOf(((Number) arrayList.get(i2)).intValue()));
                    if (aezuVar3 != null && hckVar != ((hck) aezuVar3.a)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
        }
        afeh afehVar = ((hcl) this.b).e;
        if (afehVar != null) {
            afehVar.invoke(new Integer(iIntValue), new Integer(iIntValue2), Boolean.valueOf(z));
        }
        return afak.a;
    }

    public gvz(gwa gwaVar, affq affqVar, gwc gwcVar, int i) {
        this.d = i;
        this.a = gwaVar;
        this.b = affqVar;
        this.c = gwcVar;
    }

    public gvz(List list, aitx aitxVar, bnw bnwVar, int i) {
        this.d = i;
        this.c = list;
        this.b = aitxVar;
        this.a = bnwVar;
    }
}
