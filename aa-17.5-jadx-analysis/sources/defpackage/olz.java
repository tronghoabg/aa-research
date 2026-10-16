package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.auto.components.ui.appbar.AppBarImpl;
import j$.util.function.BiPredicate$CC;
import java.util.function.BiPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class olz implements BiPredicate {
    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate$CC.$default$negate(this);
    }

    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return BiPredicate$CC.$default$or(this, biPredicate);
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        int i = AppBarImpl.r;
        return !TextUtils.equals(((TextView) ((View) obj)).getText(), ((olt) obj2).b);
    }
}
