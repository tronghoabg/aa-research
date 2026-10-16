package y3;

import android.os.Build;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4544b extends AbstractC4545c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4544b(int i5, String str, String str2) {
        super(str, str2);
        this.f47989d = i5;
    }

    @Override // y3.AbstractC4545c
    public final boolean a() {
        switch (this.f47989d) {
            case 0:
                return true;
            case 1:
                return Build.VERSION.SDK_INT >= 24;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
