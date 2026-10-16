package androidx.car.app;

import androidx.car.app.IOnRequestPermissionsListener;
import defpackage.ae;
import defpackage.eps;
import defpackage.ept;
import defpackage.qn;
import defpackage.qv;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class CarContext$1 extends IOnRequestPermissionsListener.Stub {
    final /* synthetic */ qn this$0;
    final /* synthetic */ Executor val$executor;
    final /* synthetic */ ept val$lifecycle;
    final /* synthetic */ qv val$listener;

    public CarContext$1(qn qnVar, ept eptVar, Executor executor, qv qvVar) {
        this.this$0 = qnVar;
        this.val$lifecycle = eptVar;
        this.val$executor = executor;
        this.val$listener = qvVar;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnRequestPermissionsListener
    public void onRequestPermissionsResult(String[] strArr, String[] strArr2) {
        if (this.val$lifecycle.a().a(eps.c)) {
            this.val$executor.execute(new ae((Object) this.val$listener, (Object) Arrays.asList(strArr), (Object) Arrays.asList(strArr2), 4, (byte[]) null));
        }
    }
}
