package E5;

import android.media.MediaFormat;
import w6.InterfaceC4367a;

/* loaded from: classes3.dex */
public final class G implements v6.i, InterfaceC4367a, x0 {

    /* renamed from: a, reason: collision with root package name */
    public v6.i f3033a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4367a f3034b;

    /* renamed from: c, reason: collision with root package name */
    public v6.i f3035c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4367a f3036d;

    @Override // w6.InterfaceC4367a
    public final void a(long j8, float[] fArr) {
        InterfaceC4367a interfaceC4367a = this.f3036d;
        if (interfaceC4367a != null) {
            interfaceC4367a.a(j8, fArr);
        }
        InterfaceC4367a interfaceC4367a2 = this.f3034b;
        if (interfaceC4367a2 != null) {
            interfaceC4367a2.a(j8, fArr);
        }
    }

    @Override // w6.InterfaceC4367a
    public final void b() {
        InterfaceC4367a interfaceC4367a = this.f3036d;
        if (interfaceC4367a != null) {
            interfaceC4367a.b();
        }
        InterfaceC4367a interfaceC4367a2 = this.f3034b;
        if (interfaceC4367a2 != null) {
            interfaceC4367a2.b();
        }
    }

    @Override // E5.x0
    public final void c(int i5, Object obj) {
        if (i5 == 7) {
            this.f3033a = (v6.i) obj;
            return;
        }
        if (i5 == 8) {
            this.f3034b = (InterfaceC4367a) obj;
            return;
        }
        if (i5 != 10000) {
            return;
        }
        w6.k kVar = (w6.k) obj;
        if (kVar == null) {
            this.f3035c = null;
            this.f3036d = null;
        } else {
            this.f3035c = kVar.getVideoFrameMetadataListener();
            this.f3036d = kVar.getCameraMotionListener();
        }
    }

    @Override // v6.i
    public final void d(long j8, long j10, T t10, MediaFormat mediaFormat) {
        long j11;
        long j12;
        T t11;
        MediaFormat mediaFormat2;
        v6.i iVar = this.f3035c;
        if (iVar != null) {
            iVar.d(j8, j10, t10, mediaFormat);
            mediaFormat2 = mediaFormat;
            t11 = t10;
            j12 = j10;
            j11 = j8;
        } else {
            j11 = j8;
            j12 = j10;
            t11 = t10;
            mediaFormat2 = mediaFormat;
        }
        v6.i iVar2 = this.f3033a;
        if (iVar2 != null) {
            iVar2.d(j11, j12, t11, mediaFormat2);
        }
    }
}
