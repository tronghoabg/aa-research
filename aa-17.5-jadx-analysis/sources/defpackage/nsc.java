package defpackage;

import android.app.ActivityManager;
import android.graphics.Rect;
import android.service.notification.StatusBarNotification;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class nsc implements Predicate {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ nsc(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo56negate() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.b;
        if (i == 0) {
            Rect rect = (Rect) obj;
            yph yphVar = nso.a;
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
            return ((ActivityManager.RunningAppProcessInfo) obj).pid == this.a;
        }
        if (i != 2) {
            if (i == 3) {
                return ((StatusBarNotification) obj).getNotification().extras.getInt("gearhead_missed_calls_tag_id") != this.a;
            }
            yph yphVar2 = pdh.a;
            int i2 = ((pdf) ((Map.Entry) obj).getValue()).b;
            boolean z = i2 == this.a;
            if (i2 != 0) {
                return z;
            }
            throw null;
        }
        Rect rect2 = (Rect) obj;
        yph yphVar3 = nso.a;
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
