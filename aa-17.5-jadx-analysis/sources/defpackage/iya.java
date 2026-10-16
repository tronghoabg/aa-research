package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class iya implements ixu {
    public static final yph a = yph.c("CAR.VALIDATOR");
    public static final yfq b;
    private static final ygr g;
    private static final ygr h;
    private static final ygr i;
    private static final ygr j;
    private static iya k;
    private static int l;
    public final aezk c;
    public volatile CarInfo d;
    private final Map m;
    private final xyc n;
    private final xyc o;
    private final boolean p;
    private final xyc q;
    private final Context s;
    private volatile CarUiInfo u;
    private volatile xkj v;
    private final CopyOnWriteArrayList r = new CopyOnWriteArrayList();
    private final AtomicReference t = new AtomicReference(new WeakReference(null));
    private final aat w = new aat(0);
    private final Set x = new HashSet();
    private final ixy y = new ixy(this);
    public final Object e = new Object();
    private final Map z = new HashMap();
    public CountDownLatch f = new CountDownLatch(1);

    static {
        ymp ympVar = new ymp(0);
        g = ympVar;
        ygp ygpVar = new ygp();
        ygpVar.k(ympVar);
        ygpVar.c(2);
        h = ygpVar.g();
        i = new ymp("com.google.android.gms");
        Intent intent = iyb.a;
        qpi qpiVar = qpi.f;
        ixz ixzVar = new ixz(intent, qpiVar, 0);
        ixz ixzVar2 = new ixz(iyb.b, qpiVar, 0);
        Intent intent2 = iyb.d;
        qpi qpiVar2 = qpi.h;
        b = yfq.v(ixzVar, ixzVar2, new ixz(intent2, qpiVar2, 0), new ixz(iyb.e, qpiVar2, 0), new ixz(iyb.c, qpi.c, 0), new ixz(iyb.f, qpi.i, 0));
        j = ygr.t(qpi.c, qpi.d, qpi.b, qpi.a, qpi.j, qpi.e, qpi.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iya(Context context, aezk aezkVar) {
        yfy yfyVarD;
        this.s = context;
        this.c = aezkVar;
        acma acmaVar = acma.a;
        this.p = acmaVar.gu().e();
        String strC = acmaVar.gu().c();
        HashMap map = new HashMap();
        if (strC.isEmpty()) {
            yfyVarD = ylx.a;
        } else {
            yfq yfqVarP = yfq.p(strC.substring(strC.indexOf(124) + 1).split(","));
            HashMap map2 = new HashMap();
            ynp ynpVarListIterator = yfqVarP.listIterator(0);
            while (ynpVarListIterator.hasNext()) {
                String str = (String) ynpVarListIterator.next();
                Map.Entry entryE = tgx.e(str);
                if (entryE == null) {
                    ((ype) ((ype) a.g()).ai((char) 1556)).y("Invalid package item: %s", str);
                } else {
                    String str2 = (String) entryE.getKey();
                    Optional optional = (Optional) entryE.getValue();
                    Set yyVar = (Set) map2.get(str2);
                    if (yyVar == null || !yyVar.isEmpty()) {
                        yyVar = (yyVar == null || optional.isEmpty()) ? new yy(0) : yyVar;
                        if (optional.isPresent()) {
                            yyVar.add((Long) optional.get());
                        }
                        map2.put(str2, yyVar);
                    }
                }
            }
            yfu yfuVar = new yfu(4);
            for (Map.Entry entry : map2.entrySet()) {
                yfuVar.e((String) entry.getKey(), ygr.n((Collection) entry.getValue()));
            }
            yfyVarD = yfuVar.d(true);
        }
        yno it = yfyVarD.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            String str3 = (String) entry2.getKey();
            Set set = (Set) entry2.getValue();
            set.size();
            Iterator it2 = set.iterator();
            long jMin = Long.MAX_VALUE;
            while (it2.hasNext()) {
                jMin = Math.min(jMin, ((Long) it2.next()).longValue());
            }
            if (jMin >= Long.MAX_VALUE) {
                jMin = 0;
            }
            map.put(str3, Long.valueOf(jMin));
        }
        this.m = map;
        this.n = wub.L(new ilk(context, 8));
        this.o = wub.L(new imq(5));
        this.q = wub.L(new ilk(this, 9));
    }

    private final int A(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.s.getPackageManager().getApplicationInfo(str, 128);
        if (applicationInfo.metaData == null) {
            return 0;
        }
        return applicationInfo.metaData.getInt("com.google.android.gms.car.application", 0);
    }

    private final XmlResourceParser B(Optional optional, Optional optional2, String str) throws PackageManager.NameNotFoundException {
        if (optional2.isEmpty()) {
            optional2 = Optional.of(Integer.valueOf(A(str)));
        }
        if (((Integer) optional2.get()).intValue() == 0) {
            return null;
        }
        if (optional.isEmpty()) {
            optional = Optional.of(this.s.getPackageManager().getResourcesForApplication(str));
        }
        try {
            return ((Resources) optional.get()).getXml(((Integer) optional2.get()).intValue());
        } catch (Resources.NotFoundException unused) {
            ((ype) a.l().ai((char) 1568)).y("Resource not found [%s]", str);
            return null;
        }
    }

    private final yfq C(Intent intent, qpi qpiVar, boolean z) {
        return K() ? F(intent, qpiVar, z, 0) : D(intent, qpiVar, z, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final yfq D(Intent intent, final qpi qpiVar, final boolean z, int i2) throws PackageManager.NameNotFoundException {
        List<ResolveInfo> listQueryIntentActivities;
        int iAs;
        int iAs2;
        if (acoh.a.gu().d()) {
            tfk.a.b(tfj.GEARHEAD_CAR_PROJECTION_VALIDATOR_QUERY_ALLOWED_CLIENTS);
        }
        Context context = this.s;
        int i3 = eee.n(context) ? i2 | 128 : i2;
        int i4 = 2;
        int i5 = 0;
        if (a.P() && qpiVar == qpi.j) {
            ygrVarG = intent.hasCategory("android.intent.category.CAR_LAUNCHER") ? G() : null;
            int iAs3 = a.as(acpf.e().c);
            if (iAs3 == 0) {
                iAs3 = 1;
            }
            boolean z2 = (intent.getComponent() == null && TextUtils.isEmpty(intent.getPackage())) ? false : true;
            boolean zHasCategory = intent.hasCategory("android.intent.category.LAUNCHER");
            if ((a.P() && (((iAs = a.as(acpf.e().c)) != 0 && iAs == 5) || (acpf.k() && (iAs2 = a.as(acpf.d().c)) != 0 && iAs2 == 5))) || iAs3 == 7 || acpf.k() || z2 || !zHasCategory) {
                ((ype) a.l().ai((char) 1561)).y("Using broad query for %s", intent);
                listQueryIntentActivities = this.s.getPackageManager().queryIntentActivities(intent, i3);
            } else {
                listQueryIntentActivities = new ArrayList<>();
                if (iAs3 != 2) {
                    yno it = kmo.a(acpf.e()).keySet().iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        try {
                            context.getPackageManager().getPackageUid(str, 0);
                            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent(intent).setPackage(str), i3);
                            if (resolveInfoResolveActivity != null) {
                                listQueryIntentActivities.add(resolveInfoResolveActivity);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                }
            }
        } else {
            qpi qpiVar2 = qpi.i;
            Context context2 = this.s;
            listQueryIntentActivities = qpiVar == qpiVar2 ? context2.getPackageManager().queryIntentActivities(intent, i3) : context2.getPackageManager().queryIntentServices(intent, i3 | 64);
        }
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            if (acoh.a.gu().d()) {
                tfk.a.d(tfj.GEARHEAD_CAR_PROJECTION_VALIDATOR_QUERY_ALLOWED_CLIENTS, 2);
            }
            int i6 = yfq.d;
            return yls.a;
        }
        if (qpiVar == qpi.i) {
            Stream streamFilter = Collection.EL.stream(listQueryIntentActivities).filter(new imb((ygr) Collection.EL.stream(b).filter(new iup(i4)).flatMap(new ixx(this, i5)).map(new ilq(7)).collect(ycm.b), 3));
            int i7 = yfq.d;
            listQueryIntentActivities = (List) streamFilter.collect(ycm.a);
        }
        final boolean z3 = (i3 & 32768) == 32768;
        final ygr ygrVar = ygrVarG;
        final Function function = new Function() { // from class: ixv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo329andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                qpi qpiVar3 = qpiVar;
                String str2 = (String) obj;
                if (qpiVar3 == qpi.i) {
                    qpiVar3 = qpi.b;
                }
                ygr ygrVar2 = ygrVar;
                boolean z4 = z3;
                boolean z5 = z;
                return Boolean.valueOf(this.a.z(str2, qpiVar3, z5, true, z4, ygrVar2));
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        final HashMap map = new HashMap();
        Stream streamFilter2 = Collection.EL.stream(listQueryIntentActivities).filter(new Predicate() { // from class: ixw
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo56negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) Map.EL.computeIfAbsent(map, iya.s((ResolveInfo) obj), function)).booleanValue();
            }
        });
        int i8 = yfq.d;
        yfq yfqVar = (yfq) streamFilter2.collect(ycm.a);
        if (acoh.a.gu().d()) {
            tfk.a.d(tfj.GEARHEAD_CAR_PROJECTION_VALIDATOR_QUERY_ALLOWED_CLIENTS, 1);
        }
        return yfqVar;
    }

    private final yfq E(Intent intent, boolean z) {
        Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
        yfl yflVar = new yfl(4);
        yflVar.k(C(intentCloneFilter, qpi.f, z));
        if (a.P()) {
            yflVar.k(C(intent.cloneFilter(), qpi.j, z));
        }
        return yflVar.g();
    }

    private final yfq F(Intent intent, qpi qpiVar, boolean z, int i2) {
        synchronized (this.e) {
            ixz ixzVar = new ixz(intent, qpiVar, i2);
            java.util.Map map = this.z;
            if (map.containsKey(ixzVar)) {
                return (yfq) map.get(ixzVar);
            }
            boolean zD = acoh.d();
            boolean z2 = (i2 & 32768) == 32768;
            yfq yfqVarD = D(intent, qpiVar, z, (zD || !z2) ? 0 : 32768);
            Stream streamFilter = Collection.EL.stream(yfqVarD).filter(new ghp(this, 6));
            int i3 = yfq.d;
            yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
            if (r() != null) {
                if (z2 && !acoh.d()) {
                    map.put(new ixz(intent, qpiVar, 32768), yfqVarD);
                }
                map.put(new ixz(intent, qpiVar, 0), yfqVar);
            }
            if (true != z2) {
                yfqVarD = yfqVar;
            }
            return yfqVarD;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ygr G() {
        /*
            r7 = this;
            boolean r0 = defpackage.acpf.l()
            if (r0 == 0) goto L88
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 37
            if (r0 >= r1) goto Le
            goto L88
        Le:
            com.google.android.gms.car.CarInfo r0 = r7.d
            if (r0 != 0) goto L22
            yph r7 = defpackage.iya.a
            yop r7 = r7.h()
            java.lang.String r0 = "CarInfo is null, not allowing video apps"
            r1 = 1567(0x61f, float:2.196E-42)
            defpackage.a.bs(r7, r0, r1)
            ygr r7 = defpackage.iya.g
            return r7
        L22:
            xkj r7 = r7.v
            boolean r1 = defpackage.acoh.g()
            if (r1 == 0) goto L3d
            if (r7 == 0) goto L2d
            goto L3d
        L2d:
            yph r7 = defpackage.iya.a
            yop r7 = r7.h()
            java.lang.String r0 = "Primary display media codec type is null, not allowing video apps"
            r1 = 1566(0x61e, float:2.194E-42)
            defpackage.a.bs(r7, r0, r1)
            ygr r7 = defpackage.iya.g
            return r7
        L3d:
            int r1 = r0.e
            r2 = 6
            r3 = 0
            r4 = 1
            if (r1 < r2) goto L46
            r1 = r4
            goto L47
        L46:
            r1 = r3
        L47:
            boolean r2 = defpackage.acoh.g()
            if (r2 == 0) goto L58
            r7.getClass()
            xkj r2 = defpackage.xkj.MEDIA_CODEC_VIDEO_H265
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L59
        L58:
            r3 = r4
        L59:
            boolean r7 = N(r0)
            yph r0 = defpackage.iya.a
            yop r0 = r0.l()
            r2 = 1565(0x61d, float:2.193E-42)
            yop r0 = r0.ai(r2)
            ype r0 = (defpackage.ype) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            java.lang.String r6 = "isPdk6OorAbove: %s, isH265: %s, devHU: %s"
            r0.R(r6, r2, r4, r5)
            if (r1 == 0) goto L80
            if (r3 != 0) goto L82
        L80:
            if (r7 == 0) goto L85
        L82:
            ygr r7 = defpackage.iya.h
            return r7
        L85:
            ygr r7 = defpackage.iya.g
            return r7
        L88:
            ygr r7 = defpackage.iya.g
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iya.G():ygr");
    }

    private final void H(zaa zaaVar, String str) {
        jfg jfgVarR = r();
        if (jfgVarR == null) {
            return;
        }
        Pair pairCreate = Pair.create(zaaVar, str);
        Set set = this.x;
        if (set.contains(pairCreate) || set.size() >= 100) {
            return;
        }
        rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.CAR_PROJECTION_VALIDATOR, yzy.rh);
        rrbVarH.v(zaaVar);
        rrbVarH.g(str);
        jfgVarR.b(rrbVarH.l());
        set.add(pairCreate);
    }

    private final boolean I() {
        return N(this.d);
    }

    private final boolean J() {
        return this.s.getSharedPreferences("carservice", 0).getBoolean("allow_unknown_sources", false);
    }

    private final boolean K() {
        return !I();
    }

    private final boolean L(String str, qpi qpiVar, boolean z, boolean z2) {
        return z(str, qpiVar, z, z2, false, qpiVar == qpi.j ? G() : null);
    }

    private final boolean M(Optional optional, Optional optional2, String str, qpi qpiVar) throws PackageManager.NameNotFoundException {
        if (qpiVar == qpi.a) {
            ((ype) a.l().ai((char) 1618)).y("Skip meta-data checks; OEM application type [%s]", str);
            return true;
        }
        if (i.contains(str) && ((skn) this.c.a()).b(str)) {
            ((ype) a.l().ai((char) 1617)).y("Skip meta-data checks; first-party skip list [%s]", str);
            return true;
        }
        XmlResourceParser xmlResourceParserB = B(optional, optional2, str);
        if (xmlResourceParserB == null) {
            return false;
        }
        try {
            int iOrdinal = qpi.f.ordinal();
            for (int next = xmlResourceParserB.next(); next != 1; next = xmlResourceParserB.next()) {
                if (next == 2) {
                    if ("uses".equals(xmlResourceParserB.getName())) {
                        qpi qpiVar2 = null;
                        String attributeValue = xmlResourceParserB.getAttributeValue(null, "name");
                        int iOrdinal2 = -1;
                        if (!TextUtils.isEmpty(attributeValue)) {
                            qpi[] qpiVarArrValues = qpi.values();
                            int length = qpiVarArrValues.length - 1;
                            while (true) {
                                if (length < 0) {
                                    break;
                                }
                                qpi qpiVar3 = qpiVarArrValues[length];
                                if (qpiVar3.name().equalsIgnoreCase(attributeValue)) {
                                    qpiVar2 = qpiVar3;
                                    break;
                                }
                                length--;
                            }
                        }
                        if (qpiVar2 != null) {
                            iOrdinal2 = qpiVar2.ordinal();
                        }
                        if (iOrdinal2 == qpiVar.ordinal()) {
                            return true;
                        }
                        if (qpiVar == qpi.e && iOrdinal2 == iOrdinal) {
                            return true;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return false;
        } catch (IOException | XmlPullParserException unused) {
            ((ype) a.l().ai((char) 1614)).y("Resource not parsable [%s]", str);
            return false;
        }
    }

    private static final boolean N(CarInfo carInfo) {
        if (carInfo != null) {
            boolean z = skm.a;
            if (!"user".equals(Build.TYPE) && Objects.equals(carInfo.a, "Google") && Objects.equals(carInfo.b, "Emulator")) {
                return true;
            }
            if (acma.f()) {
                return (Objects.equals(carInfo.i, "Google") && Objects.equals(carInfo.j, "tangorpro [AAR]")) || (Objects.equals(carInfo.i, "Panasonic") && Objects.equals(carInfo.j, "Seahawk [AAR]")) || (Objects.equals(carInfo.a, "Google") && Objects.equals(carInfo.b, "Desktop Head Unit"));
            }
        }
        return false;
    }

    public static synchronized iya q(Context context) {
        iya iyaVar;
        int i2 = 1;
        if (l == 0) {
            Context applicationContext = context.getApplicationContext();
            k = new iya(applicationContext, new kpg(applicationContext, i2));
        }
        iyaVar = k;
        iyaVar.getClass();
        l++;
        return iyaVar;
    }

    public static String s(ResolveInfo resolveInfo) {
        return (resolveInfo.serviceInfo == null || TextUtils.isEmpty(resolveInfo.serviceInfo.packageName)) ? resolveInfo.activityInfo.packageName : resolveInfo.serviceInfo.packageName;
    }

    public static synchronized void v() {
        int i2 = l;
        if (i2 > 0) {
            int i3 = i2 - 1;
            l = i3;
            if (i3 == 0) {
                k.getClass();
                k = null;
            }
        }
    }

    @Override // defpackage.ixu
    public final yfq a(qpi qpiVar) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        Iterator<ResolveInfo> it = this.s.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
            }
        }
        int i2 = yfq.d;
        yfl yflVar = new yfl(4);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ComponentName componentName = (ComponentName) arrayList.get(i3);
            try {
                if (M(Optional.empty(), Optional.empty(), componentName.getPackageName(), qpiVar)) {
                    yflVar.i(componentName);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                ((ype) ((ype) a.h()).ai((char) 1564)).y("Package not included because it wasn't found [%s]", componentName.getPackageName());
            }
        }
        return yflVar.g();
    }

    @Override // defpackage.ixu
    @ResultIgnorabilityUnspecified
    public final yfq b(Intent intent, qpi qpiVar) {
        ilb.e();
        return C(intent, qpiVar, true);
    }

    @Override // defpackage.ixu
    public final yfq c(Intent intent) {
        ilb.e();
        return E(intent, true);
    }

    @Override // defpackage.ixu
    @ResultIgnorabilityUnspecified
    public final yfq d(Intent intent) {
        return E(intent, false);
    }

    @Override // defpackage.ixu
    @ResultIgnorabilityUnspecified
    public final yfq e(Intent intent, qpi qpiVar) {
        int i2 = true != acoh.d() ? 32768 : 0;
        return K() ? F(intent, qpiVar, true, i2) : D(intent, qpiVar, true, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ixu
    public final void f(PrintWriter printWriter) {
        printWriter.println("unknownSourcesEnabled=" + J());
        printWriter.println("Dumping denied packages");
        for (Pair pair : this.x) {
            printWriter.println(String.format(Locale.US, "pgk=%s error=%s", pair.second, ((zaa) pair.first).name()));
        }
        printWriter.println("CarInfo: ".concat(String.valueOf(String.valueOf(this.d))));
        printWriter.println("Primary Display Media Codec Type: ".concat(String.valueOf(String.valueOf(this.v))));
        synchronized (this.e) {
            printWriter.println("Dumping Cached packages");
            java.util.Map map = this.z;
            for (ixz ixzVar : map.keySet()) {
                printWriter.println(ixzVar.toString());
                ynp ynpVarListIterator = ((yfq) map.get(ixzVar)).listIterator(0);
                while (ynpVarListIterator.hasNext()) {
                    printWriter.println(((ResolveInfo) ynpVarListIterator.next()).toString());
                }
            }
        }
    }

    @Override // defpackage.ixu
    public final void g(String str) {
        if (acoh.a.gu().b()) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.r;
        if (copyOnWriteArrayList.contains(str)) {
            return;
        }
        try {
            this.s.getPackageManager().setApplicationEnabledSetting(str, 1, 1);
            copyOnWriteArrayList.add(str);
        } catch (IllegalArgumentException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 1560)).y("Failed to enable Application %s", str);
        }
    }

    @Override // defpackage.ixu
    public final void h() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 1619)).u("onProjectionSessionEnd");
        w();
        this.t.set(new WeakReference(null));
        synchronized (this.e) {
            this.z.clear();
        }
        ixy ixyVar = this.y;
        Context context = this.s;
        context.getClass();
        ((ype) yphVar.l().ai((char) 1555)).u("unbinding from play service");
        spi.a().c(context, ixyVar);
        ixyVar.a = false;
        ixyVar.c = null;
    }

    @Override // defpackage.ixu
    public final void i(jfg jfgVar) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 1620)).u("onProjectionSessionStart");
        w();
        this.t.set(new WeakReference(jfgVar));
        Context context = this.s;
        context.getClass();
        ixy ixyVar = this.y;
        if (ixyVar.a || ixyVar.c != null) {
            ((ype) yphVar.l().ai((char) 1550)).u("ignoring bind play service request, already connected or connecting");
            return;
        }
        try {
            ixyVar.a = spi.a().d(context, new Intent().setComponent(iyc.a), ixyVar, 1);
        } catch (SecurityException e) {
            yphVar = a;
            ((ype) ((ype) ((ype) yphVar.g()).p(e)).ai((char) 1552)).u("Exception binding to Play Store.");
            ixyVar.b.t(yzy.rk);
        }
        ((ype) yphVar.l().ai((char) 1551)).y("binding to play service s=%b", Boolean.valueOf(ixyVar.a));
    }

    @Override // defpackage.ixu
    public final void j(CarInfo carInfo) {
        this.d = carInfo;
    }

    @Override // defpackage.ixu
    public final void k(CarUiInfo carUiInfo) {
        this.u = carUiInfo;
    }

    @Override // defpackage.ixu
    public final void l(xkj xkjVar) {
        this.v = xkjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ixu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.lang.String r9) {
        /*
            r8 = this;
            yfq r0 = defpackage.iya.b
            r1 = r0
            yls r1 = (defpackage.yls) r1
            int r1 = r1.c
            r2 = 0
            r3 = r2
        L9:
            if (r3 >= r1) goto L3c
            java.lang.Object r4 = r0.get(r3)
            ixz r4 = (defpackage.ixz) r4
            android.content.Intent r5 = r4.a
            qpi r4 = r4.b
            yfq r4 = r8.e(r5, r4)
            int r5 = r4.size()
            r6 = r2
        L1e:
            int r7 = r3 + 1
            if (r6 >= r5) goto L3a
            java.lang.Object r7 = r4.get(r6)
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            java.lang.String r7 = s(r7)
            if (r7 == 0) goto L37
            boolean r7 = j$.util.Objects.equals(r7, r9)
            if (r7 != 0) goto L35
            goto L37
        L35:
            r8 = 1
            return r8
        L37:
            int r6 = r6 + 1
            goto L1e
        L3a:
            r3 = r7
            goto L9
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iya.m(java.lang.String):boolean");
    }

    @Override // defpackage.ixu
    public final boolean n(String str, qpi qpiVar) {
        ilb.e();
        return L(str, qpiVar, true, true);
    }

    @Override // defpackage.ixu
    public final boolean o(String str, qpi qpiVar) {
        ilb.e();
        return L(str, qpiVar, true, false);
    }

    @Override // defpackage.ixu
    public final boolean p(String str, qpi qpiVar) {
        return L(str, qpiVar, false, true);
    }

    public final jfg r() {
        jfg jfgVar = (jfg) ((WeakReference) this.t.get()).get();
        if (jfgVar == null || !jfgVar.h()) {
            return null;
        }
        return jfgVar;
    }

    public final void t(yzy yzyVar) {
        jfg jfgVarR = r();
        if (jfgVarR == null) {
            return;
        }
        jfgVarR.b(rrc.h(yxy.CAR_SERVICE, yzz.CAR_PROJECTION_VALIDATOR, yzyVar).l());
    }

    public final void u(zaa zaaVar, String str) {
        if (acoh.a.gu().c()) {
            H(zaaVar, str);
        }
    }

    final void w() {
        this.x.clear();
    }

    public final boolean x(ComponentInfo componentInfo) {
        int componentEnabledSetting = this.s.getPackageManager().getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name));
        if (componentEnabledSetting != 1) {
            return componentEnabledSetting == 0 && componentInfo.enabled;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021c A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, PHI: r7
  0x021c: PHI (r7v3 java.lang.Boolean) = (r7v1 java.lang.Boolean), (r7v6 java.lang.Boolean), (r7v1 java.lang.Boolean) binds: [B:23:0x003d, B:29:0x004a, B:27:0x0047] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b0 A[Catch: IOException | XmlPullParserException -> 0x0313, IOException | XmlPullParserException -> 0x0313, TRY_LEAVE, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b9 A[LOOP:3: B:141:0x023e->B:178:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02e0 A[PHI: r7 r16 r17
  0x02e0: PHI (r7v4 java.lang.Boolean) = (r7v3 java.lang.Boolean), (r7v3 java.lang.Boolean), (r7v3 java.lang.Boolean), (r7v8 java.lang.Boolean) binds: [B:133:0x022c, B:139:0x023a, B:137:0x0236, B:131:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x02e0: PHI (r16v7 int) = (r16v6 int), (r16v6 int), (r16v6 int), (r16v9 int) binds: [B:133:0x022c, B:139:0x023a, B:137:0x0236, B:131:0x0216] A[DONT_GENERATE, DONT_INLINE]
  0x02e0: PHI (r17v5 java.lang.Boolean) = (r17v2 java.lang.Boolean), (r17v4 java.lang.Boolean), (r17v2 java.lang.Boolean), (r17v7 java.lang.Boolean) binds: [B:133:0x022c, B:139:0x023a, B:137:0x0236, B:131:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0103 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0109 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0134 A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013b A[Catch: IOException | XmlPullParserException -> 0x0313, TryCatch #1 {IOException | XmlPullParserException -> 0x0313, blocks: (B:72:0x00ef, B:73:0x00f9, B:74:0x00fc, B:84:0x0143, B:85:0x0155, B:96:0x016f, B:131:0x0216, B:131:0x0216, B:188:0x02eb, B:188:0x02eb, B:107:0x0185, B:107:0x0185, B:116:0x01b0, B:116:0x01b0, B:120:0x01c8, B:120:0x01c8, B:109:0x018a, B:109:0x018a, B:113:0x01a2, B:113:0x01a2, B:121:0x01d4, B:121:0x01d4, B:75:0x0103, B:76:0x0106, B:77:0x0109, B:79:0x0110, B:80:0x012d, B:81:0x0134, B:82:0x013b, B:125:0x01f3, B:125:0x01f3, B:126:0x01f8, B:126:0x01f8, B:128:0x01fd, B:128:0x01fd, B:132:0x021c, B:132:0x021c, B:135:0x0230, B:135:0x0230, B:141:0x023e, B:141:0x023e, B:143:0x0244, B:143:0x0244, B:144:0x0250, B:144:0x0250, B:179:0x02bc, B:179:0x02bc, B:180:0x02c1, B:180:0x02c1, B:182:0x02c4, B:182:0x02c4, B:185:0x02db, B:185:0x02db, B:171:0x029b, B:171:0x029b, B:172:0x029e, B:172:0x029e, B:173:0x02a3, B:173:0x02a3, B:174:0x02a9, B:174:0x02a9, B:175:0x02b0, B:175:0x02b0), top: B:216:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0174  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean y(j$.util.Optional r24, j$.util.Optional r25, java.lang.String r26, com.google.android.gms.car.CarInfo r27, com.google.android.gms.car.CarUiInfo r28) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iya.y(j$.util.Optional, j$.util.Optional, java.lang.String, com.google.android.gms.car.CarInfo, com.google.android.gms.car.CarUiInfo):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(java.lang.String r20, defpackage.qpi r21, boolean r22, boolean r23, boolean r24, defpackage.ygr r25) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iya.z(java.lang.String, qpi, boolean, boolean, boolean, ygr):boolean");
    }
}
