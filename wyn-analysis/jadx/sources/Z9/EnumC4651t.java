package z9;

import com.google.protobuf.Internal;

/* renamed from: z9.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC4651t implements Internal.EnumLite {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f48467a;

    EnumC4651t(int i5) {
        this.f48467a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f48467a;
    }
}
