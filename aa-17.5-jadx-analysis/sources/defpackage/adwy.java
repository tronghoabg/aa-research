package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class adwy extends adlg {
    final /* synthetic */ adxb a;
    private final adxb b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public adwy(adxb adxbVar, adxb adxbVar2) {
        this.a = adxbVar;
        this.b = adxbVar2;
    }

    @Override // defpackage.adlg
    public final adlc a(adld adldVar) {
        if (this.c.compareAndSet(false, true)) {
            this.a.i.c().execute(new aduy((adli) this.b, 14));
        }
        return adlc.d("pick_first: requesting connection");
    }
}
