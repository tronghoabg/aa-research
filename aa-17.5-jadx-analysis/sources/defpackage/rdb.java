package defpackage;

import android.graphics.Rect;
import android.os.RemoteException;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class rdb implements rze {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ rdb(rdj rdjVar, AbstractSafeParcelable abstractSafeParcelable, Object obj, int i) {
        this.d = i;
        this.a = rdjVar;
        this.b = abstractSafeParcelable;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rze
    public final void a() throws RemoteException {
        int i = this.d;
        if (i == 0) {
            ((rdj) this.a).C().ap((CarDisplayId) this.b, (ProjectionWindowAnimationChoreography) this.c);
            return;
        }
        if (i == 1) {
            ((rdj) this.a).C().bl((CarRegionId) this.b, (Rect) this.c);
        } else {
            if (i == 2) {
                ((rdj) this.c).C().aA((byte[]) this.b, ((yxc) this.a).aw);
                return;
            }
            final ?? r0 = this.b;
            Object obj = this.c;
            final rij rijVar = (rij) this.a;
            final ajmd ajmdVar = (ajmd) obj;
            rijVar.c.E(new ref() { // from class: rif
                @Override // defpackage.ref
                public final void a(Object obj2) throws RemoteException {
                    riu riuVar = (riu) obj2;
                    ajmd ajmdVar2 = ajmdVar;
                    List list = r0;
                    riuVar.b(ajmdVar2, list);
                    rijVar.b.u(riuVar, list);
                }
            });
        }
    }

    public /* synthetic */ rdb(rdj rdjVar, byte[] bArr, yxc yxcVar, int i) {
        this.d = i;
        this.c = rdjVar;
        this.b = bArr;
        this.a = yxcVar;
    }

    public /* synthetic */ rdb(rij rijVar, ajmd ajmdVar, List list, int i) {
        this.d = i;
        this.a = rijVar;
        this.c = ajmdVar;
        this.b = list;
    }
}
