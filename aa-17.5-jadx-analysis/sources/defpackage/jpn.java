package defpackage;

import android.graphics.Rect;
import android.os.RemoteException;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final /* synthetic */ class jpn implements jpv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jpn(jpw jpwVar, CarRegionId carRegionId, Rect rect, int i) {
        this.d = i;
        this.c = jpwVar;
        this.b = carRegionId;
        this.a = rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qwd] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.jpv
    public final void a() throws RemoteException, jnq {
        int i = this.d;
        if (i == 0) {
            ((jpw) this.a).m().as((CarRegionId) this.b, this.c);
            return;
        }
        if (i == 1) {
            ((jpw) this.a).m().aS((CarInfo) this.c, (String) this.b);
        } else if (i == 2) {
            ((jpw) this.a).m().ap((CarDisplayId) this.b, (ProjectionWindowAnimationChoreography) this.c);
        } else if (i != 3) {
            ((jpw) this.a).m().aX((String) this.c, this.b);
        } else {
            ((jpw) this.c).m().bl((CarRegionId) this.b, (Rect) this.a);
        }
    }

    public /* synthetic */ jpn(jpw jpwVar, AbstractSafeParcelable abstractSafeParcelable, Object obj, int i) {
        this.d = i;
        this.a = jpwVar;
        this.b = abstractSafeParcelable;
        this.c = obj;
    }

    public /* synthetic */ jpn(jpw jpwVar, Object obj, Object obj2, int i) {
        this.d = i;
        this.a = jpwVar;
        this.c = obj;
        this.b = obj2;
    }
}
