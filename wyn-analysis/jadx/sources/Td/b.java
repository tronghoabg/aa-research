package td;

import Fe.e;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f46035d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Parser f46036a;

    /* renamed from: b, reason: collision with root package name */
    public final GeneratedMessageLite f46037b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46038c;

    public b(GeneratedMessageLite generatedMessageLite) {
        e.t(generatedMessageLite, "defaultInstance cannot be null");
        this.f46037b = generatedMessageLite;
        this.f46036a = generatedMessageLite.getParserForType();
        this.f46038c = -1;
    }
}
