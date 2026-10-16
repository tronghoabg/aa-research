package v9;

import com.google.android.gms.tasks.Task;
import md.AbstractC3538f;
import md.AbstractC3555x;

/* loaded from: classes4.dex */
public final class k extends AbstractC3555x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3538f[] f47082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f47083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f47084c;

    public k(m mVar, AbstractC3538f[] abstractC3538fArr, Task task) {
        this.f47084c = mVar;
        this.f47082a = abstractC3538fArr;
        this.f47083b = task;
    }

    @Override // md.AbstractC3555x, md.AbstractC3538f
    public final void b() {
        if (this.f47082a[0] != null) {
            super.b();
            return;
        }
        this.f47083b.addOnSuccessListener(this.f47084c.f47092a.f47427a, new m9.B(26));
    }

    @Override // md.AbstractC3555x
    public final AbstractC3538f f() {
        AbstractC3538f[] abstractC3538fArr = this.f47082a;
        A6.c.z(abstractC3538fArr[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
        return abstractC3538fArr[0];
    }
}
