package androidx.work.impl;

import defpackage.aezr;
import defpackage.afbe;
import defpackage.affw;
import defpackage.afhe;
import defpackage.eup;
import defpackage.eys;
import defpackage.ezg;
import defpackage.fld;
import defpackage.fle;
import defpackage.flf;
import defpackage.flg;
import defpackage.flh;
import defpackage.fli;
import defpackage.flj;
import defpackage.flk;
import defpackage.fll;
import defpackage.flm;
import defpackage.fln;
import defpackage.fnk;
import defpackage.fno;
import defpackage.fnr;
import defpackage.fnu;
import defpackage.fnz;
import defpackage.fob;
import defpackage.foe;
import defpackage.fon;
import defpackage.woy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006-"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "_workSpecDao", "Lkotlin/Lazy;", "Landroidx/work/impl/model/WorkSpecDao;", "_dependencyDao", "Landroidx/work/impl/model/DependencyDao;", "_workTagDao", "Landroidx/work/impl/model/WorkTagDao;", "_systemIdInfoDao", "Landroidx/work/impl/model/SystemIdInfoDao;", "_workNameDao", "Landroidx/work/impl/model/WorkNameDao;", "_workProgressDao", "Landroidx/work/impl/model/WorkProgressDao;", "_preferenceDao", "Landroidx/work/impl/model/PreferenceDao;", "_rawWorkInfoDao", "Landroidx/work/impl/model/RawWorkInfoDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "workSpecDao", "dependencyDao", "workTagDao", "systemIdInfoDao", "workNameDao", "workProgressDao", "preferenceDao", "rawWorkInfoDao", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private final aezr k = woy.dG(new flm(this, 0));
    private final aezr l = woy.dG(new flm(this, 2));
    private final aezr m = woy.dG(new flm(this, 3));
    private final aezr n = woy.dG(new flm(this, 4));
    private final aezr o = woy.dG(new flm(this, 5));
    private final aezr p = woy.dG(new flm(this, 6));
    private final aezr q = woy.dG(new flm(this, 7));

    public WorkDatabase_Impl() {
        woy.dG(new eup(9));
    }

    @Override // defpackage.ezc
    public final eys a() {
        return new eys(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.ezc
    public final /* synthetic */ ezg c() {
        return new fln(this);
    }

    @Override // defpackage.ezc
    public final List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fld());
        arrayList.add(new fle());
        arrayList.add(new flf());
        arrayList.add(new flg());
        arrayList.add(new flh());
        arrayList.add(new fli());
        arrayList.add(new flj());
        arrayList.add(new flk());
        arrayList.add(new fll());
        return arrayList;
    }

    @Override // defpackage.ezc
    public final Map g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        afhe afheVarB = affw.b(foe.class);
        afbe afbeVar = afbe.a;
        linkedHashMap.put(afheVarB, afbeVar);
        linkedHashMap.put(affw.b(fnk.class), afbeVar);
        linkedHashMap.put(affw.b(fon.class), afbeVar);
        linkedHashMap.put(affw.b(fnu.class), afbeVar);
        linkedHashMap.put(affw.b(fnz.class), afbeVar);
        linkedHashMap.put(affw.b(fob.class), afbeVar);
        linkedHashMap.put(affw.b(fno.class), afbeVar);
        linkedHashMap.put(affw.b(fnr.class), afbeVar);
        return linkedHashMap;
    }

    @Override // defpackage.ezc
    public final Set h() {
        return new LinkedHashSet();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final fnk s() {
        return (fnk) this.l.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final fno t() {
        return (fno) this.q.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final fnu u() {
        return (fnu) this.n.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final fnz v() {
        return (fnz) this.o.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final fob w() {
        return (fob) this.p.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final foe x() {
        return (foe) this.k.a();
    }

    @Override // androidx.work.impl.WorkDatabase
    public final fon y() {
        return (fon) this.m.a();
    }
}
