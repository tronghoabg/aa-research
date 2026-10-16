package md;

import A7.C0237b0;
import R8.C0805a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* renamed from: md.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3535c {

    /* renamed from: i, reason: collision with root package name */
    public static final C3535c f40619i;

    /* renamed from: a, reason: collision with root package name */
    public final r f40620a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f40621b;

    /* renamed from: c, reason: collision with root package name */
    public final v9.i f40622c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[][] f40623d;

    /* renamed from: e, reason: collision with root package name */
    public final List f40624e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f40625f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f40626g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f40627h;

    static {
        C0805a c0805a = new C0805a();
        c0805a.f10439d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        c0805a.f10440e = Collections.EMPTY_LIST;
        f40619i = new C3535c(c0805a);
    }

    public C3535c(C0805a c0805a) {
        this.f40620a = (r) c0805a.f10436a;
        this.f40621b = (Executor) c0805a.f10437b;
        this.f40622c = (v9.i) c0805a.f10438c;
        this.f40623d = (Object[][]) c0805a.f10439d;
        this.f40624e = (List) c0805a.f10440e;
        this.f40625f = (Boolean) c0805a.f10441f;
        this.f40626g = (Integer) c0805a.f10442g;
        this.f40627h = (Integer) c0805a.f10443h;
    }

    public static C0805a b(C3535c c3535c) {
        C0805a c0805a = new C0805a();
        c0805a.f10436a = c3535c.f40620a;
        c0805a.f10437b = c3535c.f40621b;
        c0805a.f10438c = c3535c.f40622c;
        c0805a.f10439d = c3535c.f40623d;
        c0805a.f10440e = c3535c.f40624e;
        c0805a.f10441f = c3535c.f40625f;
        c0805a.f10442g = c3535c.f40626g;
        c0805a.f10443h = c3535c.f40627h;
        return c0805a;
    }

    public final Object a(B8.e eVar) {
        Fe.e.t(eVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        int i5 = 0;
        while (true) {
            Object[][] objArr = this.f40623d;
            if (i5 >= objArr.length) {
                return null;
            }
            if (eVar.equals(objArr[i5][0])) {
                return objArr[i5][1];
            }
            i5++;
        }
    }

    public final C3535c c(B8.e eVar, Object obj) {
        Object[][] objArr;
        Fe.e.t(eVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        C0805a c0805aB = b(this);
        int i5 = 0;
        while (true) {
            objArr = this.f40623d;
            if (i5 >= objArr.length) {
                i5 = -1;
                break;
            }
            if (eVar.equals(objArr[i5][0])) {
                break;
            }
            i5++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i5 == -1 ? 1 : 0), 2);
        c0805aB.f10439d = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i5 == -1) {
            ((Object[][]) c0805aB.f10439d)[objArr.length] = new Object[]{eVar, obj};
        } else {
            ((Object[][]) c0805aB.f10439d)[i5] = new Object[]{eVar, obj};
        }
        return new C3535c(c0805aB);
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f40620a, "deadline");
        c0237b0S.f(null, "authority");
        c0237b0S.f(this.f40622c, "callCredentials");
        Executor executor = this.f40621b;
        c0237b0S.f(executor != null ? executor.getClass() : null, "executor");
        c0237b0S.f(null, "compressorName");
        c0237b0S.f(Arrays.deepToString(this.f40623d), "customOptions");
        c0237b0S.g("waitForReady", Boolean.TRUE.equals(this.f40625f));
        c0237b0S.f(this.f40626g, "maxInboundMessageSize");
        c0237b0S.f(this.f40627h, "maxOutboundMessageSize");
        c0237b0S.f(this.f40624e, "streamTracerFactories");
        return c0237b0S.toString();
    }
}
