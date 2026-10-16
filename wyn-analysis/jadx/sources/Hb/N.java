package hb;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes4.dex */
public final class N extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f36282a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f36283b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum[] f36284c;

    /* renamed from: d, reason: collision with root package name */
    public final u f36285d;

    public N(Class cls) throws NoSuchFieldException {
        this.f36282a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f36284c = enumArr;
            this.f36283b = new String[enumArr.length];
            int i5 = 0;
            while (true) {
                Enum[] enumArr2 = this.f36284c;
                if (i5 >= enumArr2.length) {
                    this.f36285d = u.a(this.f36283b);
                    return;
                }
                String strName = enumArr2[i5].name();
                String[] strArr = this.f36283b;
                Field field = cls.getField(strName);
                Set set = ib.f.f36939a;
                InterfaceC2812o interfaceC2812o = (InterfaceC2812o) field.getAnnotation(InterfaceC2812o.class);
                if (interfaceC2812o != null) {
                    String strName2 = interfaceC2812o.name();
                    if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName2)) {
                        strName = strName2;
                    }
                }
                strArr[i5] = strName;
                i5++;
            }
        } catch (NoSuchFieldException e7) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e7);
        }
    }

    @Override // hb.r
    public final Object fromJson(w wVar) {
        int iX = wVar.X(this.f36285d);
        if (iX != -1) {
            return this.f36284c[iX];
        }
        String strI = wVar.i();
        throw new E5.Q("Expected one of " + Arrays.asList(this.f36283b) + " but was " + wVar.J() + " at path " + strI, 11);
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) {
        abstractC2797C.V(this.f36283b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.f36282a.getName() + ")";
    }
}
