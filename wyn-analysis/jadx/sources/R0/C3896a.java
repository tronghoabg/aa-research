package r0;

import kotlin.jvm.internal.C3338i;
import vf.AbstractC4345a;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3896a extends C3338i implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public static final C3896a f44289a = new C3896a(2, AbstractC4345a.class, "min", "min(II)I", 1);

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
