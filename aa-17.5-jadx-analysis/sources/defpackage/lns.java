package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class lns extends llu {
    final /* synthetic */ lnt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lns(lnt lntVar) {
        super((char[]) null);
        this.a = lntVar;
    }

    @Override // defpackage.llu
    public final void l(String str, Bundle bundle) {
        ype ypeVar = (ype) ((ype) lnu.d.h()).ai(4083);
        lnt lntVar = this.a;
        ypeVar.R("onError componentName=%s query=%s extras=%s", new zjd(zjc.a, lntVar.a.b.a.flattenToShortString()), str, bundle);
        lntVar.m(lpb.b(3));
    }

    @Override // defpackage.llu
    public final void m(String str, Bundle bundle, yfq yfqVar) {
        ype ypeVar = (ype) lnu.d.l().ai(4084);
        lnt lntVar = this.a;
        ypeVar.S("onSearchResult componentName=%s query=%s extras=%s size=%d", new zjd(zjc.a, lntVar.a.b.a.flattenToShortString()), str, bundle, Integer.valueOf(yfqVar.size()));
        lntVar.m(new log(yfqVar));
    }
}
