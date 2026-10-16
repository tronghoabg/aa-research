package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ues {
    private static final yfq c;
    public final float a;
    public final upr b;
    private final uwg d;
    private final rjs e;

    static {
        int i = yfq.d;
        c = yls.a;
    }

    public ues(uwg uwgVar, upr uprVar, rjs rjsVar, float f) {
        this.d = uwgVar;
        this.b = uprVar;
        this.e = rjsVar;
        this.a = f;
    }

    public static float a(ujf ujfVar, ueu ueuVar) {
        return (ujfVar == null || !ujfVar.q()) ? BitmapDescriptorFactory.HUE_RED : uqw.B(ujfVar.r.d, ueuVar, 1.0f);
    }

    public static Bitmap b(String str, uja ujaVar, ujf ujfVar, ueu ueuVar, upr uprVar, String str2, upw upwVar) {
        yfq yfqVar;
        String str3;
        uja ujaVar2;
        Bitmap bitmap;
        if (ujfVar != null && (ujaVar2 = ujfVar.t) != null && (bitmap = ujaVar2.f) != null) {
            return bitmap;
        }
        if (ujaVar != null && (str3 = ujaVar.b) != null) {
            upy upyVarC = uprVar.c(str3, str2, upwVar);
            if (upyVarC.l()) {
                return upyVarC.c();
            }
            return null;
        }
        if (ujaVar != null) {
            yfqVar = ujaVar.c;
            yfqVar.getClass();
        } else {
            yfqVar = c;
        }
        yfq yfqVar2 = yfqVar;
        int i = 0;
        int i2 = (ujfVar == null || !ujfVar.q()) ? 0 : ujfVar.r.b;
        float fA = a(ujfVar, ueuVar);
        if (ujfVar != null && ujfVar.q()) {
            i = ujfVar.r.h;
        }
        upy upyVarB = uprVar.b(yfqVar2, ujaVar != null ? ujaVar.e : 1, str, fA, i2, i, str2, upwVar);
        if (upyVarB.l()) {
            return upyVarB.c();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final uja i(yfq yfqVar, uja ujaVar) {
        boolean z;
        yfq yfqVar2 = ujaVar.c;
        if (yfqVar2 == null || yfqVar.isEmpty()) {
            return ujaVar;
        }
        ArrayList arrayList = new ArrayList(yfqVar2.size());
        int size = yfqVar2.size();
        int i = 0;
        while (true) {
            byte[] bArrD = null;
            if (i >= size) {
                return new uja(yfq.o(arrayList), ujaVar.e, (uvy) null);
            }
            uiy uiyVar = (uiy) yfqVar2.get(i);
            String strBq = uiyVar.b;
            int i2 = uiyVar.e;
            int i3 = uiyVar.d;
            boolean z2 = true;
            if (i3 == 0) {
                z = false;
                break;
            }
            int size2 = yfqVar.size();
            do {
                size2--;
                if (size2 < 0) {
                    z = false;
                    break;
                }
            } while (((abbo) yfqVar.get(size2)).c != i3);
            if ((((abbo) yfqVar.get(size2)).b & 4) != 0) {
                bArrD = ((abbo) yfqVar.get(size2)).d.D();
            } else {
                if ((((abbo) yfqVar.get(size2)).b & 1024) != 0) {
                    strBq = ((abbo) yfqVar.get(size2)).f;
                    if (!strBq.startsWith("http://") && !strBq.startsWith("https://") && !strBq.startsWith("//") && !strBq.startsWith("data:")) {
                        strBq = a.bq(strBq, "icon/name=", "&scale=4");
                    }
                }
                z = true;
            }
            strBq = "";
            z = true;
            int i4 = uiyVar.f;
            if (i4 != 0) {
                int size3 = yfqVar.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    if (((abbo) yfqVar.get(size3)).c == i4 && (((abbo) yfqVar.get(size3)).b & 8) != 0) {
                        i2 = ((abbo) yfqVar.get(size3)).e & 16777215;
                        break;
                    }
                }
            } else {
                z2 = z;
            }
            if (z2) {
                uix uixVarA = uiy.a();
                uixVarA.f(strBq);
                uixVarA.a = bArrD;
                uixVarA.d(i2);
                uixVarA.b(uiyVar.g);
                uixVarA.e(uiyVar.h);
                arrayList.add(uixVarA.a());
            } else {
                arrayList.add(uiyVar);
            }
            i++;
        }
    }

    private final uwi j(int i, Bitmap bitmap, float f) {
        uwg uwgVar = this.d;
        int iB = uwgVar.b() - 1;
        int iA = uwgVar.a() - 1;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = bitmap;
        float f2 = f;
        while (true) {
            if (width <= iB && height <= iA && f2 > 0.5d) {
                return uwgVar.f(bitmapCreateBitmap, i, -1, 1, 0, f2);
            }
            float f3 = f2;
            int width2 = bitmapCreateBitmap.getWidth();
            int height2 = bitmapCreateBitmap.getHeight();
            int i2 = width2 / 2;
            int i3 = height2 / 2;
            int[] iArr = new int[width2 * height2];
            int[] iArr2 = new int[i2 * i3];
            uwg uwgVar2 = uwgVar;
            bitmapCreateBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            int i4 = width2 / i2;
            int i5 = height2 / i3;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = 0;
                while (i7 < i2) {
                    int i8 = i7 * i4;
                    int i9 = i6 * i5;
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (i10 < i5) {
                        int i15 = iB;
                        int i16 = 0;
                        while (i16 < i4) {
                            int i17 = i16;
                            int i18 = iArr[((i9 + i10) * width2) + i8 + i16];
                            i14 += i18 & 255;
                            i13 += (i18 >> 8) & 255;
                            i12 += (i18 >> 16) & 255;
                            i11 += (i18 >> 24) & 255;
                            i16 = i17 + 1;
                            iA = iA;
                        }
                        i10++;
                        iB = i15;
                    }
                    int i19 = iB;
                    int i20 = iA;
                    int i21 = i4 * i5;
                    iArr2[(i6 * i2) + i7] = (i14 / i21) | ((i13 / i21) << 8) | ((i12 / i21) << 16) | ((i11 / i21) << 24);
                    i7++;
                    iB = i19;
                    iA = i20;
                }
            }
            bitmapCreateBitmap = Bitmap.createBitmap(iArr2, i2, i3, Bitmap.Config.ARGB_8888);
            width /= 2;
            height /= 2;
            f2 = f3 + f3;
            uwgVar = uwgVar2;
            iB = iB;
        }
    }

    private final uwi k(int i, Picture picture, uvy uvyVar, float f) {
        float f2;
        float f3;
        int i2;
        int i3;
        int i4;
        int i5;
        uwg uwgVar = this.d;
        float fB = uwgVar.b();
        float fA = uwgVar.a();
        int width = uvyVar.a() ? uvyVar.a : picture.getWidth();
        int height = (int) ((uvyVar.a() ? uvyVar.b : picture.getHeight()) * f);
        int i6 = (int) (width * f);
        float f4 = 1.0f;
        while (true) {
            f2 = i6;
            if (f2 <= fB) {
                f3 = height;
                if (f3 <= fA && f4 > 0.5d) {
                    break;
                }
            }
            i6 /= 2;
            height /= 2;
            f4 += f4;
            i = i;
        }
        int i7 = 0;
        if (f2 > fB - 2.0f || f3 > fA - 2.0f) {
            i2 = height;
            i3 = i6;
            i4 = -1;
            i5 = 0;
        } else {
            uwf uwfVarJ = uwgVar.j(i, i6, height);
            int i8 = uwfVarJ.a;
            if (uwfVarJ.b) {
                i3 = i6 + 2;
                i5 = 0;
                i7 = 1;
                i2 = height + 2;
                i4 = i8;
            } else {
                i3 = i6;
                i5 = 1;
                i4 = i8;
                i2 = height;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawPicture(picture, new Rect(i7, i7, i6 + i7, height + i7));
        return uwgVar.f(bitmapCreateBitmap, i, i4, i5, i7, f4);
    }

    final uwi c(int i) {
        return this.d.g(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uwi d(abjd abjdVar, ueu ueuVar, upy upyVar, upw upwVar) {
        int i;
        int i2;
        upy upyVarA;
        if (abjdVar.b.isEmpty()) {
            return null;
        }
        uja ujaVarA = uja.a(abjdVar);
        int iHash = Objects.hash(ujaVarA, ueuVar);
        uwi uwiVarC = c(iHash);
        if (uwiVarC != null) {
            return uwiVarC;
        }
        if ((((abjc) abjdVar.b.get(0)).b & 1) != 0) {
            abid abidVar = ((abjc) abjdVar.b.get(0)).c;
            if (abidVar == null) {
                abidVar = abid.a;
            }
            if ((abidVar.b == 1 ? (String) abidVar.c : "").startsWith("direct-bitmap")) {
                rjs rjsVar = this.e;
                abid abidVar2 = ((abjc) abjdVar.b.get(0)).c;
                if (abidVar2 == null) {
                    abidVar2 = abid.a;
                }
                Bitmap bitmapB = rjsVar.b(abidVar2.b == 1 ? (String) abidVar2.c : "");
                if (bitmapB != null) {
                    return j(iHash, bitmapB, 1.0f);
                }
                return null;
            }
        }
        String str = ujaVarA.b;
        if (str != null) {
            return g(str, upwVar, ujaVarA.d, 1.0f / ujaVarA.e);
        }
        uvy uvyVar = ujaVarA.g;
        if (uvyVar != null) {
            int i3 = ujaVarA.e;
            int i4 = uvyVar.b;
            i = uvyVar.a * i3;
            i2 = i3 * i4;
        } else {
            i = 0;
            i2 = 0;
        }
        if (upyVar == null) {
            yfq yfqVar = ujaVarA.c;
            yfqVar.getClass();
            upyVarA = this.b.a(yfqVar, ujaVarA.e, String.valueOf(getClass().getName()).concat("#getTextureForCompositePlacedIcon()"), upwVar, i, i2);
        } else {
            upyVarA = upyVar;
        }
        if (!upyVarA.l()) {
            return null;
        }
        if (upyVarA.a() == 6) {
            Picture pictureD = upyVarA.d();
            pictureD.getClass();
            return k(iHash, pictureD, ujaVarA.d, 1.0f / ujaVarA.e);
        }
        Bitmap bitmapC = upyVarA.c();
        bitmapC.getClass();
        return j(iHash, bitmapC, this.a / ujaVarA.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.uwi e(defpackage.abcn r12, defpackage.yfq r13, defpackage.ujf r14, defpackage.ueu r15, defpackage.upw r16) {
        /*
            r11 = this;
            r8 = 0
            if (r14 == 0) goto L6
            uja r2 = r14.t
            goto L7
        L6:
            r2 = r8
        L7:
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L19
            boolean r5 = r2.d()
            if (r5 == 0) goto L19
            android.graphics.Bitmap r1 = r2.f
            uwi r0 = r11.f(r1, r4)
            goto L89
        L19:
            java.lang.Class r5 = r11.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            if (r2 == 0) goto L40
            java.lang.String r6 = r2.b
            if (r6 != 0) goto L31
            yfq r7 = r2.c
            if (r7 != 0) goto L31
        L2f:
            r0 = r8
            goto L89
        L31:
            if (r6 == 0) goto L40
            uvy r1 = r2.d
            int r2 = r2.e
            float r2 = (float) r2
            float r4 = r4 / r2
            r7 = r16
            uwi r0 = r11.g(r6, r7, r1, r4)
            goto L89
        L40:
            r7 = r16
            if (r2 == 0) goto L48
            uja r2 = i(r13, r2)
        L48:
            java.lang.String r4 = r12.c
            float r6 = a(r14, r15)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r9[r10] = r4
            r4 = 1
            r9[r4] = r2
            r4 = 2
            r9[r4] = r6
            int r9 = j$.util.Objects.hash(r9)
            uwi r4 = r11.c(r9)
            if (r4 == 0) goto L6a
            r0 = r4
            goto L89
        L6a:
            java.lang.String r4 = "#getTextureForLabelElement()"
            java.lang.String r6 = r5.concat(r4)
            java.lang.String r1 = r12.c
            upr r5 = r11.b
            r3 = r14
            r4 = r15
            android.graphics.Bitmap r1 = b(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L7d
            goto L2f
        L7d:
            if (r2 == 0) goto L2f
            float r3 = r11.a
            int r2 = r2.e
            float r2 = (float) r2
            float r3 = r3 / r2
            uwi r0 = r11.j(r9, r1, r3)
        L89:
            if (r0 == 0) goto L8c
            return r0
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ues.e(abcn, yfq, ujf, ueu, upw):uwi");
    }

    public final uwi f(Bitmap bitmap, float f) {
        int iHashCode = bitmap.hashCode();
        uwi uwiVarC = c(iHashCode);
        return uwiVarC != null ? uwiVarC : j(iHashCode, bitmap, f);
    }

    @ResultIgnorabilityUnspecified
    public final uwi g(String str, upw upwVar, uvy uvyVar, float f) {
        Picture pictureD;
        int iHash = Objects.hash(str, uvyVar, Float.valueOf(f));
        uwi uwiVarC = c(iHash);
        if (uwiVarC != null) {
            return uwiVarC;
        }
        upy upyVarC = this.b.c(str, String.valueOf(getClass().getName()).concat("#getTextureForIcon()"), upwVar);
        if (!upyVarC.l()) {
            return null;
        }
        if (upyVarC.a() == 3) {
            Bitmap bitmapC = upyVarC.c();
            if (bitmapC != null) {
                return j(iHash, bitmapC, f * this.a);
            }
            return null;
        }
        if (upyVarC.a() != 6 || (pictureD = upyVarC.d()) == null) {
            return null;
        }
        return k(iHash, pictureD, uvyVar, f * this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uwk h(abjd abjdVar, ueu ueuVar, upw upwVar) {
        int i;
        int i2;
        Bitmap bitmapC;
        uja ujaVarA = uja.a(abjdVar);
        uvy uvyVar = ujaVarA.g;
        if (uvyVar != null) {
            int i3 = ujaVarA.e;
            int i4 = uvyVar.a;
            i2 = uvyVar.b * i3;
            i = i4 * i3;
        } else {
            i = 0;
            i2 = 0;
        }
        int iHash = Objects.hash(ujaVarA, ueuVar);
        String strValueOf = String.valueOf(getClass().getName());
        if (ujaVarA.d()) {
            return new uwk(f(ujaVarA.f, 1.0f));
        }
        String str = ujaVarA.b;
        if (str != null || ujaVarA.c != null) {
            if (str != null) {
                uwi uwiVarG = g(str, upwVar, ujaVarA.d, 1.0f / ujaVarA.e);
                if (uwiVarG != null) {
                    return new uwk(uwiVarG);
                }
            } else {
                upw upwVar2 = upwVar;
                yfq yfqVar = ujaVarA.c;
                if (yfqVar != null && !yfqVar.isEmpty()) {
                    if (((uiy) yfqVar.get(0)).b.startsWith("direct-bitmap")) {
                        Bitmap bitmapB = this.e.b(((uiy) yfqVar.get(0)).b);
                        if (bitmapB != null) {
                            return new uwk(j(iHash, bitmapB, 1.0f));
                        }
                    } else {
                        upr uprVar = this.b;
                        int size = yfqVar.size();
                        upy[] upyVarArr = new upy[size];
                        int i5 = 0;
                        while (i5 < size) {
                            uiy uiyVar = (uiy) yfqVar.get(i5);
                            if (!woy.am(uiyVar.b)) {
                                upyVarArr[i5] = uprVar.a(yfq.q(uiyVar), ujaVarA.e, strValueOf.concat("#getTextureGroupForLayeredPlacedIcon()"), upwVar2, i, i2);
                            }
                            i5++;
                            upwVar2 = upwVar;
                        }
                        ArrayList arrayList = new ArrayList(yfqVar.size());
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size) {
                                ArrayList arrayList2 = new ArrayList();
                                int size2 = arrayList.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    Bitmap bitmap = (Bitmap) arrayList.get(i7);
                                    if (bitmap != null) {
                                        arrayList2.add(f(bitmap, this.a / ujaVarA.e));
                                    } else {
                                        arrayList2.add(null);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    return new uwk(arrayList2);
                                }
                            } else {
                                upy upyVar = upyVarArr[i6];
                                if (upyVar == null) {
                                    arrayList.add(null);
                                } else {
                                    if (!upyVar.l() || (bitmapC = upyVar.c()) == null) {
                                        break;
                                    }
                                    arrayList.add(bitmapC);
                                }
                                i6++;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
