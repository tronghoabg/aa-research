package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public final class eb {
    public final List a;
    public long b;
    public long c;
    public Bundle d;
    private int e;
    private long f;
    private float g;
    private int h;
    private CharSequence i;
    private long j;
    private long k;

    public eb(PlaybackStateCompat playbackStateCompat) {
        ArrayList arrayList = new ArrayList();
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
        List list = playbackStateCompat.i;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.k = playbackStateCompat.j;
        this.d = playbackStateCompat.k;
    }

    public final PlaybackStateCompat a() {
        return new PlaybackStateCompat(this.e, this.f, this.b, this.g, this.c, this.h, this.i, this.j, this.a, this.k, this.d);
    }

    public final void b(int i, CharSequence charSequence) {
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
        c(i, j, f, SystemClock.elapsedRealtime());
    }

    public eb() {
        this.a = new ArrayList();
        this.k = -1L;
    }
}
