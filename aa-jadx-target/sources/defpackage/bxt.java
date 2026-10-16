package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxt extends defpackage.bvi {
    public static final ajba k = ajbb.a(defpackage.ccq.a);
    private static final java.util.concurrent.atomic.AtomicReference u = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.FALSE);
    private final aiwi A;
    private final defpackage.lam B;
    public long a;
    public final defpackage.bus b;
    public final java.lang.Object c;
    public aiwg d;
    public java.lang.Throwable e;
    public final defpackage.bzc f;
    public final java.util.List g;
    public aiuf h;
    public boolean i;
    public final defpackage.afdo j;
    public final ajba l;
    public defpackage.aaw m;
    public final defpackage.aau n;
    public final defpackage.aau o;
    public final defpackage.aau p;
    public defpackage.aaw q;
    public final defpackage.bil r;
    public final defpackage.ngb s;
    public final defpackage.dai t;
    private final java.util.List v;
    private java.util.List w;
    private final java.util.List x;
    private java.util.List y;
    private final ajba z;

    public bxt(defpackage.afdo afdoVar) {
        defpackage.bus busVar = new defpackage.bus(new defpackage.bjd(this, 18));
        this.b = busVar;
        this.s = new defpackage.ngb(new defpackage.bjd(this, 19));
        this.c = new java.lang.Object();
        this.v = new java.util.ArrayList();
        this.m = new defpackage.aaw(6);
        this.f = new defpackage.bzc(new defpackage.bvk[16]);
        this.x = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.n = new defpackage.aau(6);
        this.r = new defpackage.bil();
        long[] jArr = defpackage.aav.a;
        this.o = new defpackage.aau(6);
        this.p = new defpackage.aau(6);
        this.z = ajbb.a((java.lang.Object) null);
        this.l = new ajba(defpackage.bxo.c);
        this.B = new defpackage.lam((byte[]) null);
        defpackage.afdo aiwiVar = new aiwi(afdoVar.get(aiwg.d));
        aiwiVar.p(new defpackage.bjm(this, 14));
        this.A = aiwiVar;
        this.j = afdoVar.plus(busVar).plus(aiwiVar);
        this.t = new defpackage.dai();
    }

    private static final void L(defpackage.bxt bxtVar, defpackage.bws bwsVar, defpackage.bws bwsVar2) {
        java.util.List list = bwsVar2.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.bws bwsVar3 = (defpackage.bws) list.get(i);
                defpackage.bil bilVar = bxtVar.r;
                defpackage.bwr bwrVar = bwsVar3.a;
                defpackage.bil bilVar2 = new defpackage.bil(bwsVar3, bwsVar);
                defpackage.byy.b((defpackage.aau) bilVar.b, bwrVar, bilVar2);
                defpackage.byy.b((defpackage.aau) bilVar.a, bilVar2.b, bwrVar);
                L(bxtVar, bwsVar, bwsVar3);
            }
        }
    }

    private final boolean M() {
        return this.f.b != 0 || E() || N() || this.n.e();
    }

    private final boolean N() {
        return !this.i && ((defpackage.ccw) this.s.a).c();
    }

    private final void O(defpackage.bvk bvkVar) throws java.lang.Throwable {
        synchronized (this.c) {
            java.util.List list = this.g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (defpackage.afga.f(((defpackage.bws) list.get(i)).f, bvkVar)) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    P(arrayList, this, bvkVar);
                    while (!arrayList.isEmpty()) {
                        I(arrayList, null);
                        P(arrayList, this, bvkVar);
                    }
                    return;
                }
            }
        }
    }

    private static final void P(java.util.List list, defpackage.bxt bxtVar, defpackage.bvk bvkVar) {
        list.clear();
        synchronized (bxtVar.c) {
            java.util.Iterator it = bxtVar.g.iterator();
            while (it.hasNext()) {
                defpackage.bws bwsVar = (defpackage.bws) it.next();
                if (defpackage.afga.f(bwsVar.f, bvkVar)) {
                    list.add(bwsVar);
                    it.remove();
                }
            }
        }
    }

    private final void Q(defpackage.bvk bvkVar) {
        if (this.v.remove(bvkVar)) {
            this.w = null;
        }
    }

    private static final void R(defpackage.ced cedVar) {
        try {
            if (cedVar.c() instanceof defpackage.cel) {
                throw new java.lang.IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            cedVar.d();
        } catch (java.lang.Throwable th) {
            cedVar.d();
            throw th;
        }
    }

    public final aiuf A() {
        defpackage.bxo bxoVar;
        ajba ajbaVar = this.l;
        if (((defpackage.bxo) ajbaVar.b()).compareTo(defpackage.bxo.b) > 0) {
            if (this.z.b() != null) {
                bxoVar = defpackage.bxo.c;
            } else if (this.d == null) {
                this.m = new defpackage.aaw(6);
                this.f.g();
                bxoVar = (E() || N()) ? defpackage.bxo.d : defpackage.bxo.c;
            } else {
                bxoVar = (this.f.b != 0 || this.m.c() || !this.x.isEmpty() || !this.g.isEmpty() || E() || N() || this.n.e()) ? defpackage.bxo.f : defpackage.bxo.e;
            }
            ajbaVar.d(bxoVar);
            if (bxoVar != defpackage.bxo.f) {
                return null;
            }
            aiuf aiufVar = this.h;
            this.h = null;
            return aiufVar;
        }
        java.util.List listZ = z();
        int size = listZ.size();
        for (int i = 0; i < size; i++) {
        }
        this.v.clear();
        this.w = defpackage.afce.a;
        this.m = new defpackage.aaw(6);
        this.f.g();
        this.x.clear();
        this.g.clear();
        this.y = null;
        aiuf aiufVar2 = this.h;
        if (aiufVar2 != null) {
            aiufVar2.g((java.lang.Throwable) null);
        }
        this.h = null;
        this.z.d((java.lang.Object) null);
        return null;
    }

    public final void B() {
        synchronized (this.c) {
            ajba ajbaVar = this.l;
            if (((defpackage.bxo) ajbaVar.b()).compareTo(defpackage.bxo.e) >= 0) {
                ajbaVar.d(defpackage.bxo.b);
            }
        }
        this.A.s((java.util.concurrent.CancellationException) null);
    }

    public final void C() {
        aiuf aiufVarA;
        synchronized (this.c) {
            aiufVarA = A();
            if (((defpackage.bxo) this.l.b()).compareTo(defpackage.bxo.b) <= 0) {
                throw ahzq.a("Recomposer shutdown; frame clock awaiter will never resume", this.e);
            }
        }
        if (aiufVarA != null) {
            aiufVarA.w(defpackage.afbk.a);
        }
    }

    public final void D() {
        synchronized (this.c) {
            this.i = true;
        }
    }

    public final boolean E() {
        return !this.i && this.b.a.c();
    }

    public final boolean F() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.m.c() && this.f.b == 0 && !E() && !N()) {
                z = false;
            }
        }
        return z;
    }

    public final boolean G() {
        boolean zM;
        synchronized (this.c) {
            if (this.m.b()) {
                return M();
            }
            java.util.List listZ = z();
            defpackage.bzf bzfVar = new defpackage.bzf(this.m);
            this.m = new defpackage.aaw(6);
            try {
                int size = listZ.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.bvk) listZ.get(i)).s(bzfVar);
                    if (((defpackage.bxo) this.l.b()).compareTo(defpackage.bxo.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (A() != null) {
                        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zM = M();
                }
                return zM;
            } catch (java.lang.Throwable th) {
                synchronized (this.c) {
                    this.m.k(bzfVar);
                    throw th;
                }
            }
        }
    }

    public final void H(defpackage.bvk bvkVar) {
        java.util.List arrayList = this.y;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.y = arrayList;
        }
        if (!arrayList.contains(bvkVar)) {
            arrayList.add(bvkVar);
        }
        Q(bvkVar);
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0384 A[Catch: all -> 0x04f1, TryCatch #7 {all -> 0x04f1, blocks: (B:99:0x0287, B:101:0x0299, B:103:0x02a4, B:104:0x02aa, B:110:0x02e4, B:165:0x0483, B:117:0x02f6, B:118:0x02f9, B:119:0x02fa, B:121:0x0305, B:124:0x030b, B:127:0x0311, B:129:0x031a, B:130:0x031f, B:132:0x0326, B:133:0x032b, B:135:0x033d, B:140:0x035d, B:141:0x035f, B:143:0x037b, B:145:0x0384, B:147:0x038c, B:149:0x03a2, B:151:0x03ad, B:153:0x03c6, B:164:0x0480, B:189:0x04be, B:190:0x04c1, B:192:0x04c3, B:193:0x04c6, B:136:0x034b, B:194:0x04c7, B:142:0x0370), top: B:260:0x0287, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x038c A[Catch: all -> 0x04f1, TryCatch #7 {all -> 0x04f1, blocks: (B:99:0x0287, B:101:0x0299, B:103:0x02a4, B:104:0x02aa, B:110:0x02e4, B:165:0x0483, B:117:0x02f6, B:118:0x02f9, B:119:0x02fa, B:121:0x0305, B:124:0x030b, B:127:0x0311, B:129:0x031a, B:130:0x031f, B:132:0x0326, B:133:0x032b, B:135:0x033d, B:140:0x035d, B:141:0x035f, B:143:0x037b, B:145:0x0384, B:147:0x038c, B:149:0x03a2, B:151:0x03ad, B:153:0x03c6, B:164:0x0480, B:189:0x04be, B:190:0x04c1, B:192:0x04c3, B:193:0x04c6, B:136:0x034b, B:194:0x04c7, B:142:0x0370), top: B:260:0x0287, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ad A[Catch: all -> 0x04f1, TryCatch #7 {all -> 0x04f1, blocks: (B:99:0x0287, B:101:0x0299, B:103:0x02a4, B:104:0x02aa, B:110:0x02e4, B:165:0x0483, B:117:0x02f6, B:118:0x02f9, B:119:0x02fa, B:121:0x0305, B:124:0x030b, B:127:0x0311, B:129:0x031a, B:130:0x031f, B:132:0x0326, B:133:0x032b, B:135:0x033d, B:140:0x035d, B:141:0x035f, B:143:0x037b, B:145:0x0384, B:147:0x038c, B:149:0x03a2, B:151:0x03ad, B:153:0x03c6, B:164:0x0480, B:189:0x04be, B:190:0x04c1, B:192:0x04c3, B:193:0x04c6, B:136:0x034b, B:194:0x04c7, B:142:0x0370), top: B:260:0x0287, inners: #17 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x03c4  */
    public final java.util.List I(java.util.List list, defpackage.aaw aawVar) throws java.lang.Throwable {
        defpackage.ced cedVar;
        java.util.ArrayList arrayList;
        java.util.HashMap map;
        java.util.Iterator it;
        defpackage.bvi bviVar;
        defpackage.khb khbVar;
        defpackage.bzh bzhVar;
        defpackage.bzh bzhVarD;
        java.util.ArrayList arrayList2;
        defpackage.bzl bzlVarE;
        defpackage.bzl bzlVarE2;
        defpackage.bzl bzlVar;
        defpackage.bzl bzlVar2;
        int[] iArr;
        defpackage.zo zoVar;
        defpackage.khb khbVar2;
        boolean z;
        defpackage.khb khbVar3;
        defpackage.bzm bzmVar;
        defpackage.bzl bzlVar3;
        java.util.HashMap map2;
        java.util.Iterator it2;
        java.util.List list2;
        java.util.HashMap map3 = new java.util.HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            defpackage.bvk bvkVar = ((defpackage.bws) obj).f;
            java.lang.Object arrayList3 = map3.get(bvkVar);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                map3.put(bvkVar, arrayList3);
            }
            ((java.util.ArrayList) arrayList3).add(obj);
        }
        java.util.Iterator it3 = map3.entrySet().iterator();
        while (it3.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
            defpackage.bvk bvkVar2 = (defpackage.bvk) entry.getKey();
            java.util.List list3 = (java.util.List) entry.getValue();
            if (bvkVar2.v()) {
                defpackage.bvg.b("Check failed");
            }
            defpackage.ced cedVarM = defpackage.bzd.m(new defpackage.bjm(bvkVar2, 13), new defpackage.beh(bvkVar2, aawVar, 12));
            try {
                defpackage.cej cejVarW = cedVarM.w();
                try {
                    java.lang.Object obj2 = this.c;
                    synchronized (obj2) {
                        try {
                            arrayList = new java.util.ArrayList(list3.size());
                            int size2 = list3.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                defpackage.bws bwsVar = (defpackage.bws) list3.get(i2);
                                java.lang.Object objA = defpackage.byy.a(this.n, bwsVar.a);
                                defpackage.bws bwsVar2 = (defpackage.bws) objA;
                                if (bwsVar2 != null) {
                                    defpackage.bil bilVar = this.r;
                                    map2 = map3;
                                    java.lang.Object objA2 = ((defpackage.aau) bilVar.a).a(bwsVar2);
                                    if (objA2 != null) {
                                        it2 = it3;
                                        if (objA2 instanceof defpackage.aan) {
                                            defpackage.aan aanVar = (defpackage.aan) objA2;
                                            java.lang.Object[] objArr = aanVar.a;
                                            int i3 = aanVar.b;
                                            int i4 = 0;
                                            while (i4 < i3) {
                                                java.lang.Object obj3 = objArr[i4];
                                                obj3.getClass();
                                                int i5 = i3;
                                                defpackage.bwr bwrVar = (defpackage.bwr) obj3;
                                                defpackage.byy.c((defpackage.aau) bilVar.b, bwrVar, new defpackage.bjm(bwsVar2, 12));
                                                i4++;
                                                i3 = i5;
                                                list3 = list3;
                                            }
                                        } else {
                                            list2 = list3;
                                            defpackage.byy.c((defpackage.aau) bilVar.b, (defpackage.bwr) objA2, new defpackage.bjm(bwsVar2, 12));
                                        }
                                    } else {
                                        it2 = it3;
                                    }
                                    list2 = list3;
                                } else {
                                    map2 = map3;
                                    it2 = it3;
                                    list2 = list3;
                                }
                                arrayList.add(new defpackage.afau(bwsVar, objA));
                                i2++;
                                map3 = map2;
                                it3 = it2;
                                list3 = list2;
                            }
                            map = map3;
                            it = it3;
                            int size3 = arrayList.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                defpackage.afau afauVar = (defpackage.afau) arrayList.get(i6);
                                if (afauVar.b == null) {
                                    defpackage.bil bilVar2 = this.r;
                                    defpackage.bwr bwrVar2 = ((defpackage.bws) afauVar.a).a;
                                    java.lang.Object obj4 = bilVar2.b;
                                    if (defpackage.aau.f((defpackage.aau) obj4, bwrVar2)) {
                                        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i7 = 0; i7 < size4; i7++) {
                                            defpackage.afau afauVar2 = (defpackage.afau) arrayList.get(i7);
                                            if (afauVar2.b == null) {
                                                java.lang.Object obj5 = afauVar2.a;
                                                defpackage.bil bilVar3 = (defpackage.bil) defpackage.byy.a((defpackage.aau) obj4, ((defpackage.bws) obj5).a);
                                                if (((defpackage.aau) obj4).d()) {
                                                    ((defpackage.aau) bilVar2.a).k();
                                                }
                                                if (bilVar3 != null) {
                                                    java.lang.Object obj6 = bilVar3.a;
                                                    defpackage.byy.b(this.p, bilVar3.b, obj6);
                                                    afauVar2 = new defpackage.afau(obj5, obj6);
                                                }
                                            }
                                            arrayList4.add(afauVar2);
                                        }
                                        arrayList = arrayList4;
                                        break;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        if (((defpackage.afau) arrayList.get(i8)).b != null) {
                            int size6 = arrayList.size();
                            for (int i9 = 0; i9 < size6; i9++) {
                                if (((defpackage.afau) arrayList.get(i9)).b == null) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i10 = 0; i10 < size7; i10++) {
                                        defpackage.afau afauVar3 = (defpackage.afau) arrayList.get(i10);
                                        defpackage.bws bwsVar3 = afauVar3.b == null ? (defpackage.bws) afauVar3.a : null;
                                        if (bwsVar3 != null) {
                                            arrayList5.add(bwsVar3);
                                        }
                                    }
                                    synchronized (obj2) {
                                        defpackage.afga.bk(this.g, arrayList5);
                                    }
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i11 = 0; i11 < size8; i11++) {
                                        java.lang.Object obj7 = arrayList.get(i11);
                                        if (((defpackage.afau) obj7).b != null) {
                                            arrayList6.add(obj7);
                                        }
                                    }
                                    arrayList = arrayList6;
                                    break;
                                }
                            }
                            break;
                        }
                        defpackage.cer.i.k(cejVarW);
                        throw th;
                    }
                    int size9 = arrayList.size();
                    for (int i12 = 0; i12 < size9; i12++) {
                        if (!defpackage.afga.f(((defpackage.bws) ((defpackage.afau) arrayList.get(i12)).a).f, bvkVar2)) {
                            defpackage.bvg.b("Check failed");
                            break;
                        }
                    }
                    try {
                        defpackage.bwj bwjVar = bvkVar2.k;
                        try {
                            defpackage.bzr bzrVar = ((defpackage.bwc) bwjVar).q;
                            defpackage.khb khbVar4 = ((defpackage.bwc) bwjVar).z;
                            defpackage.khb khbVar5 = bzrVar.k;
                            try {
                                bzrVar.k = khbVar4;
                                ((defpackage.cbi) bzrVar.k.a).b(defpackage.cas.a);
                                int size10 = arrayList.size();
                                int i13 = 0;
                                while (i13 < size10) {
                                    defpackage.afau afauVar4 = (defpackage.afau) arrayList.get(i13);
                                    defpackage.bws bwsVar4 = (defpackage.bws) afauVar4.a;
                                    defpackage.bws bwsVar5 = (defpackage.bws) afauVar4.b;
                                    defpackage.bzh bzhVarD2 = defpackage.bzd.d(bwsVar4.g);
                                    defpackage.bye byeVar = bwsVar4.c;
                                    int iD = ((defpackage.bzm) byeVar).d(bzhVarD2);
                                    int i14 = size10;
                                    defpackage.cda cdaVar = new defpackage.cda(null);
                                    bzrVar.f();
                                    java.lang.Object obj8 = bzrVar.k.a;
                                    cedVar = cedVarM;
                                    try {
                                        ((defpackage.cbi) obj8).b(defpackage.bzz.a);
                                        defpackage.cbh.b((defpackage.cbi) obj8, 0, cdaVar, 1, bzhVarD2);
                                        if (bwsVar5 == null) {
                                            if (defpackage.afga.f(byeVar, ((defpackage.bwc) bwjVar).n)) {
                                                ((defpackage.bwc) bwjVar).W();
                                            }
                                            defpackage.bzl bzlVarE3 = ((defpackage.bzm) byeVar).e();
                                            try {
                                                bzlVarE3.t(iD);
                                                bzrVar.c = iD;
                                                defpackage.khb khbVar6 = new defpackage.khb((byte[]) null, (byte[]) null, (char[]) null);
                                                try {
                                                    defpackage.bvz bvzVar = new defpackage.bvz((defpackage.bwc) bwjVar, khbVar6, bzlVarE3, bwsVar4, 0);
                                                    bzlVar3 = bzlVarE3;
                                                    try {
                                                        ((defpackage.bwc) bwjVar).an(null, null, null, defpackage.afce.a, bvzVar);
                                                        bzrVar.m(khbVar6, cdaVar);
                                                        bzlVar3.r();
                                                    } catch (java.lang.Throwable th2) {
                                                        th = th2;
                                                        bzlVar3.r();
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    bzlVar3 = bzlVarE3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                th = th4;
                                                bzlVar3 = bzlVarE3;
                                            }
                                        } else {
                                            defpackage.bvi bviVar2 = ((defpackage.bwc) bwjVar).b;
                                            defpackage.khb khbVarW = bviVar2.w(bwsVar5);
                                            java.lang.Object obj9 = khbVarW != null ? khbVarW.a : null;
                                            java.lang.Object obj10 = obj9 == null ? bwsVar5.c : obj9;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (obj9 != null) {
                                                                                    bviVar = bviVar2;
                                                                                    if (((defpackage.bzm) obj9).f) {
                                                                                        defpackage.bvg.b("use active SlotWriter to create an anchor location instead");
                                                                                    }
                                                                                    if (((defpackage.bzm) obj9).b <= 0) {
                                                                                        defpackage.bxi.a("Parameter index is out of range");
                                                                                    }
                                                                                    java.util.ArrayList arrayList7 = ((defpackage.bzm) obj9).h;
                                                                                    khbVar = khbVarW;
                                                                                    int iC = defpackage.bzo.c(arrayList7, 0, ((defpackage.bzm) obj9).b);
                                                                                    if (iC < 0) {
                                                                                        bzhVar = new defpackage.bzh(0);
                                                                                        arrayList7.add(-(iC + 1), bzhVar);
                                                                                    } else {
                                                                                        bzhVar = (defpackage.bzh) arrayList7.get(iC);
                                                                                    }
                                                                                    if (bzhVar != null) {
                                                                                        bzhVarD = defpackage.bzd.d(bzhVar);
                                                                                        arrayList2 = new java.util.ArrayList();
                                                                                        bzlVarE = ((defpackage.bzm) obj10).e();
                                                                                        defpackage.bwd.f(bzlVarE, arrayList2, ((defpackage.bzm) obj10).d(bzhVarD));
                                                                                        bzlVarE.r();
                                                                                        if (arrayList2.isEmpty()) {
                                                                                            bzhVarD = bzhVarD;
                                                                                        } else {
                                                                                            khbVar3 = bzrVar.k;
                                                                                            if (!arrayList2.isEmpty()) {
                                                                                                java.lang.Object obj11 = khbVar3.a;
                                                                                                ((defpackage.cbi) obj11).b(defpackage.bzw.a);
                                                                                                defpackage.cbh.b((defpackage.cbi) obj11, 1, arrayList2, 0, cdaVar);
                                                                                            }
                                                                                            bzmVar = ((defpackage.bwc) bwjVar).c;
                                                                                            if (defpackage.afga.f(byeVar, bzmVar)) {
                                                                                                int iD2 = bzmVar.d(bzhVarD2);
                                                                                                ((defpackage.bwc) bwjVar).ae(iD2, ((defpackage.bwc) bwjVar).O(iD2) + arrayList2.size());
                                                                                            }
                                                                                        }
                                                                                        java.lang.Object obj12 = bzrVar.k.a;
                                                                                        ((defpackage.cbi) obj12).b(defpackage.bzx.a);
                                                                                        int i15 = ((defpackage.cbi) obj12).f - ((defpackage.cbi) obj12).a[((defpackage.cbi) obj12).b - 1].c;
                                                                                        java.lang.Object[] objArr2 = ((defpackage.cbi) obj12).e;
                                                                                        objArr2[i15] = khbVar;
                                                                                        objArr2[i15 + 1] = bviVar;
                                                                                        objArr2[i15 + 3] = bwsVar4;
                                                                                        objArr2[i15 + 2] = bwsVar5;
                                                                                        bzlVarE2 = ((defpackage.bzm) obj10).e();
                                                                                        bzlVar2 = ((defpackage.bwc) bwjVar).m;
                                                                                        iArr = ((defpackage.bwc) bwjVar).e;
                                                                                        zoVar = ((defpackage.bwc) bwjVar).w;
                                                                                        ((defpackage.bwc) bwjVar).e = null;
                                                                                        ((defpackage.bwc) bwjVar).w = null;
                                                                                        ((defpackage.bwc) bwjVar).m = bzlVarE2;
                                                                                        int iD3 = ((defpackage.bzm) obj10).d(defpackage.bzd.d(bzhVarD));
                                                                                        bzlVarE2.t(iD3);
                                                                                        bzrVar.c = iD3;
                                                                                        defpackage.khb khbVar7 = new defpackage.khb((byte[]) null, (byte[]) null, (char[]) null);
                                                                                        khbVar2 = bzrVar.k;
                                                                                        bzrVar.k = khbVar7;
                                                                                        z = bzrVar.b;
                                                                                        bzrVar.b = false;
                                                                                        bzlVar = bzlVarE2;
                                                                                        ((defpackage.bwc) bwjVar).an(bwsVar5.f, bwsVar4.f, java.lang.Integer.valueOf(bzlVarE2.f), bwsVar5.d, new defpackage.ajz(bwjVar, bwsVar4, 20, null));
                                                                                        bzrVar.b = z;
                                                                                        bzrVar.k = khbVar2;
                                                                                        bzrVar.m(khbVar7, cdaVar);
                                                                                        ((defpackage.bwc) bwjVar).m = bzlVar2;
                                                                                        ((defpackage.bwc) bwjVar).e = iArr;
                                                                                        ((defpackage.bwc) bwjVar).w = zoVar;
                                                                                        bzlVar.r();
                                                                                    }
                                                                                    th = th;
                                                                                    bzrVar.k = khbVar5;
                                                                                    throw th;
                                                                                }
                                                                                bviVar = bviVar2;
                                                                                khbVar = khbVarW;
                                                                                obj10 = obj10;
                                                                                ((defpackage.bwc) bwjVar).m = bzlVar2;
                                                                                ((defpackage.bwc) bwjVar).e = iArr;
                                                                                ((defpackage.bwc) bwjVar).w = zoVar;
                                                                                bzlVar.r();
                                                                            } catch (java.lang.Throwable th5) {
                                                                                th = th5;
                                                                                bzlVar.r();
                                                                                throw th;
                                                                            }
                                                                            bzrVar.k = khbVar2;
                                                                            bzrVar.m(khbVar7, cdaVar);
                                                                        } catch (java.lang.Throwable th6) {
                                                                            th = th6;
                                                                            ((defpackage.bwc) bwjVar).m = bzlVar2;
                                                                            ((defpackage.bwc) bwjVar).e = iArr;
                                                                            ((defpackage.bwc) bwjVar).w = zoVar;
                                                                            throw th;
                                                                        }
                                                                        bzrVar.b = z;
                                                                    } catch (java.lang.Throwable th7) {
                                                                        th = th7;
                                                                        bzrVar.k = khbVar2;
                                                                        throw th;
                                                                    }
                                                                    ((defpackage.bwc) bwjVar).an(bwsVar5.f, bwsVar4.f, java.lang.Integer.valueOf(bzlVarE2.f), bwsVar5.d, new defpackage.ajz(bwjVar, bwsVar4, 20, null));
                                                                } catch (java.lang.Throwable th8) {
                                                                    th = th8;
                                                                    bzrVar.b = z;
                                                                    throw th;
                                                                }
                                                                bzrVar.b = false;
                                                                bzlVar = bzlVarE2;
                                                            } catch (java.lang.Throwable th9) {
                                                                th = th9;
                                                                bzlVar = bzlVarE2;
                                                            }
                                                            bzrVar.k = khbVar7;
                                                            z = bzrVar.b;
                                                        } catch (java.lang.Throwable th10) {
                                                            th = th10;
                                                            bzlVar = bzlVarE2;
                                                        }
                                                        ((defpackage.bwc) bwjVar).m = bzlVarE2;
                                                        int iD4 = ((defpackage.bzm) obj10).d(defpackage.bzd.d(bzhVarD));
                                                        bzlVarE2.t(iD4);
                                                        bzrVar.c = iD4;
                                                        defpackage.khb khbVar8 = new defpackage.khb((byte[]) null, (byte[]) null, (char[]) null);
                                                        khbVar2 = bzrVar.k;
                                                    } catch (java.lang.Throwable th11) {
                                                        th = th11;
                                                        bzlVar = bzlVarE2;
                                                    }
                                                    bzlVar2 = ((defpackage.bwc) bwjVar).m;
                                                    iArr = ((defpackage.bwc) bwjVar).e;
                                                    zoVar = ((defpackage.bwc) bwjVar).w;
                                                    ((defpackage.bwc) bwjVar).e = null;
                                                    ((defpackage.bwc) bwjVar).w = null;
                                                } catch (java.lang.Throwable th12) {
                                                    th = th12;
                                                    bzlVar = bzlVarE2;
                                                }
                                                defpackage.bwd.f(bzlVarE, arrayList2, ((defpackage.bzm) obj10).d(bzhVarD));
                                                bzlVarE.r();
                                                if (arrayList2.isEmpty()) {
                                                    khbVar3 = bzrVar.k;
                                                    if (!arrayList2.isEmpty()) {
                                                        java.lang.Object obj13 = khbVar3.a;
                                                        ((defpackage.cbi) obj13).b(defpackage.bzw.a);
                                                        defpackage.cbh.b((defpackage.cbi) obj13, 1, arrayList2, 0, cdaVar);
                                                    }
                                                    bzmVar = ((defpackage.bwc) bwjVar).c;
                                                    if (defpackage.afga.f(byeVar, bzmVar)) {
                                                        int iD5 = bzmVar.d(bzhVarD2);
                                                        ((defpackage.bwc) bwjVar).ae(iD5, ((defpackage.bwc) bwjVar).O(iD5) + arrayList2.size());
                                                    }
                                                } else {
                                                    bzhVarD = bzhVarD;
                                                }
                                                java.lang.Object obj14 = bzrVar.k.a;
                                                ((defpackage.cbi) obj14).b(defpackage.bzx.a);
                                                int i16 = ((defpackage.cbi) obj14).f - ((defpackage.cbi) obj14).a[((defpackage.cbi) obj14).b - 1].c;
                                                java.lang.Object[] objArr3 = ((defpackage.cbi) obj14).e;
                                                objArr3[i16] = khbVar;
                                                objArr3[i16 + 1] = bviVar;
                                                objArr3[i16 + 3] = bwsVar4;
                                                objArr3[i16 + 2] = bwsVar5;
                                                bzlVarE2 = ((defpackage.bzm) obj10).e();
                                            } catch (java.lang.Throwable th13) {
                                                bzlVarE.r();
                                                throw th13;
                                            }
                                            bzhVar = bwsVar5.g;
                                            bzhVarD = defpackage.bzd.d(bzhVar);
                                            arrayList2 = new java.util.ArrayList();
                                            bzlVarE = ((defpackage.bzm) obj10).e();
                                        }
                                        bzrVar.l();
                                        i13++;
                                        arrayList = arrayList;
                                        size10 = i14;
                                        cedVarM = cedVar;
                                    } catch (java.lang.Throwable th14) {
                                        th = th14;
                                    }
                                }
                                cedVar = cedVarM;
                                bzrVar.f();
                                ((defpackage.cbi) bzrVar.k.a).b(defpackage.cad.a);
                                bzrVar.c = 0;
                                try {
                                    bzrVar.k = khbVar5;
                                    try {
                                        ((defpackage.bwc) bwjVar).V();
                                        try {
                                            defpackage.cer.i.k(cejVarW);
                                            R(cedVar);
                                            map3 = map;
                                            it3 = it;
                                        } catch (java.lang.Throwable th15) {
                                            th = th15;
                                            R(cedVar);
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th16) {
                                        try {
                                            throw th16;
                                        } catch (java.lang.Throwable th17) {
                                            th = th17;
                                            try {
                                                java.util.Set set = bvkVar2.d;
                                                if (!set.isEmpty()) {
                                                    defpackage.cdg cdgVar = bvkVar2.j;
                                                    try {
                                                        cdgVar.h(set, bvkVar2.k.Q());
                                                        cdgVar.b();
                                                    } finally {
                                                        cdgVar.a();
                                                    }
                                                }
                                                throw th;
                                            } catch (java.lang.Throwable th18) {
                                                bvkVar2.h();
                                                throw th18;
                                            }
                                        }
                                    }
                                } catch (java.lang.Throwable th19) {
                                    th = th19;
                                    ((defpackage.bwc) bwjVar).U();
                                    throw th;
                                }
                            } catch (java.lang.Throwable th20) {
                                th = th20;
                                cedVar = cedVarM;
                            }
                        } catch (java.lang.Throwable th21) {
                            th = th21;
                            cedVar = cedVarM;
                        }
                    } catch (java.lang.Throwable th22) {
                        th = th22;
                        cedVar = cedVarM;
                    }
                } catch (java.lang.Throwable th23) {
                    th = th23;
                    cedVar = cedVarM;
                }
            } catch (java.lang.Throwable th24) {
                th = th24;
                cedVar = cedVarM;
            }
        }
        return defpackage.afga.aZ(map3.keySet());
    }

    public final defpackage.bvk J(defpackage.bvk bvkVar, defpackage.aaw aawVar) {
        defpackage.aaw aawVar2;
        if (bvkVar.v() || bvkVar.f() || ((aawVar2 = this.q) != null && aawVar2.a(bvkVar))) {
            return null;
        }
        defpackage.ced cedVarM = defpackage.bzd.m(new defpackage.bjm(bvkVar, 13), new defpackage.beh(bvkVar, aawVar, 12));
        try {
            defpackage.cej cejVarW = cedVarM.w();
            boolean zH = false;
            zH = false;
            if (aawVar != null) {
                try {
                    if (aawVar.c()) {
                        defpackage.bxn bxnVar = new defpackage.bxn(aawVar, bvkVar, zH ? 1 : 0);
                        defpackage.bwj bwjVar = bvkVar.k;
                        if (((defpackage.bwc) bwjVar).l) {
                            defpackage.bvg.b("Preparing a composition while composing is not supported");
                        }
                        ((defpackage.bwc) bwjVar).l = true;
                        try {
                            bxnVar.invoke();
                            ((defpackage.bwc) bwjVar).l = false;
                        } catch (java.lang.Throwable th) {
                            ((defpackage.bwc) bwjVar).l = false;
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    defpackage.cer.i.k(cejVarW);
                    throw th2;
                }
            }
            synchronized (bvkVar.c) {
                defpackage.bxg bxgVar = bvkVar.g;
                if (bxgVar == null || (bxgVar.d.get() == defpackage.bxh.e && bxgVar.e == java.lang.Thread.currentThread().getId())) {
                    bvkVar.o();
                    try {
                        defpackage.aau aauVarX = bvkVar.x();
                        try {
                            defpackage.bwj bwjVar2 = bvkVar.k;
                            defpackage.byc bycVar = bvkVar.f;
                            if (!((defpackage.bwc) bwjVar2).y.k()) {
                                defpackage.bvg.b("Expected applyChanges() to have been called");
                            }
                            if (aauVarX.e > 0 || !((defpackage.bwc) bwjVar2).g.isEmpty()) {
                                ((defpackage.bwc) bwjVar2).r = bycVar;
                                try {
                                    ((defpackage.bwc) bwjVar2).ak(aauVarX, null);
                                    ((defpackage.bwc) bwjVar2).r = null;
                                    zH = ((defpackage.bwc) bwjVar2).y.h();
                                } catch (java.lang.Throwable th3) {
                                    ((defpackage.bwc) bwjVar2).r = null;
                                    throw th3;
                                }
                            }
                            if (!zH) {
                                bvkVar.p();
                            }
                        } catch (java.lang.Throwable th4) {
                            bvkVar.n = aauVarX;
                            throw th4;
                        }
                    } catch (java.lang.Throwable th5) {
                        try {
                            java.util.Set set = bvkVar.d;
                            if (!set.isEmpty()) {
                                defpackage.cdg cdgVar = bvkVar.j;
                                try {
                                    cdgVar.h(set, bvkVar.k.Q());
                                    cdgVar.b();
                                } finally {
                                    cdgVar.a();
                                }
                            }
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            bvkVar.h();
                            throw th6;
                        }
                    }
                } else {
                    defpackage.a.g(bxgVar.d, defpackage.bxh.f, defpackage.bxh.d);
                    bxgVar.g.a.e(9);
                }
            }
            defpackage.cer.i.k(cejVarW);
            R(cedVarM);
            if (zH) {
                return bvkVar;
            }
            return null;
        } catch (java.lang.Throwable th7) {
            R(cedVarM);
            throw th7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v0, types: [bvk] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [bvh] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public final void K(java.lang.Throwable th, defpackage.bvk bvkVar) throws java.lang.Throwable {
        if (!((java.lang.Boolean) u.get()).booleanValue() || (th instanceof defpackage.bvb)) {
            synchronized (this.c) {
                android.util.Log.e("ComposeInternal", "Error was captured in composition.", th);
                ajba ajbaVar = this.z;
                defpackage.khb khbVar = (defpackage.khb) ajbaVar.b();
                if (khbVar != null) {
                    throw ((java.lang.Throwable) khbVar.a);
                }
                ajbaVar.d(new defpackage.khb(th, (byte[]) null));
            }
            throw th;
        }
        synchronized (this.c) {
            android.util.Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
            this.x.clear();
            this.f.g();
            this.m = new defpackage.aaw(6);
            this.g.clear();
            this.n.k();
            this.o.k();
            this.z.d(new defpackage.khb(th, (byte[]) null));
            if (bvkVar != 0) {
                while (bvkVar != 0) {
                    H((defpackage.bvk) bvkVar);
                    bvkVar = ((defpackage.bvk) bvkVar).a.c();
                    if (true != (bvkVar instanceof defpackage.bvk)) {
                        bvkVar = 0;
                    }
                }
            }
            if (A() != null) {
                defpackage.bvg.b("expected to go to inactive state due to composition error");
            }
        }
    }

    @Override // defpackage.bvi
    public final long a() {
        return 1000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [afer, java.lang.Object] */
    @Override // defpackage.bvi
    public final defpackage.buv b(defpackage.afer aferVar) {
        defpackage.bwz bwzVar = new defpackage.bwz(aferVar);
        defpackage.ngb ngbVar = this.s;
        return ((defpackage.ccw) ngbVar.a).a(bwzVar, ngbVar.b);
    }

    @Override // defpackage.bvi
    public final defpackage.bvh c() {
        return null;
    }

    @Override // defpackage.bvi
    public final defpackage.afdo d() {
        return this.j;
    }

    @Override // defpackage.bvi
    public final void e(defpackage.bws bwsVar) {
        aiuf aiufVarA;
        synchronized (this.c) {
            defpackage.byy.b(this.n, bwsVar.a, bwsVar);
            if (bwsVar.e != null) {
                L(this, bwsVar, bwsVar);
            }
            aiufVarA = A();
        }
        if (aiufVarA != null) {
            aiufVarA.w(defpackage.afbk.a);
        }
    }

    @Override // defpackage.bvi
    public final void i(defpackage.bxl bxlVar) {
        defpackage.lam lamVar = this.B;
        defpackage.aaw aawVar = (defpackage.aaw) lamVar.j();
        if (aawVar == null) {
            defpackage.aaw aawVar2 = defpackage.aax.a;
            aawVar = new defpackage.aaw(6);
            lamVar.k(aawVar);
        }
        aawVar.j(bxlVar);
    }

    @Override // defpackage.bvi
    public final boolean l() {
        return ((java.lang.Boolean) u.get()).booleanValue();
    }

    @Override // defpackage.bvi
    public final boolean m() {
        return false;
    }

    @Override // defpackage.bvi
    public final boolean n() {
        return defpackage.bvg.a == 2;
    }

    @Override // defpackage.bvi
    public final boolean o() {
        return defpackage.bvg.a != 0;
    }

    @Override // defpackage.bvi
    public final defpackage.aaw p(defpackage.bvk bvkVar, defpackage.byc bycVar, defpackage.affg affgVar) {
        try {
            defpackage.byc bycVarG = bvkVar.g(bycVar);
            try {
                s(bvkVar, affgVar);
                defpackage.aaw aawVar = (defpackage.aaw) this.B.j();
                if (aawVar == null) {
                    aawVar = defpackage.aax.a;
                    aawVar.getClass();
                }
                bvkVar.g(bycVarG);
                this.B.k(null);
                return aawVar;
            } catch (java.lang.Throwable th) {
                bvkVar.g(bycVarG);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.B.k(null);
            throw th2;
        }
    }

    @Override // defpackage.bvi
    public final defpackage.aaw q(defpackage.bvk bvkVar, defpackage.byc bycVar, defpackage.aaw aawVar) {
        try {
            G();
            bvkVar.s(new defpackage.bzf(aawVar));
            defpackage.byc bycVarG = bvkVar.g(bycVar);
            try {
                defpackage.bvk bvkVarJ = J(bvkVar, null);
                if (bvkVarJ != null) {
                    O(bvkVar);
                    bvkVarJ.j();
                    bvkVarJ.k();
                }
                defpackage.aaw aawVar2 = (defpackage.aaw) this.B.j();
                if (aawVar2 == null) {
                    aawVar2 = defpackage.aax.a;
                    aawVar2.getClass();
                }
                bvkVar.g(bycVarG);
                this.B.k(null);
                return aawVar2;
            } catch (java.lang.Throwable th) {
                bvkVar.g(bycVarG);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.B.k(null);
            throw th2;
        }
    }

    @Override // defpackage.bvi
    public final void s(defpackage.bvk bvkVar, defpackage.affg affgVar) throws java.lang.Throwable {
        boolean zContains;
        boolean zV = bvkVar.v();
        synchronized (this.c) {
            zContains = ((defpackage.bxo) this.l.b()).compareTo(defpackage.bxo.b) > 0 ? true ^ z().contains(bvkVar) : true;
        }
        try {
            defpackage.ced cedVarM = defpackage.bzd.m(new defpackage.bjm(bvkVar, 13), new defpackage.beh(bvkVar, null, 12));
            try {
                defpackage.cej cejVarW = cedVarM.w();
                try {
                    synchronized (bvkVar.c) {
                        bvkVar.o();
                        defpackage.aau aauVarX = bvkVar.x();
                        try {
                            defpackage.bwj bwjVar = bvkVar.k;
                            defpackage.byc bycVar = bvkVar.f;
                            if (!((defpackage.bwc) bwjVar).y.k()) {
                                defpackage.bvg.b("Expected applyChanges() to have been called");
                            }
                            ((defpackage.bwc) bwjVar).r = bycVar;
                            try {
                                ((defpackage.bwc) bwjVar).ak(aauVarX, affgVar);
                                ((defpackage.bwc) bwjVar).r = null;
                            } catch (java.lang.Throwable th) {
                                ((defpackage.bwc) bwjVar).r = null;
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            bvkVar.n = aauVarX;
                            throw th2;
                        }
                    }
                    defpackage.cer.i.k(cejVarW);
                    R(cedVarM);
                    synchronized (this.c) {
                        if (((defpackage.bxo) this.l.b()).compareTo(defpackage.bxo.b) > 0 && !z().contains(bvkVar)) {
                            this.v.add(bvkVar);
                            this.w = null;
                        }
                    }
                    if (!zV) {
                        defpackage.cer.b().e();
                    }
                    try {
                        O(bvkVar);
                        try {
                            bvkVar.j();
                            bvkVar.k();
                            if (zV) {
                                return;
                            }
                            defpackage.cer.b().e();
                        } catch (java.lang.Throwable th3) {
                            K(th3, null);
                        }
                    } catch (java.lang.Throwable th4) {
                        K(th4, bvkVar);
                    }
                } catch (java.lang.Throwable th5) {
                    try {
                        java.util.Set set = bvkVar.d;
                        if (!set.isEmpty()) {
                            defpackage.cdg cdgVar = bvkVar.j;
                            try {
                                cdgVar.h(set, bvkVar.k.Q());
                                cdgVar.b();
                            } finally {
                                cdgVar.a();
                            }
                        }
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        try {
                            bvkVar.h();
                            throw th6;
                        } catch (java.lang.Throwable th7) {
                            defpackage.cer.i.k(cejVarW);
                            throw th7;
                        }
                    }
                }
            } catch (java.lang.Throwable th8) {
                R(cedVarM);
                throw th8;
            }
        } catch (java.lang.Throwable th9) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            K(th9, bvkVar);
        }
    }

    @Override // defpackage.bvi
    public final void t(defpackage.bvk bvkVar) {
        aiuf aiufVarA;
        synchronized (this.c) {
            defpackage.bzc bzcVar = this.f;
            if (bzcVar.l(bvkVar)) {
                aiufVarA = null;
            } else {
                bzcVar.n(bvkVar);
                aiufVarA = A();
            }
        }
        if (aiufVarA != null) {
            aiufVarA.w(defpackage.afbk.a);
        }
    }

    @Override // defpackage.bvi
    public final void u(defpackage.bvk bvkVar) {
        synchronized (this.c) {
            defpackage.aaw aawVar = this.q;
            if (aawVar == null) {
                defpackage.aaw aawVar2 = defpackage.aax.a;
                aawVar = new defpackage.aaw(6);
                this.q = aawVar;
            }
            aawVar.j(bvkVar);
        }
    }

    @Override // defpackage.bvi
    public final void v(defpackage.bvk bvkVar) {
        synchronized (this.c) {
            Q(bvkVar);
            this.f.m(bvkVar);
            this.x.remove(bvkVar);
        }
    }

    @Override // defpackage.bvi
    public final defpackage.khb w(defpackage.bws bwsVar) {
        defpackage.khb khbVar;
        synchronized (this.c) {
            khbVar = (defpackage.khb) this.o.i(bwsVar);
        }
        return khbVar;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0192 A[Catch: all -> 0x019c, LOOP:4: B:63:0x0157->B:74:0x0192, LOOP_END, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x0017, B:11:0x002c, B:13:0x0032, B:15:0x003c, B:17:0x004f, B:19:0x005d, B:21:0x0071, B:22:0x0074, B:24:0x0079, B:25:0x007c, B:27:0x0087, B:29:0x0094, B:31:0x00a2, B:33:0x00b0, B:34:0x00b8, B:36:0x00c2, B:38:0x00cd, B:39:0x00d1, B:41:0x00d7, B:60:0x014b, B:63:0x0157, B:65:0x0167, B:66:0x016a, B:68:0x0173, B:70:0x017c, B:71:0x018a, B:74:0x0192, B:42:0x00de, B:59:0x0147, B:76:0x0196, B:77:0x0199, B:7:0x001a, B:9:0x001e, B:10:0x0021, B:43:0x00ec, B:45:0x00f3, B:46:0x010b, B:48:0x010f, B:51:0x0114, B:53:0x011b, B:54:0x011f, B:56:0x0125, B:57:0x012a, B:58:0x0141), top: B:85:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x019a A[EDGE_INSN: B:95:0x019a->B:78:0x019a BREAK  A[LOOP:4: B:63:0x0157->B:74:0x0192], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    @Override // defpackage.bvi
    public final void x(defpackage.bws bwsVar, defpackage.khb khbVar, defpackage.buq buqVar) {
        defpackage.aan aanVar;
        defpackage.aau aauVar;
        int i;
        int i2;
        ?? r6;
        synchronized (this.c) {
            defpackage.aau aauVar2 = this.o;
            aauVar2.m(bwsVar, khbVar);
            java.lang.Object objA = this.p.a(bwsVar);
            if (objA == null) {
                aanVar = defpackage.aao.b;
            } else if (objA instanceof defpackage.aan) {
                aanVar = (defpackage.aan) objA;
            } else {
                java.lang.Object[] objArr = defpackage.aao.a;
                defpackage.aan aanVar2 = new defpackage.aan(1);
                aanVar2.p(objA);
                aanVar = aanVar2;
            }
            if (aanVar.g()) {
                java.lang.Object obj = khbVar.a;
                java.lang.Object[] objArr2 = aanVar.a;
                int i3 = aanVar.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!((defpackage.bzm) obj).h(defpackage.bzd.d(((defpackage.bws) objArr2[i4]).g))) {
                        defpackage.aan aanVar3 = new defpackage.aan(16);
                        java.lang.Object[] objArr3 = aanVar.a;
                        int i5 = aanVar.b;
                        for (int i6 = 0; i6 < i5; i6++) {
                            java.lang.Object obj2 = objArr3[i6];
                            if (((defpackage.bzm) obj).h(defpackage.bzd.d(((defpackage.bws) obj2).g))) {
                                aanVar3.p(obj2);
                            }
                        }
                        aanVar = aanVar3;
                        break;
                    }
                }
                defpackage.bmp bmpVar = new defpackage.bmp(obj, 19);
                if (aanVar.b > 1) {
                    java.lang.Object objInvoke = bmpVar.invoke(aanVar.c(0));
                    int i7 = aanVar.b;
                    int i8 = 1;
                    while (true) {
                        if (i8 >= i7) {
                            r6 = objInvoke;
                            break;
                        }
                        java.lang.Object objInvoke2 = bmpVar.invoke(aanVar.c(i8));
                        if (r6.compareTo(objInvoke2) > 0) {
                            r6 = objInvoke;
                            defpackage.aan aanVar4 = new defpackage.aan(aanVar.b);
                            java.lang.Object[] objArr4 = aanVar.a;
                            int i9 = aanVar.b;
                            for (int i10 = 0; i10 < i9; i10++) {
                                aanVar4.p(objArr4[i10]);
                            }
                            java.util.List listJ = aanVar4.j();
                            if (listJ.size() > 1) {
                                defpackage.afga.am(listJ, new defpackage.dab(bmpVar, 1, null));
                            }
                            aanVar = aanVar4;
                            break;
                        }
                        r6 = objInvoke;
                        i8++;
                        r6 = objInvoke2;
                    }
                }
                if (aanVar.f()) {
                    aauVar = defpackage.aav.b;
                    aauVar.getClass();
                } else {
                    long[] jArr = defpackage.aav.a;
                    defpackage.aau aauVar3 = new defpackage.aau(6);
                    defpackage.bzp bzpVarF = ((defpackage.bzm) obj).f();
                    try {
                        java.lang.Object[] objArr5 = aanVar.a;
                        int i11 = aanVar.b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            defpackage.bws bwsVar2 = (defpackage.bws) objArr5[i12];
                            int iA = bzpVarF.a(defpackage.bzd.d(bwsVar2.g));
                            int iK = bzpVarF.k(iA);
                            defpackage.bzm.g(bzpVarF, iK);
                            defpackage.bzm.g(bzpVarF, iK);
                            while (true) {
                                i = bzpVarF.o;
                                if (i == iK || i == bzpVarF.p) {
                                    break;
                                    break;
                                } else if (iK < i + bzpVarF.i(i)) {
                                    bzpVarF.J();
                                } else {
                                    bzpVarF.l();
                                }
                            }
                            if (i != iK) {
                                defpackage.bvg.b("Unexpected slot table structure");
                            }
                            bzpVarF.J();
                            bzpVarF.u(iA - bzpVarF.o);
                            aauVar3.m(bwsVar2, defpackage.bvg.c(bwsVar2.f, bwsVar2, bzpVarF, buqVar));
                        }
                        defpackage.bzm.g(bzpVarF, Integer.MAX_VALUE);
                        bzpVarF.w(true);
                        aauVar = aauVar3;
                    } catch (java.lang.Throwable th) {
                        bzpVarF.w(false);
                        throw th;
                    }
                }
                java.lang.Object[] objArr6 = aauVar.b;
                java.lang.Object[] objArr7 = aauVar.c;
                long[] jArr2 = aauVar.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j = jArr2[i13];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i13 != length) {
                                break;
                                break;
                            }
                            i13++;
                        } else {
                            int i14 = i13 - length;
                            int i15 = 0;
                            while (true) {
                                i2 = 8 - ((~i14) >>> 31);
                                if (i15 >= i2) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i16 = (i13 << 3) + i15;
                                    aauVar2.m((defpackage.bws) objArr6[i16], (defpackage.khb) objArr7[i16]);
                                }
                                j >>= 8;
                                i15++;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i13 != length) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
            }
        }
    }

    public final java.lang.Object y(defpackage.afdk afdkVar) {
        java.lang.Object objA = ahoc.a(this.b, new defpackage.bxq(this, new defpackage.bxs(this, null), defpackage.bxi.d(afdkVar.gT()), null), afdkVar);
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (objA != afdrVar) {
            objA = defpackage.afbk.a;
        }
        return objA == afdrVar ? objA : defpackage.afbk.a;
    }

    public final java.util.List z() {
        java.util.List list = this.w;
        if (list != null) {
            return list;
        }
        java.util.List list2 = this.v;
        java.util.List arrayList = list2.isEmpty() ? defpackage.afce.a : new java.util.ArrayList(list2);
        this.w = arrayList;
        return arrayList;
    }

    @Override // defpackage.bvi
    public final void g(java.util.Set set) {
    }
}
