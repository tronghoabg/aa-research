package Va;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class L1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Any any = (Any) arrayList.get(0);
        C0939d2.f14094U = (C0939d2.f14093T + 31) % 128;
        ByteString byteStringI0 = C0939d2.I0(any);
        C0939d2.f14093T = (C0939d2.f14094U + 5) % 128;
        return byteStringI0;
    }
}
