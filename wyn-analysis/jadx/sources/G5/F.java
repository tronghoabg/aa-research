package G5;

import U1.C0851v;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import y3.C4552j;

/* loaded from: classes3.dex */
public final class F extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4254b;

    public /* synthetic */ F(Object obj, int i5) {
        this.f4253a = i5;
        this.f4254b = obj;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i5) {
        G g9;
        C4552j c4552j;
        E5.K k;
        W1.t tVar;
        xa.d dVar;
        C0851v c0851v;
        switch (this.f4253a) {
            case 0:
                if (audioTrack.equals(((G) ((b7.k) this.f4254b).f19398d).f4305u) && (c4552j = (g9 = (G) ((b7.k) this.f4254b).f19398d).f4302r) != null && g9.f4277U && (k = ((K) c4552j.f48001b).f4323O0) != null) {
                    k.f3128a.f3170h.c(2);
                    break;
                }
                break;
            default:
                if (audioTrack.equals(((W1.t) ((G9.e) this.f4254b).f4687d).f15093v) && (dVar = (tVar = (W1.t) ((G9.e) this.f4254b).f4687d).f15089r) != null && tVar.f15059V && (c0851v = ((W1.v) dVar.f47873b).f34016F) != null) {
                    c0851v.a();
                    break;
                }
                break;
        }
    }

    public void onPresentationEnded(AudioTrack audioTrack) {
        switch (this.f4253a) {
            case 1:
                if (audioTrack.equals(((W1.t) ((G9.e) this.f4254b).f4687d).f15093v)) {
                    ((W1.t) ((G9.e) this.f4254b).f4687d).f15058U = true;
                    break;
                }
                break;
            default:
                super.onPresentationEnded(audioTrack);
                break;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        G g9;
        C4552j c4552j;
        E5.K k;
        W1.t tVar;
        xa.d dVar;
        C0851v c0851v;
        switch (this.f4253a) {
            case 0:
                if (audioTrack.equals(((G) ((b7.k) this.f4254b).f19398d).f4305u) && (c4552j = (g9 = (G) ((b7.k) this.f4254b).f19398d).f4302r) != null && g9.f4277U && (k = ((K) c4552j.f48001b).f4323O0) != null) {
                    k.f3128a.f3170h.c(2);
                    break;
                }
                break;
            default:
                if (audioTrack.equals(((W1.t) ((G9.e) this.f4254b).f4687d).f15093v) && (dVar = (tVar = (W1.t) ((G9.e) this.f4254b).f4687d).f15089r) != null && tVar.f15059V && (c0851v = ((W1.v) dVar.f47873b).f34016F) != null) {
                    c0851v.a();
                    break;
                }
                break;
        }
    }
}
