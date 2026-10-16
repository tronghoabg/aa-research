package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.support.v4.app.Fragment;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;

/* loaded from: classes.dex */
public final /* synthetic */ class lxu implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lxu(CarIcon carIcon, us usVar, Boolean bool, int i) {
        this.d = i;
        this.c = carIcon;
        this.a = usVar;
        this.b = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [eqa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object, ocq] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, lkc] */
    /* JADX WARN: Type inference failed for: r11v46, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v48, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v52, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v54, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v56, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v59, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, us] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, lpt] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, uh] */
    /* JADX WARN: Type inference failed for: r5v3, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [afeg, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws qrz, PendingIntent.CanceledException, qsa {
        thk thkVar = null;
        int i = 1;
        switch (this.d) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((lxv) obj).e.invoke(obj2);
                } else {
                    Object obj3 = this.c;
                    lxr.e();
                    lxv lxvVar = (lxv) obj;
                    lxr.g(yzz.MESSAGING_APP, yzy.ar, lxvVar.b);
                    afec afecVar = lxvVar.d;
                    obj3.getClass();
                    afecVar.invoke(obj3);
                }
                return afak.a;
            case 1:
                Object obj4 = (AaPlaybackState) ((lod) this.b).e.e();
                Object obj5 = this.a;
                if (obj4 == null) {
                    obj4 = obj5;
                }
                this.c.e(omu.a((AaPlaybackState) obj4) + 10000);
                return afak.a;
            case 2:
                aabf aabfVar = (aabf) ((affv) this.a).a;
                if (aabfVar != null) {
                    Object obj6 = ((affv) this.b).a;
                    if (obj6 == null) {
                        affa.d("contactsTabModel");
                    } else {
                        thkVar = (thk) obj6;
                    }
                    aabfVar.n(thkVar.e);
                }
                ((affq) this.c).a = true;
                return afak.a;
            case 3:
                ((naq) this.b).c(this.a, this.c);
                return afak.a;
            case 4:
                aezr aezrVar = ndj.a;
                mwc.b(yzy.HA, (String) this.b);
                ((ndp) this.a).a();
                ((PendingIntent) this.c).send();
                return afak.a;
            case 5:
                aezr aezrVar2 = ndj.a;
                mwc.b(yzy.HB, (String) this.b);
                ((ndp) this.a).a();
                ((PendingIntent) this.c).send();
                return afak.a;
            case 6:
                nma nmaVar = (nma) this.c;
                afia<?> afiaVar = nhr.a[0];
                Object obj7 = this.a;
                nhr nhrVar = (nhr) obj7;
                noh nohVar = (noh) nhrVar.d.getValue(obj7, afiaVar);
                byw bywVar = (byw) ((nok) this.b).a;
                if (bywVar.b == 0) {
                    throw new IllegalStateException("TooltipRequester is not attached");
                }
                oco ocoVarA = oct.b().a(nohVar, ((odc) bywVar.b()).e);
                ocoVarA.f = new niv((Fragment) obj7, i);
                nhrVar.c = nmaVar.b(ocoVarA);
                return afak.a;
            case 7:
                nio nioVar = nio.a;
                nip nipVar = nip.a;
                int iOrdinal = ((nio) this.a).ordinal();
                ?? r1 = this.c;
                Object obj8 = this.b;
                if (iOrdinal == 0) {
                    ((njw) obj8).m(((Number) r1.a()).intValue());
                } else {
                    if (iOrdinal != 1) {
                        throw new aezs();
                    }
                    ((njw) obj8).n(((Number) r1.a()).intValue());
                }
                return afak.a;
            case 8:
                nio nioVar2 = nio.a;
                nip nipVar2 = nip.a;
                int iOrdinal2 = ((nip) this.a).ordinal();
                ?? r12 = this.c;
                Object obj9 = this.b;
                if (iOrdinal2 == 0) {
                    ((njw) obj9).m(((Number) r12.a()).intValue());
                } else {
                    if (iOrdinal2 != 1) {
                        throw new aezs();
                    }
                    ((njw) obj9).n(((Number) r12.a()).intValue());
                }
                return afak.a;
            case 9:
                boolean zK = nsr.c().b().K();
                Object obj10 = this.c;
                if (zK && lem.a().i(mpl.b((ComponentName) obj10))) {
                    mud.h.a().o(true);
                }
                Object obj11 = this.a;
                nxo.b().d();
                njp.t();
                njp.p(njp.q((njk) obj11, false), (ComponentName) obj10);
                return afak.a;
            case 10:
                mud.h.a().w();
                nxo.b().d();
                njp.t();
                njp.p(njp.q((njk) this.a, false), (ComponentName) this.c);
                return afak.a;
            case 11:
                ahnc.d(this.b, null, 0, new nkn((afeg) this.a, (Integer) this.c, (afck) null, 0), 3);
                return afak.a;
            case 12:
                ahnc.d(this.b, null, 0, new nkn((afeg) this.a, (Integer) this.c, (afck) null, 2, (byte[]) null), 3);
                return afak.a;
            case 13:
                ?? r0 = this.b;
                yph yphVar = nkx.a;
                ahnc.d(r0, null, 0, new nkn((afeg) this.a, (Integer) this.c, (afck) null, 3, (char[]) null), 3);
                return afak.a;
            case 14:
                ?? r02 = this.b;
                yph yphVar2 = nkx.a;
                ahnc.d(r02, null, 0, new nkn((afeg) this.a, (Integer) this.c, (afck) null, 4, (short[]) null), 3);
                return afak.a;
            case 15:
                ((nwt) this.c).a();
                this.b.invoke();
                this.a.run();
                return afak.a;
            case 16:
                if (roc.ag(this.a).size() >= lec.a.a().a()) {
                    this.c.b(Boolean.valueOf(true));
                } else {
                    this.b.invoke();
                }
                return afak.a;
            case 17:
                return new tik((CarIcon) this.c, this.a, (Boolean) this.b);
            case 18:
                return new tiq(this.b, std.q(this.a), this.c);
            default:
                ajmn ajmnVar = ((ajhj) this.a).c;
                ajmnVar.getClass();
                return ajmnVar.a(((ajhu) this.b).a(), ((ajhc) this.c).h.b);
        }
    }

    public /* synthetic */ lxu(CharSequence charSequence, uh uhVar, bym bymVar, int i) {
        this.d = i;
        this.b = charSequence;
        this.c = uhVar;
        this.a = bymVar;
    }

    public /* synthetic */ lxu(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ lxu(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ lxu(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ lxu(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
