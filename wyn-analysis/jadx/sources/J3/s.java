package J3;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f5585a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.p f5586b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5587c;

    public s(UUID id2, S3.p workSpec, Set tags) {
        AbstractC3340k.e(id2, "id");
        AbstractC3340k.e(workSpec, "workSpec");
        AbstractC3340k.e(tags, "tags");
        this.f5585a = id2;
        this.f5586b = workSpec;
        this.f5587c = tags;
    }
}
