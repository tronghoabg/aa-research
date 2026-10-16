package dd;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import j$.util.Objects;
import uc.InterfaceC4265b;

/* renamed from: dd.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C2425d implements OnCompleteListener, InterfaceC4265b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2426e f34258b;

    public /* synthetic */ C2425d(C2426e c2426e, int i5) {
        this.f34257a = i5;
        this.f34258b = c2426e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    @Override // uc.InterfaceC4265b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.Object r20, ba.C1521a r21) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.C2425d.e(java.lang.Object, ba.a):void");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f34257a) {
            case 0:
                C2426e c2426e = this.f34258b;
                c2426e.getClass();
                if (!task.isSuccessful()) {
                    c2426e.b("status", "Failed to signout.");
                    break;
                } else {
                    m mVar = (m) c2426e.f34265g.f1846c;
                    Objects.requireNonNull(mVar);
                    mVar.success();
                    c2426e.f34265g = null;
                    break;
                }
            case 1:
                C2426e c2426e2 = this.f34258b;
                c2426e2.getClass();
                if (!task.isSuccessful()) {
                    c2426e2.b("status", "Failed to disconnect.");
                    break;
                } else {
                    m mVar2 = (m) c2426e2.f34265g.f1846c;
                    Objects.requireNonNull(mVar2);
                    mVar2.success();
                    c2426e2.f34265g = null;
                    break;
                }
            default:
                this.f34258b.e(task);
                break;
        }
    }
}
