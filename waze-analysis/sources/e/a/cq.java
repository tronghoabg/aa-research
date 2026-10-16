package e.a;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cq<ReqT, RespT> {

    /* renamed from: a, reason: collision with root package name */
    private final cp f46550a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46551b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46552c;

    /* renamed from: d, reason: collision with root package name */
    private final co f46553d;

    /* renamed from: e, reason: collision with root package name */
    private final co f46554e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f46555f;

    /* synthetic */ cq(cp cpVar, String str, co coVar, co coVar2, boolean z) {
        new AtomicReferenceArray(2);
        com.google.d.b.an.C(cpVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f46550a = cpVar;
        com.google.d.b.an.C(str, "fullMethodName");
        this.f46551b = str;
        com.google.d.b.an.C(str, "fullMethodName");
        int iLastIndexOf = str.lastIndexOf(47);
        this.f46552c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        com.google.d.b.an.C(coVar, "requestMarshaller");
        this.f46553d = coVar;
        com.google.d.b.an.C(coVar2, "responseMarshaller");
        this.f46554e = coVar2;
        this.f46555f = z;
    }

    public static cn a() {
        cn cnVar = new cn();
        cnVar.c(null);
        cnVar.d(null);
        return cnVar;
    }

    public static String e(String str, String str2) {
        com.google.d.b.an.C(str, "fullServiceName");
        com.google.d.b.an.C(str2, "methodName");
        return str + DomExceptionUtils.SEPARATOR + str2;
    }

    public final cp b() {
        return this.f46550a;
    }

    public final InputStream c(Object obj) {
        return this.f46553d.a(obj);
    }

    public final Object d(InputStream inputStream) {
        return this.f46554e.b(inputStream);
    }

    public final String f() {
        return this.f46551b;
    }

    public final String g() {
        return this.f46552c;
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("fullMethodName", this.f46551b);
        zVarH.d(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, this.f46550a);
        zVarH.e("idempotent", false);
        zVarH.e("safe", false);
        zVarH.e("sampledToLocalTracing", this.f46555f);
        zVarH.d("requestMarshaller", this.f46553d);
        zVarH.d("responseMarshaller", this.f46554e);
        zVarH.d("schemaDescriptor", null);
        zVarH.a();
        return zVarH.toString();
    }
}
