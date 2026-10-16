package hb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* renamed from: hb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2799b extends AbstractC2801d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f36307h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2799b(Type type, Set set, Object obj, Method method, int i5, int i10, boolean z2, int i11) {
        super(type, set, obj, method, i5, i10, z2);
        this.f36307h = i11;
    }

    @Override // hb.AbstractC2801d
    public Object b(w wVar) {
        switch (this.f36307h) {
            case 1:
                return c(wVar);
            default:
                return super.b(wVar);
        }
    }

    @Override // hb.AbstractC2801d
    public void d(AbstractC2797C abstractC2797C, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f36307h) {
            case 0:
                r[] rVarArr = this.f36318f;
                Object[] objArr = new Object[rVarArr.length + 2];
                objArr[0] = abstractC2797C;
                objArr[1] = obj;
                System.arraycopy(rVarArr, 0, objArr, 2, rVarArr.length);
                try {
                    this.f36316d.invoke(this.f36315c, objArr);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                }
            default:
                super.d(abstractC2797C, obj);
                return;
        }
    }
}
