package okhttp3;

import cg.C1618g;
import cg.InterfaceC1619h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.MediaType;
import okhttp3.internal.Util;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormBody extends RequestBody {

    /* renamed from: e, reason: collision with root package name */
    public static final MediaType f42256e;

    /* renamed from: c, reason: collision with root package name */
    public final List f42257c;

    /* renamed from: d, reason: collision with root package name */
    public final List f42258d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f42259a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f42260b = new ArrayList();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/FormBody$Companion;", "", "()V", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i5) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        MediaType.f42292d.getClass();
        f42256e = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList encodedNames, ArrayList encodedValues) {
        AbstractC3340k.e(encodedNames, "encodedNames");
        AbstractC3340k.e(encodedValues, "encodedValues");
        this.f42257c = Util.x(encodedNames);
        this.f42258d = Util.x(encodedValues);
    }

    public final long a(InterfaceC1619h interfaceC1619h, boolean z2) throws EOFException {
        C1618g buffer;
        if (z2) {
            buffer = new C1618g();
        } else {
            AbstractC3340k.b(interfaceC1619h);
            buffer = interfaceC1619h.getBuffer();
        }
        List list = this.f42257c;
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            int i10 = i5 + 1;
            if (i5 > 0) {
                buffer.X(38);
            }
            buffer.d0((String) list.get(i5));
            buffer.X(61);
            buffer.d0((String) this.f42258d.get(i5));
            i5 = i10;
        }
        if (!z2) {
            return 0L;
        }
        long j8 = buffer.f19902b;
        buffer.a();
        return j8;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType getF42304e() {
        return f42256e;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC1619h interfaceC1619h) throws EOFException {
        a(interfaceC1619h, false);
    }
}
