package md;

import java.nio.charset.Charset;
import java.util.BitSet;
import m8.C3496c;
import od.Y1;

/* loaded from: classes5.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f40576a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final C3496c f40577b = b0.f40616e;

    public static Z a(String str, Y1 y12) {
        boolean z2 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z2 = true;
        }
        BitSet bitSet = Y.f40606d;
        return new Z(str, z2, y12);
    }
}
