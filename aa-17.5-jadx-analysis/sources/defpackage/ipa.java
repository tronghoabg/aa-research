package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Message;
import android.view.InputEvent;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes.dex */
public final class ipa extends ine {
    public static final /* synthetic */ int i = 0;
    public final ind h;
    private boolean j;

    public ipa(ipb ipbVar, ComponentName componentName) {
        super(ipbVar, componentName);
        this.h = new ind(this, 26);
        this.j = false;
    }

    private final void w(boolean z) {
        this.j = z;
        if (z) {
            return;
        }
        rbr.e(this, this.h);
        ipb.V(true);
    }

    @Override // defpackage.ine
    protected final int a(int i2) {
        long j;
        switch (i2) {
            case 0:
                j = acoq.a.gu().j();
                break;
            case 2:
                j = acoq.a.gu().k();
                break;
            case 5:
                j = acoq.m();
                break;
            case 7:
                j = acoq.a.gu().i();
                break;
            case 9:
                j = acoq.n();
                break;
            case 11:
                j = acoq.i();
                break;
            case 13:
                j = acoq.h();
                break;
            case 15:
                j = acoq.a.gu().c();
                break;
            case 20:
                j = acoq.f();
                break;
            case 26:
                j = acoq.e();
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                j = acoq.g();
                break;
            default:
                j = acoq.a.gu().a();
                break;
        }
        return (int) j;
    }

    @Override // defpackage.ine
    protected final String b(int i2) {
        return (String) ipb.F.get(i2);
    }

    @Override // defpackage.ine
    protected final String c(Message message) {
        if (message.what == 20) {
            return message.arg1 == 1 ? "gain" : "loss";
        }
        if (message.what == 3) {
            return message.arg1 == 1 ? "window updated" : "";
        }
        return null;
    }

    @Override // defpackage.ine
    public final void f() {
        rbr.d(this, this.b);
        removeCallbacksAndMessages(null);
        rbr.e(this, this.h);
        ipb.V(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0275  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v127 */
    @Override // defpackage.ine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ void m(defpackage.ing r14, android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 1716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipa.m(ing, android.os.Message):void");
    }

    public final void q(RuntimeException runtimeException) {
        ((ype) ipb.E.l().ai(926)).M("component: %s; client crash for: %s", this.e, this);
        rbe.g(getLooper(), new ino(this, runtimeException, 4));
    }

    public final void r(InputFocusChangedEvent inputFocusChangedEvent) {
        e(Message.obtain(this, 20, inputFocusChangedEvent));
    }

    public final void s(InputEvent inputEvent, boolean z) {
        sendMessage(Message.obtain(this, 26, z ? 1 : 0, 0, inputEvent));
    }

    public final void t(Intent intent) {
        e(Message.obtain(this, 13, intent));
    }

    public final void u(boolean z) {
        p(2, Message.obtain(this, 4, z ? 1 : 0, 0));
    }
}
