package defpackage;

import androidx.car.app.model.TabTemplate;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class gbz implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gbz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object, ut] */
    /* JADX WARN: Type inference failed for: r8v42, types: [bwq, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return Float.valueOf(((gcb) this.a).a);
            case 1:
                ((ieb) this.a).t();
                return afak.a;
            case 2:
                hmb hmbVar = hmb.a;
                ghw ghwVar = ghw.a;
                return new hmb(0, ((gff) this.a).c, false, ghw.a, null, true, 0);
            case 3:
                return Boolean.valueOf(((Number) ((adu) this.a).d()).floatValue() < 1.0f);
            case 4:
                return Boolean.valueOf(((cic) this.a).i(7, true));
            case 5:
                return Boolean.valueOf(((cic) this.a).i(7, true));
            case 6:
                return ((TabTemplate) this.a).getHeaderAction();
            case 7:
                return ((TabTemplate) this.a).getTabContents();
            case 8:
                return ((TabTemplate) this.a).getActiveTabContentId();
            case 9:
                this.a.sendContentRefreshRequested(new goe());
                return afak.a;
            case 10:
                gsf gsfVar = (gsf) ((gog) this.a).a.F(gsf.class);
                if (gsfVar.c()) {
                    gsfVar.b();
                }
                return afak.a;
            case 11:
                this.a.b(false);
                return afak.a;
            case 12:
                return Float.valueOf(((bqj) this.a).c());
            case 13:
                gsf gsfVar2 = (gsf) ((gsj) this.a).a.F(gsf.class);
                if (gsfVar2.c()) {
                    gsfVar2.b();
                }
                return afak.a;
            case 14:
                ((gsy) ((geu) this.a).F(gsy.class)).a();
                return afak.a;
            case 15:
                return Float.valueOf(((gdl) this.a).a());
            case 16:
                List listB = ((gtl) this.a).b();
                if (listB != null) {
                    return (gti) listB.get(0);
                }
                return null;
            case 17:
                List listB2 = ((gtl) this.a).b();
                if (listB2 != null) {
                    return (gti) listB2.get(1);
                }
                return null;
            case 18:
                return Float.valueOf(((byb) this.a).e());
            case 19:
                return ((gve) this.a).a.a();
            default:
                gzf gzfVar = (gzf) this.a;
                gzfVar.e = null;
                gzfVar.d.c(gzfVar.g);
                return afak.a;
        }
    }
}
