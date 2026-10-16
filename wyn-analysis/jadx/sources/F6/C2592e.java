package f6;

import java.io.IOException;

/* renamed from: f6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2592e extends IOException {
    public C2592e(int i5) {
        super("Illegal clipping: ".concat(i5 != 0 ? i5 != 1 ? i5 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
