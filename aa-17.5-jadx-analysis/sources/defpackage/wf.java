package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class wf {
    public static final wf a;
    public static final wf b;
    public static final wf c;
    public static final wf d;
    public static final wf e;
    public static final wf f;
    public static final wf g;
    private static final wf s;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final wi o;
    public final Set p;
    public final Set q;
    public final Set r;

    static {
        we weVar = new we();
        weVar.d = 1;
        weVar.c();
        weVar.i = false;
        wf wfVar = new wf(weVar);
        a = wfVar;
        we weVar2 = new we();
        weVar2.d = 2;
        weVar2.c();
        weVar2.i = true;
        new wf(weVar2);
        we weVar3 = new we();
        weVar3.k = wi.a;
        weVar3.d = 2;
        wf wfVar2 = new wf(weVar3);
        s = wfVar2;
        we weVar4 = new we(wfVar2);
        weVar4.k = wi.c;
        weVar4.f = 2;
        weVar4.i = true;
        new wf(weVar4);
        we weVar5 = new we(wfVar2);
        weVar5.k = wi.c;
        weVar5.f = 2;
        weVar5.b();
        weVar5.i = true;
        b = new wf(weVar5);
        we weVar6 = new we(wfVar2);
        weVar6.f = 1;
        weVar6.k = wi.d;
        weVar6.i = true;
        weVar6.d();
        new wf(weVar6);
        we weVar7 = new we(wfVar2);
        weVar7.d = 4;
        weVar7.f = 4;
        weVar7.b();
        weVar7.k = wi.e;
        weVar7.i = true;
        weVar7.d();
        c = new wf(weVar7);
        we weVar8 = new we(wfVar2);
        weVar8.d = 4;
        weVar8.b();
        weVar8.i = true;
        weVar8.d();
        d = new wf(weVar8);
        we weVar9 = new we();
        weVar9.d = 2;
        weVar9.f = 2;
        weVar9.b();
        weVar9.a(1);
        weVar9.a(Action.TYPE_MEDIA_PLAYBACK);
        weVar9.i = true;
        e = new wf(weVar9);
        we weVar10 = new we();
        weVar10.d = 1;
        weVar10.f = 1;
        weVar10.a(1);
        weVar10.c();
        weVar10.i = true;
        f = new wf(weVar10);
        we weVar11 = new we();
        weVar11.d = 2;
        weVar11.a(1);
        weVar11.a(Action.TYPE_COMPOSE_MESSAGE);
        weVar11.a(Action.TYPE_MEDIA_PLAYBACK);
        weVar11.c();
        weVar11.h = true;
        weVar11.i = true;
        g = new wf(weVar11);
        we weVar12 = new we(wfVar);
        weVar12.a.add(Integer.valueOf(Action.TYPE_APP_ICON));
        new wf(weVar12);
        we weVar13 = new we(wfVar);
        weVar13.a(Action.TYPE_APP_ICON);
        weVar13.a(Action.TYPE_BACK);
        weVar13.a(1);
        new wf(weVar13);
        we weVar14 = new we();
        weVar14.a(1);
        weVar14.c();
        weVar14.d = 5;
        weVar14.f = 0;
        weVar14.b();
        weVar14.i = true;
        new wf(weVar14);
        we weVar15 = new we(wfVar);
        weVar15.a(Action.TYPE_APP_ICON);
        weVar15.a(Action.TYPE_BACK);
        new wf(weVar15);
        we weVar16 = new we();
        weVar16.d = 1;
        weVar16.i = true;
        weVar16.c();
        weVar16.a(1);
        weVar16.f = 0;
        new wf(weVar16);
        we weVar17 = new we();
        weVar17.d = 2;
        weVar17.f = 2;
        weVar17.i = true;
        weVar17.a(1);
        new wf(weVar17);
        we weVar18 = new we();
        weVar18.d = 3;
        weVar18.f = 2;
        weVar18.i = true;
        weVar18.a(1);
        new wf(weVar18);
    }

    public wf(we weVar) {
        int i = weVar.d;
        this.h = i;
        this.i = weVar.e;
        this.j = weVar.f;
        this.o = weVar.k;
        this.k = weVar.g;
        this.l = weVar.h;
        this.m = weVar.i;
        this.n = weVar.j;
        HashSet hashSet = new HashSet(weVar.a);
        this.p = hashSet;
        HashSet hashSet2 = new HashSet(weVar.c);
        this.r = hashSet2;
        HashSet hashSet3 = new HashSet(weVar.b);
        hashSet3.retainAll(hashSet);
        if (!hashSet3.isEmpty()) {
            throw new IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!weVar.b.isEmpty() && !hashSet2.isEmpty()) {
            throw new IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.q = new HashSet(weVar.b);
        if (hashSet.size() > i) {
            throw new IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    public final void a(List list) {
        Set set = this.p;
        Set hashSet = set.isEmpty() ? Collections.EMPTY_SET : new HashSet(set);
        int i = this.j;
        int i2 = this.i;
        int i3 = this.h;
        Iterator it = list.iterator();
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        while (it.hasNext()) {
            Action action = (Action) it.next();
            Set set2 = this.q;
            if (!set2.isEmpty() && set2.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is disallowed"));
            }
            Set set3 = this.r;
            if (!set3.isEmpty() && !set3.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is not allowed"));
            }
            hashSet.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i4--;
                if (i4 < 0) {
                    throw new IllegalArgumentException(a.bn(i, "Action list exceeded max number of ", " actions with custom titles"));
                }
                this.o.a(title);
            }
            i6--;
            if (i6 < 0) {
                throw new IllegalArgumentException(a.bn(i3, "Action list exceeded max number of ", " actions"));
            }
            if ((action.getFlags() & 1) != 0 && i5 - 1 < 0) {
                throw new IllegalArgumentException(a.bn(i2, "Action list exceeded max number of ", " primary actions"));
            }
            if (this.k && action.getIcon() == null && !action.isStandard()) {
                throw new IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            if (this.l) {
                if ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard()) {
                    throw new IllegalArgumentException("Non-standard actions without a background color are disallowed");
                }
            } else if (!CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.n && (action.getFlags() & 1) == 0) {
                throw new IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.m && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
            sb.append(",");
        }
        sb.toString();
        throw new IllegalArgumentException("Missing required action types: ".concat(sb.toString()));
    }
}
