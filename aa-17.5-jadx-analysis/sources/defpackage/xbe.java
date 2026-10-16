package defpackage;

import android.app.Activity;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final /* synthetic */ class xbe implements Function {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ xbe(Activity activity, boolean z) {
        this.a = activity;
        this.b = z;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        yph yphVar = xbo.f;
        mlh mlhVar = new mlh();
        mjv.c((kqg) obj, mlhVar, this.a, this.b);
        return mlhVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
