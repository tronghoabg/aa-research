package i.d.a;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class a implements eh {
    @Override // com.google.v.eh
    public final /* synthetic */ eg findValueByNumber(int i2) {
        if (i2 == 0) {
            return b.Unknown;
        }
        if (i2 == 1) {
            return b.CachedMethod;
        }
        if (i2 == 2) {
            return b.DeleteCachedMethod;
        }
        if (i2 != 3) {
            return null;
        }
        return b.PutCachedMethod;
    }
}
