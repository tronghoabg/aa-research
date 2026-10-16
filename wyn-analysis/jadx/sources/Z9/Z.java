package z9;

import com.google.protobuf.Internal;

/* loaded from: classes4.dex */
public enum Z implements Internal.EnumLite {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f48445a;

    Z(int i5) {
        this.f48445a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f48445a;
    }
}
