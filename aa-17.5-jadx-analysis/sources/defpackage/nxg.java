package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
final class nxg implements afdr {
    final /* synthetic */ int a;
    final /* synthetic */ List b;

    public nxg(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.afdr
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(this.a == woy.bh(this.b));
    }
}
