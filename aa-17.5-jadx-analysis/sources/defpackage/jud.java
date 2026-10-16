package defpackage;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class jud implements xxj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jud(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xxj
    public final boolean a(Object obj) {
        switch (this.b) {
            case 0:
                ComponentName componentName = (ComponentName) obj;
                int i = juf.m;
                if (componentName != null) {
                    if (componentName.getPackageName().equals(this.a)) {
                    }
                }
                break;
            case 1:
                yph yphVar = jmm.a;
                break;
            case 2:
                int i2 = jyr.a;
                break;
            case 3:
                int i3 = jyu.a;
                break;
            case 4:
                break;
            case 5:
                yph yphVar2 = orf.a;
                break;
            case 6:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                int i4 = qho.a;
                if (resolveInfo.serviceInfo != null) {
                    Object obj2 = this.a;
                    rji rjiVar = rji.b;
                    rji rjiVar2 = (rji) obj2;
                    woy.ad(rjiVar2.equals(rjiVar) || rjiVar2.equals(rji.c), "Not allowed to filter services for carDisplayType: %s", obj2);
                    if (kmo.c(rjiVar2.equals(rjiVar) ? actz.e() : actz.d(), new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name).flattenToString())) {
                    }
                }
                break;
            case 7:
                abcs abcsVar = (abcs) obj;
                abnh abnhVar = abbf.W;
                abcsVar.j(abnhVar);
                abnl abnlVar = abcsVar.w;
                abnu abnuVar = abnhVar.d;
                if (abnlVar.m(abnuVar) && !uxa.b(abcsVar)) {
                    abcsVar.j(abnhVar);
                    Object objJ = abcsVar.w.j(abnuVar);
                    Iterator<E> it = ((aazu) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).b.iterator();
                    while (it.hasNext()) {
                        toc tocVarE = toc.e(((aazt) it.next()).c);
                        if (tocVarE != null) {
                            if (((ygr) this.a).contains(tocVarE.f())) {
                                break;
                            }
                        }
                    }
                    break;
                }
                break;
            case 8:
                abcs abcsVar2 = (abcs) obj;
                abnh abnhVar2 = abbf.J;
                abcsVar2.j(abnhVar2);
                Object objJ2 = abcsVar2.w.j(abnhVar2.d);
                long j = ((abxg) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2))).c;
                if (j != 0) {
                    if (((ygr) this.a).contains(Long.valueOf(j))) {
                    }
                }
                break;
            default:
                abcs abcsVar3 = (abcs) obj;
                if ((abcsVar3.b & 8) != 0) {
                    int i5 = abcsVar3.i;
                    if (i5 == 1792 || i5 == 2792) {
                        abjm abjmVar = (abjm) this.a;
                        if (((abjmVar.b == 2 ? (abhs) abjmVar.c : abhs.a).b & 1) != 0) {
                            long j2 = (abjmVar.b == 2 ? (abhs) abjmVar.c : abhs.a).c;
                            abnh abnhVar3 = abbf.V;
                            abcsVar3.j(abnhVar3);
                            Object objJ3 = abcsVar3.w.j(abnhVar3.d);
                            if (j2 != ((abcd) (objJ3 == null ? abnhVar3.b : abnhVar3.c(objJ3))).g || abcsVar3.i == 2792) {
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }
}
