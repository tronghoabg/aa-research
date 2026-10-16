package defpackage;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class i9 implements RemoteUtils.RemoteCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ IOnDoneCallback b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i9(IOnDoneCallback iOnDoneCallback, Object obj, String str, int i) {
        this.a = i;
        this.b = iOnDoneCallback;
        this.d = obj;
        this.c = str;
    }

    @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
    public final Object call() {
        switch (this.a) {
            case 0:
                return RemoteUtils.lambda$sendSuccessResponseToHost$3(this.b, this.d, this.c);
            default:
                return RemoteUtils.lambda$sendFailureResponseToHost$4(this.b, (Throwable) this.d, this.c);
        }
    }
}
