package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class tts extends ttz {
    private final Set f;
    private final too g;
    private tpj h;
    private float i;
    private final float j;
    private boolean k;
    private usy l;

    public tts(abgl abglVar, int i, ukz ukzVar) {
        super(abglVar, ukzVar);
        this.f = new aeul(16);
        this.g = new too();
        this.k = true;
        this.j = i * i;
    }

    private final void g(List list, ukp ukpVar, too tooVar, boolean z) {
        tpj tpjVar = this.h;
        tpjVar.getClass();
        if (!z || tpjVar.j(ukpVar.d())) {
            this.l.getClass();
            int i = ukpVar.a;
            int i2 = 536870912 >> i;
            too tooVar2 = this.g;
            tooVar2.r(ukpVar.e + i2, ukpVar.f + i2);
            float fRound = Math.round((((i2 + i2) * this.l.c()) * this.l.j()) / this.l.e(tooVar2, true));
            if (Math.round(fRound * this.i * fRound) <= this.j || i >= 30) {
                list.add(ukpVar);
                h(ukpVar);
                return;
            }
            List listC = c(ukpVar, tooVar);
            if (listC.isEmpty()) {
                list.add(ukpVar);
                h(ukpVar);
            } else {
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    g(list, (ukp) it.next(), tooVar, true);
                }
            }
        }
    }

    private final void h(ukp ukpVar) {
        if (!this.k || this.f.contains(ukpVar)) {
            return;
        }
        this.k = false;
        this.b++;
    }

    @Override // defpackage.ttv
    @ResultIgnorabilityUnspecified
    public final synchronized long a(usy usyVar, List list) {
        list.clear();
        usz uszVarP = usyVar.p();
        if (uszVarP == this.d) {
            Set set = this.f;
            if (!set.isEmpty()) {
                list.addAll(set);
                return this.b;
            }
        }
        this.k = true;
        tpj tpjVarN = usyVar.n();
        this.h = tpjVarN;
        too[] tooVarArr = tpjVarN.b.a;
        float fC = tooVarArr[3].c(tooVarArr[2]);
        uky ukyVarE = e(usyVar.l());
        float f = usyVar.f();
        float fK = usyVar.k();
        int i = tsw.a;
        int iA = ukyVarE.a(30.0f - uzg.a((fC / fK) * (f * 256.0f)));
        this.l = usyVar;
        this.i = (float) Math.cos(usyVar.o().m * 0.017453292519943295d);
        ArrayList arrayList = new ArrayList();
        ukp.j(this.h.c, iA, arrayList, null);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g(list, (ukp) arrayList.get(i2), usyVar.l(), false);
        }
        Set set2 = this.f;
        set2.clear();
        set2.addAll(list);
        f(list, usyVar.o().h);
        this.d = uszVarP;
        return this.b;
    }
}
