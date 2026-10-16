package zg;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f48601a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Call.Factory f48602b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpUrl f48603c;

    /* renamed from: d, reason: collision with root package name */
    public final List f48604d;

    /* renamed from: e, reason: collision with root package name */
    public final List f48605e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f48606f;

    public T(Call.Factory factory, HttpUrl httpUrl, List list, List list2, Executor executor) {
        this.f48602b = factory;
        this.f48603c = httpUrl;
        this.f48604d = list;
        this.f48605e = list2;
        this.f48606f = executor;
    }

    public final InterfaceC4666e a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f48605e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = iIndexOf; i5 < size; i5++) {
            InterfaceC4666e interfaceC4666eA = ((AbstractC4665d) list.get(i5)).a(type, annotationArr);
            if (interfaceC4666eA != null) {
                return interfaceC4666eA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC4665d) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final InterfaceC4671j b(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f48604d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = iIndexOf; i5 < size; i5++) {
            InterfaceC4671j interfaceC4671jA = ((AbstractC4670i) list.get(i5)).a(type, annotationArr);
            if (interfaceC4671jA != null) {
                return interfaceC4671jA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC4670i) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final InterfaceC4671j c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f48604d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = iIndexOf; i5 < size; i5++) {
            InterfaceC4671j interfaceC4671jB = ((AbstractC4670i) list.get(i5)).b(type, annotationArr, this);
            if (interfaceC4671jB != null) {
                return interfaceC4671jB;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(((AbstractC4670i) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f48604d;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC4670i) list.get(i5)).getClass();
        }
    }
}
