package Va;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class S extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13670c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ B7 f13671d;

    @Override // Va.Ba
    public final void c() {
        switch (this.f13670c) {
            case 0:
                this.f13671d.q();
                return;
            default:
                int i5 = B7.f13228h;
                int i10 = i5 + 27;
                B7.f13229i = i10 % 128;
                int i11 = i10 % 2;
                B7 b72 = this.f13671d;
                if (i11 == 0) {
                    ArrayList arrayList = b72.f13235f;
                    throw null;
                }
                ArrayList arrayList2 = b72.f13235f;
                int i12 = i5 + 111;
                B7.f13229i = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                arrayList2.clear();
                return;
        }
    }
}
