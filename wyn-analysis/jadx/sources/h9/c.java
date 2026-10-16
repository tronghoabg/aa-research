package h9;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f36226a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f36227b = null;

    public d a() {
        return new d(this.f36227b, this.f36226a == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(new HashMap(this.f36226a)));
    }

    public void b(Annotation annotation) {
        if (this.f36226a == null) {
            this.f36226a = new HashMap();
        }
        this.f36226a.put(annotation.annotationType(), annotation);
    }
}
