package j$.desugar.sun.nio.fs;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public HashSet f49643a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f49644b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f49645c;

    public final void a(Object obj, String str) {
        this.f49644b.put(str, obj);
    }

    public final boolean b(String str) {
        return this.f49645c || this.f49643a.contains(str);
    }
}
