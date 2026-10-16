package androidx.compose.ui.autofill;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ContentDataType_androidKt {
    public static final ContentDataType ContentDataType(int i2) {
        return AndroidContentDataType.m7722boximpl(i2);
    }

    public static final int getDataType(ContentDataType contentDataType) {
        x.d(contentDataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) contentDataType).m7728unboximpl();
    }
}
