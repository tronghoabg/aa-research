package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class off implements lhg {
    public static final yph a = yph.c("GH.CallActDisambigMgr");
    public ofe b;
    public ajmd c;
    private final Context d;
    private final ebf e = new ofd(this);

    public off(Context context) {
        this.d = context;
    }

    public static off a() {
        return (off) mki.a.i(off.class);
    }

    private final void e() {
        if (this.b == null) {
            ((ype) ((ype) a.h()).ai((char) 5820)).u("Canceling disambiguation when disambiguation is not active.");
            return;
        }
        this.b = null;
        ajmd ajmdVar = this.c;
        if (ajmdVar != null) {
            ((ype) juk.a.l().ai((char) 2769)).u("Call account disambiguation info removed.");
            juk jukVar = (juk) ajmdVar.a;
            if (jukVar.e != null) {
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_FACET, yzy.aB).l());
            }
            jukVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.off.b():void");
    }

    @Override // defpackage.lhg
    public final void c() {
        ebf.A().D(this.e);
    }

    @Override // defpackage.lhg
    public final void d() {
        ebf.A().E(this.e);
        if (this.b != null) {
            e();
        }
    }
}
