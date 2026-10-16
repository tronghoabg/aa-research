package defpackage;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class eb {
    public final java.util.List a;
    public long b;
    public long c;
    public android.os.Bundle d;
    private int e;
    private long f;
    private float g;
    private int h;
    private java.lang.CharSequence i;
    private long j;
    private long k;

    public eb(android.support.v4.media.session.PlaybackStateCompat playbackStateCompat) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.a = arrayList;
        this.k = -1L;
        this.e = playbackStateCompat.a;
        this.f = playbackStateCompat.b;
        this.g = playbackStateCompat.d;
        this.j = playbackStateCompat.h;
        this.b = playbackStateCompat.c;
        this.c = playbackStateCompat.e;
        this.h = playbackStateCompat.f;
        this.i = playbackStateCompat.g;
        java.util.List list = playbackStateCompat.i;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.k = playbackStateCompat.j;
        this.d = playbackStateCompat.k;
    }

    public final android.support.v4.media.session.PlaybackStateCompat a() {
        return new android.support.v4.media.session.PlaybackStateCompat(this.e, this.f, this.b, this.g, this.c, this.h, this.i, this.j, this.a, this.k, this.d);
    }

    public final void b(int i, java.lang.CharSequence charSequence) {
        this.h = i;
        this.i = charSequence;
    }

    public final void c(int i, long j, float f, long j2) {
        this.e = i;
        this.f = j;
        this.j = j2;
        this.g = f;
    }

    public final void d(int i, long j, float f) {
        c(i, j, f, android.os.SystemClock.elapsedRealtime());
    }

    public eb() {
        this.a = new java.util.ArrayList();
        this.k = -1L;
    }
}
