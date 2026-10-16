package k9;

import com.unity3d.services.UnityAdsConstants;
import j9.C3091a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes4.dex */
public final class f implements h9.f {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f39327f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final h9.d f39328g = new h9.d(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, pd.f.n(pd.f.m(e.class, new C3212a(1))));

    /* renamed from: h, reason: collision with root package name */
    public static final h9.d f39329h = new h9.d(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, pd.f.n(pd.f.m(e.class, new C3212a(2))));

    /* renamed from: i, reason: collision with root package name */
    public static final C3091a f39330i = new C3091a(1);

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f39331a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39332b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f39333c;

    /* renamed from: d, reason: collision with root package name */
    public final C3091a f39334d;

    /* renamed from: e, reason: collision with root package name */
    public final h f39335e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C3091a c3091a) {
        this.f39331a = byteArrayOutputStream;
        this.f39332b = map;
        this.f39333c = map2;
        this.f39334d = c3091a;
    }

    public static int e(h9.d dVar) {
        e eVar = (e) dVar.b(e.class);
        if (eVar != null) {
            return ((C3212a) eVar).f39323a;
        }
        throw new h9.b("Field has no @Protobuf config");
    }

    public final void a(h9.d dVar, double d3, boolean z2) throws IOException {
        if (z2 && d3 == 0.0d) {
            return;
        }
        f((e(dVar) << 3) | 1);
        this.f39331a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d3).array());
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, Object obj) {
        c(dVar, obj, true);
        return this;
    }

    public final void b(h9.d dVar, int i5, boolean z2) {
        if (z2 && i5 == 0) {
            return;
        }
        e eVar = (e) dVar.b(e.class);
        if (eVar == null) {
            throw new h9.b("Field has no @Protobuf config");
        }
        f(((C3212a) eVar).f39323a << 3);
        f(i5);
    }

    public final void c(h9.d dVar, Object obj, boolean z2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z2 && charSequence.length() == 0) {
                return;
            }
            f((e(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f39327f);
            f(bytes.length);
            this.f39331a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(dVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(f39330i, dVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            a(dVar, ((Double) obj).doubleValue(), z2);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z2 && fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            f((e(dVar) << 3) | 5);
            this.f39331a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z2 && jLongValue == 0) {
                return;
            }
            e eVar = (e) dVar.b(e.class);
            if (eVar == null) {
                throw new h9.b("Field has no @Protobuf config");
            }
            f(((C3212a) eVar).f39323a << 3);
            g(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(dVar, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z2 && bArr.length == 0) {
                return;
            }
            f((e(dVar) << 3) | 2);
            f(bArr.length);
            this.f39331a.write(bArr);
            return;
        }
        h9.e eVar2 = (h9.e) this.f39332b.get(obj.getClass());
        if (eVar2 != null) {
            d(eVar2, dVar, obj, z2);
            return;
        }
        h9.g gVar = (h9.g) this.f39333c.get(obj.getClass());
        if (gVar != null) {
            h hVar = this.f39335e;
            hVar.f39337a = false;
            hVar.f39339c = dVar;
            hVar.f39338b = z2;
            gVar.encode(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            b(dVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            b(dVar, ((Enum) obj).ordinal(), true);
        } else {
            d(this.f39334d, dVar, obj, z2);
        }
    }

    public final void d(h9.e eVar, h9.d dVar, Object obj, boolean z2) throws IOException {
        C3213b c3213b = new C3213b();
        c3213b.f39324a = 0L;
        try {
            OutputStream outputStream = this.f39331a;
            this.f39331a = c3213b;
            try {
                eVar.encode(obj, this);
                this.f39331a = outputStream;
                long j8 = c3213b.f39324a;
                c3213b.close();
                if (z2 && j8 == 0) {
                    return;
                }
                f((e(dVar) << 3) | 2);
                g(j8);
                eVar.encode(obj, this);
            } catch (Throwable th) {
                this.f39331a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c3213b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void f(int i5) throws IOException {
        while ((i5 & (-128)) != 0) {
            this.f39331a.write((i5 & 127) | 128);
            i5 >>>= 7;
        }
        this.f39331a.write(i5 & 127);
    }

    public final void g(long j8) throws IOException {
        while (((-128) & j8) != 0) {
            this.f39331a.write((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        this.f39331a.write(((int) j8) & 127);
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, double d3) throws IOException {
        a(dVar, d3, true);
        return this;
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, int i5) {
        b(dVar, i5, true);
        return this;
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, boolean z2) {
        b(dVar, z2 ? 1 : 0, true);
        return this;
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, long j8) throws IOException {
        if (j8 == 0) {
            return this;
        }
        e eVar = (e) dVar.b(e.class);
        if (eVar != null) {
            f(((C3212a) eVar).f39323a << 3);
            g(j8);
            return this;
        }
        throw new h9.b("Field has no @Protobuf config");
    }
}
