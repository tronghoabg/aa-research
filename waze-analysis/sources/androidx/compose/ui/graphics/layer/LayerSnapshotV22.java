package androidx.compose.ui.graphics.layer;

import h.c.b.a.c;
import h.c.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayerSnapshotV22 implements LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final LayerSnapshotV22 INSTANCE = new LayerSnapshotV22();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LayerSnapshotV22.this.toBitmap(null, this);
        }
    }

    private LayerSnapshotV22() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer r11, h.c.e<? super android.graphics.Bitmap> r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.LayerSnapshotV22.toBitmap(androidx.compose.ui.graphics.layer.GraphicsLayer, h.c.e):java.lang.Object");
    }
}
