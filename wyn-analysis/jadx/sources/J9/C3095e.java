package j9;

import android.util.Base64;
import android.util.JsonWriter;
import h9.g;
import h9.h;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: j9.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3095e implements h9.f, h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f38686a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f38687b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f38688c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f38689d;

    /* renamed from: e, reason: collision with root package name */
    public final C3091a f38690e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38691f;

    public C3095e(Writer writer, HashMap map, HashMap map2, C3091a c3091a, boolean z2) {
        this.f38687b = new JsonWriter(writer);
        this.f38688c = map;
        this.f38689d = map2;
        this.f38690e = c3091a;
        this.f38691f = z2;
    }

    public final C3095e a(Object obj) throws IOException {
        int i5 = 0;
        JsonWriter jsonWriter = this.f38687b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        b(entry.getValue(), (String) key);
                    } catch (ClassCastException e7) {
                        throw new h9.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e7);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            h9.e eVar = (h9.e) this.f38688c.get(obj.getClass());
            if (eVar != null) {
                jsonWriter.beginObject();
                eVar.encode(obj, this);
                jsonWriter.endObject();
                return this;
            }
            g gVar = (g) this.f38689d.get(obj.getClass());
            if (gVar != null) {
                gVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f38690e.encode(obj, this);
                throw null;
            }
            if (obj instanceof InterfaceC3096f) {
                int number = ((InterfaceC3096f) obj).getNumber();
                c();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            c();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            c();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i5 < length) {
                jsonWriter.value(r8[i5]);
                i5++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i5 < length2) {
                long j8 = jArr[i5];
                c();
                jsonWriter.value(j8);
                i5++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i5 < length3) {
                jsonWriter.value(dArr[i5]);
                i5++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i5 < length4) {
                jsonWriter.value(zArr[i5]);
                i5++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i5 < length5) {
                a(numberArr[i5]);
                i5++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i5 < length6) {
                a(objArr[i5]);
                i5++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, double d3) throws IOException {
        String str = dVar.f36228a;
        c();
        JsonWriter jsonWriter = this.f38687b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(d3);
        return this;
    }

    public final C3095e b(Object obj, String str) throws IOException {
        boolean z2 = this.f38691f;
        JsonWriter jsonWriter = this.f38687b;
        if (z2) {
            if (obj == null) {
                return this;
            }
            c();
            jsonWriter.name(str);
            a(obj);
            return this;
        }
        c();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        a(obj);
        return this;
    }

    public final void c() {
        if (!this.f38686a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, int i5) throws IOException {
        String str = dVar.f36228a;
        c();
        JsonWriter jsonWriter = this.f38687b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(i5);
        return this;
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, long j8) throws IOException {
        String str = dVar.f36228a;
        c();
        JsonWriter jsonWriter = this.f38687b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(j8);
        return this;
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, Object obj) throws IOException {
        b(obj, dVar.f36228a);
        return this;
    }

    @Override // h9.f
    public final h9.f add(h9.d dVar, boolean z2) throws IOException {
        String str = dVar.f36228a;
        c();
        JsonWriter jsonWriter = this.f38687b;
        jsonWriter.name(str);
        c();
        jsonWriter.value(z2);
        return this;
    }

    @Override // h9.h
    public final h add(String str) throws IOException {
        c();
        this.f38687b.value(str);
        return this;
    }

    @Override // h9.h
    public final h add(boolean z2) throws IOException {
        c();
        this.f38687b.value(z2);
        return this;
    }
}
