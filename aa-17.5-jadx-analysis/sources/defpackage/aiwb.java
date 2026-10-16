package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aiwb implements afdb {
    final /* synthetic */ int a;
    final /* synthetic */ List b;

    public aiwb(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.afdb
    public final StackTraceElement ea() {
        return (StackTraceElement) this.b.get(this.a);
    }

    @Override // defpackage.afdb
    public final afdb eb() {
        return aijn.a(this.b, this.a + 1);
    }
}
