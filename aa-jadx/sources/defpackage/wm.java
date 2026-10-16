package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wm {
    public static final defpackage.wm a;
    public static final defpackage.wm b;
    public static final defpackage.wm c;
    public static final defpackage.wm d;
    public static final defpackage.wm e;
    public static final defpackage.wm f;
    public static final defpackage.wm g;
    private static final defpackage.wm s;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final defpackage.wp o;
    public final java.util.Set p;
    public final java.util.Set q;
    public final java.util.Set r;

    static {
        defpackage.wl wlVar = new defpackage.wl();
        wlVar.d = 1;
        wlVar.c();
        wlVar.i = false;
        defpackage.wm wmVar = new defpackage.wm(wlVar);
        a = wmVar;
        defpackage.wl wlVar2 = new defpackage.wl();
        wlVar2.d = 2;
        wlVar2.c();
        wlVar2.i = true;
        new defpackage.wm(wlVar2);
        defpackage.wl wlVar3 = new defpackage.wl();
        wlVar3.k = defpackage.wp.a;
        wlVar3.d = 2;
        defpackage.wm wmVar2 = new defpackage.wm(wlVar3);
        s = wmVar2;
        defpackage.wl wlVar4 = new defpackage.wl(wmVar2);
        wlVar4.k = defpackage.wp.c;
        wlVar4.f = 2;
        wlVar4.i = true;
        new defpackage.wm(wlVar4);
        defpackage.wl wlVar5 = new defpackage.wl(wmVar2);
        wlVar5.k = defpackage.wp.c;
        wlVar5.f = 2;
        wlVar5.b();
        wlVar5.i = true;
        b = new defpackage.wm(wlVar5);
        defpackage.wl wlVar6 = new defpackage.wl(wmVar2);
        wlVar6.f = 1;
        wlVar6.k = defpackage.wp.d;
        wlVar6.i = true;
        wlVar6.d();
        new defpackage.wm(wlVar6);
        defpackage.wl wlVar7 = new defpackage.wl(wmVar2);
        wlVar7.d = 4;
        wlVar7.f = 4;
        wlVar7.b();
        wlVar7.k = defpackage.wp.e;
        wlVar7.i = true;
        wlVar7.d();
        c = new defpackage.wm(wlVar7);
        defpackage.wl wlVar8 = new defpackage.wl(wmVar2);
        wlVar8.d = 4;
        wlVar8.b();
        wlVar8.i = true;
        wlVar8.d();
        d = new defpackage.wm(wlVar8);
        defpackage.wl wlVar9 = new defpackage.wl();
        wlVar9.d = 2;
        wlVar9.f = 2;
        wlVar9.b();
        wlVar9.a(1);
        wlVar9.a(androidx.car.app.model.Action.TYPE_MEDIA_PLAYBACK);
        wlVar9.i = true;
        e = new defpackage.wm(wlVar9);
        defpackage.wl wlVar10 = new defpackage.wl();
        wlVar10.d = 1;
        wlVar10.f = 1;
        wlVar10.a(1);
        wlVar10.c();
        wlVar10.i = true;
        f = new defpackage.wm(wlVar10);
        defpackage.wl wlVar11 = new defpackage.wl();
        wlVar11.d = 2;
        wlVar11.a(1);
        wlVar11.a(androidx.car.app.model.Action.TYPE_COMPOSE_MESSAGE);
        wlVar11.a(androidx.car.app.model.Action.TYPE_MEDIA_PLAYBACK);
        wlVar11.c();
        wlVar11.h = true;
        wlVar11.i = true;
        g = new defpackage.wm(wlVar11);
        defpackage.wl wlVar12 = new defpackage.wl(wmVar);
        wlVar12.a.add(java.lang.Integer.valueOf(androidx.car.app.model.Action.TYPE_APP_ICON));
        new defpackage.wm(wlVar12);
        defpackage.wl wlVar13 = new defpackage.wl(wmVar);
        wlVar13.a(androidx.car.app.model.Action.TYPE_APP_ICON);
        wlVar13.a(androidx.car.app.model.Action.TYPE_BACK);
        wlVar13.a(1);
        new defpackage.wm(wlVar13);
        defpackage.wl wlVar14 = new defpackage.wl();
        wlVar14.a(1);
        wlVar14.c();
        wlVar14.d = 5;
        wlVar14.f = 0;
        wlVar14.b();
        wlVar14.i = true;
        new defpackage.wm(wlVar14);
        defpackage.wl wlVar15 = new defpackage.wl(wmVar);
        wlVar15.a(androidx.car.app.model.Action.TYPE_APP_ICON);
        wlVar15.a(androidx.car.app.model.Action.TYPE_BACK);
        new defpackage.wm(wlVar15);
        defpackage.wl wlVar16 = new defpackage.wl();
        wlVar16.d = 1;
        wlVar16.i = true;
        wlVar16.c();
        wlVar16.a(1);
        wlVar16.f = 0;
        new defpackage.wm(wlVar16);
        defpackage.wl wlVar17 = new defpackage.wl();
        wlVar17.d = 2;
        wlVar17.f = 2;
        wlVar17.i = true;
        wlVar17.a(1);
        new defpackage.wm(wlVar17);
        defpackage.wl wlVar18 = new defpackage.wl();
        wlVar18.d = 3;
        wlVar18.f = 2;
        wlVar18.i = true;
        wlVar18.a(1);
        new defpackage.wm(wlVar18);
    }

    public wm(defpackage.wl wlVar) {
        int i = wlVar.d;
        this.h = i;
        this.i = wlVar.e;
        this.j = wlVar.f;
        this.o = wlVar.k;
        this.k = wlVar.g;
        this.l = wlVar.h;
        this.m = wlVar.i;
        this.n = wlVar.j;
        java.util.HashSet hashSet = new java.util.HashSet(wlVar.a);
        this.p = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet(wlVar.c);
        this.r = hashSet2;
        java.util.HashSet hashSet3 = new java.util.HashSet(wlVar.b);
        hashSet3.retainAll(hashSet);
        if (!hashSet3.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!wlVar.b.isEmpty() && !hashSet2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.q = new java.util.HashSet(wlVar.b);
        if (hashSet.size() > i) {
            throw new java.lang.IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    public final void a(java.util.List list) {
        java.util.Set set = this.p;
        java.util.Set hashSet = set.isEmpty() ? java.util.Collections.EMPTY_SET : new java.util.HashSet(set);
        int i = this.j;
        int i2 = this.i;
        int i3 = this.h;
        java.util.Iterator it = list.iterator();
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        while (it.hasNext()) {
            androidx.car.app.model.Action action = (androidx.car.app.model.Action) it.next();
            java.util.Set set2 = this.q;
            if (!set2.isEmpty() && set2.contains(java.lang.Integer.valueOf(action.getType()))) {
                throw new java.lang.IllegalArgumentException(androidx.car.app.model.Action.typeToString(action.getType()).concat(" is disallowed"));
            }
            java.util.Set set3 = this.r;
            if (!set3.isEmpty() && !set3.contains(java.lang.Integer.valueOf(action.getType()))) {
                throw new java.lang.IllegalArgumentException(androidx.car.app.model.Action.typeToString(action.getType()).concat(" is not allowed"));
            }
            hashSet.remove(java.lang.Integer.valueOf(action.getType()));
            androidx.car.app.model.CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i4--;
                if (i4 < 0) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Action list exceeded max number of ", " actions with custom titles"));
                }
                this.o.a(title);
            }
            i6--;
            if (i6 < 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bm(i3, "Action list exceeded max number of ", " actions"));
            }
            if ((action.getFlags() & 1) != 0 && (i5 = i5 - 1) < 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bm(i2, "Action list exceeded max number of ", " primary actions"));
            }
            if (this.k && action.getIcon() == null && !action.isStandard()) {
                throw new java.lang.IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            if (this.l) {
                if ((action.getBackgroundColor() == null || androidx.car.app.model.CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard()) {
                    throw new java.lang.IllegalArgumentException("Non-standard actions without a background color are disallowed");
                }
            } else if (!androidx.car.app.model.CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.n && (action.getFlags() & 1) == 0) {
                throw new java.lang.IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.m && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new java.lang.IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            sb.append(androidx.car.app.model.Action.typeToString(((java.lang.Integer) it2.next()).intValue()));
            sb.append(",");
        }
        sb.toString();
        throw new java.lang.IllegalArgumentException("Missing required action types: ".concat(sb.toString()));
    }
}
