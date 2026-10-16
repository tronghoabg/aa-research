package zg;

import ef.C2515C;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: zg.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4663b extends AbstractC4670i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f48622a;

    @Override // zg.AbstractC4670i
    public final InterfaceC4671j a(Type type, Annotation[] annotationArr) {
        if (RequestBody.class.isAssignableFrom(a0.f(type))) {
            return C4662a.f48616d;
        }
        return null;
    }

    @Override // zg.AbstractC4670i
    public final InterfaceC4671j b(Type type, Annotation[] annotationArr, T t10) {
        if (type == ResponseBody.class) {
            return a0.i(annotationArr, Bg.w.class) ? C4662a.f48617e : C4662a.f48615c;
        }
        if (type == Void.class) {
            return C4662a.f48619g;
        }
        if (!this.f48622a || type != C2515C.class) {
            return null;
        }
        try {
            return C4662a.f48618f;
        } catch (NoClassDefFoundError unused) {
            this.f48622a = false;
            return null;
        }
    }
}
