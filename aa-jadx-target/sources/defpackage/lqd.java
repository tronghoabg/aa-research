package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lqd implements java.util.function.Predicate {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lqd(com.google.android.apps.auto.components.ui.appbar.AppBarImpl appBarImpl, omm ommVar, int i) {
        this.c = i;
        this.b = appBarImpl;
        this.a = ommVar;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        int i = this.c;
        if (i != 0) {
            return i != 1 ? j$.util.function.Predicate.-CC.$default$and(this, predicate) : j$.util.function.Predicate.-CC.$default$and(this, predicate);
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        int i = this.c;
        if (i != 0) {
            return i != 1 ? j$.util.function.Predicate.-CC.$default$negate(this) : j$.util.function.Predicate.-CC.$default$negate(this);
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        int i = this.c;
        if (i != 0) {
            return i != 1 ? j$.util.function.Predicate.-CC.$default$or(this, predicate) : j$.util.function.Predicate.-CC.$default$or(this, predicate);
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        lph lphVarH;
        int i = this.c;
        if (i == 0) {
            android.content.Context context = ((defpackage.lqf) this.a).b;
            lqa lqaVar = (lqa) obj;
            if (lqaVar.f(context) != null) {
                ?? r5 = this.b;
                java.lang.CharSequence charSequenceF = lqaVar.f(context);
                charSequenceF.getClass();
                if (!r5.contains(charSequenceF.toString())) {
                    return true;
                }
            }
            return false;
        }
        if (i != 1) {
            java.util.function.Predicate predicateM = ll$.ExternalSyntheticApiModelOutline0.m(((com.google.android.apps.auto.components.ui.appbar.AppBarImpl) this.b).a.get((android.view.View) obj));
            predicateM.getClass();
            return a$.ExternalSyntheticApiModelOutline2.m(predicateM, this.a);
        }
        lpm lpmVar = (lpm) obj;
        defpackage.yqm yqmVar = defpackage.lpx.a;
        if (defpackage.acmw.i()) {
            com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = lpmVar.b;
            if (aaPlaybackState == null) {
                return false;
            }
            if (aaPlaybackState.Q() != 3 && (aaPlaybackState.Q() != 6 || (lphVarH = defpackage.lpx.h((defpackage.qsh) this.a, lpmVar)) == null || !this.b.contains(lphVarH.a))) {
                return false;
            }
        } else if (!defpackage.lki.b(lpmVar.b)) {
            return false;
        }
        return !lpmVar.d;
    }

    public /* synthetic */ lqd(java.lang.Object obj, java.util.Set set, int i) {
        this.c = i;
        this.a = obj;
        this.b = set;
    }
}
