package G3;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class d extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public static final d f4203i = new d(1);

    @Override // tf.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        AbstractC3340k.e(require, "$this$require");
        boolean z2 = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
