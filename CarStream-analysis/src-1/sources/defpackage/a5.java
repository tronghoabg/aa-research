package defpackage;

import androidx.car.app.HostCall;
import androidx.car.app.HostDispatcher;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements RemoteUtils.RemoteCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ HostDispatcher b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ HostCall e;

    public /* synthetic */ a5(HostDispatcher hostDispatcher, String str, String str2, HostCall hostCall, int i) {
        this.a = i;
        this.b = hostDispatcher;
        this.c = str;
        this.d = str2;
        this.e = hostCall;
    }

    @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
    public final Object call() {
        switch (this.a) {
            case 0:
                return this.b.lambda$dispatch$1(this.c, this.d, this.e);
            default:
                return this.b.lambda$dispatchForResult$0(this.c, this.d, this.e);
        }
    }
}
