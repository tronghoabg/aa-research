package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class dcy implements ScrollCaptureCallback {
    public static final /* synthetic */ int d = 0;
    public final ddu a;
    public final ddc b;
    public final kwp c;
    private final dlp e;
    private final View f;
    private final aitx g;

    public dcy(ddu dduVar, dlp dlpVar, aitx aitxVar, kwp kwpVar, View view) {
        this.a = dduVar;
        this.e = dlpVar;
        this.c = kwpVar;
        this.f = view;
        this.g = ahni.d(aitxVar, dda.b);
        this.b = new ddc(dlpVar.a(), new gjb(this, (afck) null, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r8, defpackage.dlp r9, defpackage.afck r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcy.a(android.view.ScrollCaptureSession, dlp, afck):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ahnc.d(this.g, aivt.a, 0, new bns(this, runnable, (afck) null, 16), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final aivh aivhVarD = ahnc.d(this.g, null, 0, new dcw(this, scrollCaptureSession, rect, consumer, null), 3);
        aivhVarD.p(new chk(cancellationSignal, 19));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: dcz
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                aivhVarD.s(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ckf.d(this.e));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.b.b = BitmapDescriptorFactory.HUE_RED;
        this.c.l(true);
        runnable.run();
    }
}
