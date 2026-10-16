package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class cw {
    final android.content.Context a;
    public final android.media.browse.MediaBrowser b;
    protected final android.os.Bundle c;
    public final defpackage.ct d = new defpackage.ct(this);
    public final defpackage.zd e = new defpackage.zd();
    public int f;
    public android.os.Messenger g;
    public android.support.v4.media.session.MediaSessionCompat.Token h;
    public defpackage.se i;

    public cw(android.content.Context context, android.content.ComponentName componentName, defpackage.cv cvVar, android.os.Bundle bundle) {
        this.a = context;
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        this.c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", android.os.Process.myPid());
        cvVar.b = this;
        this.b = new android.media.browse.MediaBrowser(context, componentName, cvVar.a, bundle2);
    }

    public final boolean a() {
        return this.b.isConnected();
    }
}
