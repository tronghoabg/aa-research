package p9;

import A.AbstractC0213f;
import A7.C0295v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final u f43420a;

    /* renamed from: b, reason: collision with root package name */
    public final C3786g f43421b;

    /* renamed from: c, reason: collision with root package name */
    public final C3781b f43422c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43423d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f43424e = 1;

    /* renamed from: f, reason: collision with root package name */
    public C3779D f43425f;

    public v(u uVar, C3786g c3786g, C3781b c3781b) {
        this.f43420a = uVar;
        this.f43422c = c3781b;
        this.f43421b = c3786g;
    }

    public final boolean a() {
        return !AbstractC0213f.b(this.f43421b.f43357d, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(p9.C3779D r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = r15.f43332d
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L11
            boolean r0 = r15.f43335g
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            java.lang.String r3 = "We got a new snapshot with no changes?"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            A6.c.z(r0, r3, r4)
            p9.g r0 = r14.f43421b
            boolean r3 = r0.f43354a
            if (r3 != 0) goto L55
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r3 = r15.f43332d
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r3.next()
            p9.f r4 = (p9.C3785f) r4
            p9.e r5 = r4.f43352a
            p9.e r6 = p9.EnumC3784e.f43350d
            if (r5 == r6) goto L2a
            r8.add(r4)
            goto L2a
        L40:
            p9.D r4 = new p9.D
            p9.u r5 = r15.f43329a
            r12 = 1
            boolean r13 = r15.f43337i
            s9.i r6 = r15.f43330b
            s9.i r7 = r15.f43331c
            boolean r9 = r15.f43333e
            c9.d r10 = r15.f43334f
            boolean r11 = r15.f43335g
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15 = r4
        L55:
            boolean r3 = r14.f43423d
            if (r3 != 0) goto L65
            int r0 = r14.f43424e
            boolean r0 = r14.d(r15, r0)
            if (r0 == 0) goto L9e
            r14.c(r15)
            goto L9f
        L65:
            java.util.ArrayList r3 = r15.f43332d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L6f
            r0 = r1
            goto L95
        L6f:
            p9.D r3 = r14.f43425f
            if (r3 == 0) goto L89
            c9.d r3 = r3.f43334f
            c9.c r3 = r3.f19805a
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            c9.d r4 = r15.f43334f
            c9.c r4 = r4.f19805a
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r1
            if (r3 == r4) goto L89
            r3 = r1
            goto L8a
        L89:
            r3 = r2
        L8a:
            boolean r4 = r15.f43335g
            if (r4 != 0) goto L93
            if (r3 == 0) goto L91
            goto L93
        L91:
            r0 = r2
            goto L95
        L93:
            boolean r0 = r0.f43355b
        L95:
            if (r0 == 0) goto L9e
            p9.b r0 = r14.f43422c
            r2 = 0
            r0.a(r15, r2)
            goto L9f
        L9e:
            r1 = r2
        L9f:
            r14.f43425f = r15
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.v.b(p9.D):boolean");
    }

    public final void c(C3779D c3779d) {
        A6.c.z(!this.f43423d, "Trying to raise initial event for second time", new Object[0]);
        u uVar = c3779d.f43329a;
        ArrayList arrayList = new ArrayList();
        s9.i iVar = c3779d.f43330b;
        Iterator it = iVar.f45377b.iterator();
        while (true) {
            C0295v c0295v = (C0295v) it;
            if (!((Iterator) c0295v.f1081b).hasNext()) {
                C3779D c3779d2 = new C3779D(uVar, iVar, new s9.i(s9.g.f45372a, new c9.d(Collections.EMPTY_LIST, new V5.s(uVar.a(), 3))), arrayList, c3779d.f43333e, c3779d.f43334f, true, c3779d.f43336h, c3779d.f43337i);
                this.f43423d = true;
                this.f43422c.a(c3779d2, null);
                return;
            }
            arrayList.add(new C3785f(EnumC3784e.f43348b, (s9.k) c0295v.next()));
        }
    }

    public final boolean d(C3779D c3779d, int i5) {
        A6.c.z(!this.f43423d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (c3779d.f43333e && a()) {
            boolean zB = AbstractC0213f.b(i5, 3);
            if (this.f43421b.f43356c && !zB) {
                A6.c.z(c3779d.f43333e, "Waiting for sync, but snapshot is not from cache", new Object[0]);
                return false;
            }
            if (c3779d.f43330b.f45376a.isEmpty() && !c3779d.f43337i && !AbstractC0213f.b(i5, 3)) {
                return false;
            }
        }
        return true;
    }
}
