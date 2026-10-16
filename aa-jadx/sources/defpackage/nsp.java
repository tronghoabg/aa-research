package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nsp implements java.util.function.Predicate {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ nsp(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Predicate$CC.$default$and(this, predicate);
        }
        if (i == 1) {
            return j$.util.function.Predicate$CC.$default$and(this, predicate);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Predicate$CC.$default$and(this, predicate) : j$.util.function.Predicate$CC.$default$and(this, predicate);
        }
        return j$.util.function.Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final /* synthetic */ java.util.function.Predicate mo55negate() {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Predicate$CC.$default$negate(this);
        }
        if (i == 1) {
            return j$.util.function.Predicate$CC.$default$negate(this);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Predicate$CC.$default$negate(this) : j$.util.function.Predicate$CC.$default$negate(this);
        }
        return j$.util.function.Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        int i = this.b;
        if (i == 0) {
            return j$.util.function.Predicate$CC.$default$or(this, predicate);
        }
        if (i == 1) {
            return j$.util.function.Predicate$CC.$default$or(this, predicate);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Predicate$CC.$default$or(this, predicate) : j$.util.function.Predicate$CC.$default$or(this, predicate);
        }
        return j$.util.function.Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            android.graphics.Rect rect = (android.graphics.Rect) obj;
            defpackage.yqm yqmVar = defpackage.ntb.a;
            if (rect.height() < rect.width() || rect.left <= 0) {
                return false;
            }
            if (rect.top != 0) {
                if (rect.bottom != this.a) {
                    return false;
                }
            }
            return true;
        }
        if (i == 1) {
            return ((android.app.ActivityManager.RunningAppProcessInfo) obj).pid == this.a;
        }
        if (i != 2) {
            if (i == 3) {
                return ((android.service.notification.StatusBarNotification) obj).getNotification().extras.getInt("gearhead_missed_calls_tag_id") != this.a;
            }
            defpackage.yqm yqmVar2 = defpackage.ped.a;
            int i2 = ((defpackage.peb) ((java.util.Map.Entry) obj).getValue()).b;
            boolean z = i2 == this.a;
            if (i2 != 0) {
                return z;
            }
            throw null;
        }
        android.graphics.Rect rect2 = (android.graphics.Rect) obj;
        defpackage.yqm yqmVar3 = defpackage.ntb.a;
        if (rect2.width() < rect2.height() || rect2.top <= 0) {
            return false;
        }
        if (rect2.left != 0) {
            if (rect2.right != this.a) {
                return false;
            }
        }
        return true;
    }
}
