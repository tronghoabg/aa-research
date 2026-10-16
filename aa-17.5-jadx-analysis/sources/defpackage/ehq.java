package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class ehq extends afey implements afdr {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(Object obj, int i) {
        super(0, obj, Callable.class, "call", "call()Ljava/lang/Object;", 0);
        this.a = i;
    }

    @Override // defpackage.afdr
    public final /* synthetic */ Object invoke() {
        boolean z;
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((Runnable) this.receiver).run();
                break;
            case 2:
                break;
            case 3:
                fux fuxVar = (fux) this.receiver;
                if (fuxVar.a == gml.b) {
                    fvl fvlVar = fuxVar.d;
                    Log.i("GH.AJTelemetry", "onKeyboardExit");
                    fuxVar.a = gml.a;
                    fuxVar.a();
                    z = true;
                } else {
                    z = false;
                }
                break;
            case 4:
                jst jstVar = (jst) this.receiver;
                if (jstVar.b == gml.b) {
                    jstVar.a.c();
                    jstVar.b = gml.a;
                    jstVar.a();
                } else {
                    ((qw) jstVar.e.a).g().c();
                }
                break;
            case 5:
                ((lke) this.receiver).k();
                break;
            case 6:
                ((lke) this.receiver).i();
                break;
            case 7:
                ((lke) this.receiver).k();
                break;
            case 8:
                ((lke) this.receiver).i();
                break;
            case 9:
                ((lke) this.receiver).k();
                break;
            case 10:
                ((lke) this.receiver).i();
                break;
            case 11:
                ((lke) this.receiver).k();
                break;
            case 12:
                ((lke) this.receiver).i();
                break;
            case 13:
                ((mzy) this.receiver).u();
                break;
            case 14:
                ((nxp) this.receiver).d();
                break;
            default:
                ((Runnable) this.receiver).run();
                break;
        }
        return afak.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(Object obj, int i, byte[] bArr) {
        super(0, obj, Runnable.class, "run", "run()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(Object obj, int i, float[] fArr) {
        super(0, obj, lke.class, "showPlaybackScreen", "showPlaybackScreen()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(Object obj, int i, int[] iArr) {
        super(0, obj, jst.class, "onBack", "onBack()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(Object obj, int i, short[] sArr) {
        super(0, obj, fux.class, "onBack", "onBack()Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(Object obj, int i, boolean[] zArr) {
        super(0, obj, lke.class, "showSearchScreen", "showSearchScreen()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(Object obj, int i, byte[][][] bArr) {
        super(0, obj, mzy.class, "goToApp", "goToApp()V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(Object obj, int i, char[][][] cArr) {
        super(0, obj, nxp.class, "hide", "hide()V", 0);
        this.a = i;
    }
}
