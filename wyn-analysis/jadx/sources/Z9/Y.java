package z9;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public final class Y implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f48439a = new Y();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i5) {
        return (i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? null : Z.IMAGE_UNSUPPORTED_FORMAT : Z.IMAGE_DISPLAY_ERROR : Z.IMAGE_FETCH_ERROR : Z.UNSPECIFIED_RENDER_ERROR) != null;
    }
}
