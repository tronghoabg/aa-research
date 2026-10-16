package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zui extends zuh {
    public static final /* synthetic */ int e = 0;

    public zui(aaia aaiaVar, Context context) {
        this.c = context;
        this.b = aaiaVar;
        this.d = b();
    }

    @Override // defpackage.zuh
    public final boolean c() {
        aahz aahzVar = this.b.c;
        if (aahzVar == null) {
            aahzVar = aahz.a;
        }
        int iAx = a.ax(aahzVar.b);
        if (iAx == 0) {
            iAx = 1;
        }
        return iAx == 6 || iAx == 5;
    }

    @Override // defpackage.zuh
    public final boolean d() {
        aahz aahzVar = this.b.c;
        if (aahzVar == null) {
            aahzVar = aahz.a;
        }
        int iAx = a.ax(aahzVar.b);
        if (iAx == 0) {
            iAx = 1;
        }
        int i = iAx - 2;
        return i == 2 || i == 4;
    }

    @Override // defpackage.zuh
    public final boolean f() {
        aaia aaiaVarA = a(this.c, zuh.a);
        if (aaiaVarA == null) {
            return false;
        }
        aahz aahzVar = aaiaVarA.c;
        if (aahzVar == null) {
            aahzVar = aahz.a;
        }
        int i = aahzVar.b;
        aahz aahzVar2 = this.b.c;
        if (aahzVar2 == null) {
            aahzVar2 = aahz.a;
        }
        if (i == aahzVar2.b) {
            return false;
        }
        this.b = aaiaVarA;
        return true;
    }
}
