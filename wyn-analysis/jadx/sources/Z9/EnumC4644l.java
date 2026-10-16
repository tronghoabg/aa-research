package z9;

import com.google.protobuf.Internal;

/* renamed from: z9.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC4644l implements Internal.EnumLite {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f48454a;

    EnumC4644l(int i5) {
        this.f48454a = i5;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f48454a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
