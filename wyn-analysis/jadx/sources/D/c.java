package D;

import Hf.InterfaceC0603m;
import N.V;
import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;

/* loaded from: classes.dex */
public final class c implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f2240c;

    public /* synthetic */ c(ArrayList arrayList, V v2, int i5) {
        this.f2238a = i5;
        this.f2239b = arrayList;
        this.f2240c = v2;
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        switch (this.f2238a) {
            case 0:
                h hVar = (h) obj;
                boolean z2 = hVar instanceof a;
                ArrayList arrayList = this.f2239b;
                if (z2) {
                    arrayList.add(hVar);
                } else if (hVar instanceof b) {
                    arrayList.remove(((b) hVar).f2237a);
                }
                this.f2240c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                h hVar2 = (h) obj;
                boolean z10 = hVar2 instanceof e;
                ArrayList arrayList2 = this.f2239b;
                if (z10) {
                    arrayList2.add(hVar2);
                } else if (hVar2 instanceof f) {
                    arrayList2.remove(((f) hVar2).f2244a);
                }
                this.f2240c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                h hVar3 = (h) obj;
                boolean z11 = hVar3 instanceof k;
                ArrayList arrayList3 = this.f2239b;
                if (z11) {
                    arrayList3.add(hVar3);
                } else if (hVar3 instanceof l) {
                    arrayList3.remove(((l) hVar3).f2251a);
                } else if (hVar3 instanceof j) {
                    arrayList3.remove(((j) hVar3).f2249a);
                }
                this.f2240c.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return C2515C.f34653a;
    }
}
