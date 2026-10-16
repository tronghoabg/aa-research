package j$.util.stream;

import java.util.stream.Collector;

/* renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2969j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f38236a;

    private /* synthetic */ C2969j(Collector collector) {
        this.f38236a = collector;
    }

    public static /* synthetic */ C2969j a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return new C2969j(collector);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f38236a;
        if (obj instanceof C2969j) {
            obj = ((C2969j) obj).f38236a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f38236a.hashCode();
    }
}
