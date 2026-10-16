package defpackage;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ztc {
    public static final /* synthetic */ int d = 0;
    private static final Set e = new HashSet(Arrays.asList("anthias", "carp", "smelt", "sparrow", "sprat", "tetra", "wren"));
    public boolean a = false;
    public final boolean b;
    public final oct c;

    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public ztc(oct octVar) {
        this.c = octVar;
        if (octVar.a.contains("IsLowBitDisplay")) {
            this.b = octVar.a.getBoolean("IsLowBitDisplay", false);
        } else {
            this.b = e.contains(Build.DEVICE);
        }
    }

    public final void a() {
        this.a = false;
    }
}
