package ka;

import com.google.protobuf.GeneratedMessageLite;
import j$.util.DesugarCollections;
import java.util.List;

/* renamed from: ka.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3232f extends GeneratedMessageLite.Builder implements InterfaceC3238h {
    public final void a(List list) {
        copyOnWrite();
        C3235g.c((C3235g) this.instance, list);
    }

    public final void b(C1 c12) {
        copyOnWrite();
        C3235g.b((C3235g) this.instance, c12);
    }

    public final C1 c(int i5) {
        return ((C3235g) this.instance).f(i5);
    }

    public final void d(int i5) {
        copyOnWrite();
        C3235g.d((C3235g) this.instance, i5);
    }

    public final int getValuesCount() {
        return ((C3235g) this.instance).getValuesCount();
    }

    @Override // ka.InterfaceC3238h
    public final List getValuesList() {
        return DesugarCollections.unmodifiableList(((C3235g) this.instance).getValuesList());
    }
}
