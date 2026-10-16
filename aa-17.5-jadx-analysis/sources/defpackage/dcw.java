package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class dcw extends afde implements afeg {
    int a;
    final /* synthetic */ dcy b;
    final /* synthetic */ ScrollCaptureSession c;
    final /* synthetic */ Rect d;
    final /* synthetic */ Consumer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcw(dcy dcyVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, afck afckVar) {
        super(2, afckVar);
        this.b = dcyVar;
        this.c = scrollCaptureSession;
        this.d = rect;
        this.e = consumer;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new dcw(this.b, this.c, this.d, this.e, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        afcr afcrVar = afcr.a;
        int i = this.a;
        woy.dF(obj);
        if (i == 0) {
            dcy dcyVar = this.b;
            ScrollCaptureSession scrollCaptureSession = this.c;
            dlp dlpVarH = ckf.h(this.d);
            this.a = 1;
            obj = dcyVar.a(scrollCaptureSession, dlpVarH, this);
            if (obj == afcrVar) {
                return afcrVar;
            }
        }
        this.e.accept(ckf.d((dlp) obj));
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dcw) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
