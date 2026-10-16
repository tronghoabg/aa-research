package l8;

import java.io.Serializable;
import java.util.ArrayList;
import k8.InterfaceC3207p;

/* loaded from: classes4.dex */
public final class Z implements InterfaceC3207p, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f40078a;

    public Z() {
        AbstractC3437s.d(2, "expectedValuesPerKey");
        this.f40078a = 2;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        return new ArrayList(this.f40078a);
    }
}
