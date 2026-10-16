package p0;

import android.view.MotionEvent;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class p extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f43165i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f43166j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i5) {
        super(1);
        this.f43165i = i5;
        this.f43166j = rVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f43165i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                AbstractC3340k.e(motionEvent, "motionEvent");
                M0.c cVar = this.f43166j.f43169a;
                if (cVar != null) {
                    cVar.invoke(motionEvent);
                    return C2515C.f34653a;
                }
                AbstractC3340k.m("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                AbstractC3340k.e(motionEvent2, "motionEvent");
                M0.c cVar2 = this.f43166j.f43169a;
                if (cVar2 != null) {
                    cVar2.invoke(motionEvent2);
                    return C2515C.f34653a;
                }
                AbstractC3340k.m("onTouchEvent");
                throw null;
        }
    }
}
