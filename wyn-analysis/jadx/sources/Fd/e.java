package Fd;

import Jd.C;
import Jd.r;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import tf.l;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Nd.a f4058a;

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(i.class);
        try {
            kTypeB = H.b(i.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f4058a = new Nd.a("ResponseAdapterAttributeKey", new Sd.a(orCreateKotlinClass, kTypeB));
    }

    public static final void a(r rVar, l block) {
        AbstractC3340k.e(rVar, "<this>");
        AbstractC3340k.e(block, "block");
        block.invoke(rVar.a());
    }

    public static final void b(c cVar, String urlString) {
        AbstractC3340k.e(urlString, "urlString");
        C.b(cVar.f4045a, urlString);
    }
}
