package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarText;
import androidx.core.graphics.drawable.IconCompat;
import com.android.car.libraries.apphost.external.model.MenuSection;
import com.android.car.libraries.apphost.external.model.MenuTemplate;
import com.google.android.libraries.handwriting.gui.UIHandler;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class lld implements tho {
    public static final /* synthetic */ int a = 0;
    private static final aisp b = new aisp("[\\p{Punct}\\s]+$");

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.CharSequence, java.lang.Object] */
    public static final wb c(List list, List list2, Integer num, Integer num2, llc llcVar) {
        List list3;
        uf ufVarA;
        CarIcon carIconA;
        List list4;
        aezu aezuVar;
        Action actionA;
        Action actionA2;
        boolean z;
        int iIntValue = num2 != null ? num2.intValue() : -1;
        gkh gkhVar = new gkh();
        int i = 1;
        boolean z2 = list != null;
        int i2 = 10;
        if (list == null) {
            list3 = afbe.a;
        } else {
            ArrayList arrayList = new ArrayList(woy.bp(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kex kexVar = (kex) it.next();
                ?? r14 = kexVar.c;
                ArrayList arrayList2 = new ArrayList(woy.bp(r14, i2));
                for (lkz lkzVar : r14) {
                    int iOrdinal = ((lla) kexVar.b).ordinal();
                    if (iOrdinal == 0) {
                        vf vfVar = new vf();
                        String str = lkzVar.b;
                        if (str == null) {
                            vfVar.i(d(lkzVar, lkzVar.a, iIntValue, llcVar));
                        } else {
                            vfVar.i(lkzVar.a);
                            vfVar.d(e(d(lkzVar, str, iIntValue, llcVar)));
                        }
                        IconCompat iconCompat = lkzVar.c;
                        if (iconCompat != null) {
                            tj tjVar = new tj(iconCompat);
                            if (leh.a.a().b() && lkzVar.d) {
                                krr krrVar = krr.s;
                                kru kruVar = ksa.a;
                                tjVar.a(CarColor.createCustom(krrVar.c(kruVar.a().c()), krrVar.e(kruVar.a().c())));
                            }
                            vfVar.e(new CarIcon(tjVar), 2);
                        }
                        if (lkzVar.e) {
                            vfVar.k = true;
                        } else {
                            if (lkzVar.f) {
                                sw swVar = new sw();
                                swVar.c(thq.d(llcVar.c, R.drawable.gs_equalizer_vd_theme_24, new oin(16)));
                                swVar.b(CarColor.createCustom(0, 0));
                                vfVar.b(swVar.a());
                            }
                            vfVar.g(new khe(lkzVar.h, 6));
                            ufVarA = vfVar.a();
                        }
                        vfVar.g(new khe(lkzVar.h, 6));
                        ufVarA = vfVar.a();
                    } else {
                        if (iOrdinal != i) {
                            throw new aezs();
                        }
                        tw twVar = new tw();
                        IconCompat iconCompat2 = lkzVar.c;
                        if (iconCompat2 == null) {
                            carIconA = CarIcon.ERROR;
                        } else if (leh.a.a().b()) {
                            tj tjVar2 = new tj(iconCompat2);
                            if (lkzVar.d) {
                                krr krrVar2 = krr.s;
                                kru kruVar2 = ksa.a;
                                tjVar2.a(CarColor.createCustom(krrVar2.c(kruVar2.a().c()), krrVar2.e(kruVar2.a().c())));
                            }
                            carIconA = new CarIcon(tjVar2);
                        } else {
                            carIconA = thq.a(iconCompat2, new oin(15));
                        }
                        twVar.b(carIconA);
                        twVar.d(new khe(lkzVar.h, 5));
                        String str2 = lkzVar.b;
                        if (str2 == null) {
                            twVar.e(d(lkzVar, lkzVar.a, iIntValue, llcVar));
                        } else {
                            twVar.e(lkzVar.a);
                            twVar.b = CarText.create(e(d(lkzVar, str2, iIntValue, llcVar)));
                            wi.f.a(twVar.b);
                        }
                        ufVarA = twVar.a();
                    }
                    arrayList2.add(ufVarA);
                    i = 1;
                }
                gke gkeVar = new gke(arrayList2);
                gkeVar.a(gkf.d);
                ?? r6 = kexVar.a;
                gkeVar.h = r6 != 0 ? CarText.create(r6) : null;
                gkeVar.i = acob.L();
                gkeVar.b(gkg.b);
                arrayList.add(new MenuSection(gkeVar, null));
                i = 1;
                i2 = 10;
            }
            list3 = arrayList;
        }
        int i3 = R.drawable.gs_equalizer_vd_theme_24;
        gkhVar.b(list3);
        if (list2 == null) {
            list4 = afbe.a;
        } else {
            if (num != null && num.intValue() == 3) {
                i3 = R.drawable.music_icon_animation;
            }
            ArrayList arrayList3 = new ArrayList(woy.bp(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                ogz ogzVar = (ogz) it2.next();
                if (acob.t()) {
                    int iOrdinal2 = ((lky) ogzVar.a).ordinal();
                    if (iOrdinal2 == 0) {
                        sw swVar2 = new sw(Action.MEDIA_PLAYBACK);
                        swVar2.b(CarColor.createCustom(iIntValue, iIntValue));
                        swVar2.d(new khe(ogzVar.b, 7));
                        actionA = swVar2.a();
                    } else if (iOrdinal2 == 1) {
                        sw swVar3 = new sw();
                        swVar3.c(thq.d(llcVar.c, R.drawable.gs_search_vd_theme_24, new oin(16)));
                        swVar3.b(CarColor.DEFAULT);
                        swVar3.d(new khe(ogzVar.b, 8));
                        actionA = swVar3.a();
                    } else {
                        if (iOrdinal2 != 2) {
                            throw new aezs();
                        }
                        sw swVar4 = new sw();
                        swVar4.c(thq.d(llcVar.c, R.drawable.gs_refresh_vd_theme_24, new oin(16)));
                        swVar4.b(CarColor.DEFAULT);
                        swVar4.d(new khe(ogzVar.b, 9));
                        actionA = swVar4.a();
                    }
                } else {
                    int iOrdinal3 = ((lky) ogzVar.a).ordinal();
                    if (iOrdinal3 == 0) {
                        aezuVar = new aezu(Integer.valueOf(i3), CarColor.createCustom(iIntValue, iIntValue));
                    } else if (iOrdinal3 == 1) {
                        aezuVar = new aezu(Integer.valueOf(R.drawable.gs_search_vd_theme_24), CarColor.DEFAULT);
                    } else {
                        if (iOrdinal3 != 2) {
                            throw new aezs();
                        }
                        aezuVar = new aezu(Integer.valueOf(R.drawable.gs_refresh_vd_theme_24), CarColor.DEFAULT);
                    }
                    int iIntValue2 = ((Number) aezuVar.a).intValue();
                    Object obj = aezuVar.b;
                    obj.getClass();
                    Context context = llcVar.c;
                    CarColor carColor = (CarColor) obj;
                    int iO = mlq.U().O(context, carColor.getColor());
                    sw swVar5 = new sw();
                    swVar5.c(thq.d(context, iIntValue2, new aia(ogzVar, iO, 15)));
                    swVar5.b(carColor);
                    swVar5.d(new khe(ogzVar.b, 10));
                    actionA = swVar5.a();
                }
                arrayList3.add(actionA);
            }
            list4 = arrayList3;
        }
        gkhVar.a(list4);
        String strF = llcVar.f();
        IconCompat iconCompat3 = llcVar.e;
        if (iconCompat3 == null) {
            actionA2 = Action.BACK;
        } else {
            sw swVar6 = new sw();
            swVar6.c(thq.a(iconCompat3, new oin(15)));
            actionA2 = swVar6.a();
        }
        actionA2.getClass();
        ua uaVar = new ua();
        if (strF != null && strF.length() != 0) {
            uaVar.e(strF);
        }
        uaVar.c(actionA2);
        gkhVar.c = uaVar.a();
        gkhVar.d = !z2;
        if (!llcVar.l()) {
            z = false;
            break;
        }
        if (!list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (!CarText.isNullOrEmpty(((MenuSection) it3.next()).getHeader())) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        gkhVar.e = z;
        gkhVar.f = 1;
        return new MenuTemplate(gkhVar, null);
    }

    private static final SpannedString d(lkz lkzVar, String str, int i, llc llcVar) {
        aezu aezuVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ListIterator listIterator = ((afbt) lkzVar.g).listIterator(0);
        while (listIterator.hasNext()) {
            llb llbVar = (llb) listIterator.next();
            Context context = llcVar.c;
            int iOrdinal = llbVar.ordinal();
            if (iOrdinal == 0) {
                aezuVar = new aezu(Integer.valueOf(R.drawable.circle_icon_padded), CarColor.createCustom(i, i));
            } else if (iOrdinal == 1) {
                aezuVar = new aezu(Integer.valueOf(R.drawable.gs_file_download_done_fill1_vd_theme_24), CarColor.DEFAULT);
            } else {
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                aezuVar = new aezu(Integer.valueOf(R.drawable.gs_explicit_fill1_vd_theme_24), CarColor.DEFAULT);
            }
            int iIntValue = ((Number) aezuVar.a).intValue();
            Object obj = aezuVar.b;
            obj.getClass();
            spannableStringBuilder.append("  ", CarIconSpan.create(thq.d(context, iIntValue, new kut((CarColor) obj, 20)), 2), 33);
            spannableStringBuilder.append((CharSequence) " ");
        }
        spannableStringBuilder.append((CharSequence) str);
        return new SpannedString(spannableStringBuilder);
    }

    private static final SpannedString e(SpannedString spannedString) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (spannedString.length() > 80) {
            CharSequence charSequenceSubSequence = spannedString.subSequence(0, 79);
            charSequenceSubSequence.getClass();
            spannableStringBuilder.append(charSequenceSubSequence);
            aisj aisjVarG = b.g(charSequenceSubSequence);
            if (aisjVarG != null) {
                spannableStringBuilder.delete(aisjVarG.b().a, aisjVarG.b().b + 1);
            }
            spannableStringBuilder.append((CharSequence) UIHandler.ContinuousWritingQueue.PLACEHOLDER);
        } else {
            spannableStringBuilder.append((CharSequence) spannedString);
        }
        return new SpannedString(spannableStringBuilder);
    }

    @Override // defpackage.tho
    public final /* bridge */ /* synthetic */ eqj a(qw qwVar, Object obj) {
        return b((llc) obj);
    }

    public final eqj b(llc llcVar) {
        llcVar.getClass();
        eqj eqjVarA = llcVar.a();
        dxm dxmVar = new dxm(llcVar, 7);
        eqj eqjVar = llcVar.m;
        eqj eqjVar2 = llcVar.l;
        eqj eqjVar3 = llcVar.k;
        return tby.u(tby.f(eqjVarA, eqjVar, eqjVar2, eqjVar3, dxmVar), c((List) llcVar.a().e(), (List) eqjVar.e(), (Integer) eqjVar2.e(), (Integer) eqjVar3.e(), llcVar));
    }
}
