package hb;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: hb.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2804g extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final C2803f f36323d = new C2803f(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C2803f f36324e = new C2803f(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36325a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final r f36326b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36327c;

    public C2804g(K k, Type type, Type type2) {
        this.f36326b = k.b(type);
        this.f36327c = k.b(type2);
    }

    @Override // hb.r
    public final Object fromJson(w wVar) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        switch (this.f36325a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                wVar.a();
                while (wVar.o()) {
                    arrayList.add(this.f36326b.fromJson(wVar));
                }
                wVar.d();
                Object objNewInstance = Array.newInstance((Class<?>) this.f36327c, arrayList.size());
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    Array.set(objNewInstance, i5, arrayList.get(i5));
                }
                return objNewInstance;
            case 1:
                H h10 = new H();
                wVar.b();
                while (wVar.o()) {
                    wVar.Q();
                    Object objFromJson = this.f36326b.fromJson(wVar);
                    Object objFromJson2 = ((r) this.f36327c).fromJson(wVar);
                    Object objPut = h10.put(objFromJson, objFromJson2);
                    if (objPut != null) {
                        throw new E5.Q("Map key '" + objFromJson + "' has multiple values at path " + wVar.i() + ": " + objPut + " and " + objFromJson2, 11);
                    }
                }
                wVar.h();
                return h10;
            default:
                return this.f36326b.fromJson(wVar);
        }
    }

    @Override // hb.r
    public boolean isLenient() {
        switch (this.f36325a) {
            case 2:
                return this.f36326b.isLenient();
            default:
                return super.isLenient();
        }
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) {
        switch (this.f36325a) {
            case 0:
                abstractC2797C.a();
                int length = Array.getLength(obj);
                for (int i5 = 0; i5 < length; i5++) {
                    this.f36326b.toJson(abstractC2797C, Array.get(obj, i5));
                }
                abstractC2797C.h();
                return;
            case 1:
                abstractC2797C.b();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new E5.Q("Map key is null at " + abstractC2797C.o(), 11);
                    }
                    int iZ = abstractC2797C.z();
                    if (iZ != 5 && iZ != 3) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    abstractC2797C.f36240h = true;
                    this.f36326b.toJson(abstractC2797C, entry.getKey());
                    ((r) this.f36327c).toJson(abstractC2797C, entry.getValue());
                }
                abstractC2797C.i();
                return;
            default:
                String str = abstractC2797C.f36237e;
                if (str == null) {
                    str = "";
                }
                abstractC2797C.D((String) this.f36327c);
                try {
                    this.f36326b.toJson(abstractC2797C, obj);
                    return;
                } finally {
                    abstractC2797C.D(str);
                }
        }
    }

    public final String toString() {
        switch (this.f36325a) {
            case 0:
                return this.f36326b + ".array()";
            case 1:
                return "JsonAdapter(" + this.f36326b + "=" + ((r) this.f36327c) + ")";
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f36326b);
                sb2.append(".indent(\"");
                return wg.b.c(sb2, (String) this.f36327c, "\")");
        }
    }

    public C2804g(Class cls, r rVar) {
        this.f36327c = cls;
        this.f36326b = rVar;
    }

    public C2804g(String str, r rVar) {
        this.f36326b = rVar;
        this.f36327c = str;
    }
}
