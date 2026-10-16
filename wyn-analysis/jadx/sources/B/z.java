package B;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class z extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1495i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ N.V f1496j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(N.V v2, int i5) {
        super(1);
        this.f1495i = i5;
        this.f1496j = v2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        C2515C c2515c = C2515C.f34653a;
        N.V v2 = this.f1496j;
        switch (this.f1495i) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                v2.setValue(null);
                return c2515c;
            default:
                Configuration it = (Configuration) obj;
                AbstractC3340k.e(it, "it");
                N.D d3 = AndroidCompositionLocals_androidKt.f18011a;
                v2.setValue(it);
                return c2515c;
        }
    }
}
