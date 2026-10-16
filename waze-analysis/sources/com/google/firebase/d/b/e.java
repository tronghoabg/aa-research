package com.google.firebase.d.b;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.d.g;
import com.google.firebase.d.h;
import com.google.firebase.d.i;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements g, i {

    /* renamed from: a, reason: collision with root package name */
    private final JsonWriter f9832a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9833b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f9834c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.d.f f9835d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9836e;

    e(Writer writer, Map map, Map map2, com.google.firebase.d.f fVar, boolean z) {
        this.f9832a = new JsonWriter(writer);
        this.f9833b = map;
        this.f9834c = map2;
        this.f9835d = fVar;
        this.f9836e = z;
    }

    @Override // com.google.firebase.d.g
    public final void a(com.google.firebase.d.e eVar, double d2) throws IOException {
        JsonWriter jsonWriter = this.f9832a;
        jsonWriter.name(eVar.c());
        jsonWriter.value(d2);
    }

    @Override // com.google.firebase.d.g
    public final void b(com.google.firebase.d.e eVar, int i2) throws IOException {
        this.f9832a.name(eVar.c());
        i(i2);
    }

    @Override // com.google.firebase.d.g
    public final void c(com.google.firebase.d.e eVar, long j2) throws IOException {
        this.f9832a.name(eVar.c());
        j(j2);
    }

    @Override // com.google.firebase.d.g
    public final void d(com.google.firebase.d.e eVar, Object obj) throws IOException {
        n(eVar.c(), obj);
    }

    @Override // com.google.firebase.d.g
    public final void e(com.google.firebase.d.e eVar, boolean z) throws IOException {
        this.f9832a.name(eVar.c());
        g(z);
    }

    final void h() throws IOException {
        this.f9832a.flush();
    }

    public final void i(int i2) throws IOException {
        this.f9832a.value(i2);
    }

    public final void j(long j2) throws IOException {
        this.f9832a.value(j2);
    }

    @Override // com.google.firebase.d.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void f(String str) throws IOException {
        this.f9832a.value(str);
    }

    @Override // com.google.firebase.d.i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void g(boolean z) throws IOException {
        this.f9832a.value(z);
    }

    final void m(com.google.firebase.d.f fVar, Object obj) throws IOException {
        JsonWriter jsonWriter = this.f9832a;
        jsonWriter.beginObject();
        fVar.a(obj, this);
        jsonWriter.endObject();
    }

    public final void n(String str, Object obj) throws IOException {
        if (this.f9836e) {
            if (obj == null) {
                return;
            }
            this.f9832a.name(str);
            o(obj);
            return;
        }
        JsonWriter jsonWriter = this.f9832a;
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            o(obj);
        }
    }

    final void o(Object obj) throws IOException {
        if (obj == null) {
            this.f9832a.nullValue();
            return;
        }
        if (obj instanceof Number) {
            this.f9832a.value((Number) obj);
            return;
        }
        int i2 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                JsonWriter jsonWriter = this.f9832a;
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    o(it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (obj instanceof Map) {
                this.f9832a.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        n((String) key, entry.getValue());
                    } catch (ClassCastException e2) {
                        throw new com.google.firebase.d.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e2);
                    }
                }
                this.f9832a.endObject();
                return;
            }
            com.google.firebase.d.f fVar = (com.google.firebase.d.f) this.f9833b.get(obj.getClass());
            if (fVar != null) {
                m(fVar, obj);
                return;
            }
            h hVar = (h) this.f9834c.get(obj.getClass());
            if (hVar != null) {
                hVar.a(obj, this);
                return;
            }
            if (!(obj instanceof Enum)) {
                m(this.f9835d, obj);
                return;
            } else if (obj instanceof f) {
                i(((f) obj).a());
                return;
            } else {
                f(((Enum) obj).name());
                return;
            }
        }
        if (obj instanceof byte[]) {
            this.f9832a.value(Base64.encodeToString((byte[]) obj, 2));
            return;
        }
        JsonWriter jsonWriter2 = this.f9832a;
        jsonWriter2.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i2 < length) {
                jsonWriter2.value(r6[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                j(jArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i2 < length3) {
                jsonWriter2.value(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i2 < length4) {
                jsonWriter2.value(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i2 < length5) {
                o(numberArr[i2]);
                i2++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i2 < length6) {
                o(objArr[i2]);
                i2++;
            }
        }
        jsonWriter2.endArray();
    }
}
