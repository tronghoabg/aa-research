package defpackage;

import android.R;
import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class fof implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fof(int i, String str, int i2) {
        this.d = i2;
        this.b = "UPDATE workspec SET stop_reason=? WHERE id=?";
        this.a = i;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [aezr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aezr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v24, types: [aezr, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        fbk fbkVarA;
        int i = this.d;
        if (i == 0) {
            fca fcaVar = (fca) obj;
            fcaVar.getClass();
            fbkVarA = fcaVar.a((String) this.b);
            Object obj2 = this.c;
            try {
                fbkVarA.f(1, this.a);
                fbkVarA.h(2, (String) obj2);
                fbkVarA.k();
                fbkVarA.close();
                return afak.a;
            } finally {
            }
        }
        if (i == 1) {
            fca fcaVar2 = (fca) obj;
            fcaVar2.getClass();
            fbkVarA = fcaVar2.a((String) this.b);
            int i2 = this.a;
            try {
                fbkVarA.h(1, (String) this.c);
                fbkVarA.f(2, i2);
                return fbkVarA.k() ? new fnt(fbkVarA.d(ckf.j(fbkVarA, "work_spec_id")), (int) fbkVarA.b(ckf.j(fbkVarA, "generation")), (int) fbkVarA.b(ckf.j(fbkVarA, "system_id"))) : null;
            } finally {
            }
        }
        if (i == 2) {
            fca fcaVar3 = (fca) obj;
            fcaVar3.getClass();
            fbkVarA = fcaVar3.a((String) this.b);
            int i3 = this.a;
            try {
                fbkVarA.h(1, (String) this.c);
                fbkVarA.f(2, i3);
                fbkVarA.k();
                fbkVarA.close();
                return afak.a;
            } finally {
            }
        }
        if (i == 3) {
            cis cisVar = (cis) obj;
            yph yphVar = nhm.a;
            cisVar.getClass();
            if (cisVar.b()) {
                Object obj3 = this.c;
                ?? r0 = this.b;
                nhm.a.l().w("Hotseat %d focused", this.a + 1);
                r0.b(obj3);
            }
            return afak.a;
        }
        if (i == 4) {
            cis cisVar2 = (cis) obj;
            yph yphVar2 = nih.a;
            cisVar2.getClass();
            if (cisVar2.b()) {
                Object obj4 = this.c;
                ?? r02 = this.b;
                nih.a.l().w("Hotseat %d focused", this.a + 1);
                r02.b(obj4);
            }
            return afak.a;
        }
        gjv gjvVar = (gjv) obj;
        gjvVar.getClass();
        qij qijVar = (qij) this.c;
        int iIntValue = ((Number) qijVar.b.a()).intValue();
        int i4 = this.a;
        gjvVar.y(dvd.e(i4, iIntValue), R.attr.state_pressed);
        gjvVar.y(dvd.e(i4, ((Number) qijVar.a.a()).intValue()), R.attr.state_hovered);
        Context context = (Context) this.b;
        if (context.getResources().getConfiguration().navigation == 2 || context.getResources().getConfiguration().navigation == 4) {
            gjvVar.y(dvd.e(i4, 0), R.attr.state_focused);
        }
        gjvVar.x(dvd.e(i4, ((Number) qijVar.c.a()).intValue()));
        return afak.a;
    }

    public /* synthetic */ fof(int i, bwq bwqVar, nii niiVar, int i2) {
        this.d = i2;
        this.a = i;
        this.b = bwqVar;
        this.c = niiVar;
    }

    public /* synthetic */ fof(int i, qij qijVar, Context context, int i2) {
        this.d = i2;
        this.a = i;
        this.c = qijVar;
        this.b = context;
    }

    public /* synthetic */ fof(String str, int i, int i2) {
        this.d = i2;
        this.b = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        this.c = str;
        this.a = i;
    }

    public /* synthetic */ fof(String str, int i, int i2, byte[] bArr) {
        this.d = i2;
        this.b = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        this.c = str;
        this.a = i;
    }
}
