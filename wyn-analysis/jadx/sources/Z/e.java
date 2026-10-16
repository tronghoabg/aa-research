package Z;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.p;

/* loaded from: classes.dex */
public final class e extends AbstractC3343n implements p {

    /* renamed from: i, reason: collision with root package name */
    public static final e f16917i = new e(2);

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        String acc = (String) obj;
        j element = (j) obj2;
        AbstractC3340k.e(acc, "acc");
        AbstractC3340k.e(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
