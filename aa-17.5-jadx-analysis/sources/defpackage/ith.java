package defpackage;

import android.content.Context;
import android.media.audiopolicy.AudioMix;
import android.media.audiopolicy.AudioPolicy;
import android.os.Looper;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ith implements itd {
    private final AudioPolicy.Builder a;
    private final List b = new ArrayList();
    private final Context c;

    public ith(Context context) {
        this.a = new AudioPolicy.Builder(context);
        this.c = context;
    }

    private final int g(AudioMix audioMix) {
        this.a.addMix(audioMix);
        this.b.add(audioMix);
        return r1.size() - 1;
    }

    @Override // defpackage.itd
    public final int a(int i, int i2, int i3) throws IllegalArgumentException {
        AudioMix audioMixF = iti.f(i3);
        if (audioMixF != null) {
            return g(audioMixF);
        }
        return -1;
    }

    @Override // defpackage.itd
    public final /* bridge */ /* synthetic */ ite b() throws RemoteException {
        return new iti(this.a.build(), yfq.o(this.b), this.c);
    }

    @Override // defpackage.itd
    public final int c(yfq yfqVar) {
        return g(iti.e(48000, 12, yfqVar));
    }

    @Override // defpackage.itd
    public final int d(yfq yfqVar, int i) {
        return g(iti.e(i, 16, yfqVar));
    }

    @Override // defpackage.itd
    public final /* bridge */ /* synthetic */ void e(itc itcVar) {
        this.a.setAudioPolicyFocusListener(new itg(itcVar));
    }

    @Override // defpackage.itd
    public final /* bridge */ /* synthetic */ void f(Looper looper) {
        this.a.setLooper(looper);
    }
}
