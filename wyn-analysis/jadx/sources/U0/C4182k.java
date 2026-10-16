package u0;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import c0.C1536a;
import ef.C2515C;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import l0.C3368a;
import n0.AbstractC3562a;
import n0.C3563b;

/* renamed from: u0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4182k extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46247i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C4188n f46248j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4182k(C4188n c4188n, int i5) {
        super(1);
        this.f46247i = i5;
        this.f46248j = c4188n;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C1536a c1536a;
        switch (this.f46247i) {
            case 0:
                int i5 = ((C3368a) obj).f39842a;
                C4188n c4188n = this.f46248j;
                boolean zRequestFocusFromTouch = true;
                if (i5 == 1) {
                    zRequestFocusFromTouch = c4188n.isInTouchMode();
                } else if (i5 != 2) {
                    zRequestFocusFromTouch = false;
                } else if (c4188n.isInTouchMode()) {
                    zRequestFocusFromTouch = c4188n.requestFocusFromTouch();
                }
                return Boolean.valueOf(zRequestFocusFromTouch);
            case 1:
                KeyEvent keyEvent = ((C3563b) obj).f40751a;
                C4188n c4188n2 = this.f46248j;
                c4188n2.getClass();
                long jA = AbstractC3230e0.a(keyEvent.getKeyCode());
                if (AbstractC3562a.a(jA, AbstractC3562a.f40747g)) {
                    c1536a = new C1536a(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (AbstractC3562a.a(jA, AbstractC3562a.f40745e)) {
                    c1536a = new C1536a(4);
                } else if (AbstractC3562a.a(jA, AbstractC3562a.f40744d)) {
                    c1536a = new C1536a(3);
                } else if (AbstractC3562a.a(jA, AbstractC3562a.f40742b)) {
                    c1536a = new C1536a(5);
                } else if (AbstractC3562a.a(jA, AbstractC3562a.f40743c)) {
                    c1536a = new C1536a(6);
                } else {
                    if (AbstractC3562a.a(jA, AbstractC3562a.f40746f) ? true : AbstractC3562a.a(jA, AbstractC3562a.f40748h) ? true : AbstractC3562a.a(jA, AbstractC3562a.f40750j)) {
                        c1536a = new C1536a(7);
                    } else {
                        c1536a = AbstractC3562a.a(jA, AbstractC3562a.f40741a) ? true : AbstractC3562a.a(jA, AbstractC3562a.f40749i) ? new C1536a(8) : null;
                    }
                }
                if (c1536a != null) {
                    int action = keyEvent.getAction();
                    if ((action != 0 ? action != 1 ? (char) 0 : (char) 1 : (char) 2) == 2) {
                        return Boolean.valueOf(((b7.k) c4188n2.getFocusManager()).A(c1536a.f19487a));
                    }
                }
                return Boolean.FALSE;
            default:
                tf.a command = (tf.a) obj;
                AbstractC3340k.e(command, "command");
                C4188n c4188n3 = this.f46248j;
                Handler handler = c4188n3.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    command.invoke();
                } else {
                    Handler handler2 = c4188n3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new M0.g(command, 3));
                    }
                }
                return C2515C.f34653a;
        }
    }
}
