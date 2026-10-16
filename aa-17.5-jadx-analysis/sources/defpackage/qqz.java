package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes.dex */
public final /* synthetic */ class qqz implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qqz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return this.b != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.b == 0) {
            ypf ypfVar = qrg.a;
            return Boolean.valueOf(!((String) obj).equals(this.a));
        }
        Intent intent = iob.a;
        return ComponentName.createRelative(((ServiceInfo) ((Optional) this.a).get()).packageName, (String) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
