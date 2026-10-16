package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileAttribute f49729a;

    public s(FileAttribute fileAttribute) {
        this.f49729a = fileAttribute;
    }

    @Override // j$.nio.file.attribute.r
    public final String name() {
        return "posix:permissions";
    }

    @Override // j$.nio.file.attribute.r
    public final Object value() {
        return Collections.unmodifiableSet(j$.nio.file.a.m((Set) this.f49729a.value()));
    }
}
