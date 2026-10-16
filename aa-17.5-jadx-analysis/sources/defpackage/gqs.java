package defpackage;

import android.graphics.Bitmap;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes2.dex */
final class gqs extends afde implements afej {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;

    public gqs(afck afckVar) {
        super(5, afckVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        ?? r6 = this.a;
        ?? r0 = this.b;
        Object obj2 = this.c;
        PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) this.d;
        int i = playbackStateCompat.a;
        if (i == 7) {
            ((ynz) grb.a.e().o(ypi.a, "CarApp.H.Media.Emitter").ai(75)).u("Playback state is ERROR");
            CharSequence charSequence = playbackStateCompat.g;
            String string = null;
            if (charSequence != null && !afyh.v(charSequence)) {
                string = charSequence.toString();
            }
            return new grc(string);
        }
        if (i == 0) {
            ((ynz) grb.a.e().o(ypi.a, "CarApp.H.Media.Emitter").ai(74)).u("Playback state is NONE; waiting");
            return grd.d;
        }
        if (!afyh.v(r6) || !afyh.v(r0) || obj2 != null) {
            return grd.a;
        }
        ((ynz) grb.a.e().o(ypi.a, "CarApp.H.Media.Emitter").ai(73)).u("Invalid title, subtitle, and image; waiting");
        return grd.d;
    }

    @Override // defpackage.afej
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gqs gqsVar = new gqs((afck) obj5);
        gqsVar.a = (CharSequence) obj;
        gqsVar.b = (CharSequence) obj2;
        gqsVar.c = (Bitmap) obj3;
        gqsVar.d = (PlaybackStateCompat) obj4;
        return gqsVar.hT(afak.a);
    }
}
