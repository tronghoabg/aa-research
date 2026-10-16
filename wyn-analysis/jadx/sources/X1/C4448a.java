package x1;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4448a extends AbstractC3343n implements l {

    /* renamed from: i, reason: collision with root package name */
    public static final C4448a f47645i = new C4448a(1);

    @Override // tf.l
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        AbstractC3340k.e(entry, "entry");
        return "  " + ((C4452e) entry.getKey()).f47652a + " = " + entry.getValue();
    }
}
