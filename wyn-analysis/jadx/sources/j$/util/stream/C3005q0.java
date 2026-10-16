package j$.util.stream;

import java.util.function.Predicate;

/* renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3005q0 extends AbstractC3024u0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ EnumC3029v0 f38290c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Predicate f38291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3005q0(EnumC3029v0 enumC3029v0, Predicate predicate) {
        super(enumC3029v0);
        this.f38290c = enumC3029v0;
        this.f38291d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f38317a) {
            return;
        }
        boolean zTest = this.f38291d.test(obj);
        EnumC3029v0 enumC3029v0 = this.f38290c;
        if (zTest == enumC3029v0.f38327a) {
            this.f38317a = true;
            this.f38318b = enumC3029v0.f38328b;
        }
    }
}
