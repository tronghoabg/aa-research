package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ior implements android.media.AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.iow.E.f()).ai((char) 840)).w("onAudioFocusChange: %d", i);
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                throw null;
            }
            if (i2 == 3) {
                defpackage.yqm yqmVar = defpackage.kce.a;
            } else {
                if (i2 == 4) {
                    throw null;
                }
                if (i2 != 5) {
                    defpackage.rgl.a.d().ai(7982).w("Received focus change: %d", i);
                }
            }
        }
    }
}
