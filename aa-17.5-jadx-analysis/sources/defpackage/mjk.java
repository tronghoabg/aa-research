package defpackage;

import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes2.dex */
public final class mjk implements epf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mjk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        if (this.b != 0) {
            eqaVar.getLifecycle().d(this);
            Object obj = this.a;
            ((knc) obj).c.post(new kea(obj, 16));
            ((ype) knc.a.l().ai((char) 3245)).u("Stopping");
            return;
        }
        mjm mjmVar = (mjm) this.a;
        mjmVar.e = null;
        MediaSessionCompat mediaSessionCompat = mjmVar.b;
        mediaSessionCompat.e(false);
        mediaSessionCompat.d();
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
