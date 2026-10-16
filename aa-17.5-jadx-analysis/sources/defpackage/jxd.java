package defpackage;

import android.content.ComponentName;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class jxd extends gqb {
    public static final yph a = yph.c("GH.MediaPBService");
    private final eqm b;
    private final usw c;

    public jxd() {
        eqm eqmVar = new eqm();
        this.b = eqmVar;
        this.c = new usw(lmi.a.a().d() ? lto.b(yzz.APP_HOST_CONTEXT, eqmVar, eqy.c(eqmVar, new jxa(2)), new mzw(1)) : lto.a(yzz.APP_HOST_CONTEXT, eqmVar, lto.d()));
    }

    @Override // defpackage.gqb
    public final void b(MediaSessionCompat.Token token, ComponentName componentName, boolean z) {
        ComponentName componentName2;
        if (!z) {
            loy loyVarJ = loy.j();
            tcs tcsVar = loyVarJ.g;
            lod lodVar = (lod) tcsVar.get(componentName);
            if (lodVar == null || !lodVar.b().equals(token)) {
                lnm.a();
                lmb lmbVar = new lmb(loyVarJ.b, new llu(token));
                if (lmbVar.R() == null || !lmbVar.R().equals(componentName.getPackageName())) {
                    throw new IllegalStateException("No controller exists for provided session token!");
                }
                lod lodVar2 = new lod(lok.b, loyVarJ.g(componentName), lmbVar);
                ((ype) loy.a.l().ai((char) 4128)).M("Register session token new connection %s %s", Integer.toHexString(System.identityHashCode(lodVar2)), lodVar2);
                tcsVar.put(componentName, lodVar2);
            }
            this.b.m(componentName);
            return;
        }
        eqm eqmVar = this.b;
        loy loyVarJ2 = loy.j();
        Iterator it = loyVarJ2.d.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                if (acsx.w()) {
                    for (lod lodVar3 : loyVarJ2.g.a()) {
                        if (lodVar3.b().equals(token)) {
                            ((ype) loy.a.l().ai((char) 4117)).u("Found controller component through CAL connection store");
                            componentName2 = lodVar3.c.a;
                        }
                    }
                }
                throw new IllegalStateException("No connection exists for provided session token!");
            }
            lox loxVar = (lox) it.next();
            loj lojVar = (loj) loxVar.a.e();
            if (!(lojVar instanceof lnr) || !((MediaSessionCompat.Token) ((lnr) lojVar).c.L().b).equals(token)) {
                lol lolVar = (lol) loxVar.b.e();
                if ((lolVar instanceof lod) && ((lod) lolVar).b().equals(token)) {
                    ((ype) loy.a.l().ai((char) 4118)).u("Found controller component through MBS connection store pair");
                    componentName2 = lolVar.d().a;
                    break;
                }
            } else {
                ((ype) loy.a.l().ai((char) 4119)).u("Found browser component through MBS connection store pair");
                componentName2 = lojVar.d().a;
                break;
            }
        }
        eqmVar.m(componentName2);
    }

    @Override // defpackage.gqb
    public final void c(ComponentName componentName) {
        this.b.m(componentName);
    }

    @Override // defpackage.gqb
    public final usw d() {
        return this.c;
    }
}
