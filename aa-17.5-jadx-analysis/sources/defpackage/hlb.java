package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.car.app.model.CarSpan;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.DistanceSpan;
import androidx.car.app.model.DurationSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hlb {
    public static final hlc a(gmr gmrVar, afec afecVar) {
        gmrVar.getClass();
        hju hjuVar = (hju) afecVar.invoke(gmrVar.a);
        aiyk aiykVar = gmrVar.b;
        return new hlc(hjuVar, aiykVar != null ? new hcg(aiykVar, afecVar, 2) : new jxz(new hju[0], 3));
    }

    public static final void b(hlc hlcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-944106860);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hlcVar) : buxVarC.E(hlcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gvq.g((hju) byx.e(hlcVar.b, hlcVar.a, null, null, buxVarC, 6).a(), cfyVar, buxVarC, i2 & 112, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hlcVar, cfyVar, i, 14);
        }
    }

    public static CharSequence c(CarText carText) {
        if (carText == null) {
            return null;
        }
        CharSequence charSequence = carText.toCharSequence();
        List<CharSequence> variants = carText.getVariants();
        if (!variants.isEmpty()) {
            CharSequence charSequence2 = (CharSequence) Collection.EL.stream(variants).min(Comparator.CC.comparing(new ijt(1))).get();
            if (charSequence2.length() < charSequence.length()) {
                return charSequence2;
            }
        }
        return charSequence;
    }

    public static CharSequence d(geu geuVar, CarText carText) {
        return e(geuVar, carText, hlv.a, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CharSequence e(geu geuVar, CarText carText, hlv hlvVar, int i) {
        CharSequence charSequence;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String string = null;
        if (carText != null) {
            int i7 = -1;
            if (i == -1) {
                charSequence = carText.toCharSequence();
            } else {
                List<CharSequence> variants = carText.getVariants();
                if (i < variants.size()) {
                    charSequence = variants.get(i);
                }
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                ArrayList<hlx> arrayList = new ArrayList();
                ArrayList<hlx> arrayList2 = new ArrayList();
                int i8 = 0;
                Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                int length = spans.length;
                int i9 = 0;
                while (true) {
                    i2 = 1;
                    if (i9 >= length) {
                        break;
                    }
                    Object obj = spans[i9];
                    if (obj instanceof CarSpan) {
                        CarSpan carSpan = (CarSpan) obj;
                        i6 = i8;
                        i5 = i7;
                        hlx hlxVar = new hlx(carSpan, spanned.getSpanStart(obj), spanned.getSpanEnd(obj), spanned.getSpanFlags(obj));
                        if ((carSpan instanceof DistanceSpan) || (carSpan instanceof DurationSpan) || (carSpan instanceof CarIconSpan)) {
                            arrayList2.add(hlxVar);
                        } else if ((carSpan instanceof ForegroundCarColorSpan) || (carSpan instanceof ClickableSpan)) {
                            arrayList.add(hlxVar);
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i6] = obj;
                            gks.e("CarApp.H.Tem", "Ignoring non unsupported span type: %s", objArr);
                        }
                    } else {
                        i5 = i7;
                        i6 = i8;
                        Object[] objArr2 = new Object[1];
                        objArr2[i6] = obj;
                        gks.e("CarApp.H.Tem", "Ignoring span not of CarSpan type: %s", objArr2);
                    }
                    i9++;
                    i8 = i6;
                    i7 = i5;
                }
                int i10 = i7;
                int i11 = i8;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.toString());
                if (hlvVar.h) {
                    for (int length2 = spannableStringBuilder.length() - 1; length2 >= 0; length2--) {
                        if (spannableStringBuilder.charAt(length2) == '\n') {
                            spannableStringBuilder.replace(length2, length2 + 1, (CharSequence) " · ");
                        }
                    }
                }
                ghv ghvVar = hlvVar.e;
                boolean z = hlvVar.f;
                for (hlx hlxVar2 : arrayList) {
                    CarSpan carSpan2 = hlxVar2.a;
                    if (!(carSpan2 instanceof ForegroundCarColorSpan)) {
                        i4 = i10;
                        if (!(carSpan2 instanceof ClickableSpan)) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i11] = hlxVar2;
                            gks.e("CarApp.H.Tem", "Ignoring unsupported span: %s", objArr3);
                        } else if (z) {
                            Object[] objArr4 = new Object[1];
                            objArr4[i11] = hlxVar2;
                            gks.c("CarApp.H.Tem", "Converting clickable span: %s", objArr4);
                            try {
                                spannableStringBuilder.setSpan(new hlw(geuVar, ((ClickableSpan) carSpan2).getOnClickDelegate()), hlxVar2.b, hlxVar2.c, hlxVar2.d);
                            } catch (RuntimeException e) {
                                Object[] objArr5 = new Object[1];
                                objArr5[i11] = hlxVar2;
                                gks.g("CarApp.H.Tem", e, "Failed to create clickable span: %s", objArr5);
                            }
                        } else {
                            gks.j("CarApp.H.Tem", "Clickable spans not allowed, dropping click listener");
                        }
                    } else if (ghvVar.equals(ghv.c)) {
                        Object[] objArr6 = new Object[1];
                        objArr6[i11] = hlxVar2;
                        gks.k("CarApp.H.Tem", "Color spans not allowed, dropping color: %s", objArr6);
                    } else {
                        Object[] objArr7 = new Object[1];
                        objArr7[i11] = hlxVar2;
                        gks.c("CarApp.H.Tem", "Converting foreground color span: %s", objArr7);
                        int iK = gbt.k(geuVar, ((ForegroundCarColorSpan) carSpan2).getColor(), false, -1, ghvVar, 0);
                        i4 = i10;
                        if (iK != i4) {
                            try {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(iK), hlxVar2.b, hlxVar2.c, hlxVar2.d);
                            } catch (RuntimeException e2) {
                                Object[] objArr8 = new Object[1];
                                objArr8[i11] = hlxVar2;
                                gks.g("CarApp.H.Tem", e2, "Failed to create foreground color span: %s", objArr8);
                            }
                        }
                    }
                    i10 = i4;
                }
                ArrayList arrayList3 = new ArrayList();
                for (hlx hlxVar3 : arrayList2) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList3.add(hlxVar3);
                            break;
                        }
                        hlx hlxVar4 = (hlx) it.next();
                        if (hlxVar3.equals(hlxVar4) || hlxVar3.b >= hlxVar4.c || hlxVar3.c <= hlxVar4.b) {
                        }
                    }
                }
                Collections.sort(arrayList3, new ail(9));
                int i12 = hlvVar.c;
                int size = arrayList3.size();
                int i13 = i11;
                int i14 = i13;
                while (i14 < size) {
                    hlx hlxVar5 = (hlx) arrayList3.get(i14);
                    CarSpan carSpan3 = hlxVar5.a;
                    if (carSpan3 instanceof DistanceSpan) {
                        spannableStringBuilder.replace(hlxVar5.b, hlxVar5.c, (CharSequence) hly.b(geuVar, ((DistanceSpan) carSpan3).getDistance()));
                    } else if (carSpan3 instanceof DurationSpan) {
                        spannableStringBuilder.replace(hlxVar5.b, hlxVar5.c, (CharSequence) hbz.m(geuVar, Duration.ofSeconds(((DurationSpan) carSpan3).getDurationSeconds())));
                    } else {
                        if (carSpan3 instanceof CarIconSpan) {
                            int i15 = i13 + 1;
                            if (i15 > i12) {
                                Object[] objArr9 = new Object[i2];
                                objArr9[i11] = carSpan3;
                                gks.k("CarApp.H.Tem", "Span over max image count, dropping image: %s", objArr9);
                            } else {
                                CarIconSpan carIconSpan = (CarIconSpan) carSpan3;
                                Object[] objArr10 = new Object[i2];
                                objArr10[i11] = hlxVar5;
                                gks.c("CarApp.H.Tem", "Converting car image: %s", objArr10);
                                Rect rect = hlvVar.b;
                                rect.getClass();
                                int alignment = carIconSpan.getAlignment();
                                if (alignment != i2 && alignment != 0 && alignment != 2) {
                                    gks.d("CarApp.H.Tem", "Invalid alignment value, will default to baseline");
                                    alignment = i2;
                                }
                                CarIcon icon = carIconSpan.getIcon();
                                hmb hmbVar = hmb.a;
                                int i16 = alignment;
                                Bitmap bitmapE = hbz.e(geuVar, icon, rect.width(), rect.height(), new hmb(hlvVar.d, false, false, ghw.b, null, false, 0), hlvVar.g);
                                if (bitmapE == null) {
                                    gks.d("CarApp.H.Tem", "Failed to get bitmap for icon span");
                                } else {
                                    spannableStringBuilder.setSpan(new hlt(geuVar, bitmapE, i16), hlxVar5.b, hlxVar5.c, hlxVar5.d);
                                }
                            }
                            i13 = i15;
                            i3 = 1;
                        } else {
                            i3 = 1;
                            Object[] objArr11 = new Object[1];
                            objArr11[i11] = carSpan3.getClass().getCanonicalName();
                            gks.e("CarApp.H.Tem", "Ignoring unsupported span found of type: %s", objArr11);
                        }
                        i14++;
                        i2 = i3;
                    }
                    i3 = i2;
                    i14++;
                    i2 = i3;
                }
                string = spannableStringBuilder;
            } else {
                gks.j("CarApp.H.Tem", "Expecting spanned char sequence, will default to string");
                string = charSequence.toString();
            }
        }
        return string == null ? "" : string;
    }
}
