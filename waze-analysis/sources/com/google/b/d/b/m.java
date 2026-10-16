package com.google.b.d.b;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f7104a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i2 = this.f7104a;
        if (i2 == 0) {
            ((z) obj).a();
        } else if (i2 != 1) {
            ((Runnable) obj).run();
        } else {
            int i3 = l.f7102b;
            ((z) obj).a();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i2 = this.f7104a;
        return i2 != 0 ? i2 != 1 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
    }
}
