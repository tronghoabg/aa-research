package defpackage;

import android.media.AudioManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class iol implements AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int a = 0;
    private final /* synthetic */ int b;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            ((ype) ((ype) ioq.E.f()).ai((char) 840)).w("onAudioFocusChange: %d", i);
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                throw null;
            }
            if (i2 == 3) {
                yph yphVar = kcc.a;
            } else {
                if (i2 == 4) {
                    throw null;
                }
                if (i2 != 5) {
                    rfq.a.d().ai(7957).w("Received focus change: %d", i);
                }
            }
        }
    }
}
