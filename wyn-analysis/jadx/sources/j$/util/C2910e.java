package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2910e extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C2910e("Unsupported " + str + " :" + serializable);
    }
}
