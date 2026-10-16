package defpackage;

import android.graphics.drawable.Drawable;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class hma extends ieq {
    private final Consumer a;

    public hma(int i, int i2, Consumer consumer) {
        super(i, i2);
        this.a = consumer;
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        this.a.accept(drawable);
    }

    @Override // defpackage.ieq, defpackage.iev
    public final void b(Drawable drawable) {
        this.a.accept(drawable);
    }

    @Override // defpackage.iev
    public final /* bridge */ /* synthetic */ void c(Object obj, ife ifeVar) {
        this.a.accept((Drawable) obj);
    }
}
