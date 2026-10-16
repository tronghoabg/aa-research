package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.GhApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class vwj implements aezk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vwj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ackk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aezk, java.lang.Object] */
    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        switch (this.b) {
            case 0:
                return false;
            case 1:
                ?? r1 = this.a;
                if (!((xxh) r1.a()).f()) {
                    return null;
                }
                return null;
            case 2:
                return ((GhApplication) this.a).a;
            case 3:
                int i = GhApplication.b;
                return this.a;
            case 4:
                int i2 = GhApplication.b;
                return this.a;
            case 5:
                return ((GhApplication) this.a).a;
            case 6:
                int i3 = GhApplication.b;
                return this.a;
            case 7:
                return (rqb) this.a.gu();
            case 8:
                return new wym((Context) this.a);
            case 9:
                return new xfx((Context) this.a);
            default:
                return new xfl((Context) this.a);
        }
    }
}
