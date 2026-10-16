package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wij {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public wij(com.google.android.gearhead.appdecor.CarUiEntry carUiEntry, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        this.b = imageView;
        this.a = viewGroup;
        this.c = carUiEntry;
    }

    public final void a(boolean z) {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.b).getAndSet(true)) {
            return;
        }
        j$.time.Duration durationC = ((defpackage.xzg) this.a).c();
        j$.time.Duration duration = com.google.android.apps.auto.components.settings.interactivetroubleshooter.ChargeOnlyFragment.h;
        long millis = durationC.compareTo(duration) >= 0 ? 0L : duration.minus(durationC).toMillis();
        java.lang.Object obj = this.c;
        if (!z) {
            ((com.google.android.apps.auto.components.settings.interactivetroubleshooter.ChargeOnlyFragment) obj).j.postDelayed(new defpackage.lzk(obj, 13), millis);
            return;
        }
        android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) obj;
        defpackage.omv.i(fragment.requireContext(), defpackage.yyn.INTERACTIVE_TROUBLESHOOTER_CHARGE_ONLY_DETECTED);
        android.text.Spanned spannedFromHtml = android.text.Html.fromHtml(fragment.requireContext().getString(com.google.android.projection.gearhead.R.string.charge_only_failure_message, defpackage.acyl.d()));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("title_string_resource", com.google.android.projection.gearhead.R.string.charge_only_failure_title);
        bundle.putCharSequence("message_key", spannedFromHtml);
        ((com.google.android.apps.auto.components.settings.interactivetroubleshooter.ChargeOnlyFragment) obj).j.postDelayed(new defpackage.mbx(obj, bundle, 8), millis);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void b() {
        ?? r0 = this.a;
        if (r0 != 0) {
            r0.run();
            return;
        }
        ?? r1 = this.b;
        ((defpackage.fgj) this.c).o();
        r1.run();
    }

    public wij(com.google.android.gearhead.appdecor.CarUiEntry carUiEntry, com.google.android.gearhead.appdecor.StatusBarView statusBarView, defpackage.lbd lbdVar) {
        this.c = statusBarView;
        this.a = lbdVar;
        this.b = carUiEntry;
    }

    public wij(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    public /* synthetic */ wij(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte[] bArr) {
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ wij(java.lang.Runnable runnable, defpackage.fgj fgjVar, java.lang.Runnable runnable2) {
        this.a = runnable;
        this.c = fgjVar;
        this.b = runnable2;
    }

    public wij(defpackage.qs qsVar, defpackage.aiuw aiuwVar, defpackage.bys bysVar) {
        this.c = qsVar;
        this.a = aiuwVar;
        this.b = bysVar;
    }
}
