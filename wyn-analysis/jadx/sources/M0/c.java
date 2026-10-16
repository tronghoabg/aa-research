package M0;

import android.os.Looper;
import android.view.MotionEvent;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class c extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7236i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f7237j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(o oVar, int i5) {
        super(1);
        this.f7236i = i5;
        this.f7237j = oVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f7236i) {
            case 0:
                i it = (i) obj;
                AbstractC3340k.e(it, "it");
                o oVar = this.f7237j;
                oVar.getHandler().post(new C8.g(oVar.f7261m, 11));
                return C2515C.f34653a;
            case 1:
                tf.a command = (tf.a) obj;
                AbstractC3340k.e(command, "command");
                o oVar2 = this.f7237j;
                if (oVar2.getHandler().getLooper() == Looper.myLooper()) {
                    command.invoke();
                } else {
                    oVar2.getHandler().post(new g(command, 0));
                }
                return C2515C.f34653a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                AbstractC3340k.e(motionEvent, "motionEvent");
                int actionMasked = motionEvent.getActionMasked();
                o oVar3 = this.f7237j;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = oVar3.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = oVar3.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
