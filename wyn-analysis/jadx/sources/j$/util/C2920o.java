package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2920o implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f37926a;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37926a.accept(new C2921p((Map.Entry) obj));
    }
}
