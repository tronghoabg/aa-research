package Jf;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection f6106a;

    static {
        try {
            f6106a = Af.n.e0(Af.n.S(Arrays.asList(new Ff.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
