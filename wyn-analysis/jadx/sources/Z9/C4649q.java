package z9;

import com.google.protobuf.Internal;

/* renamed from: z9.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4649q implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final C4649q f48455a = new C4649q();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return (i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? null : r.SWIPE : r.CLICK : r.AUTO : r.UNKNOWN_DISMISS_TYPE) != null;
    }
}
