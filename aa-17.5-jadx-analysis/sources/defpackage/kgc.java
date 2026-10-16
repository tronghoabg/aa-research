package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.bugreport.BugreportRequester;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class kgc implements BiFunction {
    private final /* synthetic */ int a;

    public final /* synthetic */ BiFunction andThen(Function function) {
        return this.a != 0 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        if (this.a != 0) {
            return ips.q().a();
        }
        yph yphVar = BugreportRequester.a;
        Context applicationContext = ((Context) obj).getApplicationContext();
        applicationContext.getClass();
        return omc.b(applicationContext, (rbt) obj2, null, null, 2);
    }
}
