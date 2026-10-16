package android.support.v4.app;

import android.content.res.Configuration;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.util.Consumer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class as implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f133a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f134b;

    public /* synthetic */ as(Object obj, int i2) {
        this.f134b = i2;
        this.f133a = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i2 = this.f134b;
        if (i2 == 0) {
            ((av) this.f133a).f141e.j();
            return;
        }
        if (i2 == 1) {
            ((av) this.f133a).f141e.j();
            return;
        }
        if (i2 == 2) {
            ((bv) this.f133a).ak((Configuration) obj);
        } else if (i2 == 3) {
            ((bv) this.f133a).al((Integer) obj);
        } else if (i2 != 4) {
            ((bv) this.f133a).an((PictureInPictureModeChangedInfo) obj);
        } else {
            ((bv) this.f133a).am((MultiWindowModeChangedInfo) obj);
        }
    }
}
