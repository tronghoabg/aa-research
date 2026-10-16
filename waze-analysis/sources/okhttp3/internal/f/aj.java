package okhttp3.internal.f;

import java.io.IOException;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class aj extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final b f56138a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(b bVar) {
        super("stream was reset: ".concat(String.valueOf(bVar)));
        h.g.b.x.f(bVar, "errorCode");
        Objects.toString(bVar);
        this.f56138a = bVar;
    }
}
