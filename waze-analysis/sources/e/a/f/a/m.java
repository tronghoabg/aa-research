package e.a.f.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum m {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: f, reason: collision with root package name */
    private final String f47596f;

    m(String str) {
        this.f47596f = str;
    }

    public static m a(String str) throws IOException {
        m mVar = HTTP_1_0;
        if (str.equals(mVar.f47596f)) {
            return mVar;
        }
        m mVar2 = HTTP_1_1;
        if (str.equals(mVar2.f47596f)) {
            return mVar2;
        }
        m mVar3 = HTTP_2;
        if (str.equals(mVar3.f47596f)) {
            return mVar3;
        }
        m mVar4 = SPDY_3;
        if (str.equals(mVar4.f47596f)) {
            return mVar4;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f47596f;
    }
}
