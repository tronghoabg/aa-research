package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kwv {
    public final java.lang.Object a;

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c A[PHI: r9
  0x002c: PHI (r9v1 int) = (r9v0 int), (r9v3 int), (r9v4 int) binds: [B:5:0x0014, B:11:0x001e, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public kwv(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length = fArr.length - 1;
        defpackage.aes[][] aesVarArr = new defpackage.aes[length][];
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < length) {
            int i5 = iArr[i2];
            int i6 = 3;
            if (i5 == 0) {
                i = i6;
            } else if (i5 == 1) {
                i3 = 1;
                i = i3;
            } else {
                if (i5 != 2) {
                    if (i5 != 3) {
                        i6 = 4;
                        if (i5 != 4) {
                            i6 = 5;
                            if (i5 != 5) {
                                i = i4;
                            } else {
                                i = i6;
                            }
                        } else {
                            i = i6;
                        }
                    } else {
                        if (i3 != 1) {
                            i3 = 1;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i2];
            int i7 = i2 + 1;
            float[] fArr4 = fArr2[i7];
            float f = fArr[i2];
            float f2 = fArr[i7];
            int length2 = fArr3.length;
            int i8 = (length2 & 1) + (length2 >> 1);
            defpackage.aes[] aesVarArr2 = new defpackage.aes[i8];
            int i9 = 0;
            while (i9 < i8) {
                int i10 = i9 + i9;
                defpackage.aes[] aesVarArr3 = aesVarArr2;
                int i11 = i10 + 1;
                int i12 = i9;
                aesVarArr3[i12] = new defpackage.aes(i, f, f2, fArr3[i10], fArr3[i11], fArr4[i10], fArr4[i11]);
                i9 = i12 + 1;
                i8 = i8;
                aesVarArr2 = aesVarArr3;
            }
            aesVarArr[i2] = aesVarArr2;
            i4 = i;
            i2 = i7;
        }
        this.a = aesVarArr;
    }

    public static void G(android.view.View view, defpackage.ece eceVar) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            bgp$.ExternalSyntheticApiModelOutline0.m(view, eceVar != null ? new defpackage.ecj(eceVar) : null);
            return;
        }
        android.view.animation.Interpolator interpolator = eci.a;
        ech echVar = eceVar != null ? new ech(view, eceVar) : null;
        view.setTag(2131429720, echVar);
        if (view.getTag(2131429708) == null && view.getTag(2131429710) == null) {
            view.setOnApplyWindowInsetsListener(echVar);
        }
    }

    public static defpackage.kwv a() {
        return (defpackage.kwv) defpackage.mkp.a.i(defpackage.kwv.class);
    }

    public final defpackage.ehp A() {
        return (defpackage.ehp) ((ajba) this.a).b();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    public final defpackage.ehp B(defpackage.ehp ehpVar) {
        ajba ajbaVar;
        java.lang.Object objB;
        defpackage.ehp ehpVar2;
        ehpVar.getClass();
        do {
            ajbaVar = (ajba) this.a;
            objB = ajbaVar.b();
            ehpVar2 = (defpackage.ehp) objB;
            if ((ehpVar2 instanceof defpackage.ehe) || defpackage.afga.f(ehpVar2, defpackage.ehs.a)) {
                ehpVar2 = ehpVar;
            } else if (ehpVar2 instanceof defpackage.eez) {
                if (ehpVar.c > ((defpackage.eez) ehpVar2).c) {
                    ehpVar2 = ehpVar;
                }
            } else if (!(ehpVar2 instanceof defpackage.egv)) {
                if (ehpVar2 instanceof defpackage.ehc) {
                    throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                throw new defpackage.afas();
            }
        } while (!ajbaVar.e(objB, ehpVar2));
        return ehpVar2;
    }

    public final float C() {
        return ((defpackage.ecl) this.a).g();
    }

    public final float D() {
        return ((defpackage.ecl) this.a).h();
    }

    public final int E() {
        return ((defpackage.ecl) this.a).i();
    }

    public final long F() {
        return ((defpackage.ecl) this.a).j();
    }

    public final void H(float f) {
        ((defpackage.ecl) this.a).k(f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bwx, java.lang.Object] */
    public final void I(boolean z) {
        this.a.b(java.lang.Boolean.valueOf(z));
    }

    public final void J() {
        ((java.util.HashMap) this.a).clear();
    }

    public final void K(java.lang.String str) {
        try {
            ((android.content.Context) this.a).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
        } catch (android.content.ActivityNotFoundException e) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "Can't open ", "."), e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    public final int L() {
        return ((defpackage.cps) this.a.a()).a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bwx, java.lang.Object] */
    public final void M(int i) {
        this.a.b(new defpackage.cps(i));
    }

    public final void N(int i) {
        int i2 = 6;
        if (i != 6) {
            i2 = 3;
            if (i != 3) {
                if (i == 0) {
                    i2 = 0;
                } else {
                    i2 = 9;
                    if (i != 9) {
                        i2 = 1;
                        if (i != 1) {
                            i2 = -1;
                        }
                    }
                }
            }
        }
        java.lang.Object obj = this.a;
        int[] iArr = defpackage.ebt.a;
        if (i2 == -1) {
            i2 = -1;
        }
        if (i2 == -1) {
            return;
        }
        ((android.view.View) obj).performHapticFeedback(i2);
    }

    public final java.lang.Object O(defpackage.sr srVar) {
        ((defpackage.czt) this.a).a().setPrimaryClip((android.content.ClipData) srVar.a);
        return defpackage.afbk.a;
    }

    public final defpackage.ayu P(int i, int i2) {
        defpackage.ayu ayuVar = new defpackage.ayu(i, i2);
        ((defpackage.bzc) this.a).n(ayuVar);
        return ayuVar;
    }

    public final void Q(defpackage.ayu ayuVar) {
        ((defpackage.bzc) this.a).m(ayuVar);
    }

    public final boolean R() {
        return ((defpackage.bzc) this.a).b != 0;
    }

    public final void S(java.lang.Throwable th) {
        defpackage.bzc bzcVar = (defpackage.bzc) this.a;
        int i = bzcVar.b;
        aiuf[] aiufVarArr = new aiuf[i];
        for (int i2 = 0; i2 < i; i2++) {
            aiufVarArr[i2] = ((defpackage.ang) bzcVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            aiufVarArr[i3].g(th);
        }
        if (bzcVar.b == 0) {
            return;
        }
        defpackage.asq.d("uncancelled requests present");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aff, java.lang.Object] */
    public final defpackage.ahb T() {
        return new defpackage.ahb(this.a);
    }

    public final java.lang.Object U(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.util.LinkedHashMap) this.a).put(obj, obj2);
    }

    public final java.lang.Object V(java.lang.Object obj) {
        obj.getClass();
        return ((java.util.LinkedHashMap) this.a).remove(obj);
    }

    public final boolean W() {
        return ((java.util.LinkedHashMap) this.a).isEmpty();
    }

    public final defpackage.bt X() {
        return ((defpackage.bg) this.a).e;
    }

    public final android.view.View Y(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return ((defpackage.bg) this.a).e.d.onCreateView(view, str, context, attributeSet);
    }

    public final void Z() {
        ((defpackage.bg) this.a).e.s();
    }

    public final void aa() {
        ((defpackage.bg) this.a).e.u();
    }

    public final void ab() {
        ((defpackage.bg) this.a).e.v();
    }

    public final void ac() {
        ((defpackage.bg) this.a).e.B();
    }

    public final void ad() {
        ((defpackage.bg) this.a).e.D();
    }

    public final void ae() {
        ((defpackage.bg) this.a).e.E();
    }

    public final void af() {
        ((defpackage.bg) this.a).e.G();
    }

    public final void ag() {
        ((defpackage.bg) this.a).e.N();
    }

    public final void ah() {
        java.lang.Object obj = this.a;
        defpackage.bg bgVar = (defpackage.bg) obj;
        bgVar.e.o(bgVar, (defpackage.be) obj, null);
    }

    public final void ai() {
        ((defpackage.bg) this.a).e.an(true);
    }

    public final boolean b() {
        return ((defpackage.npc) this.a).e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    public final java.lang.Object c(java.lang.String str) throws defpackage.qsu, defpackage.qst {
        java.lang.Object objE;
        switch (str) {
            case "car_navigation_service":
                objE = defpackage.ooa.e((defpackage.qsh) this.a);
                break;
            case "car_1p":
                objE = ((defpackage.qsh) this.a).a().u();
                break;
            case "sensor":
                objE = ((defpackage.qsh) this.a).a().y();
                break;
            case "info":
                objE = ((defpackage.qsh) this.a).a().v();
                break;
            case "audio":
                objE = defpackage.oml.i((defpackage.qsh) this.a);
                break;
            case "car_control_service":
                objE = ((defpackage.qsh) this.a).a().e();
                break;
            case "car_display_service":
                objE = ((defpackage.qsh) this.a).a().f();
                break;
            case "car_call_service":
                objE = defpackage.oml.k((defpackage.qsh) this.a);
                break;
            case "app_focus":
                objE = defpackage.oml.s((defpackage.qsh) this.a);
                break;
            case "car_bluetooth_conn":
                objE = defpackage.oml.j((defpackage.qsh) this.a);
                break;
            default:
                objE = null;
                break;
        }
        if (objE != null) {
            return objE;
        }
        throw new defpackage.qsu("could not find a manager for the given serviceName:  serviceName = ".concat(str));
    }

    public final defpackage.row d(int i) throws defpackage.qsu, defpackage.qst {
        return ((defpackage.qsh) this.a).a().t(new com.google.android.gms.car.display.CarDisplayId(i));
    }

    public final void e(int i, boolean z) throws java.io.IOException {
        ((defpackage.abof) this.a).f(i, z);
    }

    public final void f(int i, defpackage.abnv abnvVar) throws java.io.IOException {
        ((defpackage.abof) this.a).g(i, abnvVar);
    }

    public final void g(int i, double d) throws java.io.IOException {
        ((defpackage.abof) this.a).J(i, d);
    }

    public final void h(int i, int i2) throws java.io.IOException {
        ((defpackage.abof) this.a).m(i, i2);
    }

    public final void i(int i, int i2) throws java.io.IOException {
        ((defpackage.abof) this.a).i(i, i2);
    }

    public final void j(int i, long j) throws java.io.IOException {
        ((defpackage.abof) this.a).k(i, j);
    }

    public final void k(int i, float f) throws java.io.IOException {
        ((defpackage.abof) this.a).L(i, f);
    }

    public final void l(int i, java.lang.Object obj, defpackage.abqn abqnVar) throws java.io.IOException {
        defpackage.abof abofVar = (defpackage.abof) this.a;
        abofVar.t(i, 3);
        abqnVar.m((defpackage.abng) obj, this);
        abofVar.t(i, 4);
    }

    public final void m(int i, int i2) throws java.io.IOException {
        ((defpackage.abof) this.a).m(i, i2);
    }

    public final void n(int i, long j) throws java.io.IOException {
        ((defpackage.abof) this.a).w(i, j);
    }

    public final void o(int i, java.lang.Object obj, defpackage.abqn abqnVar) throws java.io.IOException {
        defpackage.abng abngVar = (defpackage.abng) obj;
        defpackage.abof abofVar = (defpackage.abof) this.a;
        abofVar.t(i, 2);
        abofVar.v(abngVar.e(abqnVar));
        abqnVar.m(abngVar, this);
    }

    public final void p(int i, java.lang.Object obj) throws java.io.IOException {
        boolean z = obj instanceof defpackage.abnv;
        java.lang.Object obj2 = this.a;
        if (z) {
            ((defpackage.abof) obj2).q(i, (defpackage.abnv) obj);
        } else {
            ((defpackage.abof) obj2).p(i, (defpackage.abpy) obj);
        }
    }

    public final void q(int i, int i2) throws java.io.IOException {
        ((defpackage.abof) this.a).i(i, i2);
    }

    public final void r(int i, long j) throws java.io.IOException {
        ((defpackage.abof) this.a).k(i, j);
    }

    public final void s(int i, int i2) throws java.io.IOException {
        ((defpackage.abof) this.a).u(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void t(int i, long j) throws java.io.IOException {
        ((defpackage.abof) this.a).w(i, (j >> 63) ^ (j + j));
    }

    public final void u(int i, java.lang.String str) throws java.io.IOException {
        ((defpackage.abof) this.a).r(i, str);
    }

    public final void v(int i, int i2) throws java.io.IOException {
        ((defpackage.abof) this.a).u(i, i2);
    }

    public final void w(int i, long j) throws java.io.IOException {
        ((defpackage.abof) this.a).w(i, j);
    }

    public final defpackage.zhs x(java.io.IOException iOException, defpackage.wha whaVar) {
        return !(iOException.getCause() instanceof defpackage.abpp) ? new defpackage.zif(iOException) : defpackage.zfz.g(whaVar.a(defpackage.ysr.cp(this.a)), java.io.IOException.class, new defpackage.key(iOException, 17), defpackage.zgt.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wgg */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.io.File y(android.net.Uri uri) throws wgg {
        java.io.File externalFilesDir;
        android.accounts.Account account;
        if (!uri.getScheme().equals("android")) {
            throw new wgg("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new wgg(java.lang.String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!android.text.TextUtils.isEmpty(uri.getQuery())) {
            throw new wgg("Did not expect uri to have query");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(uri.getPathSegments());
        java.lang.String str = (java.lang.String) arrayList.get(0);
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals("external")) {
                    externalFilesDir = ((android.content.Context) this.a).getExternalFilesDir(null);
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wgg(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str.equals("cache")) {
                    externalFilesDir = ((android.content.Context) this.a).getCacheDir();
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wgg(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str.equals("files")) {
                    externalFilesDir = defpackage.sqs.bH((android.content.Context) this.a);
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wgg(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str.equals("managed")) {
                    java.io.File file = new java.io.File(defpackage.sqs.bH((android.content.Context) this.a), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            java.lang.String str2 = (java.lang.String) arrayList.get(2);
                            android.accounts.Account account2 = defpackage.wfu.a;
                            if ("shared".equals(str2)) {
                                account = defpackage.wfu.a;
                            } else {
                                int iIndexOf = str2.indexOf(58);
                                defpackage.acmj.h(iIndexOf >= 0, "Malformed account", new java.lang.Object[0]);
                                account = new android.accounts.Account(str2.substring(iIndexOf + 1), str2.substring(0, iIndexOf));
                            }
                            if (!defpackage.wfu.a.equals(account)) {
                                throw new wgg("AccountManager cannot be null");
                            }
                        } catch (java.lang.IllegalArgumentException e) {
                            throw new wgg(e);
                        }
                    }
                    externalFilesDir = file;
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wgg(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str.equals("directboot-cache")) {
                    externalFilesDir = a$.ExternalSyntheticApiModelOutline2.m((android.content.Context) this.a).getCacheDir();
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wgg(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str.equals("directboot-files")) {
                    externalFilesDir = a$.ExternalSyntheticApiModelOutline2.m((android.content.Context) this.a).getFilesDir();
                    return new java.io.File(externalFilesDir, android.text.TextUtils.join(java.io.File.separator, arrayList.subList(1, arrayList.size())));
                }
                throw new wgg(java.lang.String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new wgg(java.lang.String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    public final java.lang.Object z() {
        return ((java.lang.ref.WeakReference) this.a).get();
    }

    public kwv(android.widget.TextView textView) {
        this.a = new defpackage.enf();
    }

    public kwv(java.lang.Object obj) {
        this.a = obj;
    }

    public kwv(java.lang.Object obj, char[] cArr) {
        this.a = obj;
    }

    public kwv(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.a = new defpackage.bzc(new defpackage.ang[16]);
    }

    public kwv(byte[] bArr, char[] cArr) {
        this.a = new defpackage.bzc(new defpackage.ayu[16]);
    }

    public kwv(int i) {
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.cps(i), defpackage.bxv.c);
    }

    public kwv(byte[] bArr) {
        this.a = new java.util.concurrent.atomic.AtomicReference(null);
    }

    public kwv(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new java.util.HashMap();
    }

    public kwv(char[] cArr, byte[] bArr) {
        this.a = new java.util.LinkedHashMap(0, 0.75f, true);
    }

    public kwv(java.lang.Object obj, byte[] bArr) {
        this.a = new java.lang.ref.WeakReference(obj);
    }

    public kwv(char[] cArr) {
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
    }

    public kwv(defpackage.abof abofVar) {
        this.a = abofVar;
        abofVar.a = this;
    }

    public kwv(short[] sArr) {
        this.a = new defpackage.zz(10);
    }

    public kwv(android.content.Context context) {
        this.a = new defpackage.npc(context);
    }

    public kwv(android.content.Context context, byte[] bArr, byte[] bArr2) {
        java.lang.Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (android.view.accessibility.AccessibilityManager) systemService;
    }

    public kwv() {
        this.a = new java.util.HashMap();
    }

    public kwv(java.lang.String str, byte[] bArr) {
        this.a = str;
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("name cannot be empty");
        }
    }

    public kwv(int i, android.view.animation.Interpolator interpolator, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.a = new defpackage.eck(new android.view.WindowInsetsAnimation(i, interpolator, j));
        } else {
            this.a = new eci(i, interpolator, j);
        }
    }

    public kwv(defpackage.qsh qshVar) {
        this.a = qshVar;
        new j$.util.concurrent.ConcurrentHashMap();
    }

    public kwv(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (android.view.animation.Interpolator) null, 0L);
        this.a = new defpackage.eck(windowInsetsAnimation);
    }

    public kwv(byte[] bArr, byte[] bArr2) {
        this.a = new ajba(defpackage.ehs.a);
    }
}
