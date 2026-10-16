package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class goo implements aiyl {
    final /* synthetic */ aiyl a;

    public goo(aiyl aiylVar) {
        this.a = aiylVar;
    }

    @Override // defpackage.aiyl
    public final Object a(Object obj, afck afckVar) {
        hju hktVar = (hju) obj;
        if (hktVar instanceof hkt) {
            hkt hktVar2 = (hkt) hktVar;
            hju hjuVar = hktVar2.b;
            hcl hclVar = hjuVar instanceof hcl ? (hcl) hjuVar : null;
            if (hclVar != null) {
                List<Object> list = hclVar.a;
                int i = 10;
                ArrayList arrayList = new ArrayList(woy.bp(list, 10));
                for (Object objD : list) {
                    if (objD instanceof hck) {
                        hck hckVar = (hck) objD;
                        List<hcc> list2 = hckVar.a;
                        ArrayList arrayList2 = new ArrayList(woy.bp(list2, i));
                        for (hcc hdfVar : list2) {
                            if (hdfVar instanceof hdf) {
                                hdf hdfVar2 = (hdf) hdfVar;
                                hju hjuVar2 = hdfVar2.d;
                                if ((hjuVar2 instanceof hdl) && ((hdl) hjuVar2).d) {
                                    List list3 = hdfVar2.e;
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj2 : list3) {
                                        if (obj2 instanceof hdn) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList(woy.bp(arrayList3, i));
                                    Iterator it = arrayList3.iterator();
                                    while (it.hasNext()) {
                                        arrayList4.add(((hdn) it.next()).a);
                                    }
                                    hju hjuVar3 = hdfVar2.f;
                                    if (true != (hjuVar3 instanceof hdc)) {
                                        hjuVar3 = null;
                                    }
                                    List listBY = woy.bY(arrayList4, hjuVar3 != null ? ((hdc) hjuVar3).a : afbe.a);
                                    if (listBY.isEmpty()) {
                                        hdfVar = hdfVar2;
                                    } else {
                                        hju hjuVarC = (hju) woy.bK(listBY);
                                        List listBS = woy.bS(listBY, 1);
                                        hju hjuVar4 = hjuVarC instanceof hlc ? ((hlc) hjuVarC).a : hjuVarC;
                                        if (hjuVar4 instanceof fya) {
                                            hjuVar4 = ((fya) hjuVar4).a;
                                        }
                                        if (hjuVar4 instanceof fwy) {
                                            hjuVarC = fwy.c((fwy) hjuVar4, null, null, true, null, 95);
                                        } else if (hjuVar4 instanceof fwu) {
                                            hjuVarC = fwy.c(((fwu) hjuVar4).b, null, null, true, null, 95);
                                        }
                                        ArrayList arrayList5 = new ArrayList(woy.bp(listBS, i));
                                        Iterator it2 = listBS.iterator();
                                        while (it2.hasNext()) {
                                            arrayList5.add(new hdn((hju) it2.next(), true));
                                        }
                                        hdfVar = new hdf(hdfVar2.a, hdfVar2.b, hdfVar2.c, hjuVar2, arrayList5, new hdc(woy.bg(hjuVarC), 2), hdfVar2.g);
                                    }
                                }
                            }
                            arrayList2.add(hdfVar);
                            i = 10;
                        }
                        objD = hck.d(hckVar, arrayList2);
                    } else if (!(objD instanceof hbn) && !(objD instanceof hcp)) {
                        throw new aezs();
                    }
                    arrayList.add(objD);
                    i = 10;
                }
                hktVar = new hkt(hktVar2.a, new hcl(arrayList, hclVar.b, hclVar.c, hclVar.d, hclVar.e, hclVar.f), hktVar2.c, hktVar2.d, hktVar2.e, hktVar2.f, hktVar2.g, hktVar2.h);
            }
        }
        Object objA = this.a.a(hktVar, afckVar);
        return objA == afcr.a ? objA : afak.a;
    }
}
