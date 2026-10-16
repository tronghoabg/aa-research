package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class beg implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ beg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [ben, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [ben, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [bho, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [bfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v39, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v43, types: [cwc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47, types: [cwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v50, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v54, types: [cwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v65, types: [cwd, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.a.a();
                return afak.a;
            case 1:
                this.a.d();
                return afak.a;
            case 2:
                bem bemVar = (bem) this.a;
                return new dlq(bep.a(bemVar.b, bemVar.e, bemVar.g));
            case 3:
                bfb bfbVar = (bfb) this.a;
                return Boolean.valueOf(bfbVar.b() < bfbVar.a());
            case 4:
                return Boolean.valueOf(((bfb) this.a).b() > BitmapDescriptorFactory.HUE_RED);
            case 5:
                bfh bfhVar = (bfh) this.a;
                deu deuVar = bfhVar.b;
                dft dftVarA = bfhVar.a();
                return Boolean.valueOf(affa.f(deuVar, dftVarA != null ? dftVarA.a.a : null));
            case 6:
                return new dlo(((dlp) this.a).d());
            case 7:
                return this.a.b();
            case 8:
                cst cstVar = (cst) this.a.a();
                if (cstVar != null) {
                    return cstVar;
                }
                asl.b("Required value was null.");
                throw new aezp();
            case 9:
                this.a.a();
                return afak.a;
            case 10:
                cst cstVar2 = (cst) this.a.a();
                if (cstVar2 != null) {
                    return cstVar2;
                }
                asl.b("Required value was null.");
                throw new aezp();
            case 11:
                ?? r5 = this.a;
                bgz bgzVar = (bgz) r5;
                bgzVar.b.b((Configuration) bzi.x(r5, daa.a));
                bgzVar.c.b((Context) bzi.x(r5, daa.b));
                return afak.a;
            case 12:
                ?? r52 = this.a;
                return ((cfx) r52).A ? awx.Z(r52) : bfu.a;
            case 13:
                cst cstVar3 = (cst) this.a.a();
                if (cstVar3 != null) {
                    return cstVar3;
                }
                asl.b("Required value was null.");
                throw new aezp();
            case 14:
                bzi.u(this.a);
                return afak.a;
            case 15:
                ((bid) this.a).f.j(true);
                return true;
            case 16:
                ((bid) this.a).f.y(true);
                return true;
            case 17:
                ((bid) this.a).f.z();
                return true;
            case 18:
                bzi.u(this.a);
                return afak.a;
            case 19:
                ((bid) this.a).f.A();
                return true;
            default:
                bid bidVar = (bid) this.a;
                bidVar.c.n.invoke(new djd(bidVar.g.f));
                return true;
        }
    }
}
