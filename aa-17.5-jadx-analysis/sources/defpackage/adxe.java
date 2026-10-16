package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class adxe extends adlg {
    final /* synthetic */ adxf a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public adxe(adxf adxfVar) {
        this.a = adxfVar;
    }

    @Override // defpackage.adlg
    public final adlc a(adld adldVar) {
        if (this.b.compareAndSet(false, true)) {
            adxf adxfVar = this.a;
            adxfVar.g.c().execute(new aduy((adli) adxfVar, 15));
        }
        return adlc.d("pick_first: requesting connection");
    }
}
