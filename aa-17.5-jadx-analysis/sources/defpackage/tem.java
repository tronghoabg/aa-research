package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class tem implements emj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tem(ffy ffyVar, int i) {
        this.b = i;
        this.a = ffyVar;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [afck, java.lang.Object] */
    @Override // defpackage.emj
    public final void a(emm emmVar, boolean z, float f) {
        int i = this.b;
        if (i == 0) {
            this.a.w(afak.a);
            return;
        }
        if (i != 1) {
            ArrayList arrayList = emmVar.r;
            int iIndexOf = arrayList.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList.set(iIndexOf, null);
            }
            ((wkm) this.a).d();
            return;
        }
        if (z) {
            return;
        }
        Object obj = this.a;
        if (f >= 1.0f) {
            fgc fgcVar = ((ffy) obj).g;
            fgcVar.u(fgcVar, fgb.b, false);
            return;
        }
        ffy ffyVar = (ffy) obj;
        long jH = ffyVar.h();
        fgc fgcVar2 = ffyVar.g;
        fgc fgcVarG = ((fgm) fgcVar2).g(0);
        fgc fgcVar3 = fgcVarG.r;
        fgcVarG.r = null;
        fgcVar2.z(-1L, ffyVar.a);
        fgcVar2.z(jH, -1L);
        ffyVar.a = jH;
        Runnable runnable = ffyVar.f;
        if (runnable != null) {
            runnable.run();
        }
        fgcVar2.s.clear();
        if (fgcVar3 != null) {
            fgcVar3.u(fgcVar3, fgb.b, true);
        }
    }

    public tem(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
