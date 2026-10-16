package kotlinx.b.c;

import androidx.autofill.HintConstants;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bj implements kotlinx.b.a.q {

    /* renamed from: a, reason: collision with root package name */
    public static final bj f50994a = new bj();

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.x f50995b = kotlinx.b.a.ab.f50903a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f50996c = "kotlin.Nothing";

    private static final void l() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return 0;
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return f50996c;
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ List e() {
        return h.a.i.h();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.q g(int i2) {
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final kotlinx.b.a.x h() {
        return f50995b;
    }

    public final int hashCode() {
        return f50996c.hashCode() + (f50995b.hashCode() * 31);
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        l();
        throw new h.e();
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean k() {
        return false;
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
