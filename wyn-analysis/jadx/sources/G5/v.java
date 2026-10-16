package G5;

import android.media.AudioTrack;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4447a;

    /* renamed from: b, reason: collision with root package name */
    public int f4448b;

    /* renamed from: c, reason: collision with root package name */
    public long f4449c;

    /* renamed from: d, reason: collision with root package name */
    public long f4450d;

    /* renamed from: e, reason: collision with root package name */
    public long f4451e;

    /* renamed from: f, reason: collision with root package name */
    public long f4452f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4453g;

    public v(AudioTrack audioTrack, int i5) {
        this.f4447a = i5;
        switch (i5) {
            case 1:
                this.f4453g = new W1.k(audioTrack);
                a();
                break;
            default:
                if (u6.v.f46721a < 19) {
                    this.f4453g = null;
                    b(3);
                    break;
                } else {
                    this.f4453g = new u(audioTrack);
                    a();
                    break;
                }
        }
    }

    public final void a() {
        switch (this.f4447a) {
            case 0:
                if (((u) this.f4453g) != null) {
                    b(0);
                    break;
                }
                break;
            default:
                if (((W1.k) this.f4453g) != null) {
                    b(0);
                    break;
                }
                break;
        }
    }

    public final void b(int i5) {
        switch (this.f4447a) {
            case 0:
                this.f4448b = i5;
                if (i5 == 0) {
                    this.f4451e = 0L;
                    this.f4452f = -1L;
                    this.f4449c = System.nanoTime() / 1000;
                    this.f4450d = 10000L;
                    return;
                }
                if (i5 == 1) {
                    this.f4450d = 10000L;
                    return;
                }
                if (i5 == 2 || i5 == 3) {
                    this.f4450d = 10000000L;
                    return;
                } else {
                    if (i5 != 4) {
                        throw new IllegalStateException();
                    }
                    this.f4450d = 500000L;
                    return;
                }
            default:
                this.f4448b = i5;
                if (i5 == 0) {
                    this.f4451e = 0L;
                    this.f4452f = -1L;
                    this.f4449c = System.nanoTime() / 1000;
                    this.f4450d = 10000L;
                    return;
                }
                if (i5 == 1) {
                    this.f4450d = 10000L;
                    return;
                }
                if (i5 == 2 || i5 == 3) {
                    this.f4450d = 10000000L;
                    return;
                } else {
                    if (i5 != 4) {
                        throw new IllegalStateException();
                    }
                    this.f4450d = 500000L;
                    return;
                }
        }
    }
}
