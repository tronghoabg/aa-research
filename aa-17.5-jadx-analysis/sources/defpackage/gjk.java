package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gjk {
    public static final gjk a;
    public static final gjk b;
    public static final gjk c;
    public static final gjk d;
    public static final gjk e;
    public static final gjk f;
    public static final gjk g;
    public static final gjk h;
    public static final gjk i;
    public static final gjk j;
    private static final /* synthetic */ gjk[] l;
    public final float k;
    private final int m;

    static {
        gjk gjkVar = new gjk("P0", 0, 4.0f, R.dimen.padding_p0);
        a = gjkVar;
        gjk gjkVar2 = new gjk("P1", 1, 8.0f, R.dimen.padding_p1);
        b = gjkVar2;
        gjk gjkVar3 = new gjk("P2", 2, 12.0f, R.dimen.padding_p2);
        c = gjkVar3;
        gjk gjkVar4 = new gjk("P3", 3, 16.0f, R.dimen.padding_p3);
        d = gjkVar4;
        gjk gjkVar5 = new gjk("P4", 4, 24.0f, R.dimen.padding_p4);
        e = gjkVar5;
        gjk gjkVar6 = new gjk("P5", 5, 32.0f, R.dimen.padding_p5);
        f = gjkVar6;
        gjk gjkVar7 = new gjk("P6", 6, 48.0f, R.dimen.padding_p6);
        g = gjkVar7;
        gjk gjkVar8 = new gjk("P7", 7, 64.0f, R.dimen.padding_p7);
        h = gjkVar8;
        gjk gjkVar9 = new gjk("P8", 8, 72.0f, R.dimen.padding_p8);
        i = gjkVar9;
        gjk gjkVar10 = new gjk("P9", 9, 96.0f, R.dimen.padding_p9);
        j = gjkVar10;
        gjk[] gjkVarArr = {gjkVar, gjkVar2, gjkVar3, gjkVar4, gjkVar5, gjkVar6, gjkVar7, gjkVar8, gjkVar9, gjkVar10};
        l = gjkVarArr;
        affa.p(gjkVarArr);
    }

    private gjk(String str, int i2, float f2, int i3) {
        this.k = f2;
        this.m = i3;
    }

    public static gjk valueOf(String str) {
        return (gjk) Enum.valueOf(gjk.class, str);
    }

    public static gjk[] values() {
        return (gjk[]) l.clone();
    }

    public final int a(Context context) {
        context.getClass();
        return (int) context.getResources().getDimension(this.m);
    }
}
