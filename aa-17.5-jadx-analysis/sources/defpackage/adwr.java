package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class adwr implements admh {
    private final List a;
    private final admg b;

    public adwr(List list, admg admgVar) {
        this.a = yfq.o(list);
        this.b = admgVar;
    }

    @Override // defpackage.admh
    public final void a(admy admyVar, List list, List list2) {
        List list3 = admyVar.c;
        int size = list3.size();
        int i = ((yls) list).c;
        woy.Q(i == size, "Incorrect number of required labels provided. Expected: %s", list3.size());
        List list4 = admyVar.d;
        int size2 = list4.size();
        int i2 = ((yls) list2).c;
        woy.Q(i2 == size2, "Incorrect number of optional labels provided. Expected: %s", list4.size());
        for (admi admiVar : this.a) {
            if (admiVar.a() <= admyVar.a) {
                this.b.c();
                admiVar.d();
            }
            admiVar.b();
        }
    }

    @Override // defpackage.admh
    public final void b(admy admyVar, List list, List list2) {
        List list3 = admyVar.c;
        int size = list3.size();
        int i = ((yls) list).c;
        woy.Q(i == size, "Incorrect number of required labels provided. Expected: %s", list3.size());
        List list4 = admyVar.d;
        int size2 = list4.size();
        int i2 = ((yls) list2).c;
        woy.Q(i2 == size2, "Incorrect number of optional labels provided. Expected: %s", list4.size());
        for (admi admiVar : this.a) {
            if (admiVar.a() <= admyVar.a) {
                this.b.c();
                admiVar.d();
            }
            admiVar.c();
        }
    }
}
