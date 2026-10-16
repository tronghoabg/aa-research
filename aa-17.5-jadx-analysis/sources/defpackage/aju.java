package defpackage;

import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class aju implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aju(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [cdm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [asf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v44, types: [cdp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v45, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v47, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v50, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v51, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [asd, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) throws Throwable {
        int i = 1;
        switch (this.c) {
            case 0:
                this.a.c(this.b);
                break;
            case 1:
                cxd cxdVar = (cxd) obj;
                cxdVar.q();
                czz.aI(cxdVar, ((ckj) this.a).a, (cjs) this.b, BitmapDescriptorFactory.HUE_RED, null, 60);
                break;
            case 2:
                long j = ((anp) obj).c;
                Object obj2 = this.b;
                amq amqVar = (amq) obj2;
                long jC = cja.c(j, true == amqVar.l() ? -1.0f : 1.0f);
                ((amu) this.a).a(amqVar.a.c(Float.intBitsToFloat((int) (((aoe) obj2).d == api.a ? jC & 4294967295L : jC >> 32))), BitmapDescriptorFactory.HUE_RED);
                break;
            case 3:
                ((byw) ((kwp) this.b).a).m(this.a);
                break;
            case 4:
                anp anpVar = (anp) obj;
                ((izj) this.b).o(cja.c(((aqk) this.a).e(anpVar.c), true == anpVar.d ? -1.0f : 1.0f), 1);
                break;
            case 5:
                ((Long) obj).longValue();
                arf arfVar = (arf) this.b;
                float f = arfVar.e;
                arfVar.e = BitmapDescriptorFactory.HUE_RED;
                this.a.invoke(Float.valueOf(f));
                break;
            case 6:
                float fFloatValue = ((Float) obj).floatValue();
                affs affsVar = (affs) this.a;
                float f2 = affsVar.a - fFloatValue;
                affsVar.a = f2;
                this.b.invoke(Float.valueOf(f2));
                break;
            case 7:
                float fFloatValue2 = ((Float) obj).floatValue();
                affs affsVar2 = (affs) this.a;
                float f3 = affsVar2.a - fFloatValue2;
                affsVar2.a = f3;
                this.b.invoke(Float.valueOf(f3));
                break;
            case 8:
                cun cunVar = (cun) obj;
                avh avhVar = (avh) this.b;
                boolean z = avhVar.c;
                Object obj3 = this.a;
                if (z) {
                    cunVar.x((cuo) obj3, dlf.l(cunVar, avhVar.a), dlf.l(cunVar, avhVar.b));
                } else {
                    cunVar.r((cuo) obj3, dlf.l(cunVar, avhVar.a), dlf.l(cunVar, avhVar.b), BitmapDescriptorFactory.HUE_RED);
                }
                break;
            case 9:
                cun cunVar2 = (cun) obj;
                avj avjVar = (avj) this.b;
                long j2 = ((dlo) avjVar.a.invoke(cunVar2)).a;
                boolean z2 = avjVar.b;
                Object obj4 = this.a;
                int i2 = (int) (j2 >> 32);
                int i3 = (int) (j2 & 4294967295L);
                if (z2) {
                    cunVar2.y((cuo) obj4, i2, i3, cup.a);
                } else {
                    cun.A(cunVar2, (cuo) obj4, i2, i3, null, 12);
                }
                break;
            case 10:
                cun cunVar3 = (cun) obj;
                avm avmVar = (avm) this.b;
                boolean z3 = avmVar.e;
                Object obj5 = this.a;
                if (z3) {
                    cunVar3.x((cuo) obj5, dlf.l(cunVar3, avmVar.a), dlf.l(cunVar3, avmVar.b));
                } else {
                    cunVar3.r((cuo) obj5, dlf.l(cunVar3, avmVar.a), dlf.l(cunVar3, avmVar.b), BitmapDescriptorFactory.HUE_RED);
                }
                break;
            case 11:
                Object obj6 = this.b;
                Object obj7 = this.a;
                ((awp) obj7).b((View) obj6);
                break;
            case 12:
                ayf ayfVar = (ayf) this.b;
                dek dekVar = ayfVar.b;
                if (dekVar != null) {
                    dekVar.b();
                }
                Object obj8 = this.a;
                ayfVar.b = null;
                ayg aygVar = (ayg) obj8;
                aitm aitmVar = aygVar.b;
                if (aitmVar != null) {
                    aitmVar.O(afak.a);
                }
                aygVar.b = null;
                break;
            case 13:
                ((cmi) this.a).h(((Number) ((adu) obj).d()).floatValue());
                ((aza) this.b).b.invoke();
                break;
            case 14:
                ((cmi) this.a).h(((Number) ((adu) obj).d()).floatValue());
                ((aza) this.b).b.invoke();
                break;
            case 15:
                Object obj9 = this.b;
                aap aapVar = ((bab) obj9).a;
                Object obj10 = this.a;
                aapVar.e(obj10);
                break;
            case 16:
                break;
            case 17:
                this.a.invoke(Integer.valueOf(((epk) this.b).i().b));
                break;
            case 18:
                ((cun) obj).w(new bbn(this.a, i));
                this.b.a();
                break;
            case 19:
                djv djvVar = (djv) obj;
                if (!affa.f(this.b, djvVar)) {
                    this.a.invoke(djvVar);
                }
                break;
            default:
                dft dftVar = (dft) obj;
                Object obj11 = this.b;
                if (obj11 != null) {
                    ((bfh) obj11).a.b(dftVar);
                }
                ?? r11 = this.a;
                if (r11 != 0) {
                    r11.invoke(dftVar);
                }
                break;
        }
        return afak.a;
    }

    public /* synthetic */ aju(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
