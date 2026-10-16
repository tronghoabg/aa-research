package defpackage;

import android.graphics.drawable.Drawable;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class gfd implements Consumer {
    final /* synthetic */ aitf a;

    public gfd(aitf aitfVar) {
        this.a = aitfVar;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        this.a.w((Drawable) obj);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
