package ga;

import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.G;
import lf.AbstractC3471j;
import org.json.JSONObject;
import tf.p;

/* renamed from: ga.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2716b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public G f35782a;

    /* renamed from: b, reason: collision with root package name */
    public G f35783b;

    /* renamed from: c, reason: collision with root package name */
    public int f35784c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f35785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2718d f35786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2716b(C2718d c2718d, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35786e = c2718d;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2716b c2716b = new C2716b(this.f35786e, interfaceC3103c);
        c2716b.f35785d = obj;
        return c2716b;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2716b) create((JSONObject) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        if (r15 == r4) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011b A[PHI: r0 r1
  0x011b: PHI (r0v10 kotlin.jvm.internal.G) = (r0v7 kotlin.jvm.internal.G), (r0v7 kotlin.jvm.internal.G), (r0v11 kotlin.jvm.internal.G) binds: [B:48:0x00f8, B:53:0x0117, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x011b: PHI (r1v10 kotlin.jvm.internal.G) = (r1v6 kotlin.jvm.internal.G), (r1v6 kotlin.jvm.internal.G), (r1v15 kotlin.jvm.internal.G) binds: [B:48:0x00f8, B:53:0x0117, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[PHI: r0
  0x0142: PHI (r0v12 kotlin.jvm.internal.G) = (r0v10 kotlin.jvm.internal.G), (r0v10 kotlin.jvm.internal.G), (r0v17 kotlin.jvm.internal.G) binds: [B:56:0x011f, B:61:0x013e, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6 A[RETURN] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.C2716b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
