package defpackage;

import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class bih implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bih(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v36, types: [bjy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v39, types: [bjy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v42, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v46, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v60, types: [cwc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v64, types: [cwc, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        ty btwVar;
        tv bttVar;
        blx blxVar;
        blx blxVar2;
        switch (this.b) {
            case 0:
                Object systemService = ((View) ((bii) this.a).a).getContext().getSystemService("input_method");
                systemService.getClass();
                break;
            case 1:
                bid bidVar = (bid) this.a;
                asl.an(bidVar.c, bidVar.h);
                break;
            case 8:
                bjg bjgVar = (bjg) this.a;
                bjgVar.f();
                bjgVar.m();
                break;
            case 9:
                bjk bjkVar = (bjk) this.a;
                bjkVar.f();
                bjkVar.l();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                aef aefVar = blc.a;
                break;
            case 15:
                blr blrVar = (blr) this.a;
                deu deuVar = blrVar.f().a;
                long jT = czz.t(0, blrVar.f().a().length());
                long j = dfv.a;
                djv djvVar = new djv(deuVar, jT, (dfv) null);
                blrVar.c.invoke(djvVar);
                long j2 = djvVar.b;
                blrVar.o = new dfv(j2);
                blrVar.n = djv.b(blrVar.n, null, j2, 5);
                blrVar.j(true);
                break;
            case 16:
                afdr afdrVar = ((blr) this.a).f;
                if (afdrVar != null) {
                    afdrVar.invoke();
                }
                break;
            case 17:
                ?? r14 = this.a;
                if (((bpc) bzi.x(r14, bpe.b)) == null) {
                    bno bnoVar = (bno) r14;
                    cwd cwdVar = bnoVar.g;
                    if (cwdVar != null) {
                        ((cwe) r14).V(cwdVar);
                    }
                    bnoVar.g = null;
                } else {
                    bno bnoVar2 = (bno) r14;
                    if (bnoVar2.g == null) {
                        bpf bpfVar = new bpf(r14, 1);
                        bih bihVar = new bih(r14, 18);
                        ase aseVar = bnoVar2.a;
                        boolean z = bnoVar2.b;
                        float f = bnoVar2.c;
                        agl aglVar = btk.a;
                        cwe cweVar = new cwe(aseVar, z, f, bpfVar, bihVar);
                        ((cwe) r14).W(cweVar);
                        bnoVar2.g = cweVar;
                    }
                }
                break;
            case 18:
                ?? r142 = this.a;
                bor borVar = ((bog) bzi.x(r142, boh.a)).d;
                kgx kgxVar = (kgx) bzi.x(r142, bpe.a);
                bpc bpcVar = (bpc) bzi.x(r142, bpe.b);
                bno bnoVar3 = (bno) r142;
                float f2 = 0.1f;
                if (bnoVar3.e) {
                    btwVar = new btw((bpcVar == null || (blxVar2 = bpcVar.b) == null) ? 0.1f : blxVar2.d);
                } else {
                    btwVar = btv.b;
                }
                boolean z2 = bnoVar3.f;
                float f3 = BitmapDescriptorFactory.HUE_RED;
                if (z2) {
                    Object obj = kgxVar.a;
                    if (bpcVar != null && bpcVar.b != null) {
                        f2 = 0.0f;
                    }
                    bttVar = new btt(f2);
                } else {
                    bttVar = bts.a;
                }
                if (bpcVar == null || bpcVar.b == null) {
                    f3 = 0.08f;
                }
                btu btuVar = new btu(f3);
                float f4 = 0.16f;
                if (bpcVar != null && (blxVar = bpcVar.b) != null) {
                    f4 = blxVar.a;
                }
                break;
        }
        return ((bvv) this.a).ao();
    }
}
