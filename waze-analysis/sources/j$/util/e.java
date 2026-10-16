package j$.util;

import java.io.Serializable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class e extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new e("Unsupported " + str + " :" + serializable);
    }
}
