package z9;

import com.google.protobuf.Internal;

/* renamed from: z9.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4650s implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C4650s f48462a = new C4650s();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return (i5 != 0 ? i5 != 1 ? i5 != 2 ? null : EnumC4651t.CLICK_EVENT_TYPE : EnumC4651t.IMPRESSION_EVENT_TYPE : EnumC4651t.UNKNOWN_EVENT_TYPE) != null;
    }
}
