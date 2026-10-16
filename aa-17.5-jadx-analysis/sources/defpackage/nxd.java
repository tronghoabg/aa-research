package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class nxd implements afdr {
    public final /* synthetic */ bwq a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nxd(aitx aitxVar, List list, axr axrVar, SnapshotStateList snapshotStateList, afec afecVar, bwq bwqVar, int i) {
        this.g = i;
        this.b = aitxVar;
        this.c = list;
        this.d = axrVar;
        this.e = snapshotStateList;
        this.f = afecVar;
        this.a = bwqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [afec, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        List listH;
        if (this.g == 0) {
            ?? r0 = this.b;
            yph yphVar = nxm.a;
            bwq bwqVar = this.a;
            ahnc.d(r0, null, 0, new nxi(this.c, (axr) this.d, (SnapshotStateList) this.e, this.f, bwqVar, null), 3);
            return afak.a;
        }
        bwq bwqVar2 = this.a;
        ?? r2 = this.d;
        yph yphVar2 = myv.a;
        if (((Boolean) r2.a()).booleanValue() || (listH = myv.h(bwqVar2)) == null || listH.isEmpty()) {
            ?? r3 = this.e;
            bwqVar2.b(myv.i(roc.ag(this.c), myv.c(this.f), myv.b(this.b)));
            r2.b(Boolean.valueOf(false));
            r3.b(Boolean.valueOf(true));
            myv.a.l().y("MediaSwitcher resumed, restoring stable items with %s", myv.h(bwqVar2));
        }
        return afak.a;
    }

    public /* synthetic */ nxd(bwq bwqVar, bwq bwqVar2, bym bymVar, bym bymVar2, bym bymVar3, bwq bwqVar3, int i) {
        this.g = i;
        this.d = bwqVar;
        this.a = bwqVar2;
        this.c = bymVar;
        this.f = bymVar2;
        this.b = bymVar3;
        this.e = bwqVar3;
    }
}
