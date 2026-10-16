package com.bumptech.glide.load.a.b;

import j$.util.Objects;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m implements com.bumptech.glide.g.a.d {
    m(o oVar) {
        Objects.requireNonNull(oVar);
    }

    public static final n b() {
        try {
            return new n(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.bumptech.glide.g.a.d
    public final /* bridge */ /* synthetic */ Object a() {
        return b();
    }
}
