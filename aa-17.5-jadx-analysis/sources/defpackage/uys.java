package defpackage;

import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class uys extends Level {
    public static final uys a = new uys(Level.SEVERE.intValue() + 100);

    private uys(int i) {
        super("DEBUG_FATAL", i);
    }
}
