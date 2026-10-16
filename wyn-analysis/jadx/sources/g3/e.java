package G3;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class e extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public static final e f4204i = new e(1);

    @Override // tf.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        AbstractC3340k.e(require, "$this$require");
        return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
    }
}
