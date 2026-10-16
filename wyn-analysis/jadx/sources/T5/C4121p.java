package t5;

import java.util.Set;
import q5.C3868c;
import q5.InterfaceC3871f;
import q5.InterfaceC3872g;

/* renamed from: t5.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4121p implements InterfaceC3872g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f45790a;

    /* renamed from: b, reason: collision with root package name */
    public final C4114i f45791b;

    /* renamed from: c, reason: collision with root package name */
    public final C4123r f45792c;

    public C4121p(Set set, C4114i c4114i, C4123r c4123r) {
        this.f45790a = set;
        this.f45791b = c4114i;
        this.f45792c = c4123r;
    }

    public final C4122q a(String str, C3868c c3868c, InterfaceC3871f interfaceC3871f) {
        Set set = this.f45790a;
        if (set.contains(c3868c)) {
            return new C4122q(this.f45791b, str, c3868c, interfaceC3871f, this.f45792c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3868c, set));
    }
}
