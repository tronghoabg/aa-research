package defpackage;

import java.util.function.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class wya implements Supplier {
    public final /* synthetic */ yyi a;

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = wyb.b;
        return Integer.valueOf(this.a == yyi.ALPHA ? 5000 : 500);
    }
}
