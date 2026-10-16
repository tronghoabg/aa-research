package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes2.dex */
public final /* synthetic */ class nlr implements afeh {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ nlr(Bitmap bitmap, boolean z, GhIcon ghIcon, boolean z2, bym bymVar, int i) {
        this.f = i;
        this.e = bitmap;
        this.a = z;
        this.d = ghIcon;
        this.b = z2;
        this.c = bymVar;
    }

    /* JADX WARN: Type inference failed for: r14v7, types: [bym, java.lang.Object] */
    @Override // defpackage.afeh
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f == 0) {
            bux buxVar = (bux) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            ((avx) obj).getClass();
            int i = iIntValue & 17;
            if (buxVar.I(i != 16, iIntValue & 1)) {
                lxr.C(bxc.i(-1940310156, true, new njt(this.c, i), buxVar), bxc.i(-842992267, true, new nlv((String) this.d, this.a, this.b, (kts) this.e, 1), buxVar), buxVar, 54);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        myy myyVar = (myy) obj;
        bux buxVar2 = (bux) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        yph yphVar = myi.a;
        myyVar.getClass();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= true == ((iIntValue2 & 8) == 0 ? buxVar2.C(myyVar) : buxVar2.E(myyVar)) ? 4 : 2;
        }
        if (buxVar2.I((iIntValue2 & 19) != 18, iIntValue2 & 1)) {
            ?? r14 = this.c;
            boolean z = this.b;
            Object obj4 = this.d;
            boolean z2 = this.a;
            Object obj5 = this.e;
            if (true == z2) {
                obj4 = null;
            }
            myyVar.a((Bitmap) obj5, (GhIcon) obj4, z, null, myi.d(r14), buxVar2, (iIntValue2 << 15) & 458752);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ nlr(String str, String str2, boolean z, boolean z2, kts ktsVar, int i) {
        this.f = i;
        this.c = str;
        this.d = str2;
        this.a = z;
        this.b = z2;
        this.e = ktsVar;
    }
}
