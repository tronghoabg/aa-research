package z9;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum r implements Internal.EnumLite {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f48461a;

    r(int i5) {
        this.f48461a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f48461a;
    }
}
