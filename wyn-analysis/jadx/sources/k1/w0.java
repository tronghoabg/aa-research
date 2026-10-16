package k1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.applovin.shadow.okio.Segment;

/* loaded from: classes.dex */
public class w0 extends com.moloco.sdk.internal.publisher.H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38879b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f38880c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f38881d;

    public w0(Window window, ad.L l10, int i5) {
        this.f38879b = i5;
        switch (i5) {
            case 1:
                this.f38881d = window.getInsetsController();
                this.f38880c = window;
                break;
            default:
                this.f38880c = window;
                this.f38881d = l10;
                break;
        }
    }

    public final void A0(int i5) {
        switch (this.f38879b) {
            case 0:
                View decorView = this.f38880c.getDecorView();
                decorView.setSystemUiVisibility((~i5) & decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f38880c.getDecorView();
                decorView2.setSystemUiVisibility((~i5) & decorView2.getSystemUiVisibility());
                break;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H
    public final void Z() {
        switch (this.f38879b) {
            case 0:
                for (int i5 = 1; i5 <= 512; i5 <<= 1) {
                    if ((519 & i5) != 0) {
                        if (i5 == 1) {
                            z0(4);
                        } else if (i5 == 2) {
                            z0(2);
                        } else if (i5 == 8) {
                            ((C3137y) ((ad.L) this.f38881d).f17515b).a();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f38881d).hide(519);
                break;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H
    public void q0(boolean z2) {
        switch (this.f38879b) {
            case 1:
                Window window = this.f38880c;
                if (!z2) {
                    if (window != null) {
                        A0(16);
                    }
                    ((WindowInsetsController) this.f38881d).setSystemBarsAppearance(0, 16);
                    break;
                } else {
                    if (window != null) {
                        z0(16);
                    }
                    ((WindowInsetsController) this.f38881d).setSystemBarsAppearance(16, 16);
                    break;
                }
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H
    public final void r0(boolean z2) {
        switch (this.f38879b) {
            case 0:
                if (!z2) {
                    A0(Segment.SIZE);
                    break;
                } else {
                    Window window = this.f38880c;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    z0(Segment.SIZE);
                    break;
                }
            default:
                Window window2 = this.f38880c;
                if (!z2) {
                    if (window2 != null) {
                        A0(Segment.SIZE);
                    }
                    ((WindowInsetsController) this.f38881d).setSystemBarsAppearance(0, 8);
                    break;
                } else {
                    if (window2 != null) {
                        z0(Segment.SIZE);
                    }
                    ((WindowInsetsController) this.f38881d).setSystemBarsAppearance(8, 8);
                    break;
                }
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H
    public void s0() {
        switch (this.f38879b) {
            case 0:
                this.f38880c.getDecorView().setTag(356039078, 2);
                A0(2048);
                z0(4096);
                break;
            default:
                Window window = this.f38880c;
                if (window == null) {
                    ((WindowInsetsController) this.f38881d).setSystemBarsBehavior(2);
                    break;
                } else {
                    window.getDecorView().setTag(356039078, 2);
                    A0(2048);
                    z0(4096);
                    break;
                }
        }
    }

    public final void z0(int i5) {
        switch (this.f38879b) {
            case 0:
                View decorView = this.f38880c.getDecorView();
                decorView.setSystemUiVisibility(i5 | decorView.getSystemUiVisibility());
                break;
            default:
                View decorView2 = this.f38880c.getDecorView();
                decorView2.setSystemUiVisibility(i5 | decorView2.getSystemUiVisibility());
                break;
        }
    }
}
