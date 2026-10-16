package androidx.car.app;

import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CarAppBinder) this.b).lambda$getManager$7((String) this.c, (IOnDoneCallback) this.d);
                break;
            default:
                ((OnRequestPermissionsListener) this.b).onRequestPermissionsResult((List) this.c, (List) this.d);
                break;
        }
    }
}
