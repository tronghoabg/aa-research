package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.car.RadioProgramInfo;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class mjm {
    public static final yph a = yph.c("GH.Radio.Session");
    public final MediaSessionCompat b;
    public final mji c;
    public final min d;
    public RadioProgramInfo e;
    public final mit f;
    private final Context g;
    private final du h;
    private final mjg i;

    public mjm(Context context, mji mjiVar, min minVar, mjg mjgVar, eqa eqaVar, mit mitVar) {
        mjl mjlVar = new mjl(this);
        this.h = mjlVar;
        this.g = context;
        this.c = mjiVar;
        this.d = minVar;
        this.f = mitVar;
        this.i = mjgVar;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "Media.Projected.Radio");
        this.b = mediaSessionCompat;
        mediaSessionCompat.e(false);
        eb ebVar = new eb();
        ebVar.d(0, -1L, BitmapDescriptorFactory.HUE_RED);
        mediaSessionCompat.i(ebVar.a());
        Bundle bundle = new Bundle();
        bundle.putString("android.media.session.BROWSE_SERVICE", "com.google.android.apps.auto.components.radio.RadioMediaBrowserService");
        mediaSessionCompat.g(bundle);
        mediaSessionCompat.b.e();
        mediaSessionCompat.f(mjlVar, null);
        mjgVar.c.fE(eqaVar, new eqn() { // from class: mjj
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x034c  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0366  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0254  */
            /* JADX WARN: Type inference failed for: r0v5, types: [android.os.Parcelable] */
            /* JADX WARN: Type inference failed for: r0v61 */
            /* JADX WARN: Type inference failed for: r0v63 */
            /* JADX WARN: Type inference failed for: r4v11, types: [android.os.Bundle] */
            @Override // defpackage.eqn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void eS(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 912
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mjj.eS(java.lang.Object):void");
            }
        });
        mjgVar.d.fE(eqaVar, new lsh(this, 12));
        tby.m(tby.d(tby.u(mjgVar.c, null), mjgVar.d, new mqe(1)), Duration.ofMillis(150L), Duration.ofMillis(500L)).fE(eqaVar, new lsh(this, 13));
        mjiVar.i().fE(eqaVar, new lsh(this, 14));
        eqaVar.getLifecycle().c(new mjk(this, 0));
    }

    public final void a() {
        this.c.o(true);
        this.i.b(new mis(7, 2, this.g.getString(R.string.radio_selection_error)));
    }
}
