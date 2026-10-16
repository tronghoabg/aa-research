package Yf;

import A7.C0237b0;
import androidx.appcompat.widget.ActionBarContextView;
import ef.AbstractC2517a;
import ef.C2515C;
import ef.C2518b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jf.InterfaceC3103c;
import k1.Y;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import kotlinx.serialization.json.JsonNull;
import md.C3535c;

/* loaded from: classes5.dex */
public final class B implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16806a;

    /* renamed from: b, reason: collision with root package name */
    public int f16807b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16808c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16809d;

    public B(Xf.h hVar, J5.f fVar) {
        this.f16806a = 0;
        this.f16809d = fVar;
        this.f16808c = hVar.f16272c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(Yf.B r10, ef.C2518b r11, lf.AbstractC3462a r12) {
        /*
            boolean r0 = r12 instanceof Yf.A
            if (r0 == 0) goto L13
            r0 = r12
            Yf.A r0 = (Yf.A) r0
            int r1 = r0.f16805g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16805g = r1
            goto L18
        L13:
            Yf.A r0 = new Yf.A
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f16803e
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f16805g
            r3 = 0
            r4 = 6
            r5 = 0
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5d
            if (r2 != r8) goto L55
            java.lang.String r10 = r0.f16802d
            java.util.LinkedHashMap r11 = r0.f16801c
            Yf.B r2 = r0.f16800b
            ef.b r9 = r0.f16799a
            Fe.e.U(r12)
            kotlinx.serialization.json.b r12 = (kotlinx.serialization.json.b) r12
            r11.put(r10, r12)
            java.lang.Object r10 = r2.f16809d
            J5.f r10 = (J5.f) r10
            byte r10 = r10.f()
            if (r10 == r7) goto L4f
            if (r10 != r6) goto L45
            goto La2
        L45:
            java.lang.Object r10 = r2.f16809d
            J5.f r10 = (J5.f) r10
            java.lang.String r11 = "Expected end of the object or comma"
            J5.f.r(r10, r11, r3, r5, r4)
            throw r5
        L4f:
            r12 = r2
            r2 = r10
            r10 = r12
            r12 = r11
            r11 = r9
            goto L73
        L55:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L5d:
            Fe.e.U(r12)
            java.lang.Object r12 = r10.f16809d
            J5.f r12 = (J5.f) r12
            byte r2 = r12.g(r4)
            byte r9 = r12.y()
            if (r9 == r7) goto Lba
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
        L73:
            java.lang.Object r3 = r10.f16809d
            J5.f r3 = (J5.f) r3
            boolean r9 = r3.c()
            if (r9 == 0) goto L9e
            boolean r2 = r10.f16808c
            if (r2 == 0) goto L86
            java.lang.String r2 = r3.l()
            goto L8a
        L86:
            java.lang.String r2 = r3.j()
        L8a:
            r4 = 5
            r3.g(r4)
            r0.f16799a = r11
            r0.f16800b = r10
            r0.f16801c = r12
            r0.f16802d = r2
            r0.f16805g = r8
            r11.getClass()
            r11.f34658b = r0
            return r1
        L9e:
            r11 = r2
            r2 = r10
            r10 = r11
            r11 = r12
        La2:
            java.lang.Object r12 = r2.f16809d
            J5.f r12 = (J5.f) r12
            if (r10 != r4) goto Lac
            r12.g(r6)
            goto Lae
        Lac:
            if (r10 == r7) goto Lb4
        Lae:
            kotlinx.serialization.json.c r10 = new kotlinx.serialization.json.c
            r10.<init>(r11)
            return r10
        Lb4:
            java.lang.String r10 = "object"
            Yf.r.l(r12, r10)
            throw r5
        Lba:
            java.lang.String r10 = "Unexpected leading comma"
            J5.f.r(r12, r10, r3, r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Yf.B.a(Yf.B, ef.b, lf.a):java.lang.Object");
    }

    public kotlinx.serialization.json.b b() {
        kotlinx.serialization.json.b cVar;
        Object obj;
        J5.f fVar = (J5.f) this.f16809d;
        byte bY = fVar.y();
        if (bY == 1) {
            return g(true);
        }
        if (bY == 0) {
            return g(false);
        }
        if (bY != 6) {
            if (bY == 8) {
                return f();
            }
            J5.f.r(fVar, "Cannot read Json element because of unexpected ".concat(r.r(bY)), 0, null, 6);
            throw null;
        }
        int i5 = this.f16807b + 1;
        this.f16807b = i5;
        if (i5 == 200) {
            z zVar = new z(this, null);
            kf.a aVar = AbstractC2517a.f34656a;
            C2518b c2518b = new C2518b();
            c2518b.f34657a = zVar;
            c2518b.f34658b = c2518b;
            kf.a aVar2 = AbstractC2517a.f34656a;
            c2518b.f34659c = aVar2;
            while (true) {
                obj = c2518b.f34659c;
                InterfaceC3103c interfaceC3103c = c2518b.f34658b;
                if (interfaceC3103c == null) {
                    break;
                }
                if (AbstractC3340k.a(aVar2, obj)) {
                    try {
                        z zVar2 = c2518b.f34657a;
                        K.e(3, zVar2);
                        z zVar3 = new z(zVar2.f16899c, interfaceC3103c);
                        zVar3.f16898b = c2518b;
                        Object objInvokeSuspend = zVar3.invokeSuspend(C2515C.f34653a);
                        if (objInvokeSuspend != kf.a.f39711a) {
                            interfaceC3103c.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        interfaceC3103c.resumeWith(Fe.e.z(th));
                    }
                } else {
                    c2518b.f34659c = aVar2;
                    interfaceC3103c.resumeWith(obj);
                }
            }
            Fe.e.U(obj);
            cVar = (kotlinx.serialization.json.b) obj;
        } else {
            byte bG = fVar.g((byte) 6);
            if (fVar.y() == 4) {
                J5.f.r(fVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!fVar.c()) {
                    break;
                }
                String strL = this.f16808c ? fVar.l() : fVar.j();
                fVar.g((byte) 5);
                linkedHashMap.put(strL, b());
                bG = fVar.f();
                if (bG != 4) {
                    if (bG != 7) {
                        J5.f.r(fVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bG == 6) {
                fVar.g((byte) 7);
            } else if (bG == 4) {
                r.l(fVar, "object");
                throw null;
            }
            cVar = new kotlinx.serialization.json.c(linkedHashMap);
        }
        this.f16807b--;
        return cVar;
    }

    @Override // k1.Y
    public void c() {
        this.f16808c = true;
    }

    @Override // k1.Y
    public void d() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f16808c = false;
    }

    @Override // k1.Y
    public void e() {
        if (this.f16808c) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f16809d;
        actionBarContextView.f17799f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f16807b);
    }

    public kotlinx.serialization.json.a f() {
        J5.f fVar = (J5.f) this.f16809d;
        byte bF = fVar.f();
        if (fVar.y() == 4) {
            J5.f.r(fVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (fVar.c()) {
            arrayList.add(b());
            bF = fVar.f();
            if (bF != 4) {
                boolean z2 = bF == 9;
                int i5 = fVar.f5633b;
                if (!z2) {
                    J5.f.r(fVar, "Expected end of the array or comma", i5, null, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            fVar.g((byte) 9);
        } else if (bF == 4) {
            r.l(fVar, "array");
            throw null;
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public kotlinx.serialization.json.d g(boolean z2) {
        J5.f fVar = (J5.f) this.f16809d;
        String strL = (this.f16808c || !z2) ? fVar.l() : fVar.j();
        return (z2 || !AbstractC3340k.a(strL, "null")) ? new Xf.p(strL, z2, null) : JsonNull.INSTANCE;
    }

    public String toString() {
        switch (this.f16806a) {
            case 1:
                C0237b0 c0237b0S = Ba.c.S(this);
                c0237b0S.f((C3535c) this.f16809d, "callOptions");
                c0237b0S.h("previousAttempts", String.valueOf(this.f16807b));
                c0237b0S.g("isTransparentRetry", this.f16808c);
                return c0237b0S.toString();
            default:
                return super.toString();
        }
    }

    public B(C3535c c3535c, int i5, boolean z2) {
        this.f16806a = 1;
        Fe.e.t(c3535c, "callOptions");
        this.f16809d = c3535c;
        this.f16807b = i5;
        this.f16808c = z2;
    }

    public B(ActionBarContextView actionBarContextView) {
        this.f16806a = 2;
        this.f16809d = actionBarContextView;
        this.f16808c = false;
    }
}
