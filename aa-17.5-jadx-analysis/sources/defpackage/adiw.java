package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class adiw {
    public static final adiw a;
    public final adjr b;
    public final Executor c;
    public final String d = null;
    public final List e;
    public final Integer f;
    public final Integer g;
    public final aclh h;
    private final Object[][] i;
    private final Boolean j;

    static {
        adiu adiuVar = new adiu();
        adiuVar.c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        adiuVar.d = Collections.EMPTY_LIST;
        a = new adiw(adiuVar);
    }

    public adiw(adiu adiuVar) {
        this.b = adiuVar.a;
        this.c = adiuVar.b;
        this.h = adiuVar.h;
        this.i = adiuVar.c;
        this.e = adiuVar.d;
        this.j = adiuVar.e;
        this.f = adiuVar.f;
        this.g = adiuVar.g;
    }

    public static adiu a(adiw adiwVar) {
        adiu adiuVar = new adiu();
        adiuVar.a = adiwVar.b;
        adiuVar.b = adiwVar.c;
        adiuVar.h = adiwVar.h;
        adiuVar.c = adiwVar.i;
        adiuVar.d = adiwVar.e;
        adiuVar.e = adiwVar.j;
        adiuVar.f = adiwVar.f;
        adiuVar.g = adiwVar.g;
        return adiuVar;
    }

    public final adiw b(adjr adjrVar) {
        adiu adiuVarA = a(this);
        adiuVarA.a = adjrVar;
        return new adiw(adiuVarA);
    }

    public final adiw c(Executor executor) {
        adiu adiuVarA = a(this);
        adiuVarA.b = executor;
        return new adiw(adiuVarA);
    }

    public final adiw d(int i) {
        woy.Q(i >= 0, "invalid maxsize %s", i);
        adiu adiuVarA = a(this);
        adiuVarA.f = Integer.valueOf(i);
        return new adiw(adiuVarA);
    }

    public final adiw e(int i) {
        woy.Q(i >= 0, "invalid maxsize %s", i);
        adiu adiuVarA = a(this);
        adiuVarA.g = Integer.valueOf(i);
        return new adiw(adiuVarA);
    }

    public final adiw f(adiv adivVar, Object obj) {
        Object[][] objArr;
        int length;
        adivVar.getClass();
        adiu adiuVarA = a(this);
        int i = 0;
        while (true) {
            objArr = this.i;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (adivVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        adiuVarA.c = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
        System.arraycopy(objArr, 0, adiuVarA.c, 0, length);
        if (i == -1) {
            adiuVarA.c[length] = new Object[]{adivVar, obj};
        } else {
            adiuVarA.c[i] = new Object[]{adivVar, obj};
        }
        return new adiw(adiuVarA);
    }

    public final Object g(adiv adivVar) {
        adivVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.i;
            if (i >= objArr.length) {
                return adivVar.a;
            }
            if (adivVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean h() {
        return Boolean.TRUE.equals(this.j);
    }

    public final adiw i(adqq adqqVar) {
        List list = this.e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(adqqVar);
        adiu adiuVarA = a(this);
        adiuVarA.d = DesugarCollections.unmodifiableList(arrayList);
        return new adiw(adiuVarA);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("deadline", this.b);
        xxgVarAo.b("authority", null);
        xxgVarAo.b("callCredentials", this.h);
        Executor executor = this.c;
        xxgVarAo.b("executor", executor != null ? executor.getClass() : null);
        xxgVarAo.b("compressorName", null);
        xxgVarAo.b("customOptions", Arrays.deepToString(this.i));
        xxgVarAo.h("waitForReady", h());
        xxgVarAo.b("maxInboundMessageSize", this.f);
        xxgVarAo.b("maxOutboundMessageSize", this.g);
        xxgVarAo.b("onReadyThreshold", null);
        xxgVarAo.b("streamTracerFactories", this.e);
        return xxgVarAo.toString();
    }
}
