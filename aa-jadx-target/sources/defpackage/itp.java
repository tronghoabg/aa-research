package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class itp implements defpackage.itl {
    private final android.media.audiopolicy.AudioPolicy.Builder a;
    private final java.util.List b = new java.util.ArrayList();
    private final android.content.Context c;

    public itp(android.content.Context context) {
        this.a = new android.media.audiopolicy.AudioPolicy.Builder(context);
        this.c = context;
    }

    private final int g(android.media.audiopolicy.AudioMix audioMix) {
        this.a.addMix(audioMix);
        java.util.List list = this.b;
        list.add(audioMix);
        return list.size() - 1;
    }

    @Override // defpackage.itl
    public final int a(int i, int i2, int i3) {
        android.media.audiopolicy.AudioMix audioMixF = defpackage.itq.f(i3);
        if (audioMixF != null) {
            return g(audioMixF);
        }
        return -1;
    }

    @Override // defpackage.itl
    public final /* bridge */ /* synthetic */ defpackage.itm b() throws android.os.RemoteException {
        return new defpackage.itq(this.a.build(), defpackage.ygw.o(this.b), this.c);
    }

    @Override // defpackage.itl
    public final int c(defpackage.ygw ygwVar) {
        return g(defpackage.itq.e(48000, 12, ygwVar));
    }

    @Override // defpackage.itl
    public final int d(defpackage.ygw ygwVar, int i) {
        return g(defpackage.itq.e(i, 16, ygwVar));
    }

    @Override // defpackage.itl
    public final /* bridge */ /* synthetic */ void e(defpackage.itk itkVar) {
        this.a.setAudioPolicyFocusListener(new defpackage.ito(itkVar));
    }

    @Override // defpackage.itl
    public final /* bridge */ /* synthetic */ void f(android.os.Looper looper) {
        this.a.setLooper(looper);
    }
}
