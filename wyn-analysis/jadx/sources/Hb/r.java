package hb;

import cg.C1618g;
import cg.InterfaceC1619h;
import cg.InterfaceC1620i;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class r {
    public final r failOnUnknown() {
        return new C2813p(this, 2);
    }

    public abstract Object fromJson(w wVar);

    public final Object fromJson(String str) throws IOException {
        C1618g c1618g = new C1618g();
        c1618g.d0(str);
        x xVar = new x(c1618g);
        Object objFromJson = fromJson(xVar);
        if (isLenient() || xVar.P() == v.f36357j) {
            return objFromJson;
        }
        throw new E5.Q("JSON document was not fully consumed.", 11);
    }

    public final Object fromJsonValue(Object obj) {
        C2795A c2795a = new C2795A();
        int[] iArr = c2795a.f36359b;
        int i5 = c2795a.f36358a;
        iArr[i5] = 7;
        Object[] objArr = new Object[32];
        c2795a.f36231g = objArr;
        c2795a.f36358a = i5 + 1;
        objArr[i5] = obj;
        try {
            return fromJson(c2795a);
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public r indent(String str) {
        if (str != null) {
            return new C2804g(str, this);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    public final r lenient() {
        return new C2813p(this, 1);
    }

    public final r nonNull() {
        return this instanceof ib.a ? this : new ib.a(this);
    }

    public final r nullSafe() {
        return this instanceof ib.b ? this : new ib.b(this);
    }

    public final r serializeNulls() {
        return new C2813p(this, 0);
    }

    public final String toJson(Object obj) {
        C1618g c1618g = new C1618g();
        try {
            toJson(c1618g, obj);
            return c1618g.readUtf8();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public abstract void toJson(AbstractC2797C abstractC2797C, Object obj);

    public final Object toJsonValue(Object obj) {
        C2796B c2796b = new C2796B();
        c2796b.f36232j = new Object[32];
        c2796b.B(6);
        try {
            toJson(c2796b, obj);
            int i5 = c2796b.f36233a;
            if (i5 > 1 || (i5 == 1 && c2796b.f36234b[i5 - 1] != 7)) {
                throw new IllegalStateException("Incomplete document");
            }
            return c2796b.f36232j[0];
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final void toJson(InterfaceC1619h interfaceC1619h, Object obj) throws IOException {
        toJson(new y(interfaceC1619h), obj);
    }

    public final Object fromJson(InterfaceC1620i interfaceC1620i) throws IOException {
        return fromJson(new x(interfaceC1620i));
    }
}
