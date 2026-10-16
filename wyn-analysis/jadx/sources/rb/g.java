package rb;

import x6.AbstractC4480k;
import x6.C4470a;

/* loaded from: classes4.dex */
public final class g extends AbstractC4480k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44729b;

    public /* synthetic */ g(Object obj, int i5) {
        this.f44728a = i5;
        this.f44729b = obj;
    }

    @Override // x6.AbstractC4480k
    public final void onAdClicked() {
        switch (this.f44728a) {
            case 0:
                ((h) this.f44729b).f44731c.onAdClicked();
                break;
            case 1:
                ((j) this.f44729b).f44737c.onAdClicked();
                break;
            case 2:
                ((vb.d) this.f44729b).f47148c.onAdClicked();
                break;
            default:
                ((vb.f) this.f44729b).f47153c.onAdClicked();
                break;
        }
    }

    @Override // x6.AbstractC4480k
    public final void onAdDismissedFullScreenContent() {
        switch (this.f44728a) {
            case 0:
                ((h) this.f44729b).f44731c.onAdClosed();
                break;
            case 1:
                ((j) this.f44729b).f44737c.onAdClosed();
                break;
            case 2:
                ((vb.d) this.f44729b).f47148c.onAdClosed();
                break;
            default:
                ((vb.f) this.f44729b).f47153c.onAdClosed();
                break;
        }
    }

    @Override // x6.AbstractC4480k
    public final void onAdFailedToShowFullScreenContent(C4470a c4470a) {
        switch (this.f44728a) {
            case 0:
                ((h) this.f44729b).f44731c.onAdFailedToShow(c4470a.f47720a, c4470a.toString());
                break;
            case 1:
                ((j) this.f44729b).f44737c.onAdFailedToShow(c4470a.f47720a, c4470a.toString());
                break;
            case 2:
                ((vb.d) this.f44729b).f47148c.onAdFailedToShow(c4470a.f47720a, c4470a.toString());
                break;
            default:
                ((vb.f) this.f44729b).f47153c.onAdFailedToShow(c4470a.f47720a, c4470a.toString());
                break;
        }
    }

    @Override // x6.AbstractC4480k
    public final void onAdImpression() {
        switch (this.f44728a) {
            case 0:
                ((h) this.f44729b).f44731c.onAdImpression();
                break;
            case 1:
                ((j) this.f44729b).f44737c.onAdImpression();
                break;
            case 2:
                ((vb.d) this.f44729b).f47148c.onAdImpression();
                break;
            default:
                ((vb.f) this.f44729b).f47153c.onAdImpression();
                break;
        }
    }

    @Override // x6.AbstractC4480k
    public final void onAdShowedFullScreenContent() {
        switch (this.f44728a) {
            case 0:
                ((h) this.f44729b).f44731c.onAdOpened();
                break;
            case 1:
                ((j) this.f44729b).f44737c.onAdOpened();
                break;
            case 2:
                ((vb.d) this.f44729b).f47148c.onAdOpened();
                break;
            default:
                ((vb.f) this.f44729b).f47153c.onAdOpened();
                break;
        }
    }
}
