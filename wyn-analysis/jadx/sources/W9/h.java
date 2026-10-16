package W9;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import com.applovin.impl.T0;
import com.applovin.impl.i5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f6.Z;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;
import n2.C3581d;
import n7.AbstractC3598c;
import r6.C3928c;
import t.InterfaceC4035a;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Continuation, InterfaceC4035a, r6.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15340c;

    public /* synthetic */ h(boolean z2, Object obj, Object obj2) {
        this.f15339b = obj;
        this.f15340c = obj2;
        this.f15338a = z2;
    }

    @Override // r6.i
    public e0 a(int i5, Z z2, int[] iArr) {
        r6.l lVar = (r6.l) this.f15339b;
        lVar.getClass();
        C3581d c3581d = new C3581d(lVar, 1);
        C3406H c3406hI = AbstractC3409K.i();
        int i10 = 0;
        while (i10 < z2.f35017a) {
            int i11 = i5;
            Z z10 = z2;
            c3406hI.a(new C3928c(i11, z10, i10, (r6.f) this.f15340c, iArr[i10], this.f15338a, c3581d));
            i10++;
            i5 = i11;
            z2 = z10;
        }
        return c3406hI.g();
    }

    @Override // t.InterfaceC4035a
    public Object apply(Object obj) {
        return ((com.applovin.impl.sdk.ad.b) this.f15339b).a((MotionEvent) this.f15340c, this.f15338a, (i5) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (AbstractC3598c.h() && ((Integer) task.getResult()).intValue() == 402) ? i.a((Context) this.f15339b, (Intent) this.f15340c, this.f15338a).continueWith(new T0(1), new V1.c(7)) : task;
    }
}
