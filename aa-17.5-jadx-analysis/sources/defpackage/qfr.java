package defpackage;

import android.widget.ImageView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class qfr extends wpq {
    final /* synthetic */ ImageView a;
    final /* synthetic */ qfs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfr(qfs qfsVar, ImageView imageView) {
        super(null);
        this.a = imageView;
        this.b = qfsVar;
    }

    @Override // defpackage.wpq
    public final void a() {
        ((ype) qfs.a.l().ai((char) 7083)).u("onConnect");
        qfs qfsVar = this.b;
        if (qfsVar.d) {
            qfsVar.d = false;
            try {
                qfsVar.c.b(null);
            } catch (IllegalStateException e) {
                ((ype) ((ype) ((ype) qfs.a.h()).p(e)).ai((char) 7084)).u("failed to open demand space onConnect");
            }
        }
    }

    @Override // defpackage.wpq
    public final void b(int i) {
        ((ype) qfs.a.l().ai(7085)).w("onDemandSpaceStateChanged %d", i);
        if (this.a == null) {
            return;
        }
        qfs qfsVar = this.b;
        if (i == 3) {
            qfsVar.b.setImageResource(R.drawable.ic_mic_disabled_white);
        } else {
            qfsVar.b.setImageResource(R.drawable.ic_mic_enabled_white);
        }
    }
}
