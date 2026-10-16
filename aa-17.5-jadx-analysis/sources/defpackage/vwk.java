package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class vwk extends woy implements vsa, vqa {
    private final vqe a;
    private final aezk b;

    public vwk(vqe vqeVar, ackk ackkVar) {
        super(null, null);
        new AtomicBoolean();
        this.a = vqeVar;
        this.b = new vwj(ackkVar, 0);
    }

    @Override // defpackage.vqa
    public final void g(vky vkyVar) {
        this.a.b(this);
        vwh vwhVar = vwh.a;
        vsf vsfVar = vwhVar.c;
        vsf vsfVar2 = vwhVar.d;
        ((Boolean) this.b.a()).booleanValue();
        ((ynz) ((ynz) vlj.a.f()).ai((char) 9851)).u("missing firstDraw timestamp");
    }

    @Override // defpackage.vsa
    public final void k() {
        this.a.a(this);
    }

    @Override // defpackage.vqa
    public final /* synthetic */ void j(vky vkyVar) {
    }
}
