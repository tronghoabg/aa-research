package Va;

import com.explorestack.protobuf.ByteString;
import java.util.ArrayList;

/* renamed from: Va.c2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0926c2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ByteString byteString = (ByteString) arrayList.get(0);
        C0939d2.f14094U = (C0939d2.f14093T + 67) % 128;
        String strG0 = C0939d2.G0(byteString);
        C0939d2.f14093T = (C0939d2.f14094U + 7) % 128;
        return strG0;
    }
}
