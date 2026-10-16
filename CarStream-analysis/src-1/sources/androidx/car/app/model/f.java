package androidx.car.app.model;

import androidx.car.app.model.SearchCallbackDelegateImpl;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements RemoteUtils.HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchCallbackDelegateImpl.SearchCallbackStub b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(SearchCallbackDelegateImpl.SearchCallbackStub searchCallbackStub, String str, int i) {
        this.a = i;
        this.b = searchCallbackStub;
        this.c = str;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public final Object dispatch() {
        switch (this.a) {
            case 0:
                return this.b.lambda$onSearchSubmitted$1(this.c);
            default:
                return this.b.lambda$onSearchTextChanged$0(this.c);
        }
    }
}
