package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ocy implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ocy(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, odk] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                this.a.a();
                return;
            case 1:
                ((defpackage.nye) this.a).c();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.ocx) this.a).i();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((odh) this.a).a();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((odz) this.a).a.b();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((odz) this.a).a.b();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a).c.abandonAudioFocus(null);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView standardDialpadView = (com.google.android.apps.auto.components.telecom.dialpad.StandardDialpadView) this.a;
                android.view.View view = standardDialpadView.f;
                view.getClass();
                if (view.isPressed()) {
                    standardDialpadView.f.setPressed(false);
                    standardDialpadView.f.performLongClick();
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.ofl) this.a).H();
                return;
            case 9:
                defpackage.yqm yqmVar = defpackage.ofv.a;
                ((defpackage.ofv) ((ofp) this.a).a).B();
                return;
            case 10:
                defpackage.ofv ofvVar = ((defpackage.ohl) this.a).a;
                java.util.Iterator it = ofvVar.b.iterator();
                while (it.hasNext()) {
                    ((defpackage.omf) it.next()).e(ofvVar.d());
                }
                return;
            case 11:
                ((com.google.android.apps.auto.components.ui.media.MediaPlaybackView) this.a).o.g();
                return;
            case 12:
                com.google.android.apps.auto.components.ui.media.MediaPlaybackView mediaPlaybackView = (com.google.android.apps.auto.components.ui.media.MediaPlaybackView) this.a;
                mediaPlaybackView.e();
                mediaPlaybackView.removeCallbacks(this);
                mediaPlaybackView.postDelayed(this, 500L);
                return;
            case 13:
                onq onqVar = (onq) this.a;
                com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackStateC = onqVar.b.c();
                if (aaPlaybackStateC != null) {
                    ajnd ajndVar = onqVar.g;
                    ajndVar.l(false);
                    ajndVar.m(defpackage.onn.a(aaPlaybackStateC), 1);
                }
                android.os.Handler handler = onqVar.d;
                handler.removeCallbacks(this);
                handler.postDelayed(this, 500L);
                return;
            case 14:
                ((onq) this.a).g.l(true);
                return;
            case 15:
                com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator seekableLinearProgressIndicator = (com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator) this.a;
                seekableLinearProgressIndicator.h.n(seekableLinearProgressIndicator.a());
                if (defpackage.mlv.r(seekableLinearProgressIndicator.f)) {
                    seekableLinearProgressIndicator.f = 4;
                    return;
                }
                return;
            case 16:
                int i = com.google.android.apps.auto.components.ui.telecom.MaterialUnCallView.q;
                com.google.android.apps.auto.components.ui.telecom.MaterialUnCallView materialUnCallView = (com.google.android.apps.auto.components.ui.telecom.MaterialUnCallView) this.a;
                materialUnCallView.f(materialUnCallView.a);
                materialUnCallView.d.postDelayed(materialUnCallView.o, 1000L);
                return;
            case 17:
                int i2 = com.google.android.apps.auto.components.ui.telecom.UnCallView.n;
                com.google.android.apps.auto.components.ui.telecom.UnCallView unCallView = (com.google.android.apps.auto.components.ui.telecom.UnCallView) this.a;
                unCallView.e(unCallView.a);
                unCallView.c.postDelayed(unCallView.l, 1000L);
                return;
            case 18:
                if ((defpackage.nte.c().h() && (defpackage.nte.c().b().m().equals(defpackage.nti.f) || defpackage.nte.c().b().m().equals(defpackage.nti.g) || defpackage.nte.c().b().m().equals(defpackage.nti.h))) || defpackage.acyc.at()) {
                    defpackage.ool oolVar = (defpackage.ool) this.a;
                    defpackage.oor oorVar = oolVar.c;
                    defpackage.zhs zhsVarSubmit = oorVar.f.submit(new ooq(oorVar));
                    android.os.Handler handler2 = oolVar.b;
                    handler2.getClass();
                    defpackage.ysr.cy(zhsVarSubmit, oolVar.f, new defpackage.czu(handler2, 5));
                    return;
                }
                return;
            case 19:
                oow oowVar = (oow) this.a;
                oowVar.updateAppWidget(new android.widget.RemoteViews(oowVar.getAppWidgetInfo().provider.getPackageName(), 0));
                return;
            default:
                java.lang.Object obj = this.a;
                synchronized (obj) {
                    j$.util.Optional optional = ((orc) obj).e;
                    optional.getClass();
                    if (optional.isPresent()) {
                        return;
                    }
                    java.util.function.Consumer consumer = ((orc) obj).c;
                    consumer.getClass();
                    a$.ExternalSyntheticApiModelOutline2.m(consumer, new orb());
                    return;
                }
        }
    }

    public ocy(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
