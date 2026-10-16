package defpackage;

import android.graphics.Bitmap;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ufd extends ufg {
    public final yfq a;
    public final abcn b;
    public final ujf c;
    public final ues d;
    public final upw e;
    public final ueu f;
    public final boolean g;

    public ufd(float f, float f2, ues uesVar, yfq yfqVar, abcn abcnVar, ujf ujfVar, ueu ueuVar, upw upwVar, boolean z) {
        super(f, f2);
        this.a = yfqVar;
        this.b = abcnVar;
        this.c = ujfVar;
        this.d = uesVar;
        this.f = ueuVar;
        this.e = upwVar;
        this.g = z;
    }

    @ResultIgnorabilityUnspecified
    public static ufd b(ues uesVar, yfq yfqVar, abcn abcnVar, ujf ujfVar, ueu ueuVar, upw upwVar) {
        uwi uwiVarE = uesVar.e(abcnVar, yfqVar, ujfVar, ueuVar, upwVar);
        if (uwiVarE == null) {
            return null;
        }
        float f = uwiVarE.e;
        float f2 = uwiVarE.h;
        ufd ufdVar = new ufd(uwiVarE.d * f2, f2 * f, uesVar, yfqVar, abcnVar, ujfVar, ueuVar, upwVar, false);
        uwiVarE.c();
        return ufdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ufg
    public final uwk a() {
        Bitmap bitmapC;
        upw upwVar;
        int i;
        uwi uwiVarG;
        boolean z = this.g;
        ues uesVar = this.d;
        if (!z) {
            uwi uwiVarE = uesVar.e(this.b, this.a, this.c, this.f, this.e);
            if (uwiVarE != null) {
                return new uwk(uwiVarE);
            }
            return null;
        }
        abcn abcnVar = this.b;
        yfq yfqVar = this.a;
        ujf ujfVar = this.c;
        ueu ueuVar = this.f;
        upw upwVar2 = this.e;
        uja ujaVar = ujfVar != null ? ujfVar.t : null;
        String strValueOf = String.valueOf(uesVar.getClass().getName());
        int i2 = yfq.d;
        yfl yflVar = new yfl(4);
        if (ujaVar != null) {
            if (ujaVar.d()) {
                yflVar.i(uesVar.f(ujaVar.f, 1.0f));
                return new uwk(yflVar.g());
            }
            String str = ujaVar.b;
            if (str == null && ujaVar.c == null) {
                return null;
            }
            if (str != null && (uwiVarG = uesVar.g(str, upwVar2, ujaVar.d, 1.0f / ujaVar.e)) != null) {
                return new uwk(yfq.q(uwiVarG));
            }
            if (ujaVar.c != null) {
                uja ujaVarI = ues.i(yfqVar, ujaVar);
                String str2 = abcnVar.c;
                upr uprVar = uesVar.b;
                yfq yfqVar2 = ujaVarI.c;
                int size = yfqVar2 == null ? 0 : yfqVar2.size();
                int i3 = ujfVar.q() ? ujfVar.r.b : 0;
                float fA = ues.a(ujfVar, ueuVar);
                int i4 = ujfVar.q() ? ujfVar.r.h : 0;
                upy[] upyVarArr = new upy[size];
                int i5 = 0;
                while (i5 < size) {
                    yfqVar2.getClass();
                    uiy uiyVar = (uiy) yfqVar2.get(i5);
                    if (woy.am(uiyVar.b)) {
                        upwVar = upwVar2;
                        i = size;
                    } else {
                        i = size;
                        upwVar = upwVar2;
                        upyVarArr[i5] = uprVar.b(yfq.q(uiyVar), ujaVarI.e, str2, fA, i3, i4, strValueOf.concat("#getTextureGroupForLabelElement()"), upwVar);
                    }
                    i5++;
                    size = i;
                    upwVar2 = upwVar;
                }
                int i6 = size;
                ArrayList arrayList = new ArrayList(yfqVar2.size());
                for (int i7 = 0; i7 < i6; i7++) {
                    upy upyVar = upyVarArr[i7];
                    if (upyVar == null) {
                        arrayList.add(null);
                    } else {
                        if (!upyVar.l() || (bitmapC = upyVar.c()) == null) {
                            return null;
                        }
                        arrayList.add(bitmapC);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    Bitmap bitmap = (Bitmap) arrayList.get(i8);
                    if (bitmap != null) {
                        arrayList2.add(uesVar.f(bitmap, uesVar.a / ujaVarI.e));
                    } else {
                        arrayList2.add(null);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                return new uwk(arrayList2);
            }
        }
        return null;
    }
}
