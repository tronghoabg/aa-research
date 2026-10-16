package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.ui.appbar.AppBarImpl;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class lpw implements Predicate {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lpw(AppBarImpl appBarImpl, olt oltVar, int i) {
        this.c = i;
        this.b = appBarImpl;
        this.a = oltVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.c;
        return i != 0 ? i != 1 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        int i = this.c;
        return i != 0 ? i != 1 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.c;
        return i != 0 ? i != 1 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        loz lozVarH;
        int i = this.c;
        if (i == 0) {
            Context context = ((lpz) this.a).b;
            lpt lptVar = (lpt) obj;
            if (lptVar.f(context) != null) {
                ?? r5 = this.b;
                CharSequence charSequenceF = lptVar.f(context);
                charSequenceF.getClass();
                if (!r5.contains(charSequenceF.toString())) {
                    return true;
                }
            }
            return false;
        }
        if (i != 1) {
            Predicate predicateM353m = lk$$ExternalSyntheticApiModelOutline0.m353m(((AppBarImpl) this.b).a.get((View) obj));
            predicateM353m.getClass();
            return predicateM353m.test(this.a);
        }
        lpf lpfVar = (lpf) obj;
        yph yphVar = lpq.a;
        if (aclu.i()) {
            AaPlaybackState aaPlaybackState = lpfVar.b;
            if (aaPlaybackState == null) {
                return false;
            }
            if (aaPlaybackState.Q() != 3 && (aaPlaybackState.Q() != 6 || (lozVarH = lpq.h((qrn) this.a, lpfVar)) == null || !this.b.contains(lozVarH.a))) {
                return false;
            }
        } else if (!lkb.b(lpfVar.b)) {
            return false;
        }
        return !lpfVar.d;
    }

    public /* synthetic */ lpw(Object obj, Set set, int i) {
        this.c = i;
        this.a = obj;
        this.b = set;
    }
}
